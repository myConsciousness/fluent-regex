/*
 * Copyright 2020 Kato Shinya.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.thinkit.common.regex.catalog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * The test class for the {@link RegexPattern} .
 *
 * @author Kato Shinya
 * @since 1.0
 * @version 1.0
 */
final class RegexPatternTest {

    /**
     * The expected tags
     */
    private static final Map<Integer, String> EXPECTED_TAGS = new HashMap<>() {

        /**
         * Serial Verison UID
         */
        private static final long serialVersionUID = 1819378243842224939L;

        {
            put(0, "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
            put(1, "^[a-zA-Z0-9][a-zA-Z0-9-]{1,61}[a-zA-Z0-9]\\.[a-zA-Z]{2,}$");
            put(2, "^(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$");
            put(3, "^[a-zA-Z0-9_\\-.]");
            put(4, "^0\\d\\d{4}\\d{4}$");
            put(5, "^0\\d-\\d{4}-\\d{4}$");
            put(6, "^(070|080|090)\\d{4}\\d{4}$");
            put(7, "^(070|080|090)-\\d{4}-\\d{4}$");
            put(8, "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).");
            put(9, "^\\d{4}\\d{1,2}\\d{1,2}$");
            put(10, "^\\d{4}-\\d{1,2}-\\d{1,2}$");
            put(11, "^\\d{4}\\\\d{1,2}\\\\d{1,2}$");
            put(12, "^\\d{3}-\\d{4}$");
            put(13, "^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[x|X][m|M][l|L]$");
            put(14, "(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])");
            put(15, "(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]):([1-9][0-9]{3}|[1-9][0-9]{2}|[1-9][0-9]{1})");
            put(16, "^[0-9]*$");
            put(17, "^[A-Za-z0-9]+$");
            put(18, "^[A-Za-z]+$");
            put(19, "^[A-Z]+$");
            put(20, "^[a-z]+$");
        }
    };

    @Test
    void testCodeValues() {

        int expected = 0;

        for (RegexPattern regexPattern : RegexPattern.values()) {
            assertEquals(expected++, regexPattern.getCode());
        }
    }

    @Test
    void testTagValues() {

        int code = 0;

        for (RegexPattern regexPattern : RegexPattern.values()) {
            assertEquals(EXPECTED_TAGS.get(code++), regexPattern.getTag());
        }
    }
}