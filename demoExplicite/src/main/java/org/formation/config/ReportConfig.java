package org.formation.config;

import org.formation.model.HtmlReport;
import org.formation.model.PdfReport;
import org.formation.model.ReportGenerator;
import org.formation.service.ReportService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReportConfig {

    @Bean
    ReportGenerator htmlReport(){
        return new HtmlReport();
    }

    @Bean
    ReportGenerator pdfReport(){
        return new PdfReport();
    }


    @Bean
    ReportService reportService(@Qualifier("htmlReport") ReportGenerator generator){
        return new ReportService(generator);
    }
}