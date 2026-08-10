# Learning Notes

## Naming Convention
// Camel casing
```
class - Calc
variable and method - marks, show()
constants - PIE, BRAND

// showMyMarks()
// MyData

// age, DATA, Human()
```

Java doesn't support multiple inheritance.
in internet we can achive the multiple inheritance - later need to study this!

## constructor
in java in every constructor we have super() method, even we didn't mention (we can't see, by default)

* Every class in java extends Object class

## Types of interface
1. Normal interface
```
If the interface has multiple method which is known as normal interface.
``
2. Functional interface / Single Abstarct method (SAM)
```
If the interface has single method which is known as functional interface / single abstract method (SAM)
```
3. Marker interface
```
If the interface has no method in interface is called as marker interface. for example Serialization
if you want to the store the object in hard driver for those case is know as serialization.
when program starts take object from hard drive which is known as deserialization
```

## Exceptions
Error

1. Compile time error
2. Runtime error -> Exception Handling
3. Logical error

## Thread states

New -> Runnable -> Running -> Waiting -> Dead