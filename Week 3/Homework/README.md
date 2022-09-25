# Week 3 Homework 🍵

### Task 🐧
Create a mock FRC robot 🥶🥶🥶🥶🥶🥶

Create a class called Motor
 - Make a constructor for the port number of the motor
 - Includes `set()`, `get()`, and `stop()` methods
   - `set()` sets the speed of the motor
   - `get()` returns the speed of the motor
   - `stop()` sets the speed of the motor to 0

Create a class called Shooter
 - Encapsulate two motors with ports 25 and 26 (Hint: Private object but public methods)
 - Create a method to set the speed of both motors

Create a class called Shoot
  - Create an instance variable for the Shooter class & set it to the parameter of the constructor
  - Includes `initialize()`, `execute()`, and `end()` methods
    - `initialize()` sets the speed of the shooter to 0 & prints "Shooter initialized"
    - `execute()` sets the speed of the shooter to 1 & prints "Shooting"
    - `end()` sets the speed of the shooter to 0 & prints "Shooter stopped"

Create a class called Robot
 - Declare the Shooter and Shoot objects
 - Create a method called `teleopInit()` that calls the `initialize()` method of the Shoot object
 - Create a method called `teleopPeriodic()` that calls the `execute()` method of the Shoot object IF the user enters the key "A" in the terminal
 - Create a method called `teleopEnd()` that calls the `end()` method of the Shoot object

### Requirements 🏫
```
1. A .java file
2. Prints the exact qutient of 39 and 49
3. Prints the rounded quotient of 37 and 49
4. Prints the product of 37 and 49
```