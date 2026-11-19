package org.formation.model;


public class HtmlReport implements ReportGenerator {
    @Override
    public void generate() {
        System.out.println("Generating HTML report...");
    }
}
