package com.example.dbbesttask0.testtask.configuration;

import com.example.dbbesttask0.testtask.logic.PipeManager;
import com.example.dbbesttask0.testtask.scv.builder.PipeBuilder;
import com.example.dbbesttask0.testtask.scv.builder.PointBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean
    public PipeBuilder pipeBuilder(){
        return new PipeBuilder();
    }
    @Bean
    public PointBuilder pointBuilder(){return new PointBuilder();}
    @Bean
    public PipeManager pipeManager(){return new PipeManager();}
}
