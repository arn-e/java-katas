import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.net.URI;

public class FileReaderTest {

    public static void main(String[] args) throws FileNotFoundException{
        File newFile = new File("/Users/arne/IdeaProjects/testEnvironment/public/index.html");
        File newFile2 = new File("index.html");

        FileInputStream fis1 = new FileInputStream(newFile2);
        FileInputStream fis = new FileInputStream(newFile);
        FileReader reader = new FileReader("/Users/arne/IdeaProjects/testEnvironment/public/index.html");
    }
}
