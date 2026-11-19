package org.formation.service;

import org.formation.model.ReportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ReportService {
    @Autowired
    @Qualifier("htmlReport")
    private ReportGenerator generator;

    private String name;

    public void generateReport(){
        generator.generate(name);
    }


    public void setName(String name) {
        this.name = name;
    }
}
