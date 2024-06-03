package com.template.application.core;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("fast")
@SpringBootTest
public class LogicTest {

    @Autowired
    private Logic logic;

    @Test
    void getString_shouldReturnHelloWorld_whenCalled() {
        String result = logic.getString();
        assertEquals("Hello Worsld!", result, "Expected getString() to return 'Hello World!'");
    }
}