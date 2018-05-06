Object and Class:
-----------------

Object is the physical as well as logical entity.
class is the logical entity only.

Object is an instance of a class. 
Class is a template or blueprint from which objects are created. 

An object has three characteristics:

i)state

ii)behavior

iii)identity

For Example: Pen is an object. Its name is Reynolds, color is white etc. known as its state. 

Object Definitions:

Object is a real world entity.

Object is a run time entity.

Object is an entity which has state and behavior.

Object is an instance of a class.

A class in Java can contain: fields,methods,constructors,blocks,nested class and interface



Constructor:
----------------

constructor is a block of codes similar to method. It is a special type of method which is used to initialize the object.

Two Rules for creating java constructor:

Constructor name must be same as its class name

Constructor must have no explicit return type


Types of java constructors:

Default constructor (no-arg constructor)

Parameterized constructor



Static keyword
---------------

The static keyword in java is used for memory management mainly.

The static can be:

variable (also known as class variable)

method (also known as class method)

block

nested class



This keyword
---------------

this is a reference variable that refers to the current object.

6 usage of java this keyword:

used to refer current class instance variable.

used to invoke current class method (implicitly)

used to invoke current class constructor.

this can be passed as an argument in the method call.

this can be passed as argument in the constructor call.



Super keyword:
---------------

It is a reference variable which is used to refer immediate parent class object.

Usage of java super Keyword

Used to refer immediate parent class instance variable.

Used to invoke immediate parent class method.

Used to invoke immediate parent class constructor.


Final keyword:
---------------

The final keyword in java is used to restrict the user.The java final keyword can be used in many context like:

variable

method

class




Method Overloading:
--------------------

Multiple methods having same name but different in parameters, it is known as Method Overloading.

Advantage of method overloading:

Method overloading increases the readability of the program.

2 ways to overload the method:

By changing number of arguments

By changing the data type



Method Overriding:
--------------------

Same method as declared in the parent class, it is known as method overriding in java.

If subclass provides the specific implementation of the method that has been provided by one of its parent class, it is known as method overriding.

Usage of Java Method Overriding:

Method overriding is used to provide specific implementation of a method that is already provided by its super class.
Method overriding is used for runtime polymorphism


Rules for Method Overriding

method must have same name as in the parent class

method must have same parameter as in the parent class.

must be IS-A relationship (inheritance).




Inheritance:
-------------

Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of parent object. It is an important part of OPPs.Inheritance represents the 'IS-A relationship', also known as parent-child relationship.


Why use inheritance in java ?

For Method Overriding (so runtime polymorphism can be achieved).

For Code Reusability.



Interface:
-----------

An interface in java is a blueprint of a class. It has static constants and abstract methods.

Why use Java interface?

There are mainly three reasons to use interface. They are given below.

To achieve abstraction.

can support the functionality of multiple inheritance.

It can be used to achieve loose coupling.



Encapsulation:
-------------

Encapsulation in java is a process of wrapping code and data together into a single unit.

Example capsule i.e. mixed of several medicines.The Java Bean class is the example of fully encapsulated class.

Advantage of Encapsulation:

By providing only setter or getter method, you can make the class read-only or write-only.

It provides you the control over the data. Suppose you want to set the value of id i.e. greater than 100 only, you can write the logic inside the setter method.




Access Modifiers:
------------------

There are two types of modifiers in java: access modifiers and non-access modifiers.

The access modifiers in java specifies accessibility (scope) of a data member, method, constructor or class.


There are 4 types of java access modifiers:

private :accessible only within class.

default :If you don't use any modifier, it is treated as default bydefault. Accessible only within package.

protected :The protected access modifier is accessible within package and outside the package but through inheritance only.
The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.

public : The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.

There are many non-access modifiers such as static, abstract, synchronized, native, volatile, transient etc. Here, we will learn access modifiers.


