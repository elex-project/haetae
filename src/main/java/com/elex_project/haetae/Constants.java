/*
 * Copyright (c) 2021. Elex.
 * All Rights Reserved.
 */

package com.elex_project.haetae;

/**
 * @author Elex
 */
interface Constants {
	static final char FILLER = 0;

	// 한글 음절
	static final char HANGEUL_SYLLABLE_BEGIN = '\uAC00';
	static final char HANGEUL_SYLLABLE_END = '\uD7AF';

	// 한글 자모
	static final char HANGEUL_JAMO_BEGIN = '\u1100';
	static final char HANGEUL_JAMO_END = '\u11FF';

	static final char HANGEUL_JAMO_CHOSEONG_BEGIN = '\u1100';
	static final char HANGEUL_JAMO_CHOSEONG_END = '\u1112';
	static final char HANGEUL_JAMO_CHOSEONG_OLD_BEGIN = '\u1113';
	static final char HANGEUL_JAMO_CHOSEONG_OLD_END = '\u115F';
	static final char HANGEUL_JAMO_JUNGSEONG_BEGIN = '\u1161';
	static final char HANGEUL_JAMO_JUNGSEONG_END = '\u1175';
	static final char HANGEUL_JAMO_JUNGSEONG_OLD_BEGIN = '\u1176';
	static final char HANGEUL_JAMO_JUNGSEONG_OLD_END = '\u11A7';
	static final char HANGEUL_JAMO_JONGSEONG_BEGIN = '\u11A8';
	static final char HANGEUL_JAMO_JONGSEONG_END = '\u11C2';
	static final char HANGEUL_JAMO_JONGSEONG_OLD_BEGIN = '\u11C3';
	static final char HANGEUL_JAMO_JONGSEONG_OLD_END = '\u11FF';

	// 한글 호환 자모
	static final char HANGEUL_COMPAT_JAMO_BEGIN = '\u3131';
	static final char HANGEUL_COMPAT_JAMO_END = '\u318E';

	static final char HANGEUL_COMPAT_JAMO_CONSONANT_BEGIN = '\u3131';
	static final char HANGEUL_COMPAT_JAMO_CONSONANT_END = '\u314E';
	static final char HANGEUL_COMPAT_JAMO_VOWEL_BEGIN = '\u314F';
	static final char HANGEUL_COMPAT_JAMO_VOWEL_END = '\u3163';
	static final char HANGEUL_COMPAT_JAMO_CONSONANT_OLD_BEGIN = '\u3165';
	static final char HANGEUL_COMPAT_JAMO_CONSONANT_OLD_END = '\u3186';
	static final char HANGEUL_COMPAT_JAMO_VOWEL_OLD_BEGIN = '\u3187';
	static final char HANGEUL_COMPAT_JAMO_VOWEL_OLD_END = '\u318E';

	//
	static final char HANGUL_CHOSEONG_KIYEOK = '\u1100';
	static final char HANGUL_CHOSEONG_SSANGKIYEOK = '\u1101';
	static final char HANGUL_CHOSEONG_NIEUN = '\u1102';
	static final char HANGUL_CHOSEONG_TIKEUT = '\u1103';
	static final char HANGUL_CHOSEONG_SSANGTIKEUT = '\u1104';
	static final char HANGUL_CHOSEONG_RIEUL = '\u1105';
	static final char HANGUL_CHOSEONG_MIEUM = '\u1106';
	static final char HANGUL_CHOSEONG_PIEUP = '\u1107';
	static final char HANGUL_CHOSEONG_SSANGPIEUP = '\u1108';
	static final char HANGUL_CHOSEONG_SIOS = '\u1109';
	static final char HANGUL_CHOSEONG_SSANGSIOS = '\u110A';
	static final char HANGUL_CHOSEONG_IEUNG = '\u110B';
	static final char HANGUL_CHOSEONG_CIEUC = '\u110C';
	static final char HANGUL_CHOSEONG_SSANGCIEUC = '\u110D';
	static final char HANGUL_CHOSEONG_CHIEUCH = '\u110E';
	static final char HANGUL_CHOSEONG_KHIEUKH = '\u110F';
	static final char HANGUL_CHOSEONG_THIEUTH = '\u1110';
	static final char HANGUL_CHOSEONG_PHIEUPH = '\u1111';
	static final char HANGUL_CHOSEONG_HIEUH = '\u1112';

	static final char HANGUL_JUNGSEONG_A = '\u1161';
	static final char HANGUL_JUNGSEONG_AE = '\u1162';
	static final char HANGUL_JUNGSEONG_YA = '\u1163';
	static final char HANGUL_JUNGSEONG_YAE = '\u1164';
	static final char HANGUL_JUNGSEONG_EO = '\u1165';
	static final char HANGUL_JUNGSEONG_E = '\u1166';
	static final char HANGUL_JUNGSEONG_YEO = '\u1167';
	static final char HANGUL_JUNGSEONG_YE = '\u1168';
	static final char HANGUL_JUNGSEONG_O = '\u1169';
	static final char HANGUL_JUNGSEONG_WA = '\u116A';
	static final char HANGUL_JUNGSEONG_WAE = '\u116B';
	static final char HANGUL_JUNGSEONG_OE = '\u116C';
	static final char HANGUL_JUNGSEONG_YO = '\u116D';
	static final char HANGUL_JUNGSEONG_U = '\u116E';
	static final char HANGUL_JUNGSEONG_WEO = '\u116F';
	static final char HANGUL_JUNGSEONG_WE = '\u1170';
	static final char HANGUL_JUNGSEONG_WI = '\u1171';
	static final char HANGUL_JUNGSEONG_YU = '\u1172';
	static final char HANGUL_JUNGSEONG_EU = '\u1173';
	static final char HANGUL_JUNGSEONG_YI = '\u1174';
	static final char HANGUL_JUNGSEONG_I = '\u1175';

	static final char HANGUL_JONGSEONG_KIYEOK = '\u11A8';
	static final char HANGUL_JONGSEONG_SSANGKIYEOK = '\u11A9';
	static final char HANGUL_JONGSEONG_KIYEOK_SIOS = '\u11AA';
	static final char HANGUL_JONGSEONG_NIEUN = '\u11AB';
	static final char HANGUL_JONGSEONG_NIEUN_CIEUC = '\u11AC';
	static final char HANGUL_JONGSEONG_NIEUN_HIEUH = '\u11AD';
	static final char HANGUL_JONGSEONG_TIKEUT = '\u11AE';
	static final char HANGUL_JONGSEONG_RIEUL = '\u11AF';
	static final char HANGUL_JONGSEONG_RIEUL_KIYEOK = '\u11B0';
	static final char HANGUL_JONGSEONG_RIEUL_MIEUM = '\u11B1';
	static final char HANGUL_JONGSEONG_RIEUL_PIEUP = '\u11B2';
	static final char HANGUL_JONGSEONG_RIEUL_SIOS = '\u11B3';
	static final char HANGUL_JONGSEONG_RIEUL_THIEUTH = '\u11B4';
	static final char HANGUL_JONGSEONG_RIEUL_PHIEUPH = '\u11B5';
	static final char HANGUL_JONGSEONG_RIEUL_HIEUH = '\u11B6';
	static final char HANGUL_JONGSEONG_MIEUM = '\u11B7';
	static final char HANGUL_JONGSEONG_PIEUP = '\u11B8';
	static final char HANGUL_JONGSEONG_PIEUP_SIOS = '\u11B9';
	static final char HANGUL_JONGSEONG_SIOS = '\u11BA';
	static final char HANGUL_JONGSEONG_SSANGSIOS = '\u11BB';
	static final char HANGUL_JONGSEONG_IEUNG = '\u11BC';
	static final char HANGUL_JONGSEONG_CIEUC = '\u11BD';
	static final char HANGUL_JONGSEONG_CHIEUCH = '\u11BE';
	static final char HANGUL_JONGSEONG_KHIEUKH = '\u11BF';
	static final char HANGUL_JONGSEONG_THIEUTH = '\u11C0';
	static final char HANGUL_JONGSEONG_PHIEUPH = '\u11C1';
	static final char HANGUL_JONGSEONG_HIEUH = '\u11C2';

	static final char[][] CONV_INITIAL_CONSONANTS = new char[][]{
			{HANGUL_CHOSEONG_KIYEOK, '\u3131'},//ㄱ
			{HANGUL_CHOSEONG_SSANGKIYEOK, '\u3132'},//ㄲ
			{HANGUL_CHOSEONG_NIEUN, '\u3134'},//ㄴ
			{HANGUL_CHOSEONG_TIKEUT, '\u3137'},//ㄷ
			{HANGUL_CHOSEONG_SSANGTIKEUT, '\u3138'},//ㄸ
			{HANGUL_CHOSEONG_RIEUL, '\u3139'},//ㄹ
			{HANGUL_CHOSEONG_MIEUM, '\u3141'},//ㅁ
			{HANGUL_CHOSEONG_PIEUP, '\u3142'},//ㅂ
			{HANGUL_CHOSEONG_SSANGPIEUP, '\u3143'},//ㅃ
			{HANGUL_CHOSEONG_SIOS, '\u3145'},//ㅅ
			{HANGUL_CHOSEONG_SSANGSIOS, '\u3146'},//ㅆ
			{HANGUL_CHOSEONG_IEUNG, '\u3147'},//ㅇ
			{HANGUL_CHOSEONG_CIEUC, '\u3148'},//ㅈ
			{HANGUL_CHOSEONG_SSANGCIEUC, '\u3149'},//ㅉ
			{HANGUL_CHOSEONG_CHIEUCH, '\u314A'},//ㅊ
			{HANGUL_CHOSEONG_KHIEUKH, '\u314B'},//ㅋ
			{HANGUL_CHOSEONG_THIEUTH, '\u314C'},//ㅌ
			{HANGUL_CHOSEONG_PHIEUPH, '\u314D'},//ㅍ
			{HANGUL_CHOSEONG_HIEUH, '\u314E'}//ㅎ
	};

	static final char[][] CONV_FINAL_CONSONANTS = new char[][]{
			{HANGUL_JONGSEONG_KIYEOK, '\u3131'},//ㄱ
			{HANGUL_JONGSEONG_SSANGKIYEOK, '\u3132'},//ㄲ
			{HANGUL_JONGSEONG_KIYEOK_SIOS, '\u3133'},//ㄳ
			{HANGUL_JONGSEONG_NIEUN, '\u3134'},//ㄴ
			{HANGUL_JONGSEONG_NIEUN_CIEUC, '\u3135'},//ㄵ
			{HANGUL_JONGSEONG_NIEUN_HIEUH, '\u3136'},//ㄶ
			{HANGUL_JONGSEONG_TIKEUT, '\u3137'},//ㄷ
			{HANGUL_JONGSEONG_RIEUL, '\u3139'},//ㄹ
			{HANGUL_JONGSEONG_RIEUL_KIYEOK, '\u313A'},//ㄺ
			{HANGUL_JONGSEONG_RIEUL_MIEUM, '\u313B'},//ㄻ
			{HANGUL_JONGSEONG_RIEUL_PIEUP, '\u313C'},//ㄼ
			{HANGUL_JONGSEONG_RIEUL_SIOS, '\u313D'},//ㄽ
			{HANGUL_JONGSEONG_RIEUL_THIEUTH, '\u313E'},//ㄾ
			{HANGUL_JONGSEONG_RIEUL_PHIEUPH, '\u313F'},//ㄿ
			{HANGUL_JONGSEONG_RIEUL_HIEUH, '\u3140'},//ㅀ
			{HANGUL_JONGSEONG_MIEUM, '\u3141'},//ㅁ
			{HANGUL_JONGSEONG_PIEUP, '\u3142'},//ㅂ
			{HANGUL_JONGSEONG_PIEUP_SIOS, '\u3144'},//ㅄ
			{HANGUL_JONGSEONG_SIOS, '\u3145'},//ㅅ
			{HANGUL_JONGSEONG_SSANGSIOS, '\u3146'},//ㅆ
			{HANGUL_JONGSEONG_IEUNG, '\u3147'},//ㅇ
			{HANGUL_JONGSEONG_CIEUC, '\u3148'},//ㅈ
			{HANGUL_JONGSEONG_CHIEUCH, '\u314A'},//ㅊ
			{HANGUL_JONGSEONG_KHIEUKH, '\u3148'},//ㅋ
			{HANGUL_JONGSEONG_THIEUTH, '\u314C'},//ㅌ
			{HANGUL_JONGSEONG_PHIEUPH, '\u314D'},//ㅍ
			{HANGUL_JONGSEONG_HIEUH, '\u314E'}//ㅎ
	};
}
