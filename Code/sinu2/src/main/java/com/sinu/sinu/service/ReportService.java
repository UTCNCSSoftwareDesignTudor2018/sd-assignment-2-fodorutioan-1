package com.sinu.sinu.service;

import com.sinu.sinu.entity.Report;
import com.sinu.sinu.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public Report save(Report report) { return this.reportRepository.save(report);}
}
