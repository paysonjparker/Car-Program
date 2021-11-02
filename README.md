# Car-Program
This program models my knowledge of the core Obeject-Oriented Programming principles: abstraction, encapsulation, interfaces, and polymorphism. 

# Summary:
In this program, I created an abstract Car class that implements a Car Interface and serves as the base class for other car objects.
The Car Interface forces the Car class to provide each one of the methods inside the Interface. In this case, I created two classes, 
Sedan and Truck, that use inheritance and extend the Car class. Because the Car class is abstract, users will not be able to instantiate 
a new Car. Instead, they will have to instantiate either a new Sedan or a new Truck, which both share the same characteristics and 
behaviors as the Car class, except for their own unique honk() method. Each Car object, whether it be a Sedan or Truck, contains 1 Engine and 4 Tires.
To keep track of each Tire on the car, I created an array of length 4 and stored a Tire object into each index of the array.

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
* I used encapsulation in this program, by making variables private to make as many pieces of the program hidden as possible.
* By using encapsulation, this program will be much esaier to update in the future if needed.

# Interfaces
* I used the Car Interface in this program to force the Car base class to implement four different methods, start(), stop(), accelerate(int), and honk().
* Interfaces define a contract that forces a class to implement each method in the interface, otherwise the code will not compile. They act sort of like a blueprint for a class.
* The Car Interface helps to promote code reusability in this program.

# Polymorphism
* By using polymorphism in this program, I am giving classes and variables the ability to take on multiple forms.
  * For example, a Sedan and Truck object are also Car objects, but calling them either Sedan or Truck is much more specific than just calling them a Car.
* Another way polymorphism is used in this program is the array of cars in the Driver class.
  * I created an array of type Car, but I was able to store a Sedan and Truck object inside that array because of polymorphism.
  * By making the Sedan and Truck classes a subclass of the Car class, we can then store them as a Car object.
* Polymorphism can also be seen in the honk() methods of each different type of Car. Each of the Car, Sedan, and Truck classes have overridden honk() methods so you can differentiate them from each other.
  * For example, the Car's honk() method prints, "Beeeepppp," the Sedan's honk() method prints, "BEEP BEEP," and the Truck's honk() method prints, "HOOONNKKKKK."
  * All of the honk methods have the same name and parameters, but perform different versions of a similar task.
