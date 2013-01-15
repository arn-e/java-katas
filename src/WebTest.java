import static spark.Spark.*;
import spark.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WebTest {

    public static void main(String[] args) {
        setPort(9000);
        final String filename = "./public/index.html";

        get(new Route("/") {
            @Override
            public Object handle(Request request, Response response){
                List<String> returnVal = new ArrayList<String>();

                try { returnVal = Files.readAllLines(Paths.get(filename), Charset.defaultCharset()); }
                catch(IOException e) { e.printStackTrace(); }

                response.type("text/html");
                StringBuilder cleaned = new StringBuilder();
                for (String i : returnVal) { cleaned.append(i); }
                return cleaned;
            }
        });


    }
}
