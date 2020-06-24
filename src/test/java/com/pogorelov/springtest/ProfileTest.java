package com.pogorelov.springtest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@ActiveProfiles(profiles = "dev")
public class ProfileTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void profile() {
        Assertions.assertEquals("I'm a dev bean", applicationContext.getBean("message"));
        Assertions.assertEquals("I'm a free bean", applicationContext.getBean("noProfileBean"));
    }
}
