// Пусть дан список сотрудников:
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Иван Савин
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

package work2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class work2 {
        public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Иван Иванов", 1);
        phoneBook.put("Светлана Петрова",2 );
        phoneBook.put("Кристина Белова", 3);
        phoneBook.put("Анна Мусина", 4);
        phoneBook.put("Анна Крутова", 5);
        phoneBook.put("Иван Юрин", 6);
        phoneBook.put("Петр Лыков", 7);
        phoneBook.put("Павел Чернов", 8);
        phoneBook.put("Петр Чернышов", 9);
        phoneBook.put("Мария Федорова", 10);
        phoneBook.put("Марина Светлова", 11);
        phoneBook.put("Мария Савина", 12);
        phoneBook.put("Мария Рыкова", 13);
        phoneBook.put("Марина Лугова", 14);
        phoneBook.put("Анна Владимирова", 15);
        phoneBook.put("Иван Мечников",16);
        phoneBook.put("Петр Петин", 17);
        phoneBook.put("Иван Ежов",18);

        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : phoneBook.keySet()) {
            String firstName = name.split(" ")[0];
            nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCount.entrySet());
        Collections.sort(sortedNames, Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sortedNames) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }    
}
