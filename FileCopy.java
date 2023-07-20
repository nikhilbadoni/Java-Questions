import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFilePath = "/Users/nikhilbadoni/Documents/Java/file/Bio.txt";
        String destinationFilePath = "/Users/nikhilbadoni/Documents/Java/file/Bio_New.txt";

        try (FileInputStream inputStream = new FileInputStream(sourceFilePath);
             FileOutputStream outputStream = new FileOutputStream(destinationFilePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}
