package com.works.wings.wingsgateway.config;

import com.alibaba.csp.sentinel.datasource.spring.cloud.config.SentinelRuleLocator;
import com.alibaba.csp.sentinel.datasource.spring.cloud.config.SentinelRuleStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.client.ConfigClientProperties;
import org.springframework.cloud.config.client.ConfigServicePropertySourceLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

import javax.annotation.PostConstruct;

@Configuration
public class SentinelRuleLocators {

    @Autowired
    private SentinelRuleLocators sentinelRulesSourceLocator;

    @Autowired
    private Environment environment;

    @Autowired
    private ConfigServicePropertySourceLocator configServicePropertySourceLocator;
    @Autowired
    private ConfigClientProperties configClientProperties;

    @PostConstruct
    public void init() {
        PropertySource<?> locate = configServicePropertySourceLocator.locate(environment);
        SentinelRuleLocator sentinelRulesSourceLocator = new SentinelRuleLocator(configClientProperties, environment);
        sentinelRulesSourceLocator.locate(environment);
        SentinelRuleStorage.retrieveRule("flow_rule");

    }
}
