# Classes and Objects

# Problem Statement
Create a class Car that represents a car with a unique twist. The Car class should include properties such as make, model, and year. Additionally, it should have a method getCarAge that calculates the car's age based on the current year input by the user. However, you need to ensure that the car's year of manufacture is validated to be not in the future.

# Description
Define a class Car with private properties: make (String), model (String), and year (int).
Include a constructor that initializes these properties.
Create a method getCarAge that calculates the age of the car based on the current year provided by the user.
Ensure the year property is validated to be less than or equal to the current year.

# Input Format
String representing the make of the car.
String representing the model of the car.
Integer representing the year of the car.
Integer representing the current year.
# Output Format
Integer representing the age of the car.
A message indicating if the year is invalid.

# Sample Input 1:
Toyota 
Corolla 
2015 
2024
# Sample Output 1:
9

# Sample Input 2:
Tesla
ModelS
2025
2024
# Sample Output 2:
Invalid year
