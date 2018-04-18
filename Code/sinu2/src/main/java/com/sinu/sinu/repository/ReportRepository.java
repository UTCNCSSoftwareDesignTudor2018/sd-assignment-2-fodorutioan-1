package com.sinu.sinu.repository;

import com.sinu.sinu.entity.Report;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportRepository extends MongoRepository<Report, String> {
}
