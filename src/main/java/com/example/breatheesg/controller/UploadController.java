package com.example.breatheesg.controller;


import com.example.breatheesg.entity.EmissionRecord;
import com.example.breatheesg.repository.EmissionRecordRepository;
import com.example.breatheesg.service.UploadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/upload")
@CrossOrigin("*")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @Autowired
    private EmissionRecordRepository repository;

    @PostMapping("/sap")
    public String uploadSAP(
            @RequestParam("file") MultipartFile file) {

        uploadService.processSAP(file);

        return "File Uploaded Successfully";
    }

    @GetMapping("/records")
    public List<EmissionRecord> getAllRecords() {

        return repository.findAll();
    }
}