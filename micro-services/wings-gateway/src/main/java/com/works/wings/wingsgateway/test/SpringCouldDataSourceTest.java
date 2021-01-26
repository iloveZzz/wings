package com.works.wings.wingsgateway.test;

import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.datasource.spring.cloud.config.SentinelRuleLocator;
import com.alibaba.csp.sentinel.datasource.spring.cloud.config.SpringCloudConfigDataSource;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping(value = "/test/dataSource/")
public class SpringCouldDataSourceTest {

    private final List<FlowRule> rules;

    public SpringCouldDataSourceTest(@Qualifier("dsadasd") List<FlowRule> rules, SentinelRuleLocator locator) {
        this.rules = rules;
        this.locator = locator;
    }

    private final SentinelRuleLocator locator;


    @GetMapping("/get")
    @ResponseBody
    public List<FlowRule> get() {
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