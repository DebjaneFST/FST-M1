package activities;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) {
        try {
            // 1. Create a new text file
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2. Write some text into the text file
            String data = "This is some sample text for Activity 14.";
            FileUtils.writeStringToFile(file, data, "UTF-8");
            System.out.println("Data written to file.");

            // 3. Read the text file
            String fileData = FileUtils.readFileToString(file, "UTF-8");
            System.out.println("Data in file: " + fileData);

            // 4. Create a new directory named "destDir"
            File destDir = new File("destDir");
            if (!destDir.exists()) {
                destDir.mkdir();
                System.out.println("Directory created: " + destDir.getName());
            }

            // 5. Copy the text file into this directory
            FileUtils.copyFileToDirectory(file, destDir);
            System.out.println("File copied to directory: " + destDir.getName());

            // 6. Read data from the new file in destDir
            File copiedFile = FileUtils.getFile(destDir, file.getName());
            String copiedFileData = FileUtils.readFileToString(copiedFile, "UTF-8");
            System.out.println("Data in copied file: " + copiedFileData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
