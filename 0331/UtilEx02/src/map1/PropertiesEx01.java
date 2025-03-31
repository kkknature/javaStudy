package map1;

import java.util.Properties;

public class PropertiesEx01 {
    public static void main(String[] args) {

        Properties prop = new Properties();
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        System.out.println(prop);
        System.out.println(prop.size());

        System.out.println(prop.getProperty("timeout"));
        System.out.println(prop.getProperty("language"));
    }
}
