import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example1.json"));

            JSONObject jsonObject =  (JSONObject) obj;

            List<Map<String, ?>> listInfo = (List<Map<String, ?>>) jsonObject.get("platforms");


            for(int i = 0; i < listInfo.size(); i++) {
                System.out.print(listInfo.get(i).get("id").toString()+" ");
                System.out.println(listInfo.get(i).get("name").toString());
            }

            Map<String, ?> map = (HashMap<String, ?>) jsonObject.get("esrbRating");
            System.out.println("Id: " + map.get("id").toString());
            System.out.println("Code: " + map.get("code").toString());
            System.out.println("Name: " + map.get("name").toString());


           //write code here to parse the json print all the platforms




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}