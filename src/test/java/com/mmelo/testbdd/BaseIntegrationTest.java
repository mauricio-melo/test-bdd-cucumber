package com.mmelo.testbdd;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
        classes = TestBddApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class BaseIntegrationTest {
    public static final String URL = "http://localhost:8080";
}

