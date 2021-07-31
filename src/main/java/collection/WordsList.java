package collection;

import java.util.ArrayList;
import java.util.List;

public class WordsList {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList();

        wordList.add("Роза");
        wordList.add("Лира");
        wordList.add("Лоза");
        wordList.add("Ваза");
        wordList.add("Книга");

        System.out.println(wordList.size());

        for (int i = 0; i < wordList.size(); i++) {
            System.out.println(wordList.get(i));
        }
    }
}
