package org.formation.model;



public class PdfReport implements ReportGenerator {
    @Override
    public void generate() {
        System.out.println("Generating PDF report...");
    }
}
