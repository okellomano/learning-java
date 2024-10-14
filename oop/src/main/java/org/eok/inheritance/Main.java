package org.eok.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(9);
        Box box1 = new Box(box);

        BoxWeight box2 = new BoxWeight();
        BoxWeight box3 = new BoxWeight(2, 3, 4, 8);

        System.out.println(box.length + " " + box.width + " " + box.height);

        System.out.println(box2.height);

        System.out.println(box3.weight);
    }
}
