# Project Haetae

Unicode Hangeul
```kotlin
dependencies {
	implementation("com.elex-project:hangeul:1.0.0")
}
```
```java
@Test
void testCase1() throws OutOfUnicodeRangeException {
    //Usage 1.
    HCharacter character = new HCharacter('호');

    log.info("{} {} {}", character.getChoSeongCompat(),
            character.getJungSeongCompat(),
            character.getJongSeongCompat());
    // ㅎ ㅗ
}

@Test
void testCase2() throws OutOfUnicodeRangeException {
    //Usage 2.
    log.info("{}", new HCharacter('ㅇ', 'ㅏ')); // 아
    log.info("{}", new HCharacter('ㅌ', 'ㅚ', 'ㄺ')); // 퇽

}

@Test
void testCase3() throws Exception {
    //Usage 3.
    char[] chars = "동해물과 백두산이 Hello, 2014!".toCharArray();
    StringBuilder sb = new StringBuilder();
    for (char c : chars) {
        try {
            HCharacter hCharacter = new HCharacter(c);
            sb.append(hCharacter.getChoSeongCompat());
            sb.append(hCharacter.getJungSeongCompat());
            if (hCharacter.getJongSeongCompat() != FILLER) sb.append(hCharacter.getJongSeongCompat());

        } catch (OutOfUnicodeRangeException e) {
            sb.append(c);
        }
    }
    log.info("{}", sb.toString());
    // ㄷㅗㅇㅎㅐㅁㅜㄹㄱㅘ ㅂㅐㄱㄷㅜㅅㅏㄴㅇㅣ Hello, 2014!
}
```

---
developed by Elex
https://www.elex-project.com
