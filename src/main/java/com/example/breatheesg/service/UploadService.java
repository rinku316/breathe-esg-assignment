package  com.example.breatheesg.service;



import com.example.breatheesg.entity.EmissionRecord;
import com.example.breatheesg.repository.EmissionRecordRepository;
import com.opencsv.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStreamReader;
import java.util.List;

@Service
public class UploadService {

    @Autowired
    private EmissionRecordRepository repository;

    public void processSAP(MultipartFile file) {

        try {

            CSVReader reader = new CSVReader(new InputStreamReader(file.getInputStream()));

            List<String[]> rows = reader.readAll();

            for (int i = 1; i < rows.size(); i++) {

                String[] row = rows.get(i);

                EmissionRecord record = new EmissionRecord();

                record.setSourceType("SAP");
                record.setCategory("Fuel");

                record.setActivityType(row[0]);

                double amount = Double.parseDouble(row[1]);

                record.setAmount(amount);

                record.setUnit(row[2]);

                record.setNormalizedAmount(amount);

                record.setNormalizedUnit(row[2]);

                record.setEmissionScope("Scope 1");

                if (amount > 100000) {
                    record.setStatus("SUSPICIOUS");
                } else {
                    record.setStatus("PENDING");
                }

                record.setRawData(String.join(",", row));

                repository.save(record);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public void approveRecord(Long id) {
		// TODO Auto-generated method stub
		EmissionRecord record = repository.findById(id).orElse(null);
		
		if (record != null) {
			record.setStatus("APPROVED");
			repository.save(record);
		}
		
	}

	public void rejectrecord(Long id) {
		// TODO Auto-generated method stub
		EmissionRecord record = repository.findById(id).orElse(null);
		
		if (record != null) {
			record.setStatus("REJECTED");
			repository.save(record);
		}
		
	}
}