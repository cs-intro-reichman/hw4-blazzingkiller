public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c', 'l', 'e', 'a', 'r', 'l', 'y'};
        char[] arr2 = {'U', 'n', 'd', 'e', 'r', 's', 't', 'o', 'o', 'd'};
        
        System.out.println(str);  // Prints the string
        ArrCharOps.println(arr1); // Prints an array of characters
        System.out.println(charAt(arr1, 2));      
        System.out.println(indexOf(arr1, 'l'));  
        System.out.println(indexOf(arr1, 'l', 3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static char charAt(char[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Value out of bounds");
            return '\0'; // Null character
        }
        return arr[index];
    }

    public static int indexOf(char[] arr, char ch) {
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
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        char[] arrsum = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrsum[i] = arr1[i];
        }
        for (int i = arr1.length; i < arrsum.length; i++) {
            arrsum[i] = arr2[i - arr1.length];
        }
        return arrsum;
    }

    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char[] subarr = new char[endIndex - beginIndex];
        for (int i = beginIndex; i < endIndex; i++) {
            subarr[i - beginIndex] = arr[i];
        }
        return subarr;
    }

    public static long hashCode(char[] arr) {
        long hash = 0;
        long power = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            hash += arr[i] * power;
            power *= 7;
        }
        return hash;
    }

    public static int compareTo(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return -2;
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
