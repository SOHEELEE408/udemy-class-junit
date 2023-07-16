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
        DemoUtils demoUtils = new DemoUtils();

        String str1 = null;
        String str2 = "null이 아니다.";

        // when & then
        assertNull(demoUtils.checkNull(str1), "null이어야 한다.");
        assertNotNull(demoUtils.checkNull(str2), "null이 아니다.");

        // then

    }
}