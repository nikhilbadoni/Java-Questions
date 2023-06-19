public class StringConcatenator {
    public static void main(String[] args) {
        String[] arr1 = {"Hello", " ", "world!"};
        String[] arr2 = null;
        String[] arr3 = {"This", " ", "is", " ", "an", " ", "example"};

        String result1 = concatenateStrings(arr1);
        String result2 = concatenateStrings(arr2);
        String result3 = concatenateStrings(arr3);

        System.out.println("Result 1: " + result1);  
        System.out.println("Result 2: " + result2);  
        System.out.println("Result 3: " + result3);  
    }

    public static String concatenateStrings(String[] strings) {
        if (strings == null) {
            return "";
        }

        String result = "";
        for (String str : strings) {
            if (str != null) {
                result += str;
            }
        }

        return result;
    }
}
