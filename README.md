# Java basic
[1. First Java Program]
[2. Variables in Java]
    [1) Static variables](#static-variables)
    [2) Instance variables]
    [3) Local variables]
[3. Java Operators]
    [1) Basic Arithmetic Operators]
    [2) Assignment Operators]
    [3) Auto-increment and Auto-decrement Operators]
    [4) Logical Operators]
    [5) Comparison (relational) operators]
    [6) Bitwise Operators]
    [7) Ternary Operator]
[4. If-else in Java]
    [1) if statement]
    [2) nested if statement]
    [3) if-else statement]
    [4) if-else-if statement]
[5. Switch-Case in Java]
[6. Java For loop]
    [1) For loop]
    [2) While loop]
    [3) Do-while loop]
========================
<a name="static-variables"></a>
###1) Static variables
The `static` keyword in Java is mainly used for memory management. We can apply static keyword to variables, methods, blocks, nested classes. The static keyword belongs to the class, not to the instance of the class.
####In java, Static can be:
#####1. Static variable
When you declare a variable as `static`, that variable is called a `static variable`, or a `static variable`
#####2. Static method
When you declare a method as `static`, the method is called a `static method`
#####3. Static block
`Static block` is used for the purpose of initializing `static variables`. The block will be executed when the class containing it is loaded into memory
There can be many arbitrary blocks in a class. These blocks will run together, and run before the main program of that class.
####1. Static variable
The `static variable` can be used to reference properties that are common to all objects
The `static variable` takes memory only once in the Class Area at the time of that class load.

#####Problems not using `static variables`?
```
public class Counter {
    int count = 0; // will get the memory when the instance is created
    
    Counter() {
        count++;
        System.out.println(count);
    }
    
    public static void main (String [] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
```
Result:
```
1
1
1
```
#####Counting program using `static variable` in java
As you have seen above, static variable will take memory only once, if any object changes the value of static variable, it will still remember its value.
```
public class Counter {
    static int count = 0;
    
    Counter() {
        count++;
        System.out.println(count);
    }
    
    public static void main (String [] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
```
Result:
```
1
2
3
```

####2. Static method in java
A method declared with the `static` keyword is called static method
    1. A `static method` belongs to the class, not an object of the class
    2. A `static method` calls without creating an instance of a class
    3. `Static method` can access `static variable` and can change its value.
Java static method example:
 ```
 public class Student {
    int studentId;
    String name;
    static String college = "Ha Noi national university";
    
    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    
    void display() {
        System.out.println(studentId + " - " + name + " - " + college);
    }
    
    public static void main(String args[] ) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Nam");
        Student s3 = new Student(333, "Anh");
        s1.display();
        s2.display();
        s3.display();
    }
 }
 ```
Result: 
```
111 - Hoang - Ha Noi national university
222 - Nam - Ha Noi national university
333 - Anh - Ha Noi national university
```

Limitations of `static methods`:
    1. Static methods cannot use non-static variables or call `non-static` methods directly.
    2. This and super cannot be used in static context.
    Example:
   
        public class A {
            int number = 20; // non static
            
            public static void main(String args[]) {
                System.out.println(number);
            }
        }
   
    Result:
     ```
        Compile Time Error
     ```
 ####3. Static block in Java
`Static block` is used for the purpose of initializing `static variables`. The block will be executed when the class containing it is loaded into memory
There can be many arbitrary blocks in a class. 
These blocks will run together, and run before the main program of that class.
#####Java static block example
```
    public class Example {
        static {
            System.out.println("Static block: hello !");
        }
        
        public static void main(String args[]) {
            System.out.println("Main: Hello");
        }
    }
```
Result:
```
Static block: hello !
Main: Hello

```
