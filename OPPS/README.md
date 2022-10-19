# OPPs Concept.

### 1] What is OPPs ?
- _Opps is Object-Orianted Progaming._
- _Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc. in programming._ 
- _The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function._

### 2] Access Modifire: 
> ### public:  
    Accessible in all classes in your application.
> ### protected: 
    Accessible within the package in which it is defined and in its subclass(es) (including subclasses declared outside the package).
> ### private: 
    Accessible only within the class in which it is defined.
> ### default (declared/defined without using any modifier): 
    Accessible within the same class and package within which its class is defined.

### 2] What is Inheritance?
- _Inheritance is an inportant pillar of OPP(Object Orianted Progamming). It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class._
```java
class Subclass extends Superclassname{
    // Methods and fields
}
```

#### I] _Single Inheritance:_
- _In single inheritance, subclasses. In the image below, class A serves as a base class for clss for the derived class B._
```java
// Class A to Class B Exteding, Single Inheritance.
// Class A
class A{
    public void name(){
        System.out.println("Inheritance to B Class.");
    }
}
// Class B extend on Class A
class B extends A{
    public void print(){System.out.println("for");}
}
// Driver class
public class Main{
    public static void main(String[] args){
        B obj = new B();
        obj.name();
        obj.print();
    }
}
```
#### II] _Multilevel Inheritace:_
- _In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also act as the base class to other class._
```java
// Multilevel Inheritance A to B to C
class A{
    public void one(){System.out.println("one");}
}
class B(){
    public void two(){System.out.println("two");}
}
class C{
    public void three(){System.out.println("three");}
}
// Driver class
public class Main{
    public static void main(String[] args){
        // Create Object
        C obj = new C();
        obj.one();
        obj.two();
        obj.three();
    }
}
```

#### III] _Hierarchical Inheritance:_
- _Hirarchical Inheritance, one class servers as a superclass (Base class) for more than one subclass. In the below image, class A serves as a base class for the dirived class B, C and D._
- _A >> B, A >> C, A >> D_
```java
//Herarchical Inheritance
class A{ 
    public void A_class(){System.out.println("class A"); }
}
class B extends A{
    public void B_class(){System.out.println("class B"); }
}
class C extends A{
    public void C_class(){System.out.println("class C"); }
}
class D extends A{ 
    public void D_class(){System.out.println("class D"); }
    }
// Driver Class
public class Main{
    // A to B, A to C, A to D
    public static void main(String[] args){
        // class B Object
        B obj_b = new B();
        obj_b.A_class();
        obj_b.B_class();

        // class C Object
        C obj_c =new C();
        obj_c.A_class();
        obj_c.c_class();

        // class D Object
        D obj_d =new D();
        obj_d.A_class();
        obj_d.d_class();
    }
}
```

#### IV] _Multiple Inheritance (Through Interfaces) :_
- _C >> A, C >> B. Parent Class A or B Conected with C class_
- _In Multiple Inheritances, one class can have more than one supperclass and inherit features from all parent classes._
- ### _Note: jave Not suport Multiple Inheritance_
```java
interface A{ public void print_A(); }
interface B{ public void print_B(); }
interface C extends A, B{ public void print_C(); }

class child implements C{
    
    public void print_A(){ System.out.println('A'); }

    public void print_C(){ System.out.println("C"); }

    public void print_B() { System.out.println('B'); }
}

// Driver class
public class Main{
    public static void main(String[] args){
        child c = new child();
        c.print_A();
        c.print_B();
        c.print_C();
    }
}
```
#### V] _Hybrid inheritance (Through Interfaces):_
- _It is a mix of two or more the above types of inheritance. Since java doesn't support multiple inheritances is also not possible with classes. In Java, We can achive hybrid inheritance only through interfaces._
- _D >> B, D >> C, B >> A, C >> A_
- ### _Note: jave Not suport Multiple Inheritance_
```java
public class A{}
public class B extends A{}
public class C extends A{}
public class D extends B{}

```

### 4] Pollymorephisum in Java.
- _the pollymorephisum means meny forms. In simple worlds, we can definde polymorephism as the ability of a message to be displayed in more the one form_
- ### Type of polymorphism
    - Compile-time Polymorphism
        - _It is known as static polymorphism. this type of polymorphism is achieved by fuction overloading oprater overloading._
        - ### _NOTE: But Java Dosen't support the Oprater overloading._
        - ### Method Overloading:
            - _Multiple functions with the same name but diffrent parameters then these functions are said to be Overloading. Function can be Overloading by change number of argument and type of arguments._
        ```java
        class Helper{
            static int Multiply(int a, int b){
                return a * b;
            }
            static double Multiply(double a, double b){
                return a * b;
            }
        }

        class Main{
            public static main(String[] args){
                Helper obj = new helper();
                System.out.println(obj.Multiply(2,4)); // 8
                System.out.println(obj.Multiply(5.5,6.3)); // 34.65
            }
        }
        ```
    - Runtime Polymorephism
        - _It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime._
        - ### I] _Method Overriding_
            - _when a derived class has a definition for one of the member functions of the base class. that base function is said to be overriding._
        ```java
        class Parent{
            void print(){ System.out.println("parent class"); }
        }

        class child_1 extends Parent{
            void print(){ System.out.println('Child_1 class'); }
        }
        class child_2 extends Parent{
            void print(){ System.out.println('child_2 class'); }
        }
        class Main{
            public static void main(String[] args){
                //create object of class
                Parent p;

                p = new child_1();
                p.print();

                p = new child_2();
                p.print();
            }
        }
        ```
### 5] Constructor in Java
- _In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called._
- ### _Note: It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn’t have any._
    ```java
    class Consts {
        // Constructor
        Consts() { super(); }

        public static void main(String[] args)
        {
            Consts cons = new Consts();
        }
    }
    ```    

    - No-argument constructor
        - _A constructor that has no parameter is known as the default constructor. If we don’t define a constructor in a class, then the compiler creates a default constructor(with no arguments) for the class. And if we write a constructor with arguments or no arguments then the compiler does not create a default constructor. _
        ```java
        class Consts {
            int num;
            String name;
        
            // this would be invoked while an object
            // of that class is created.
            Consts() { System.out.println("Constructor called"); }
        }
        
        class Main {
            public static void main(String[] args)
            {
                // this would invoke default constructor.
                Consts Consts = new Consts();
        
                // Default constructor provides the default
                // values to the object like 0, null
                System.out.println(Consts.name);
                System.out.println(Consts.num);
            }
        }
        ```
    - Parameterized Constructor
        - _ A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor._
        ```java
        class Consts {
            // data members of the class.
            String name;
            int id;
        
            // Constructor would initialize data members
            // With the values of passed arguments while
            // Object of that class created
            Consts(String name, int id)
            {
                this.name = name;
                this.id = id;
            }
        }
        
        // Class 2
        class Main {
            // main driver method
            public static void main(String[] args)
            {
                // This would invoke the parameterized constructor.
                Consts Consts1 = new Consts("adam", 1);
                System.out.println("ConstsName :" + Consts1.name
                                + " and ConstsId :" + Consts1.id);
            }
        }
        ```
### 6] Abstraction in Java.
- _Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or non-essential units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components._
- _Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the car speed or applying brakes will stop the car, but he does not know how on pressing the accelerator, the speed is actually increasing. He does not know about the inner mechanism of the car or the implementation of the accelerators, brakes etc. in the car. This is what abstraction is._
> ### Interface already Abstract
```java
// A simple interface
interface Player
{
    int id = 10; // public + static + final
    int move(); // static abstract
}
```
> ### Class Defined Abstract
```java
abstract class Shape 
{
    int color;
    // An abstract function
    abstract void draw();
}
```

### 7] Encapsulation in java
_It is defined as the wrapping up of data under a single unit. It is the mechanism that binds together the code and the data it manipulates. Another way to think about encapsulation is that it is a protective shield that prevents the data from being accessed by the code outside this shield._

- Technically, in encapsulation, the variables or the data in a class is hidden from any other class and can be accessed only through any member function of the class in which they are declared.
- In encapsulation, the data in a class is hidden from other classes, which is similar to what data-hiding does. So, the terms “encapsulation” and “data-hiding” are used interchangeably.
- Encapsulation can be achieved by declaring all the variables in a class as private and writing public methods in the class to set and get the values of the variables.

### 8] Overriding and Overloading.
> ### Overriding in java.
    Overriding is a Same name with Different value.
```java
class Parent { 
    void show() 
    { 
        System.out.println("Parent's show()"); 
    } 
} 
  
// Inherited class 
class Child extends Parent { 
    // This method overrides show() of Parent 
    @Override
    void show() 
    { 
        System.out.println("Child's show()"); 
    } 
} 
  
// Driver class 
class Main { 
    public static void main(String[] args) 
    { 
        // If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // show is called 
        Parent obj1 = new Parent(); 
        obj1.show(); 
  
        // If a Parent type reference refers 
        // to a Child object Child's show() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM. 
        Parent obj2 = new Child(); 
        obj2.show(); 
    } 
} 
```

> ### Overloading in Java.
    Overloading is a Same name with Different parameter.

    Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.
```java
import java.io.*; 

// Class 1 
// Helper class 
class Product { 

	// Method 1 
	// Multiplying two integer values 
	public int multiply(int a, int b) 
	{ 
		int prod = a * b; 
		return prod; 
	} 

	// Method 2 
	// Multiplying three integer values 
	public int multiply(int a, int b, int c) 
	{ 
		int prod = a * b * c; 
		return prod; 
	} 
} 

// Class 2 
// Main class 
class Overloading{ 

	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Creating object of above class inside main() 
		// method 
		Product ob = new Product(); 

		// Calling method to Multiply 2 numbers 
		int prod1 = ob.multiply(1, 2); 

		// Printing Product of 2 numbers 
		System.out.println( 
			"Product of the two integer value :" + prod1); 

		// Calling method to multiply 3 numbers 
		int prod2 = ob.multiply(1, 2, 3); 

		// Printing product of 3 numbers 
		System.out.println( 
			"Product of the three integer value :" + prod2); 
	} 
}

```
