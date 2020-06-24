package com.pogorelov.springtest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pogorelov.springtest.config.MyConfig;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class, initializers = EnvironmentMockTest.MockPropertyInitializer.class)
public class EnvironmentMockTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void environment() {
        Assertions.assertEquals("I'm a mock star", context.getBean("message"));
    }

    public static class MockPropertyInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

        @Override
        public void initialize(ConfigurableApplicationContext applicationContext) {
            MockEnvironment mock = new MockEnvironment();
            mock.setProperty("message", "I'm a mock star");
            applicationContext.setEnvironment(mock);
        }
    }

}
