package org.formation.model;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class PdfReport implements ReportGenerator {
    @Override
    public void generate() {
        System.out.println("Generating PDF report...");
    }

    @Override
    public void generate(String author) {
        System.out.println("Generating PDF report ... "+author);
    }


}
