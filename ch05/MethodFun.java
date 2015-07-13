import java.io.*;

class MyAnimal {
    int weight = 10;
    int height = 10;
    int legs   = 2;
    String name = "Animal";    

    MyAnimal() {
        System.out.println("A new animal is born. It has no name yet. Meow!");
    }

    MyAnimal(String name) {
        System.out.printf("A new animal is born. Its name is %s. Meow!\n", name);
        setName(name);
    }

    public void getStats(){
        System.out.printf("Weight = %d Height = %d Legs = %d Name = %s\n", weight, height, legs, name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void giveToys(String ... toys) {
        for(String item : toys) {
            System.out.println(item);
        }
    }
}

public class MethodFun {
    public static void main(String[] args) {
        MyAnimal kitty = new MyAnimal("Lucy");
        kitty.getStats();
        kitty.setName("Lucy");
        kitty.giveToys("ball", "dog bone", "chew toy", "laser");
    }
}  
