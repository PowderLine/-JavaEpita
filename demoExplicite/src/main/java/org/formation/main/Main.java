package org.formation.main;

import org.formation.config.ReportConfig;
import org.formation.service.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ReportConfig.class);
        ReportService service = context.getBean("reportService", ReportService.class);

        service.generateReport();

    }
}
