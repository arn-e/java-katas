import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.nio.file.Paths;


public class FileReaderTest {

    public static void main(String[] args) {
        String filename = "./public/index.html";

        try {
            List<String> allLines = Files.readAllLines(Paths.get(filename), Charset.defaultCharset());
            for ( String i : allLines ) {
                System.out.println(i);
            }
        } catch(IOException exception) {
            exception.printStackTrace();
            throw new RuntimeException("Oh, a Runtime Exception?");
        }
    }
}
