package com.udemyjunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    private DemoUtils demoUtils;

    @BeforeEach
    void setUp(){
        demoUtils = new DemoUtils();
        System.out.println("====================================");
        System.out.println("@Before executes before the executions of each test method.");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Running @AfterEach.");
    }

    @DisplayName("더하기 연산")
    @Test
    void testEqualsAndNotEquals() {
        // given
        System.out.println("Running test: testEqualsAndNotEquals");

        int expected = 6;
        int unexpected = 8;

        // when
        int actual = demoUtils.add(2, 4);

        // then
        assertEquals(expected, actual, "2+4는 6이다.");
        assertNotEquals(unexpected, actual, "2+4는 8이 아니다.");

        // when & then
        assertEquals(expected, demoUtils.add(2, 4), "2+4는 6이다.");
        assertNotEquals(unexpected, demoUtils.add(2, 4), "2+4는 8이 아니다.");

    }

    @DisplayName("null인지 확인")
    @Test
    void testNullAndNotNull() {
        // given
        System.out.println("Running test: testNullAndNotNull");

        String str1 = null;
        String str2 = "null이 아니다.";

        // when & then
        assertNull(demoUtils.checkNull(str1), "null이어야 한다.");
        assertNotNull(demoUtils.checkNull(str2), "null이 아니다.");

        // then

    }
}