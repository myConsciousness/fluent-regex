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
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
public enum RegexPattern implements BiCatalog<RegexPattern, String> {

	/**
	 * Email address
	 */
	EMAIL_ADDRESS(0, "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"),

	/**
	 * Domain name
	 */
	DOMAIN_NAME(1, "^[a-zA-Z0-9][a-zA-Z0-9-]{1,61}[a-zA-Z0-9]\\.[a-zA-Z]{2,}$"),

	/**
	 * Web URL
	 */
	WEB_URL(2, "^(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$"),

	/**
	 * User name
	 */
	USER_NAME(3, "^[a-zA-Z0-9_\\-.]"),

	/**
	 * Fixed line phone (Japan)
	 */
	FIXED_LINE_PHONE_JP(4, "^0\\d\\d{4}\\d{4}$"),

	/**
	 * Fixed line phone with hyphen (Japan)
	 */
	FIXED_LINE_PHONE_WITH_HYPHEN_JP(5, "^0\\d-\\d{4}-\\d{4}$"),

	/**
	 * Cell phone (Japana)
	 */
	CELL_PHONE_JP(6, "^(070|080|090)\\d{4}\\d{4}$"),

	/**
	 * Cell phone with hyphen (Japan)
	 */
	CELL_PHONE_WITH_HYPHEN_JP(7, "^(070|080|090)-\\d{4}-\\d{4}$"),

	/**
	 * Password
	 */
	PASSWORD(8, "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])."),

	/**
	 * Date (yyyyMMdd format)
	 */
	DATE(9, "^\\d{4}\\d{1,2}\\d{1,2}$"),

	/**
	 * Date with hyphen (yyyyMMdd format)
	 */
	DATE_WITH_HYPHEN(10, "^\\d{4}-\\d{1,2}-\\d{1,2}$"),

	/**
	 * Date with slash (yyyyMMdd format)
	 */
	DATE_WITH_SLASH(11, "^\\d{4}\\\\d{1,2}\\\\d{1,2}$"),

	/**
	 * Post code (Japan)
	 */
	POST_CODE_JP(12, "^\\d{3}-\\d{4}$"),

	/**
	 * XML
	 */
	XML(13, "^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[x|X][m|M][l|L]$"),

	/**
	 * IP address
	 */
	IP_ADDRESS(14,

			"(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])"),

	/**
	 * IP address with port
	 */
	IP_ADDRESS_WITH_PORT(15,
			"(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]):([1-9][0-9]{3}|[1-9][0-9]{2}|[1-9][0-9]{1})"),

	/**
	 * Numeric
	 */
	NUMERIC(16, "^[0-9]*$"),

	/**
	 * Alphanumeric character
	 */
	ALPHANUMERIC_CHARACTER(17, "^[A-Za-z0-9]+$"),

	/**
	 * Alphabet
	 */
	ALPHABET(18, "^[A-Za-z]+$"),

	/**
	 * Alphabet (upper case)
	 */
	ALPHABET_UPPER_CASE(19, "^[A-Z]+$"),

	/**
	 * Alphabet (lower case)
	 */
	ALPHABET_LOWER_CASE(20, "^[a-z]+$");

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