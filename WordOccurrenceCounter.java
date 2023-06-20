public class WordOccurrenceCounter {
    public static int countOccurrence(String statement, String word) {
        
        statement = statement.toLowerCase();
        word = word.toLowerCase();

        
        String[] words = statement.split("\\s+");

        
        int count = 0;

        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String givenStatement = "Java is an Object Oriented Programming language. Java is Platform independent.";
        String givenWord = "java";
        int occurrences = countOccurrence(givenStatement, givenWord);
        System.out.println("The word '" + givenWord + "' occurs " + occurrences + " times in the statement.");
    }
}
