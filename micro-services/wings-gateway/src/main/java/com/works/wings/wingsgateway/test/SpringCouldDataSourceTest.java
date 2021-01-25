package com.works.wings.wingsgateway.test;

import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.datasource.spring.cloud.config.SentinelRuleLocator;
import com.alibaba.csp.sentinel.datasource.spring.cloud.config.SpringCloudConfigDataSource;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test/dataSource/")
public class SpringCouldDataSourceTest {


    @Autowired
    private SentinelRuleLocator locator;

    final Converter<String, List<FlowRule>> converter = new Converter<String, List<FlowRule>>() {
        @Override
        public List<FlowRule> convert(String source) {
            return JSON.parseArray(source, FlowRule.class);
        }
    };


    @GetMapping("/get")
    @ResponseBody
    public List<FlowRule> get() {
        SpringCloudConfigDataSource dataSource = new SpringCloudConfigDataSource("flow_rule", converter);
        FlowRuleManager.register2Property(dataSource.getProperty());
        return FlowRuleManager.getRules();
    }

    /**
     * WebHook refresh config
     */
    @GetMapping("/refresh")
    @ResponseBody
    public List<FlowRule> refresh() {
        locator.refresh();
        return FlowRuleManager.getRules();
    }
}