# Abstraction 🍵

### Task 🐧
 - Create an abstract class called Shirt:
   - Make an instance variable called color
   - Make a constructor that takes a String for the color & sets it to the instance variable
   - Make a public method called `getColor()` that returns the name of the color 
   - Make an empty abstract method called `getDescription()`

 - Create a default class called `T_Shirt` that extends Shirt:
   - Make an instance variable called size
   - Make an instance variable called price
   - Make a constructor that takes in a color, size, price and sets the instance variables (Use super() to call the constructor of Shirt)
   - Override the method called `getDescription()` that returns the color, size, and price of the T_Shirt

 - Create another default class called 'Jacket' that extends Shirt:
   - Make an instance variable called price
   - Make an instance variable called brand
   - Make a constructor that takes in a color, and price, and sets the instance variables (Use super() to call the constructor of Shirt)
   - Override the method called `getDescription()` that returns the color, brand, and price of the T_Shirt

### Requirements 🏫
```
1. A .java file
2. Prints the color & size of a T_Shirt
3. Prints the color & size of a Jacket
4. Prints the isZip of a Jacket
5. Prints the total price of the items
```