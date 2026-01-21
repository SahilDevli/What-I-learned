import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"string1");
        map.put(2,"string2");
        map.put(3,"string3");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
/*
Map methods

put(K key, V value)	        Inserts a key-value pair into the map. 

get(K key)	                Returns the value associated with the key, or null if the key does not exist.

remove(K key)	            Removes the key-value pair from the map.

containsKey(K key)	        Checks if the map contains the given key.

containsValue(V value)	    Checks if the map contains the given value.

size()	                    Returns the number of key-value pairs in the map.

isEmpty()	                Returns true if the map is empty, otherwise false.

clear()	                    Removes all key-value pairs from the map.

keySet()	                Returns a Set of all keys.

values()	                Returns a Collection of all values.

entrySet()	                Returns a Set of key-value pairs.

*/