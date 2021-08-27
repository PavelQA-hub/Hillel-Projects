package collection.wordList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListOfWords {
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза");
        list.add("лира");
        list.add("лоза");
        list.add("книга");
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            String buf = "р";

            if (list.get(i).contains("р") && list.get(i).contains("л"))
            {
                continue;
            }
            else
            if (list.get(i).contains("л"))
            {
                list.add(i + 1, list.get(i));
                i++;
            }

            if (s.charAt(0) == buf.charAt(0))
            {
                list.remove(i);
            }

        }

        return list;
    }
}
