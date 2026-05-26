package com.example.breatheesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.breatheesg.entity.EmissionRecord;

@Repository
public interface EmissionRecordRepository extends JpaRepository<EmissionRecord, Long>{

}
