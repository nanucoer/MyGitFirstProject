package com.Runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


@CucumberOptions
        (
                plugin = {"pretty", "html:target/cucumber"}
                ,features = {"src/main/java/com/Resources"}
                ,glue = {"com.StepDefinition"}
                ,monochrome = true
                ,dryRun = false
        )

public class TestRunner extends AbstractTestNGCucumberTests {
        @BeforeClass
        public void before()
        {
                System.out.println("Test is running");
        }
        @AfterClass
        public void after()
        {
                System.out.println("Test is completed");
        }

}
