public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
<<<<<<< HEAD
        // Replace the following statement with your code
        return null;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        return false;
    }
=======
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                // Convert uppercase to lowercase by adding 32 to its ASCII code
                c = (char)(c + 32); 
            }
            str1 += c;
        }
        return str1;
    }

   /** 
 * Checks if str1 contains str2 as a substring.
 * If yes, returns true; otherwise returns false.
 */
public static boolean contains(String str1, String str2) {
    if (str2.length() > str1.length()) {
        System.out.println("Error, second string larger than first");
        return false;
    }
    for (int i = 0; i <= str1.length() - str2.length(); i++) {
        int j;
        for (j = 0; j < str2.length(); j++) {
            if (str1.charAt(i + j) != str2.charAt(j)) {
                break;
            }
        }

        if (j == str2.length()) {
            return true; 
        }
    }
    return false;
}

>>>>>>> f824e41 (HW4)
}
