package com.aalam.birthdayemailconsumer.sendgrid;

import com.sendgrid.SendGrid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SendgridConfig {

    @Value("${sendKey}")
    private String key ;

    @Bean
    public SendGrid sendGrid(){
        return new SendGrid(key);
    }
}