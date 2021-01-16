/*
 * Copyright (c) 2021. Elex.
 * All Rights Reserved.
 */

package com.elex_project.haetae;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Elex
 */
@Slf4j
@Getter
public final class OutOfUnicodeRangeException extends Exception {
	private final char character;

	public OutOfUnicodeRangeException(char c) {
		this.character = c;
	}

}
