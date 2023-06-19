import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        String reversed = new String(chars);

        char firstChar = reversed.charAt(0);
        if (firstChar >= 'a' && firstChar <= 'z') {
            firstChar = (char) (firstChar - 32);
        }

        char lastChar = reversed.charAt(reversed.length() - 1);
        if (lastChar >= 'a' && lastChar <= 'z') {
            lastChar = (char) (lastChar - 32);
        }

        reversed = firstChar + reversed.substring(1, reversed.length() - 1) + lastChar;

        System.out.println("Reversed string with uppercase first and last characters: " + reversed);
        scanner.close();
    }
}
/*
OTHER APPROACH
 import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char charArr[] = str.toCharArray();
        int arrLen = charArr.length;
        String uc = ""+charArr[0];
        charArr[0] = uc.toUpperCase().charAt(0);
        uc = ""+charArr[arrLen-1];
        charArr[arrLen-1] = uc.toUpperCase().charAt(0);
        for (int i = 0; i < (arrLen / 2); i++) {
            char temp = charArr[i];
            charArr[i] = charArr[arrLen - i - 1];
            charArr[arrLen - i - 1] = temp;
        }

        str = "";
        for (int i = 0; i < arrLen; i++)
            str += charArr[i];
        System.out.print("\nReverse: " + str);
        System.out.println();
        sc.close();
    }
}
 */