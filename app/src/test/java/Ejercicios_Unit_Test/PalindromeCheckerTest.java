package Ejercicios_Unit_Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PalindromeCheckerTest {

    @ParameterizedTest
    @CsvSource({
            "jose, false",
            "oro, true",
            "radar, true",
            "Aibohphobia, true",
            "not, false",
            "madam, true",
            "Was, false",
            "Eva, false",
            "a, true",
            "Aba, true",
            "abcBA, true"
    })
    public void testIsPalindrome(String word, boolean expectedResult) {
        PalindromeChecker checker = new PalindromeChecker();
        boolean actualResult = checker.isPalindrome(word);
        Assertions.assertEquals(expectedResult, actualResult, "La palabra '" + word + "' no se evaluó correctamente como palíndromo.");
    }
}
