package com.multiJpa.POSTGRES;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "postgres.datasource")
@Data
@Component
public class PostgresDataSourceConfigurationProp {

    private String url;
    private String username;
    private String password;
    private String driverClassName;
}
