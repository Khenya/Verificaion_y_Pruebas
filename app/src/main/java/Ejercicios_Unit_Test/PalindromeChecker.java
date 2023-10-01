package Ejercicios_Unit_Test;
public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        // Eliminamos espacios y convertimos a minúsculas para hacer la comparación
        word = word.replaceAll("\\s+", "").toLowerCase();

        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
