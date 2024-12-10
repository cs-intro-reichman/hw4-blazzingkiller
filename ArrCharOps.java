public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c', 'l', 'e', 'a', 'r', 'l', 'y'};
        char[] arr2 = {'U', 'n', 'd', 'e', 'r', 's', 't', 'o', 'o', 'd'};
        
        System.out.println("String: " + str); // Prints the string
        System.out.print("Array1: ");
        ArrCharOps.println(arr1); // Prints an array of characters
        System.out.print("Array2: ");
        ArrCharOps.println(arr2); // Prints the second array of characters
        
        System.out.println("Character at index 2 in Array1: " + charAt(arr1, 2));      
        System.out.println("Index of 'l' in Array1: " + indexOf(arr1, 'l'));  
        System.out.println("Index of 'l' in Array1 starting from index 3: " + indexOf(arr1, 'l', 3)); 
        System.out.println("Last index of 'l' in Array1: " + lastIndexOf(arr1, 'l'));
        System.out.print("Concatenated arrays: ");
        ArrCharOps.println(concat(arr1, arr2));
        System.out.print("Sub-array of Array2 (index 2 to 9): ");
        ArrCharOps.println(subArray(arr2, 2, 9));
        
        System.out.println("Comparison of \"abcd\" and \"abcd\": " + compareTo("abcd", "abcd"));
        System.out.println("Comparison of \"abc\" and \"abcd\": " + compareTo("abc", "abcd"));
        System.out.println("Comparison of \"abw\" and \"abcd\": " + compareTo("abw", "abcd"));
        System.out.println("Comparison of \"Abcd\" and \"a\": " + compareTo("Abcd", "a"));
        System.out.println("Comparison of \"apple\" and \"banana\": " + compareTo("apple", "banana"));
        System.out.println("Comparison of \"apple\" and \"applepie\": " + compareTo("apple", "applepie"));
        System.out.println("Comparison of \"Zoo\" and \"zoo\": " + compareTo("Zoo", "zoo"));
        System.out.println("HashCode of Array1: " + hashCode(arr1));
        System.out.println("HashCode of Array2: " + hashCode(arr2));
    }

    public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void println(char[] arr) {
        if (arr == null) {
            System.out.println("(null)");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static char charAt(char[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            System.out.println("Value out of bounds");
            return '\0'; 
        }
        return arr[index];
    }

    public static int indexOf(char[] arr, char ch) {
        if (arr == null) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(char[] arr, char ch, int fromIndex) {
        if (arr == null || fromIndex < 0 || fromIndex >= arr.length) {
            return -1;
        }
        for (int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(char[] arr, char ch) {
        if (arr == null) {
            return -1;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        if (arr1 == null || arr2 == null) {
            return new char[0];
        }
        char[] arrsum = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrsum[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrsum[arr1.length + i] = arr2[i];
        }
        return arrsum;
    }

    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        if (arr == null || beginIndex < 0 || endIndex > arr.length || beginIndex > endIndex) {
            return new char[0]; 
        }
        char[] subarr = new char[endIndex - beginIndex];
        for (int i = beginIndex; i < endIndex; i++) {
            subarr[i - beginIndex] = arr[i];
        }
        return subarr;
    }

    public static long hashCode(char[] arr) {
        if (arr == null) {
            return 0;
        }
        long hash = 0;
        long power = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            hash += arr[i] * power;
            power *= 7;
        }
        return hash;
    }

    public static int compareTo(String str1, String str2) {
        if (str1.length() == 0 && str2.length() == 0) {
            return 0;
        }
        if (str1.length() == 0) {
            return str2.length() - str1.length();
        }
        if (str2.length() == 0) {
            return str1.length() - str2.length();
        }
        
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            if (char1 < char2) {
                return -1;
            } else if (char1 > char2) {
                return 1;
            }
        }
        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() > str2.length()) {
            return 1;
        }
        return 0;
    }
}
