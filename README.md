# Resume-Code
This program models my knowledge of the core Obeject-Oriented Programming principles. 
In this program, I created an abstract Car class that implements a Car Interface and serves as the base class for other car objects.
The Car Interface forces the Car class to provide each one of the methods inside the Interface. In this case, I created two classes, 
Sedan and Truck, that use inheritance and extend the Car class. Because the Car class is abstract, users will not be able to instantiate 
a new Car. Instead, they will have to instantiate either a new Sedan or a new Truck, which both share the same characteristics and 
behaviors as the Car class, except for their own unique honk() method. Each Car object, whether it be a Sedan or Truck, contains 1 Engine and 4 Tires.
To keep track of each Tire on the car, I created an array of length 4 and stored a Tire object into each index of the array.
![UML Class Diagram](https://user-images.githubusercontent.com/90354190/137603520-9eb3c306-e67f-435b-85b5-cdd8cc656622.jpeg)
