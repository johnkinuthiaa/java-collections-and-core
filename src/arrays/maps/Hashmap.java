package arrays.maps;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> cities = new HashMap<>();
        cities.put("New york",1);
        cities.put("new Orleans",1);
        cities.put("New jersey",1);
        cities.put("chicago",1);
        System.out.println(cities.keySet());

        System.out.println(cities.entrySet());

    }
}
