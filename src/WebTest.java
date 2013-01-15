import static spark.Spark.*;
import spark.*;

import java.io.*;

public class WebTest {

    public static void main(String[] args) throws FileNotFoundException {
        setPort(9000);
        File newFile = new File("/Users/arne/IdeaProjects/testEnvironment/public/index.html");
        FileInputStream fis1 = new FileInputStream(newFile);
        FileReader input = new FileReader(newFile);
        final BufferedReader buffer = new BufferedReader(input);

        get(new Route("/") {
            @Override
            public Object handle(Request request, Response response){
                String returnVal = "";
                try {
                    returnVal = buffer.readLine();
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
                return returnVal;
            }
        });

        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });
    }
}
