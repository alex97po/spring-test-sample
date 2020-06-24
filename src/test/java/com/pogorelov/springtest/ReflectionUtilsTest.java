package com.pogorelov.springtest;

import com.pogorelov.springtest.domain.Secret;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

public class ReflectionUtilsTest {

    @Test
    public void privateFieldAccess() {
        Secret secret = new Secret();
        secret.initiate("aio");
        Field secretField = ReflectionUtils.findField(Secret.class, "secret", String.class);
        Assertions.assertNotNull(secretField);
        ReflectionUtils.makeAccessible(secretField);
        Assertions.assertEquals("zko", ReflectionUtils.getField(secretField, secret));
        ReflectionUtils.setField(secretField, secret, "cool");
        Assertions.assertEquals("cool", ReflectionUtils.getField(secretField, secret));
    }
}
