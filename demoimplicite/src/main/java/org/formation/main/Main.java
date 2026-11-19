package org.formation.main;

import org.formation.config.ReportConfig;
import org.formation.service.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ReportConfig.class);
        ReportService service = context.getBean("reportService", ReportService.class);
        ReportService service2 = context.getBean("reportService", ReportService.class);

        service.setName("bob");
        service2.setName("David");
        service.generateReport();
        service2.generateReport();

    }
}
