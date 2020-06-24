package com.pogorelov.springtest;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

public class SysOutTestExecutionListener implements TestExecutionListener {

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {
        System.out.println("In before test class for class " + testContext.getTestClass());
    }

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        System.out.println("In before test method for method " + testContext.getTestMethod().getName());
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        System.out.println("In after test method for method " + testContext.getTestMethod().getName());
    }

    @Override
    public void afterTestClass(TestContext testContext) throws Exception {
        System.out.println("In after test class for class " + testContext.getTestClass());
    }
}
