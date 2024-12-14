package org.sid.customerservice.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "customer.params")

public record CustomerConfigParams(int x, int y) {
}