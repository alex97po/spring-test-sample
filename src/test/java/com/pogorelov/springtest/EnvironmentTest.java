package com.pogorelov.springtest;

import com.pogorelov.springtest.config.MyConfig;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
@DirtiesContext
public class EnvironmentTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void environment() {
        Assertions.assertEquals("I'm the king", context.getBean("message"));
    }
}
