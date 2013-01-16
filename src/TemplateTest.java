import java.util.List;
import java.util.ArrayList;

// look into implementation of List & ArrayList

public class TemplateTest {

    public static String parseDocument(String document) {
        
    }

    private static String readFile(String filename) {
        List<String> returnVal = new ArrayList<String>();
    }
    public static void main(String[] args){
//        Debug Only
        String filename = "./public/index.html";
        String newDocument = parseDocument(filename);
        System.out.println(newDocument);
    }
}
