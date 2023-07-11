// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package work1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class work1 {
 
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов", 8123456, bookPhone);
        addNumber("Васильев", 8321456, bookPhone);
        addNumber("Петрова",8234561, bookPhone);
        addNumber("Иванов", 8234432, bookPhone);
        addNumber("Петрова", 8654321, bookPhone);
        addNumber("Иванов", 8645478, bookPhone);
        addNumber("Сидоров", 8745978, bookPhone);
        addNumber("Гришанов", 8244678, bookPhone);
        addNumber("Сидоров", 8945678, bookPhone);
        printBook(bookPhone);
       } 
}