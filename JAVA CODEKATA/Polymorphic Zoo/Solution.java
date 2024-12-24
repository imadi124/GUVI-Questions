import java.util.*;  //package import 

abstract class Animal { //Abstract class Animal 
    abstract String speak();   //Abstract method speak()
}

class Lion extends Animal {    //subclass Lion
    @Override
    String speak() {           //method override 
        return "roar";
    }
}

class Elephant extends Animal {  //subclass Elephant
    @Override
    String speak() {             //method override 
        return "Trumphet";
    }
}

class Monkey extends Animal {    //subclass Monkey
    @Override
    String speak() {             //method override 
        return "Oh kAhh oh kaah";
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Animals :");
        int N = sc.nextInt(); // Number of animals
        sc.nextLine(); // Consume the newline character
        ArrayList<Animal> zoo = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter the Animal name:");
            String animalType = sc.nextLine().trim();
            Animal animal = null;

            switch (animalType) {
                case "Lion":
                    animal = new Lion();
                    break;
                case "Elephant":
                    animal = new Elephant();
                    break;
                case "Monkey":
                    animal = new Monkey();
                    break;
                default:
                    System.out.println("Unknown animal type: " + animalType);
            }

            // Add the animal only if it's not null
            if (animal != null) {
                zoo.add(animal);
            }
        }
        sc.close();

        // Print the sound of each animal in the zoo
        for (Animal animal : zoo) {
            System.out.println(animal.speak());
        }
    }
}
