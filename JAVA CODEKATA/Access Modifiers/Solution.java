import java.util.*;  //package import 

public class Solution {//main class  
    public static void main(String[] args) { //boilerplate code 
        Scanner sc = new Scanner(System.in); //input scanner code 
        String name = sc.next();  //input for the name 
        int age = sc.nextInt();   //input for the age 
        
        Person person = new Person();   //Creating the object 
        person.setName(name);           //using the object to call the function so that i can print "name" through main class 
        person.setAge(age);              //using the object to call the function so that i can print "Age" through main class 
        if (age>0){
            System.out.println("Name: " + person.getName());
            System.out.println("Name: " + person.getAge());
        }
        
        sc.close();
    }
}
class Person{ //creating the class person 
    private String name;  //declaring private property name 
    private int age;      //declaring private property age 


public void setName(String name){  //constructor for the Name 
    this.name = name;
 }
public void setAge(int age){   //constructor for the age 
    if (age>0){
    this.age = age;
    }else{
         System.out.println("Invalid age.");
    }
    }

public String getName(){ //method for the name 
    return this.name;
}

public int getAge(){ //method for the name 
    return this.age;
}
}
   
