package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Report;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ReportRepository extends MongoRepository<Report, String> {
    Report save(Report report);
}
