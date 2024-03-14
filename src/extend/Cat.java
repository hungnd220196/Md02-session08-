package extend;

import java.io.Serializable;

public class Cat extends Animal {
    public String name;
    public String color;

    public Cat() {
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat(String species, String name, String color) {
        super(species);
        this.name = name;
        this.color = color;
    }

//    @Override
//    public void move() {
//        System.out.println("Mèo đang di chuyển");
//    }

//    @Override
//    public void eat() {
//        System.out.println("Mèo ăn cá");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("mèo đang ngủ");
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}
