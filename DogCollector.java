import java.io.*;

class Dog {
    String name;
    String breed;
    int age;
    String color;
    boolean Service;

    Dog()
    { 
    }

    Dog(String name, String breed, int age, String color, boolean Service)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.Service = Service;
    }

}

public class DogCollector {
    public static void main(String[] args)
    {
        System.out.println("1st Dog");
        Dog dog = new Dog("Diggs","German Shepard", 3, " tan/black ", true);
        System.out.println("Name: " + dog.name + " Breed: " + dog.breed + " Age: " + 
        dog.age + " Color:" + dog.color + "Service? : " + dog.Service);
        
        System.out.println("2nd Dog");
        Dog dog2 = new Dog("Scoob", "Dobermann", 10, " black/brown ", false);
        System.out.println("Name: " + dog2.name + " Breed: " + dog2.breed + " Age: " + 
        dog2.age + " Color:" + dog2.color + "Service? : " + dog2.Service);

        System.out.println("3rd Dog");
        Dog dog3 = new Dog("Buddy", "Beagle", 5, "black/tan/white", false);
        System.out.println("Name: " + dog3.name + " Breed: " + dog3.breed + " Age: " + 
        dog3.age + " Color:" + dog3.color + "Service? : " + dog3.Service);
    }
}
