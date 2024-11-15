Scientific Calculator with Unit Conversion and Constants Lookup
===========================================================
Overview

This scientific calculator project is designed to greatly perform basic arithmetic, unit conversions, trigonometric functions, and constant lookup. These include a conversion of many different types of scientific units and their corresponding constants, thereby giving a multitude of functionalities ranging from speed, length, and area conversions to more intricate factorial and advanced trigonometric functions. This was implemented in Java with the explicit intent of making it modular and very efficient.

Feature

Basic Arithmetic Operations: Add, Subtract, Multiply, Divide, and Mod

Trig Operations: All operations involving sine, Cosine, and tangent along with their inverse hyperbolic and hyperbolic trig values in radians and degrees

Logarithm Operations: Calculate base-n, natural logarithms and base-10 logarithms

Exponential and Power Operations: Exponentiation and square root function

Constant Lookup: Returns Scientific constants such as the speed of light, Planck constant, gravitational constant etc.

Unit Conversions:Convert values from one unit to another for each of the following units: velocity, length, area, volume, force, pressure, energy, mass, heat, temperature, power, and data

Number System Conversions: decimal, octal, hexadecimal, binary

-------------------
Prerequisites
Java JDK: versions 8 and above
IDE: Pick a favorite. Popular options are IntelliJ IDEA, Eclipse, and VS Code.

1. Run the main method in Calc class.

You can use the following console prompts to go to the different functions and conversion.

Just follow the prompts on the screen to do a calculation, a conversion or look up a constant.

Class Constants
-------------

There is a set of predefined scientific constants with methods to retrieve both the value as well as unit for a given constant name.

Attributes: Holds constants as final double values, for example speedOfLight, planckConstant, etc.

Methods:


getConstant(String constantName): Returns the value of the constant by name

getUnit(String constantName): Returns the unit of the constant by name

--------------------------------------------------------
Calculator
========================================================
This class contains methods for all calculator functions, such as unit conversions and mathematical calculations.

Main Methods:

main(String[] args): entry point for program execution.

unitConv(): In charge of getting user input and calling the respective conversion methods.

constant() uses class Constants for science constants.

simpleCalc(): Performs simple arithmetic functions.

trigonometricFunctions(): Calculates trigonometric functions and their inverse

Methods for Conversion

speed(), length(), area(), volume(), etc.: Input methods by user

convertSpeed(double speed, String fromUnit, String toUnit): Convert the speed value from one unit to another

More such methods in similar cases of conversion. Returns the result of conversion based on user inputs.

Utility Methods:
 
evaluate(String expression): Evaluates any complex mathematical expression.
 
factorial(int n): Calculates factorial of an integer
Helper methods such as applyOperation, getPrecedence, etc., to perform any mathematical operations on the input expressions.

 Testing and Validation

The calculator is tested with unit tests for some of the basic functionalities as mentioned below:

Basic Calculations: It had been tested using valid input and boundary cases such as zero division.

Unit Conversions: Proper conversion was verified for different units

Constant Retrieval: It had ensured proper retrieval of the constants along with invalid names.

 Known Issues & Limitations
Compatibility: It has been designed for Java. In other platforms, it needs manipulation.

Input of Data: Now this calculator is implemented for console-based input. Further, it can be improved to GUI for usability purposes.

==============================

Future Advancements

Graphical User Interface (GUI): To make user interaction more user-friendly by implementing GUI.

Additional Constants and Units: Additional constants to the list and types of units.

Additional Math Functions: Addition of complex numbers and matrices operations.

This README.md contains an overview of the project with setup and usage as well as class structure and functionalities briefly documented for new users.
