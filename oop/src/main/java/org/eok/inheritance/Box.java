package org.eok.inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box () {
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    Box(double side) {
        this.width = side;
        this.length = side;
        this.height = side;
    }

    Box(double length, double height, double width) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box (Box old) {
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
