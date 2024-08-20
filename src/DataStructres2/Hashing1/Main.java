package DataStructres2.Hashing1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void demoOfHashMap() {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(12, 87);
//        map.put(34, 67);
//        map.put(26, 95);
//        map.put(11, 68);
//        map.put(17, 90);
//        map.put(12,87);
//        System.out.println(map.remove(17));
//        System.out.println(map.get(11));
//        System.out.println(map.get(13));
//        System.out.println(map.containsKey(11));
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());
//        System.out.println(map.values());
//        System.out.println(map.clone());
//      System.out.println(map.toString());
    }
    public static void demoOfHashMap1() {
        String[] countries = {"India", "Nepal", "Australia", "USA", "China"};
        int[] population = {10000, 1000, 2500, 5000, 11000};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < population.length; i++) {
            String key = countries[i];
            int value = population[i];

            map.put(key, value);
        }
        System.out.println(map);

        // Instead of using SOP we can print the above the for-each loop.

        for(String key : map.keySet()){
            System.out.println(key  + " : " + map.get(key));
        }

//        for(String coun : countries){
//            System.out.println(coun + " : " + map.get(coun));
//        }
    }
    public static void demoOfForEachLoop(){
        int[] arr = {10, 20, 30, 40, 50};

        for(int val : arr){
            System.out.println(val);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        for(int ele : list){
            System.out.println(ele + " ");
        }
    }

    public static void main(String[] args) {
        demoOfHashMap();
        demoOfHashMap1();
    }
}
