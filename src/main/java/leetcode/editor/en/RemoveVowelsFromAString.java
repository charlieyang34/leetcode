package leetcode.editor.en;

public class RemoveVowelsFromAString {
    public String removeVowels(String s, int n) {
        if (n == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
