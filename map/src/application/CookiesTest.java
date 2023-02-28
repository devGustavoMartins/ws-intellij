package application;

import java.util.Map;
import java.util.TreeMap;

public class CookiesTest {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Gustavo");
        cookies.put("email", "gustavo@gmail.com");
        cookies.put("address", "My house");

        cookies.remove("address");
        cookies.put("username", "Gustavo Martins");

        System.out.println("Contains 'username' key -> " + cookies.containsKey("username"));
        System.out.println("Name -> " + cookies.get("username"));
        System.out.println("Address -> " + cookies.get("address"));

        /*
        System.out.println("All Cookies:");
        for (String k : cookies.keySet()){
            System.out.println(k + ": " + cookies.get(k));
        }
         */
    }
}
