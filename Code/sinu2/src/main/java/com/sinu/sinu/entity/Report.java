package com.sinu.sinu.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Report {

    @Id
    public String id;

    public String report;

    public Report() {}

    public Report(String report) {
        this.report = report;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report1 = (Report) o;
        return Objects.equals(id, report1.id) &&
                Objects.equals(report, report1.report);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, report);
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", report='" + report + '\'' +
                '}';
    }
}
