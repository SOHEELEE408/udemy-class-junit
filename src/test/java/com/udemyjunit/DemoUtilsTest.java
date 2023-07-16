package com.udemyjunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    @DisplayName("더하기 연산")
    @Test
    void testEqualsAndNotEquals() {
        // given
        DemoUtils demoUtils = new DemoUtils();

        int expected = 6;

        // when
        int actual = demoUtils.add(2, 4);

        // then
        assertEquals(expected, actual, "2+4는 6이다.");
        
    }

}