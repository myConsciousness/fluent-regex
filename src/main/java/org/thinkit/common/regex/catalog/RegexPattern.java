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

import org.thinkit.api.catalog.BiCatalog;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The catalog that manages regex patterns.
 *
 * @author Kato Shinya
 * @since 1.0.0
 */
@RequiredArgsConstructor
public enum RegexPattern implements BiCatalog<RegexPattern, String> {

    /**
     * Email address
     */
    EMAIL_ADDRESS(0, "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"),

    /**
     * Domain name
     */
    DOMAIN_NAME(1, "((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}"),

    /**
     * Web URL
     */
    WEB_URL(2, "(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?"),

    /**
     * User id
     */
    USER_ID(3, "(?i)(?=.*[a-z])[a-z0-9_.]{0,32}"),

    /**
     * Fixed line phone (Japan)
     */
    FIXED_LINE_PHONE_JP(4, "0\\d\\d{4}\\d{4}"),

    /**
     * Fixed line phone with hyphen (Japan)
     */
    FIXED_LINE_PHONE_WITH_HYPHEN_JP(5, "0\\d-\\d{4}-\\d{4}"),

    /**
     * Cell phone (Japan)
     */
    CELL_PHONE_JP(6, "(070|080|090)\\d{4}\\d{4}"),

    /**
     * Cell phone with hyphen (Japan)
     */
    CELL_PHONE_WITH_HYPHEN_JP(7, "(070|080|090)-\\d{4}-\\d{4}"),

    /**
     * Password
     * <p>
     * Ensures that password will contain at least 1 upper case letter, 1 lower case
     * letter, 1 number or special character, 8-32 characters in length.
     */
    PASSWORD(8, "((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).{8,32}"),

    /**
     * Date (yyyyMMdd format)
     */
    DATE(9, "[0-9]{4}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])"),

    /**
     * Date with hyphen (yyyy-MM-dd format)
     */
    DATE_WITH_HYPHEN(10, "[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])"),

    /**
     * Date with slash (yyyyMMdd format)
     */
    DATE_WITH_SLASH(11, "[0-9]{4}/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])"),

    /**
     * Post code (Japan)
     */
    POST_CODE_JP(12, "\\d{3}-\\d{4}"),

    /**
     * XML file
     */
    XML_FILE(13, "([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[x|X][m|M][l|L]"),

    /**
     * IP address (IPv4)
     */
    IP_ADDRESS(14,

            "((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])"),

    /**
     * IP address with port (IPv4)
     */
    IP_ADDRESS_WITH_PORT(15,
            "((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9]):[0-9]+"),

    /**
     * Numeric
     */
    NUMERIC(16, "[0-9]+"),

    /**
     * Alphanumeric character
     */
    ALPHANUMERIC(17, "[A-Za-z0-9]+"),

    /**
     * Alphabet
     */
    ALPHABET(18, "[A-Za-z]+"),

    /**
     * Alphabet (upper case)
     */
    ALPHABET_UPPER_CASE(19, "[A-Z]+"),

    /**
     * Alphabet (lower case)
     */
    ALPHABET_LOWER_CASE(20, "[a-z]+"),

    /**
     * FTP URL
     */
    FTP_URL(21, "ftp://([a-z0-9]+:[a-z0-9]+@)?([\\.a-z0-9]+)/([\\./a-z0-9]+)"),

    /**
     * Java file
     */
    JAVA_FILE(22, "([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[j|J][a|A][v|V][a|A]"),

    /**
     * Text file
     */
    TEXT_FILE(23, "([一-龯ァ-ンぁ-んa-zA-Z]+-?)+[一-龯ァ-ンぁ-んa-zA-Z0-9]+\\.[t|T][x|X][t|T]"),

    /**
     * JSON file
     */
    JSON_FILE(24, "([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[j|J][s|S][o|O][n|N]"),

    /**
     * Japanese Kanji
     */
    JAPANESE_KANJI(25, "[一-龯]+"),

    /**
     * Hiragana
     */
    HIRAGANA(26, "[ぁ-ん]+"),

    /**
     * Hiragana (upper case)
     */
    HIRAGANA_UPPER_CASE(27, "[あ-ん]+"),

    /**
     * Hiragana (lower case)
     */
    HIRAGANA_LOWER_CASE(28, "[ぁぃぅぇぉゕゖっゃゅょゎ]+"),

    /**
     * Katakana
     */
    KATAKANA(29, "[ァ-ン]+"),

    /**
     * Katakana (upper case)
     */
    KATAKANA_UPPER_CASE(30, "[ア-ン]+"),

    /**
     * Katakana (lower case)
     */
    KATAKANA_LOWER_CASE(31, "[ァィゥェォヵヶッャュョヮ]+"),

    /**
     * Japanese alphabet
     */
    JAPANESE_ALPHABET(32, "[ぁ-んァ-ン一-龯]+"),

    /**
     * Japanese alphanumeric
     */
    JAPANESE_ALPHANUMERIC(33, "[ぁ-んァ-ン一-龯0-9]+");

    /**
     * The code
     */
    @Getter
    private final int code;

    /**
     * The tag
     */
    @Getter
    private final String tag;
}
