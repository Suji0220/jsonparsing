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
            JSONObject jsonObject =  (JSONObject) obj;

            HashMap<String, String> userDetails = (HashMap<String, String>)obj;
            List<Map<String, ?>> phoneNumberInfo = (List<Map<String, ?>>) jsonObject.get("phoneNumber");


            for(int i = 0; i < phoneNumberInfo.size(); i++) {
                System.out.print(phoneNumberInfo.get(i).get("type").toString());
                System.out.println(phoneNumberInfo.get(i).get("number").toString());

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