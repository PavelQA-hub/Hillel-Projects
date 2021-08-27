package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception{
        String[] cats = new String[] {"cat1", "cat2", "cat3", "cat4", "cat5", "cat6", "cat7", "cat8", "cat9", "cat10"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats)
    {
        HashMap<String, Cat> addCats = new HashMap<String, Cat>();
        for(String s: cats){
            addCats.put(s, new Cat(s));
        }
        return addCats;
    }
}


