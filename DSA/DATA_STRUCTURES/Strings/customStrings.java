import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class customStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");

        int len = str1.length(); 
        System.out.println("the length of str1 is " + len);

        char ch = str1.charAt(1);
        System.out.println("character at index 1 is " + ch);

        String sub = str1.substring(1, 4);
        System.out.println("substring from index 1 to 4 is " + sub);

        String result = str1 + " " + str2;  
        System.out.println("the concatenation of str1 and str2 is: " + result);

        boolean isEqual = str1.equals(str2); 
        System.out.println("comparing str1 and str2 using equals: " + isEqual);
        
        boolean ignoreCase = str1.equalsIgnoreCase("hello");  
        System.out.println("comparing str1 and 'hello' ignoring case: " + ignoreCase);
        
        int cmp = str1.compareTo(str2);  
        System.out.println("comparing str1 and str2 using compareTo: " + cmp);
        
        boolean contains = str1.contains("el");
        System.out.println("checking does str1 contains el: "+contains);
        
        int index = str1.indexOf('e');
        System.out.println("getting the first index of e"+index);
        
        int lastIndex = str1.lastIndexOf('l'); 
        System.out.println("getting the last index of l"+lastIndex);
        
        boolean starts = str1.startsWith("He"); 
        System.out.println("checking does str1 starts with He: "+starts);
        
        boolean ends = str1.endsWith("lo"); 
        System.out.println("checking does str1 ends with lo: "+ends);

        String upper = str1.toUpperCase(); 
        System.out.println("converting str1 to upper case: "+upper);
        
        String lower = str1.toLowerCase();  
        System.out.println("converting str1 to lower case: "+lower);
        
        String replaced = str1.replace('l', 'x');
        System.out.println("replacing l with x in str1: "+replaced);
        
        String trimmed = "  Hello  ".trim();  
        System.out.println("trimming the string: "+trimmed);
        
        String str3 = "apple,banana,orange";
        String[] fruits = str3.split(",");
        System.out.println("splitting the string and converting into array: "+Arrays.toString(fruits));

        char[] charArray = str1.toCharArray();
        System.out.println("converting str1 to char array: "+Arrays.toString(charArray));

        boolean isEmpty = str1.isEmpty();  
        System.out.println("checking is str1 is empty: "+isEmpty);
        boolean isBlank = "  ".isBlank(); 
        System.out.println("checking is blank: "+isBlank);

        System.out.println("\nreversing the string str1: "+reverseString(str1));

        System.out.println("checking is str2 palindrome or not: "+isPalindrome(str2));    

        System.out.println("getting all subsequences of str1: "+getAllSubstrings(str1));

    }
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static List<String> getAllSubstrings(String s) {
        List<String> substrings = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(s.substring(i, j));
            }
        }
        return substrings;
    }

    
}