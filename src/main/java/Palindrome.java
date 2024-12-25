public class Palindrome {
    /**
     * Checks if a given string is a palindrome.
     * Palindromes are words that read the same forwards and backwards, e.g., 'bob', 'racecar'.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str) {
        if (str == null || str.isEmpty()) {
            return false; 
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found, not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }
}
