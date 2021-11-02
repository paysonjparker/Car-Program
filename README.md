# Car-Program
This program models my knowledge of the core Obeject-Oriented Programming principles: abstraction, encapsulation, interfaces, and polymorphism. 

# UML Class Diagram: 
![UML Diagram Car.pdf](https://github.com/paysonjparker/Car-Program/files/7456906/UML.Diagram.Car.pdf)

# Abstraction:
* I used one abtract class in this program, the Car base class.
* The abstract Car class will not allow users to create an instance of it, rather it will force them to create either a new Sedan or Truck object.
* The subclasses of this abstract base class share similar characteristics as the base class, but can have differences.
  * Ex. The Car class has a honk() method, but in both the Sedan and Truck classes, that method is overrode to make each object's honk unique.
  * The Sedan and Truck classes have the same variables as the Car class.

# Encapsulation
* Encapsulation is a way to use class variables with class methods as a single unit.
* 
In this program, I created an abstract Car class that implements a Car Interface and serves as the base class for other car objects.
The Car Interface forces the Car class to provide each one of the methods inside the Interface. In this case, I created two classes, 
Sedan and Truck, that use inheritance and extend the Car class. Because the Car class is abstract, users will not be able to instantiate 
a new Car. Instead, they will have to instantiate either a new Sedan or a new Truck, which both share the same characteristics and 
behaviors as the Car class, except for their own unique honk() method. Each Car object, whether it be a Sedan or Truck, contains 1 Engine and 4 Tires.
To keep track of each Tire on the car, I created an array of length 4 and stored a Tire object into each index of the array.
