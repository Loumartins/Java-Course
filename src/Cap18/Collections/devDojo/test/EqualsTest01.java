package Cap18.Collections.devDojo.test;

import Cap18.Collections.devDojo.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABC1", "Iphone");
        Smartphone smartphone2 = new Smartphone("1ABC1", "Iphone");

        System.out.println(smartphone1.equals(smartphone2));
    }
}
