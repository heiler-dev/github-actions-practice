package com.example.demospring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpringApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    void testExample1() {
        int a = 1;
        assertThat(a).isEqualTo(1);
    }
}
