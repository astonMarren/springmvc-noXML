package com.mystudy.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.mystudy.controller","com.mystudy.entity"})
public class AppConfig {
}
