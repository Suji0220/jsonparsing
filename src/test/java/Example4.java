import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example4 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example4.json"));
            //write code here to print all the type of phone no and the corresponding no
            HashMap<String, ?> userDetails = (HashMap<String, ?>) obj;
            List<HashMap<String,String>> phoneNumberList = (List<HashMap<String, String>>) userDetails.get("phoneNumber");

            for ( HashMap<String, String> phoneNumber : phoneNumberList)
            {
                System.out.println("Type of Phone: " + phoneNumber.get("type"));
                System.out.println("Phone number: " + phoneNumber.get("number"));
            }

          //write code here to print all the type of phone no and the corresponding no


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}