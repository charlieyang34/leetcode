package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveVowelsFromAStringTest {

    private final RemoveVowelsFromAString removeVowelsFromAString = new RemoveVowelsFromAString();

    @Test
    void removeVowels() {
        String s = "";
        int n = s.length();
        String expected = "";
        assertEquals(expected, removeVowelsFromAString.removeVowels(s,n));
    }
}