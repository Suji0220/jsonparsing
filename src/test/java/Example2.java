import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example2.json"));
          // JSONObject jsonObject =  (JSONObject) obj;

           JSONArray array = (JSONArray)obj;

           Iterator iterator = array.iterator();
           while(iterator.hasNext())
           {
               JSONObject obj1= (JSONObject)iterator.next();
               System.out.print(obj1.get("name"));
               System.out.println(" " + obj1.get("cars"));
           }




          //write code here to print all the cars for each person


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}