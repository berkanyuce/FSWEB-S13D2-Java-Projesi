public class Main {
    public static void main(String[] args) {
        // Palindrome
        System.out.println("Palindrome mu : " + isPalindrome(11212));
        System.out.println("Perfect mi? : " + isPerfectNumber(-1));
        System.out.println("Sayı to kelime : " + numberToWords(-12));
    }

    // Palindrome Sayıyı Bulma
    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        String s = String.valueOf(num);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static boolean isPerfectNumber(int num) {
        int result = 0;
        for (int i = 1; i <= num / 2; i++) {
            if(num % i == 0) {
                result += i;
            }
        }
        return result == num ? true : false;
    }

    public static String numberToWords(int num) {
        String[] sayilar = {"Zero", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine"};
        String result = "";
        if (num < 0) return "Invalid Value";
        else {
            String s = String.valueOf(num);
            for (int i = 0; i < s.length(); i++) {
                result += sayilar[Character.getNumericValue(s.charAt(i))] + " ";
            }
        }
        return result;
    }
}