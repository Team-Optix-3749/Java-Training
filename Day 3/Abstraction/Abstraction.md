# Abstraction 🍵

### Task 🐧
```
Create an abstract class called Shirt:
 - Make an instance variable called color
 - Make a constructor that takes a String for the color & sets it to the instance variable
 - Make a public method called `getColor()` that returns the name of the color 
 - Make EMPTY abstract methods, getSize() and getPrice()

Create a default class called `T_Shirt` that extends Shirt:
 - Make an instance variable called size
 - Make an instance variable called price
 - Make a constructor that takes in a color and a size and sets the instance variables (Use super() to call the constructor of Shirt)
 - Override the method called `getSize()` that returns the size of the shirt in a string
 - Override the method called `getPrice()` that returns the price of the shirt in a string

Create another default class called 'Jacket' that extends Shirt:
 - Make and instance variable that is a boolean called isZip
 - Make an instance variable called price
 - Make an instance variable called size
 - Make a constructor that takes in a color, price, and isZip and sets the instance variables (Use super() to call the constructor of Shirt)
 - Ovveride the method `getSize()` that returns the size of the shirt in a string
 - Override the method called `getPrice()` that returns the price of the shirt

In public static void main(String[] args):
 - Create an instance of T_Shirt
 - Create an instance of Jacket
 - Print the color & size of the T_Shirt 
 - Print the color & size of the Jacket
 - Print the isZip of the Jacket
 - Print the total price of both the T_Shirt and the Jacket
```
### Requirements 🏫
```
1. A .java file
2. Prints the color & size of a T_Shirt
3. Prints the color & size of a Jacket
4. Prints the isZip of a Jacket
5. Prints the total price of the items
```