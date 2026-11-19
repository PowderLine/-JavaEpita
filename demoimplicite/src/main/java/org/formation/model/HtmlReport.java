package org.formation.model;

import org.springframework.stereotype.Component;

@Component
public class HtmlReport implements ReportGenerator {
    @Override
    public void generate() {
        System.out.println("Generating HTML report...");
    }

    @Override
    public void generate(String author) {
        System.out.println("Generating HTML report ... " +author);
    }


}
