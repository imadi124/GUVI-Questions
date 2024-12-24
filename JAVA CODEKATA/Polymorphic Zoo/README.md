# Polymorphic Zoo

# Problem Statement:
Create a program that models a zoo with animals demonstrating polymorphism. Each animal should have a speak method, but the sound they make depends on the type of animal. Implement a system that allows adding different animals to the zoo and prints their sounds.

# Description:
Your task is to design a Java program that uses polymorphism to model a zoo. You need to create an abstract class Animal with a method speak(). Then, create at least three subclasses (Lion, Elephant, Monkey) that override the speak() method to return their respective sounds. The program should allow the user to add animals to the zoo and then print out the sounds of all animals in the zoo.

# Input Format:
The first line of input contains an integer N, the number of animals.
The next N lines each contain a string representing the type of animal (Lion, Elephant, Monkey).
# Output Format:
The output should be the sounds of all animals in the zoo, each on a new line, in the order they were added.

# Sample Input:
3
Lion
Elephant
Monkey
# Sample Output:
Roar
Trumpet
Ooh Ooh Aah Aah
