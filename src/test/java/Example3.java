import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example3.json"));
            JSONObject jsonObject =  (JSONObject) obj;


            JSONObject responseJson = (JSONObject) jsonObject.get("responseData");
            JSONObject feedJson = (JSONObject) responseJson.get("feed");

            List<HashMap<String, ?>> listOfEntries = (List<HashMap<String, ?>>) feedJson.get("entries");

            for (HashMap<String,?> entryMap : listOfEntries)
            {
                System.out.println( "The title for the Entry : " + entryMap.get("title"));
                System.out.println("The categories are:");
                List<String> categories = (List<String>) entryMap.get("categories");
                printCategories(categories);
            }

          //write code here to print all the titles and the associated categories


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }


    }
    public static void printCategories ( List<String> categories)
    {
        for ( String category : categories)
            System.out.println(category);
    }
}