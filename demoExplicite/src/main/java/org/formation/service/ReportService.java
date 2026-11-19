package org.formation.service;

import org.formation.model.ReportGenerator;

public class ReportService {
    private ReportGenerator generator;

    public ReportService(ReportGenerator generator) {
        this.generator = generator;
    }

    public void generateReport(){
        generator.generate();
    }
}
