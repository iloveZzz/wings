package com.works.wings.wingsgateway.config;

import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.google.common.collect.Lists;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
public class SentinelRuleLocators {

    @Bean("dsadasd")
    @ConfigurationProperties(prefix = "sentinel.flow.rules",ignoreInvalidFields=true)
    public List<FlowRule> getRules() {
        return Lists.newArrayList();
    }


    @PostConstruct
    public void initRule() {
        FlowRuleManager.loadRules(getRules());
    }
}
