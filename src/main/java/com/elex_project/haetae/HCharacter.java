/*
 * Copyright (c) 2021. Elex.
 * All Rights Reserved.
 */

package com.elex_project.haetae;

import lombok.extern.slf4j.Slf4j;

import static com.elex_project.haetae.Constants.*;

/**
 * Created by Elex on 2014-07-11.
 *
 * @author Elex
 */
@Slf4j
public class HCharacter {

	private final char character;
	private final char initialConsonant;
	private final char medialVowel;
	private final char finalConsonant;

	public HCharacter(final char character) throws OutOfUnicodeRangeException {
		if (isSyllableLetter(character)) {
			this.character = character;
			this.finalConsonant = getJongSeong(this.character);
			this.medialVowel = getJungSeong(this.character);
			this.initialConsonant = getChoSeong(this.character);

		} else if (isJamoLetter(character)) {
			this.character = character;
			this.finalConsonant = FILLER;
			this.medialVowel = FILLER;
			this.initialConsonant = FILLER;

		} else if (isJamoCompatLetter(character)) {
			this.character = character;
			this.finalConsonant = FILLER;
			this.medialVowel = FILLER;
			this.initialConsonant = FILLER;

		} else {
			throw new OutOfUnicodeRangeException(character);
		}
	}

	public HCharacter(char initialConsonant, char medialVowel, char finalConsonant)
			throws OutOfUnicodeRangeException {
		// 한글 호환 자모의 코드를 그냥 자모로 변환한다.
		if (isJamoCompatLetter(initialConsonant)) {
			for (char[] row : CONV_INITIAL_CONSONANTS) {
				if (row[1] == initialConsonant) {
					initialConsonant = row[0];
					break;
				}
			}
		}

		if (isJamoCompatLetter(medialVowel)) {
			medialVowel -= HANGEUL_COMPAT_JAMO_VOWEL_BEGIN;
			medialVowel += HANGEUL_JAMO_JUNGSEONG_BEGIN;
		}

		if (isJamoCompatLetter(finalConsonant)) {
			for (char[] row : CONV_FINAL_CONSONANTS) {
				if (row[1] == finalConsonant) {
					finalConsonant = row[0];
					break;
				}
			}
		}

		// 옛한글은 완성형 문자 없음
		if (!isJamoLetter(initialConsonant) || isOldLetter(initialConsonant))
			throw new OutOfUnicodeRangeException(initialConsonant);
		if (!isJamoLetter(medialVowel) || isOldLetter(medialVowel))
			throw new OutOfUnicodeRangeException(medialVowel);
		if (finalConsonant != FILLER && (!isJamoLetter(finalConsonant) || isOldLetter(finalConsonant)))
			throw new OutOfUnicodeRangeException(finalConsonant);

		this.initialConsonant = initialConsonant;
		this.medialVowel = medialVowel;
		this.finalConsonant = finalConsonant;

		// 자모 결합
		initialConsonant -= HANGEUL_JAMO_CHOSEONG_BEGIN;
		medialVowel -= HANGEUL_JAMO_JUNGSEONG_BEGIN;
		if (finalConsonant != FILLER) {
			finalConsonant -= HANGEUL_JAMO_JONGSEONG_BEGIN;
		}

		int val = 0;
		val += initialConsonant * 28 * 21;
		val += medialVowel * 28;
		if (finalConsonant != FILLER) val += finalConsonant + 1;
		val += HANGEUL_SYLLABLE_BEGIN;

		this.character = (char) val;
	}

	public HCharacter(char initialConsonant, char medialVowel) throws OutOfUnicodeRangeException {
		this(initialConsonant, medialVowel, FILLER);
	}

	public char getChar() {
		return character;
	}

	public char getChoSeong() {
		return initialConsonant;
	}

	public char getJungSeong() {
		return medialVowel;
	}

	public char getJongSeong() {
		return finalConsonant;
	}

	public char getChoSeongCompat() {
		return toCharCompat(initialConsonant);
	}

	public char getJungSeongCompat() {
		return toCharCompat(medialVowel);
	}

	public char getJongSeongCompat() {
		return toCharCompat(finalConsonant);
	}

	protected static char toCharCompat(char ch) {
		if (!isJamoLetter(ch)) return ch;

		if (isVowelLetter(ch)) {
			return (char) (ch - HANGEUL_JAMO_JUNGSEONG_BEGIN + HANGEUL_COMPAT_JAMO_VOWEL_BEGIN);
		} else {
			for (char[] row : CONV_INITIAL_CONSONANTS) {
				if (row[0] == ch) {
					return row[1];
				}
			}
			for (char[] row : CONV_FINAL_CONSONANTS) {
				if (row[0] == ch) {
					return row[1];
				}
			}
		}
		return '\u3164';
	}

	protected static char getChoSeong(char character) {
		int val = (int) character;
		val -= HANGEUL_SYLLABLE_BEGIN;
		val = val / 28 / 21;
		val += HANGEUL_JAMO_CHOSEONG_BEGIN;
		return (char) val;
	}

	protected static char getJungSeong(char character) {
		int val = (int) character;
		val -= HANGEUL_SYLLABLE_BEGIN;
		val = val / 28 % 21;
		val += HANGEUL_JAMO_JUNGSEONG_BEGIN;
		return (char) val;
	}

	protected static char getJongSeong(char character) {
		int val = (int) character;
		val -= HANGEUL_SYLLABLE_BEGIN;
		val = val % 28 - 1;
		if (val == -1) return FILLER; //종성없음
		val += HANGEUL_JAMO_JONGSEONG_BEGIN;
		return (char) val;
	}

	public String toString() {
		return String.valueOf(character);
	}

	public boolean isJamoLetter() {
		return isJamoLetter(character);
	}

	protected static boolean isJamoLetter(char ch) {
		return (ch >= HANGEUL_JAMO_BEGIN && ch <= HANGEUL_JAMO_END);
	}

	public boolean isJamoCompatLetter() {
		return isJamoCompatLetter(character);
	}

	protected static boolean isJamoCompatLetter(char ch) {
		return (ch >= HANGEUL_COMPAT_JAMO_BEGIN && ch <= HANGEUL_COMPAT_JAMO_END);
	}

	public boolean isSyllableLetter() {
		return isSyllableLetter(character);
	}

	protected static boolean isSyllableLetter(char ch) {
		return (ch >= HANGEUL_SYLLABLE_BEGIN && ch <= HANGEUL_SYLLABLE_END);
	}

	protected static boolean isVowelLetter(char ch) {
		return (ch >= HANGEUL_JAMO_JUNGSEONG_BEGIN && ch <= HANGEUL_JAMO_JUNGSEONG_END) ||
				(ch >= HANGEUL_COMPAT_JAMO_VOWEL_BEGIN && ch <= HANGEUL_COMPAT_JAMO_VOWEL_END) ||
				(ch >= HANGEUL_JAMO_JUNGSEONG_OLD_BEGIN && ch <= HANGEUL_JAMO_JUNGSEONG_OLD_END) ||
				(ch >= HANGEUL_COMPAT_JAMO_VOWEL_OLD_BEGIN && ch <= HANGEUL_COMPAT_JAMO_VOWEL_OLD_END);
	}

	protected static boolean isConsonantLetter(char ch) {
		if (isJamoLetter(ch) || isJamoCompatLetter(ch)) {
			return !isVowelLetter(ch);
		}
		return false;
	}

	protected static boolean isOldLetter(char ch) {
		return (ch >= HANGEUL_JAMO_CHOSEONG_OLD_BEGIN && ch <= HANGEUL_JAMO_CHOSEONG_OLD_END) ||
				(ch >= HANGEUL_JAMO_JUNGSEONG_OLD_BEGIN && ch <= HANGEUL_JAMO_JUNGSEONG_OLD_END) ||
				(ch >= HANGEUL_JAMO_JONGSEONG_OLD_BEGIN && ch <= HANGEUL_JAMO_JONGSEONG_OLD_END) ||
				(ch >= HANGEUL_COMPAT_JAMO_CONSONANT_OLD_BEGIN && ch <= HANGEUL_COMPAT_JAMO_VOWEL_OLD_END);
	}

}
