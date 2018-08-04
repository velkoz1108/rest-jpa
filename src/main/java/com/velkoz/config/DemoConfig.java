package com.velkoz.config;

import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : want
 * @Team Home
 * @date : 2018-8-4 15:07 星期六
 */
@Configuration
@Import(RepositoryRestMvcAutoConfiguration.class)
public class DemoConfig {
}
