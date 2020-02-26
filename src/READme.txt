
cerner interview got  : https://github.com/rishabh-agarwal/Cerner-Interview-Guide.git

 ************************************************************************************************************************
 ************************************************************************************************************************
 Getting user i/p using the scanner class
************************************************************************************************************************
import java.util.Scanner;
public class Exercise5 {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.print("Number of words in the string: " + count_Words(str)+"\n");
    }

 public static int count_Words(String str)
    {
       int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count; // returns 0 if string starts or ends with space " ".
    }
 }
 ************************************************************************************************************************
 ************************************************************************************************************************
 Getting user i/p using the scanner class
************************************************************************************************************************
 ************************************************************************************************************************
 



package lesson1;

import java.util.Scanner;

public class MyClass {
    
    public static void main(String[] args) {
        /*
         * author @yomi
         */
    Scanner scan = new Scanner(System.in);
    //make an instance of a the scanner class-its used in getting user i/p
    System.out.println("kindly enter your number");
    //get user i/p
    int user_input = scan.nextInt();
    //append .nextInt(); cos we are expecting an int from the user
    System.out.println("The number entered is") ;
    System.out.print(user_input);
    //This prints on a single line
    

package lesson1;

import java.util.Scanner;

public class MyClass {

    
    public static void main(String[] args) {
        
    Scanner scan1 = new Scanner(System.in);
    //make an instance of a the scanner class-its used in getting user i/p
    System.out.println("kindly enter some sentences");
    //get user i/p
    String user_input = scan1.nextLine();
    //append .nextInt(); cos we are expecting an a string from the user
    System.out.println("The number entered is") ;
    System.out.print(user_input);
    //This prints on a single line
        
    }

}

 ************************************************************************************************************************
 ************************************************************************************************************************
mathematical operators
 ************************************************************************************************************************
 ************************************************************************************************************************
 package lesson1;



public class MyClass {

    
    public static void main(String[] args) {
        int x,y, answer;
        x = 10;
        y = 19;
        answer = x - y ;
        System.out.println("Answer = "  + answer);  
    }

}

package lesson1;



public class MyClass {

    
    public static void main(String[] args) {
        int x,y ;
        double answer;
        x = 70;
        y = 30;
        answer = x / y ;
        System.out.println("Answer = "  + answer);
    
    }

}

package lesson1;
public class MyClass {

    
    public static void main(String[] args) {
        int x = 10;
        System.out.println(++x);
        //pre increment, value will be increased
        System.out.println(x++);
        //post increment, value of X wont change
        System.out.println(x);
        //value of x increased by 
        
    }

}

 ************************************************************************************************************************
 ************************************************************************************************************************
Conditional Statement : IF_ELse, comparison operators-!=,>,<,>=,<=
 ************************************************************************************************************************
 ************************************************************************************************************************
package lesson1;

/**
 * @author OO046152 : Yomi Oluwadara
 *
 */
public class MyClass {  
/*
 if (boolean_expression) for ex, if (x==10)
 {
 execute if boolean expression is true, for ex,System.out.println (X
 }
 */
    public static void main(String[] args) {
     int x = 11;
if (x==10){
    System.out.println(x);
}
else { 
    System.out.println("x != 10");
            }

    }
}


 ************************************************************************************************************************
 ************************************************************************************************************************
Conditonal statements + logical opreators -  CAN USE TO  EVALUATE MORE THAN ONE CONDITION, AND (&&) AND OR (||)
 ************************************************************************************************************************
 ************************************************************************************************************************
package lesson1;

/**
 * @author OO046152 : Yomi Oluwadara
 *
 */
public class MyClass {  
/*
 if (boolean_expression) for ex, if (x==10)
 {
 execute if boolean expression is true, for ex,System.out.println (X
 }
 
 */
    public static void main(String[] args) {
         int toelf_score = 100;
         int gre_score = 550;
         
         if((toelf_score >= 110) &&( gre_score> 600))
         {
        System.out.println("Horray! I got to go to grad school");
    }
         else {
            System.out.println("Im all screwed");
         }
    }
}



while  

public class MyClass {
  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println(i);

      i++;
    }  
  }
}


The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking 
if the condition is true, then it will repeat the loop as long as the condition is true.
do while

public class MyClass {
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);  
  }
}




package PracticeExrecises;

import java.util.Scanner;

public class WhileStatmentPractise {
    /*
     * Exercise 1: Write Java program to prompt the user to choose the correct answer from a list of answer choices of a question.
     */
    

    public static void main(String[] args) {
        
 int right_answer = 10;
 
//declaring the right answer and all the options the user can pick from

System.out.println("Question : What is the result of 6 + 10 ?");
System.out.println("Type your answer, answer must be an ingeter,kep trying until you get it rght");

//now get the user input

Scanner scan = new Scanner(System.in);
int user_answer = scan.nextInt();

if (user_answer == right_answer )
{
    
    System.out.println("Good job!! you are right");
}
    else if(user_answer != right_answer)
{
    System.out.println("Wrong answer, try again");
    }
        else
        {
    System.out.println("You need to study harder!!");
        }
    



}
    }



package lesson1;

/**
 * @author OO046152 : Yomi Oluwadara
 *
 */
public class MyClass {  
/*
 if (boolean_expression) for ex, if (x==10)
 {
 execute if boolean expression is true, for ex,System.out.println (X
 }
 
 */
    public static void main(String[] args) {
         int toelf_score = 10;
         int gre_score = 55;
         
         if((toelf_score >= 1) || ( gre_score> 600))
         {
        System.out.println("Horray! I got to go to grad school");
    }
         else {
            System.out.println("Im all screwed");
         }
    }
}


package PracticeExrecises;

import java.util.Scanner;

public class StudentGradeExercise {
/*
 * @author: Yomi 
 * 
 * Exercise 1: Write a Java program that determines a student’s grade.
The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based
 on the following rules:
-if the average score >=90% =>grade=A
-if the average score >= 70% and <90% => grade=B
-if the average score>=50% and <70% =>grade=C
-if the average score<50% =>grade=F
 */
    
    public static void main(String[] args) {
//logic takes the quiz score
        
System.out.println("Enter the Quiz score for the student");
System.out.println("Maximum score is 30");
Scanner scan = new Scanner(System.in);
double quiz_score = scan.nextDouble();
        
//logic takes the mid_term score
System.out.println("Enter the Mid term score for the student");
System.out.println("Maximum score is 30");
Scanner scan2 = new Scanner(System.in);
double mid_term_score = scan2.nextDouble();
        
//logic takes final score
System.out.println("Enter the Final score for the student");
Scanner scan3 = new Scanner(System.in);
System.out.println("Maximum score is 40");
double final_score = scan3.nextDouble();
// Determine the average score of the student

double average_score = quiz_score + mid_term_score + final_score ;
/*
 using IF to determine the grade and sending o/p to the console
 */
if (average_score >= 90)
{
    System.out.println("Your Final score is " +  average_score );
    System.out.println("Final grade is A" );
}
            else if (average_score >= 70 && average_score <=90  )
    {
        System.out.println("Your Final score is " +  average_score );
        System.out.println("Final grade is B" );
        }
                else if (average_score >= 50 && average_score <=70 )
    {
        System.out.println("Your Final score is " +  average_score );
        System.out.println("Final grade is C" );
    }
                    else if (average_score <50 )
    {
        System.out.println("Your Final score is " +  average_score );
        System.out.println("Final grade is F" );
    }
else
    {
        System.out.println("Final score is " +  average_score);

}
        

    }

}

 ************************************************************************************************************************
 ************************************************************************************************************************
Conditonal statements SWITCH Statement - use for multiple condition testing, can work in place of IF_ELSE
 ************************************************************************************************************************
 ************************************************************************************************************************
The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional


package lesson1;

/**
 * @author OO046152 : Yomi Oluwadara
 *
 */
public class MyClass {  
/*
 if (boolean_expression) for ex, if (x==10)
 {
 execute if boolean expression is true, for ex,System.out.println (X
 }
 
 */
    public static void main(String[] args) {
    int score = 80;
    switch (score)
    {
    case 90:
        //compares the value in case to the value declared and then do something
        System.out.println("90 is an excellent score");
        break;  
    case 70:
        System.out.println("70 is a good score");
    break;
    case 50:
        System.out.println("50 is just average my man");
    break;
        default:  // use when the condition/ score to evaluate is not given
            System.out.println("No score, this is a default sentence");
    break;
    /*
     * You can also decide not to use the " break" keyword- executn just go to he next case statement.it consider all case staement
     * with no break as an OR.
     */

    
    }
    }
}


package PracticeExrecises;

import java.util.Scanner;

/**
 * @author OO046152 : Yomi
 * Takes i/p from user, then, based on certain condition, det if wate is boiling or not!
 *
 */
public class BoilingWater {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
                System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        int user_input = scan.nextInt();
        System.out.println(" You have entered "  +   user_input);
        
if (user_input >= 0 && user_input <= 100)
        {
            System.out.println(" The water will boil at 100");
            //checking to see if user i/p is btw 1 and 100
    
    }
        else if (user_input < 0)
        {
            System.out.println(" Water might not boil");
        }
        //checking to see if user input is negative

        else if (user_input == 100)
        {
            System.out.println(" Water is boiling");
        }
        else 
        {
            System.out.println(" You entered the wrong damn number");
            // you DO NOT TEST condition in the else part of the conditional statement

            
        }
}
    }
Ex 2: Switch on s=String variables
// Java program to demonstrate use of a 
// string to control a switch statement. 
public class Test  
{ 
    public static void main(String[] args) 
    { 
        String str = "two"; 
        switch(str) 
        { 
            case "one": 
                System.out.println("one"); 
                break; 
            case "two": 
                System.out.println("two"); 
                break; 
            case "three": 
                System.out.println("three"); 
                break; 
            default: 
                System.out.println("no match"); 
        } 
    } 
} 

 ************************************************************************************************************************
 ************************************************************************************************************************
type casting
 ************************************************************************************************************************
 ************************************************************************************************************************
public class MyClass {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}


public class MyClass {
  public static void main(String[] args) {
    double myDouble = 9.78;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}

 ************************************************************************************************************************
 ************************************************************************************************************************
 STRINGS methods:  java methods that can be invoked on a string
 ************************************************************************************************************************
 ************************************************************************************************************************
------  length() and how to call it

public class MyClass {
  public static void main(String[] args) {
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length()); // txt.length() var txt calls the length method
  }
}
 
toUpperCase() and toLowerCase() methods
 String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"

indexOf() method
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7

 concat()
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));

Quatation withing a string variable
String txt = "We are the so-called \"Vikings\" from the north.";
String txt = "It\'s alright.";

Code    Result  
\n  New Line    
\r  Carriage Return 
\t  Tab 
\b  Backspace   
\f  Form Feed

 ************************************************************************************************************************
 ************************************************************************************************************************
Math
 ************************************************************************************************************************
 ************************************************************************************************************************
max()

public class MyClass {
  public static void main(String[] args) {
    System.out.println(Math.max(5, 10));  //math var called the max mathod. method returns 10.

  }
}

other methods: min() , 
sqrt()  -- Math.sqrt(x) method returns the square root of x:

Math.random() returns a random number between 0 (inclusive), and 1 (exclusive
 ************************************************************************************************************************
 ************************************************************************************************************************
For statement
 ************************************************************************************************************************
 ************************************************************************************************************************

sysntax:

for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.

The example below will print the numbers 0 to 4:

public class MyClass {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {       // exec 1st statement, evalu second statement, if true, then execute 3rd statement.
      System.out.println(i);
    }  
  }
}

 ************************************************************************************************************************
 ************************************************************************************************************************
For each statement : used with arrays  and ARRAYS- operations on ArrayS
 ************************************************************************************************************************
 ************************************************************************************************************************

For-Each Loop
There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

public class MyClass {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }    
  }
}

--accessing elements in ArrayS
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
---- changing an array element
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
// Now outputs Opel instead of Volvo

-- length - invoking the length method on array:
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars.length);
// Outputs 4

-- Multidimensional Arrays
A multidimensional array is an array containing one or more arrays.

To create a two-dimensional array, add each array within its own set of curly braces:

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };


To access the elements of the myNumbers array, specify two indexes:
     one for the array, and one for the element inside that array. 
This example accesses the third element (2) in the second array (1) of myNumbers


int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2];
System.out.println(x); // Outputs 7
REMEBER: INDEXING STARTS FROM 0, EVEN WHEN YOU ARE REFERRING TO AN ARRAY- WHEN YOU HAVE A Multidimensional ARRAY

 ************************************************************************************************************************
 ************************************************************************************************************************
break and continue
 ************************************************************************************************************************
 ************************************************************************************************************************
 break is used in the switch statement in addtion to that, it can also be used in loops to EXIT out of the loop if aA CERTAIN 
 CONDITION has been met
for ex, loop terminates when i equals 4.

 for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
} 


continue: this check a condition that is true , then skips it ( as opposed to stop), then continue to execute the loop
 for ex:
    public
     class MyClass {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {    // skips the value of 4: o/p is 0,1,2,3,5,6,7,8,9
        continue;
      }
      System.out.println(i);
    }  
  }
}


 ************************************************************************************************************************
Java Exceptions ( try, catch, Finally)
 ************************************************************************************************************************
 ************************************************************************************************************************
When an error occurs, Java will normally stop and generate an error message. The technical term for this is: 
Java will throw an exception (throw an error).

Try: Code within the TRY block will be examined for errors
catch: Code within this catch wiill be executed IF AN ERROR  occured in the try

    try {
  //  Block of code to try/see if there 
}
catch (Exception e) {           // generic exception
  //  Block of code to handle errors
}
EX: This will generate an error, because myNumbers[10] does not exist.
    public class Car {

    public static void main(String[] args) {
         int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // error!

    }

}
 -- error message is as below:
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
    at ClassesAndObjectsInJava.Car.main(Car.java:7)

    -- To fix the error, we can tell the code what to do in the CATCH block if an error occured in the TRY

        EX: where the catch executes despite the error found in the Try

            public class MyClass {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}
    The output of the try catch  will be:
     Something went wrong.


FINALLY
The finally statement lets you execute code, after try...catch, regardless of the result:

EX:
package ClassesAndObjectsInJava;

public class Car {

    public static void main(String[ ] args) {
        try {
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[10]);
        } 
        catch (Exception e) 
        {
          System.out.println("Something went wrong.");
        
        finally {                                                  //finally means finally will be called no matter what
                                                                    // var values in fianlly overides whatever value that var holds
                                                                    // before the  finall    
            System.out.println("The 'try and catch' is fucked");
        }
         
        
      }
    }


output will be 
Something went wrong.
The 'try and catch' is fucked

THROW

The throw statement allows you to create a custom error.
The throw statement is used together with an exception type. There are many exception types available in Java: 
    ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc

ex:
public class MyClass {
  static void checkAge(int age) { 
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
    }
    else {
      System.out.println("Access granted - You are old enough!"); 
    }
  } 

  public static void main(String[] args) { 
    checkAge(15); // calling and Setting  age to 15  in the main method (which is below 18...)
  } 
}

OUTPUT WILL Be:

Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
        at MyClass.checkAge(MyClass.java:4)
        at MyClass.main(MyClass.java:12)


if checkAge(20); // the o/p will be Access granted - You are old enough!


--THE final keyword
    * final attribute means the value of that attribute CANNOT be changed
    *Final class means that class CANNOT be inherited.
*******************************************************************************************************************
throws keyword
Methods typycally use the throws keyword,its typically used wehn an exception will be be handled(within try-ctach)


************************************************************************************************************************
************************************************************************************************************************
java methods
************************************************************************************************************************
************************************************************************************************************************
* its a blcok of code that does something
* it runs when its CALLED/INVOKED
*it can take PARAMETERS within its ()

eX:

public class MyClass {
  static void myMethod() {
    // code to be executed
  }
}

Example Explained
myMethod() is the name of the method
static means that the method belongs to the MyClass class and not an object of the MyClass class.
void means that this method does not have a return value. 


--CALL A method (inside the MAIN METHOD)

Inside main, call the myMethod() method:

public class MyClass {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();     // CAlling method myMethod() inside the main method without an object
  }
}
// Outputs "I just got executed!



--method PARAMETERS
Few notes here:

* once you define the method and you have, within the method, defined the paramters, that is the parameter types(separated by comma) and parameter names,
YOU DO NOT NEED TO SPECIFY THE TYPE AGAIN WHENEVER YOU CALL THAT METHOD FROM THE MAIN METHOD. ALL YOU HAVE TO DO IS JUST PASS THE PARAMETER VALUES SEPARATED BY COMMMAS (if more than one)
    ex:
     package ClassesAndObjectsInJava;

public class JavaMethods1 {
    static void newMethod(int age)  //defining the method, no ; needed here
    
    {
        System.out.println ("I'm " + age);
    }
    

    public static void main(String[ ] args) {
        
       newMethod(4); // calling the method, : needed here. also note that you can call the same method multiple times
      }
    }

---METHOD RETURN VALUES ( return)
    The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type
     (such as int, char, etc.) instead of void, and use the return keyword inside the method:

public class MyClass {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(5, 3));
  }
}
// Outputs 8 (5 + 3)

---you can also store the result/output of a method in a variable
Ex:public class MyClass {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int z = myMethod(5, 3);
    System.out.println(z);
  }
}
// Outputs 8 (5 + 3)

---- IF ELSE  statements inside methods
public class MyClass {

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!"); 

    // If age is greater than 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!"); 
    }

  } 

  public static void main(String[] args) { 
    checkAge(20); // Call the checkAge method and pass along an age of 20
  } 
}

// Outputs "Access granted - You are old enough!"

DIFFERENCE BETWEEN STATIC AND OUBLIC METHODS

static method,- that it can be accessed FROM THE MAIN without creating an object of the class
public method - can only be accessed by objects
     EX:

     public class MyClass {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method on the object
  }
}

-- STATIC AND PUBLIC METHODS

STAIC METHOD- belongs to the class, can be called in the main without using an object to call it
PUBLIC METHOD-  can only be called from the main by an object.

 public class MyClass {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}


-- abstract method : An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:

// Code from filename: Person.java 
// abstract class
abstract class Person {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Person.java

// Code from filename: MyClass.java
class MyClass {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student(); 

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}


---METHOD OVERLOADING
 method has the same name, but the logic defined for each one of them is diff. Three ways to overload a method
In order to overload a method, the argument lists of the methods must differ in either of these:
1. Number of parameters.

For example: This is a valid case of overloading
add(int, int)
add(int, int, int)

2. Data type of parameters.
For example:
add(int, int)
add(int, float)

3. Sequence of Data type of parameters.
For example:
add(int, float)
add(float, int)

************************************************************************************************************************
************************************************************************************************************************
Access Methods With an Object

************************************************************************************************************************
************************************************************************************************************************

Create a Car object named myCar.
 Call the fullThrottle() and speed() methods on the myCar object, and run the program:

// Create a Car class
public class Car {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

// The car is going as fast as it can!
// Max speed is: 200

************************************************************************************************************************
************************************************************************************************************************

accessing methods declared in one class in another class
************************************************************************************************************************
************************************************************************************************************************
- Best practise is to create the methods, constructors in one class and create an instance/object to access the method in another class;

the examples below helps explain this further.

// class where the methods are created
public class Car {
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}

//class where objects are created and the object calls the methods created in the other class
class OtherClass {
  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}



************************************************************************************************************************
************************************************************************************************************************
java classes
************************************************************************************************************************
************************************************************************************************************************

--OBJECTS
A Class is like an object constructor, or a "blueprint" for creating objects.

To create an object of MyClass, specify the class name, followed by the object name, and use the keyword new
EX:
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
 YOU CAN CREATE MULTIPLE OBJECTS OF A Class
    public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // Object 1
    MyClass myObj2 = new MyClass();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}

---Using Multiple Classes 
You can also create an object of a class and access it in another class. This is often used for better organization of classes

 // (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory/folder:

public class MyClass {
  int x = 5;
}

class OtherClass {
  public static void main(String[] args) {
    MyClass myObj = new MyClass();  // creting the object of MYClass in a diff class.
    System.out.println(myObj.x);  //prints 5
  }  
}



--HOW OBJECTS ACCESS/INVOVE A variable

EX:

public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);  // OBJECT ACCESSING A VAR
  }
}

-- HOW OBJECTS CAN MODIFY attributes
EX:
Set the value of x to 40:

public class MyClass {
  int x;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 40;   // MODIFIES THE VALUE OF THE VAR
    System.out.println(myObj.x);
  }
}
EX 2:
Change the value of x to 25:

public class MyClass {
  int x = 10;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x); 
  }
}

---multiple objects in one class can modidy the value of the same attribute:

Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:

public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // Object 1
    MyClass myObj2 = new MyClass();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
__________________________________________________________________________________________________________________________
_________________________________________________________________________________________________________________________________
KEEP: constructor AND OBJECTS
------ you can use them to create an object/instance
------ its often called a 'special' method that is used to initialize objects
------ constructor is called when the object is created

CONSTRUCTORS AND OBJECTS   -- lesson 19 on that youtube video is a good resource
_________________________________________________________________________________________________________________________________
_________________________________________________________________________________________________________________________________

Constructors are required to create objects for a class. Constructors are used to initialize the instance variables of an object.
Constructor declaration looks like method declaration. It must have the same name as that of the class and have no return type.
Constructors can be classified into two types, default constructors and parametarized constructors.
If you don't define a constructor, then the compiler creates a default constructor. Default constructors do not contain any parameters. Default constructors are created only if there are no constructors defined by us.
Prametarized constructors are required to pass parameters on creation of objects. We can overload constructors with different datatypes
 as its parameters.
Use 'this()' to communicate from one constructor to another constructor in the same class.
Use 'super()' to communicate with super class constructor.

EX 1
A constructor allows you to provide initial values for class fields when you create the object. Suppose that you have a class named Actor
 that has fields named firstName and lastName. You can create a constructor for the Actor class:

public class Actor {  //Actor class

public Actor(String first, String last)
{                                             //creating and intilaizing the paramtirez constructor
    firstName = first;
    lastName = last;
 
    }
}
Then you create an instance of the Actor class by calling this constructor:
Actor a = new Actor("Arnold", " Schwarzenegger");   //creating an instance/object of actor class and passing parameters beased on the constructor
                                                        // definition

ex 2:
// Create a MyClass class
public class MyClass {
  int x;  // Create a class attribute

  // Create a class constructor for the MyClass class
  public MyClass() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5

EX 3 (good one)

public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }    // CONSTRUCTOR

  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);

  }
  //OBECT CREATION AND INTIALIZED BASED OFF THE CONSTRUCTOR DEFINITION
}

_________________________________________________________________________________________________________________________________
_________________________________________________________________________________________________________________________________
CONSTRUCTOR OVERLOADING

Like methods, constructors can be overloaded. In other words, you can provide more than one constructor for a class if each constructor 
has a unique signature- takes in diff typees.
NOTE THAT constructor- same new, taking in diff types as input

package com.myjava.constructors;
 
public class MyOverloading {
     
    public MyOverloading(){
        System.out.println("Inside default constructor");
    }
    public MyOverloading(int i){
        System.out.println("Inside single parameter constructor with int value");
    }
    public MyOverloading(String str){
        System.out.println("Inside single parameter constructor with String object");
    }
    public MyOverloading(int i, int j){
        System.out.println("Inside double parameter constructor");
    }
     
    public static void main(String a[]){
        MyOverloading mco = new MyOverloading();
        MyOverloading spmco = new MyOverloading(10);
        MyOverloading dpmco = new MyOverloading(10,20);
    MyOverloading dpmco = new MyOverloading("java2novice");
    }

CONSTRUCTOR CHAINING:   add relevant content here.
************************************************************************************************************************
************************************************************************************************************************
Prime number examples
************************************************************************************************************************
************************************************************************************************************************
--

Prime number
EX:
A prime number is a number that is evenly divisible only by itself and 1. For example, the number 5 is prime because it can be evenly divided only
 by 1 and 5. The number 6, however,
 is not prime because it can be divided evenly by 1, 2, 4, and 6. 
Write a method named isPrime, which takes an integer as an argument and returns true if the argument is a prime number, or false otherwise.
lso write main method that displays prime numbers between 1 to 500.
public class PrimeNumbers
{
    public static void main(String[] args)
    {        
        for(int i = 1; i <= 500; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }    
    }

    public static boolean isPrime(int number)
    {
        for(int i = 2; i < number; i++)
    {
        if(number % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
}

************************************************************************************************************************
************************************************************************************************************************
java modifiers
-- reference https://www.w3schools.com/java/java_modifiers.asp
--STATIC : anything with this modifier type means IT BELONGS TO THE CLASS alone
 good proactice: methods declared as static should be c called by the class
                 methods that are non- stattic should be called by the object of the class


************************************************************************************************************************
************************************************************************************************************************
Java Encapsulation (GETTER AND SETTERS METHODS)
************************************************************************************************************************
************************************************************************************************************************
** The goal of Encapsulation is to ensure that SENSITIVE DATA is HIDDEN from the user

1. declare class variables/attributes as private (only accessible within the same class)
2. provide public setter and getter methods to access and update the value of a private variable

The GET method returns the variable value, and 
the SET method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;       //SETTER SETTING THE STRING VALUE OF name to newName
  }
}

The get method returns the value of the variable name.

The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.

However, as the name variable is declared as private, we cannot access it from outside this class:

************************************************************************************************************************
************************************************************************************************************************
JAVA Package

************************************************************************************************************************
************************************************************************************************************************
Package: used to grpup related classes
    EX: can name package as com.YomiOluwadara.FirstProject.835To837

    * There are 2 types of packages:
        -Built-in Packages (packages from the Java API)  -  https://docs.oracle.com/javase/8/docs/api/ 
        -User-defined Packages (create your own packages)

* to use a class or package, use the IMPORT keyword

        import package.name.Class; 
                ex:  import java.util.Scanner;
                     // Import a single class (Scanner) from the java.util package
        Import package.name.*;  
               ex:  import java.util.*;     // Import the whole package  java util 
************************************************************************************************************************
************************************************************************************************************************
Inheritance (extends)               
************************************************************************************************************************
************************************************************************************************************************
In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):
class Vehicle {
  protected String brand = "Ford";         // Vehicle attribute
  public void honk() {                     // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName); 
  }
}

NOTE: Java does not support "multiple inheritance" (a class can only inherit from one superclass)
************************************************************************************************************************
************************************************************************************************************************
Java Polymorphism    (poly = MANY morphism= BEHAVIORS )    Polymorphism = many BEHAVIORS    
************************************************************************************************************************
************************************************************************************************************************
* There are 2 basic concepts in polymophism:
1  METHOD / CONSTRUCTOR OVERLOADING
2  METHOD/ CONSTRUCTOR OVERRIDING

***** METHOD / CONSTRUCTOR OVERLOADING :method has same name, but has different signatures. For eX
 public void show (){

 }
 and 
 public void show (String A, double b){

 }
 java auto detects what method you are calling by the parameters you are passing
 -- see more examples in code

****METHOD/ CONSTRUCTOR OVERRIDING
    This has to do with inheritance. A child class that inherits from the parent inherits all its methods
    therefore the object of the subclass can call the method in its super class(UPCASTING). However,
    if the sub class now tweatks the method ( same signature) but does somethiing else, the object
        of that class will automatically invoke its own method ( that has been tweaked) and no longer the 
    method from its superclass.


This has to do when subclasses are implementing inherited methods (from parant class) so the inherited method do somethig else
as opposed to what its supposed to do in the parent class (super class)
 Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

Also,an instance of the superclass class can call methods of the subclasses

 For example,
  think of a superclass called Animal that has a method called animalSound(). 
 Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal
  sound (the pig oinks, and the cat meows, etc.):


  class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

************************************************************************************************************************
************************************************************************************************************************
java inner class   *** red page***          
************************************************************************************************************************
************************************************************************************************************************
** inner classes is whenevr a class is nested within another class. This is a good practice because it lets you group similar
classes together, it also helps with maintanability.
** How to access the inner class
    To access the inner class, create an object of the outer class, and then create an object of the inner class:

    class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class MyMainClass {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}

// Outputs 15 (5 + 10)

--Private inner class
Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, 
declare the class as private:

--Static Inner Class
You can access this class without having to create an object of the outer class

EX:
class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

public class MyMainClass {
  public static void main(String[] args) {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y);
  }
}

// Outputs 5

--- Access Outer Class From Inner Class
One advantage of inner classes, is that they can access attributes and methods of the outer class:

EX:
    class OuterClass {
  int x = 10; 

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class MyMainClass {
  public static void main(String args[]) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}

// Outputs 10
************************************************************************************************************************
************************************************************************************************************************
Abstraction         
************************************************************************************************************************
************************************************************************************************************************
Abstraction in java is a means of hiding certain information from the user. Abstraction can be implmented  at the class and method levels.

Abstract class: 
    You CANNOT create an object of an abstract class,  to access an abstract class, it must be inherited
    An abstract class can have both abstract and regular methods.


abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

        Animal myObj = new Animal(); // will generate an error



Abstract method:
     can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).   

  -- accessing an abstract class (To access the abstract class, it must be inherited from another class.)
  ex:

  // Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}

************************************************************************************************************************
************************************************************************************************************************
Java interface      
************************************************************************************************************************
************************************************************************************************************************
An interface is a completely "abstract class" that is used to group related methods with empty bodies:

-- basically it can be regarded as some form of Abstraction (a way of hidding information from user).
EX:
    // interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}

-- How to access an interface class
    To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements
    keyword (instead of extends). The body of the interface method is provided by the "implement" class:

 EX:
 
 // Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}   


-- IMPLEMENTING MULTIPLE INTERFACES
whenever a class is implementing multiple interfaces (a class consisiting of methods that does not do anything), the interfaces beinmg implemented
are separated by commas.

EX:
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {     // interfaces separated by comma
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}


NOTES
 * a class can implement multiple interfaces
 *ike abstract classes, interfaces cannot be used to create objects 
 (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
 * Interface methods does not have a body - the body is provided by the "implement" class
  * On implementation of an interface, you must override all of its methods
* Interface methods are by default abstract and public
* Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)



************************************************************************************************************************
************************************************************************************************************************
Java Enums     
************************************************************************************************************************
************************************************************************************************************************
*Enum is a specil kind of class that contains variable that would not change.
*The variable names must BE CAPITALIZED in the ENUM class
*To create an enum, use the enum keyword 

-- how to acess an Enum variable: You can declara a var and call the enum var you want to call by referencing the enum class and the var

EX:
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class MyClass { 
  public static void main(String[] args) { 
    Level myVar = Level.MEDIUM;   // var myvar accessinb the MEDIUM var in the Enum level class
    System.out.println(myVar); 
  } 
}

-- You can have enum insside of a class and access it the way you access an enum variable
EX:
    public class MyClass { 
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) { 
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar); 
  } 
}


-- ENUMS can be used with a SWITCH statement

ex:

enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class MyClass { 
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;    // myvae being initilaized to MEDUIM var from the enum class classed level

    switch(myVar) {                  //switch statement taking the val of myvar , that is MEDIUM  as the switch condition
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}

// outputs  medium level

-- ENUMS AND THE Values() method
The values() whenever being invoked by an enum clas can be used to return all the variable in an emum

EX:
for (Level myVar : Level.values()) {       // myVar invoking values() on the enum class
  System.out.println(myVar);
}
The output will be:

LOW
MEDIUM
HIGH


-- ENUMS and Classes
* enums, like classes, can have attributes and methods
*the attributes of enum are final, public and static ((unchangeable - cannot be overridden).)
*An enum cannot be used to create objects, and it can not extend other classes (but it can implement interfaces).


************************************************************************************************************************
************************************************************************************************************************
Java Dates and the now()   
************************************************************************************************************************
************************************************************************************************************************

Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. 
The package includes many date and time classes. For example:

Class   Description
LocalDate              Represents a date (year, month, day (yyyy-MM-dd))
LocalTime             Represents a time (hour, minute, second and microsecond (HH-mm-se-zzz))
LocalDateTime         Represents both a date and a time (yyyy-MM-dd-HH-mm-ss.zzz)
DateTimeFormatter     Formatter for displaying and parsing date-time objects

-- now ()   : displays current date


to display the current date, import the java.time.LocalDate class, and use its now() method:

Example
import java.time.LocalDate; // import the LocalDate class

public class MyClass { 
  public static void main(String[] args) { 
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
  } 
}
The output will be:

2019-04-24


************************************************************************************************************************
************************************************************************************************************************
Java ArrayS 
************************************************************************************************************************
************************************************************************************************************************
* Arrays are used to store multiple valueses/ more than one of the same datatype in a variable
Declaration 
        datatype arrayname = new datatype[n];    n = number of values to be stored.
Ex:
int age = new int[3];
then initialize/set values for each index in the array
age[0] = 1;
age[1] = 11;
age[2] = 12;

or,using array initializer
 ex:datatype arrayname [] = {1,2...n}

 



************************************************************************************************************************
************************************************************************************************************************
Java ArrayList 
************************************************************************************************************************
************************************************************************************************************************
The ArrayList class is a resizable array, which can be found in the java.util package.
--Difference between an Array and an ArrayList is that the elements of the former canot be added or removed, but the the latter
ArrayList, YOU CAN ADD AND REMOVE ELEMENTS .

EX:
Create an ArrayList object called cars that will store strings:

import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object


--methods of an ArrayList
* Add Items - Add()
The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method:

Ex:
import java.util.ArrayList;

public class MyClass { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();  // creates an object of an ArrayList
    cars.add("Volvo");                                  // using the add() to add cars to the Arraylist called cars
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  } 
}


---accessing the elements of an ArrayList uisng the get()

Access an Item
To access an element in the ArrayList, use the get() method and refer to the index number:

Ex:
cars.get(0)

what is the difference between List and ArrayList?

************************************************************************************************************************
************************************************************************************************************************
Java HashMap and some methods that can be used on them : put() , get() , remove()
************************************************************************************************************************
************************************************************************************************************************
Unlike arrays that stores just elements, A HashMap however, store items in "key/value" pairs. An example of key/values could be

" currency, Dollar", " name, YomiOluwadara"

-- create a HashMap bject and add values pairs to it

The HashMap class has many useful methods. For example, to add items to it, use the put() method:

Example
// Import the HashMap class
import java.util.HashMap;

public class MyClass {
  public static void main(String[] args) {

    // Create a HashMap object called capitalCities
    Map<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");  //Engand is the key, London is the value
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities); 
  }
}


---Access an Item in a HashMap
To access a value in the HashMap, use the get() method and refer to its key:

EX:
capitalCities.get("England");

--Remove an Item
To remove an item, use the remove() method and refer to the key:

Example
capitalCities.remove("England");


************************************************************************************************************************
************************************************************************************************************************
Java Wrapper class
************************************************************************************************************************
************************************************************************************************************************
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

Primitive Data Type         Wrapper Class
byte                        Byte
short                       Short
int                         Integer
long                        Long
float                       Float
double                      Double
boolean                     Boolean
char                        Character


--Creating Wrapper Objects
To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just print the object:

Example
public class MyClass { 
  public static void main(String[] args) { 
    Integer myInt = 5; 
    Double myDouble = 5.99; 
    Character myChar = 'A'; 
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  }
}

--toString()

Another useful method is the toString() method, which is used to convert wrapper objects to strings.

In the following example, we convert an Integer to a String, and use the length() method of the String class to output the length of the "string":

Example
public class MyClass { 
  public static void main(String[] args) { 
    Integer myInt = 100; 
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}


************************************************************************************************************************
************************************************************************************************************************
Java Files - File class
************************************************************************************************************************
************************************************************************************************************************
The File class from the java.io package, allows us to work with files.


EX:
import java.io.File;  // Import the File class

File myObj = new File("filename.txt"); // Specify the filename

--methods in the file class

Method          Type            Description
canRead()       Boolean         Tests whether the file is readable or not
canWrite()      Boolean         Tests whether the file is writable or not
createNewFile() Boolean         Creates an empty file
delete()        Boolean         Deletes a file
exists()        Boolean         Tests whether the file exists
getName()       String          Returns the name of the file
getAbsolutePath() String        Returns the absolute pathname of the file
length()         Long            Returns the size of the file in bytes
list()          String[]         Returns an array of the files in the directory
mkdir()         Boolean          Creates a directory



--- crate a file--

Use the createNewFile() method to create a file. 

This method returns a boolean value: true if the file was successfully created, and false if the file already exists.
 Note that the method is enclosed in a try...catch block. This is necessary because it throws an IOException if an error occurs 
 (if the file cannot be created for some reason):

EX:

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile { 
  public static void main(String[] args) { 
    try { 
      File myObj = new File("filename.txt");  // crates the object of the file class (class that was imported - see line 1945)
      if (myObj.createNewFile()) { 
        System.out.println("File created: " + myObj.getName());    // the getName() method gets the name of the file crated
      } else { 
        System.out.println("File already exists."); 
      } 
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); 
    } 
  } 
}
The output will be:

File created: filename.txt


-- To crate the file in a a specific directory,specify the location when the file object is created;
EX:

Example
File myObj = new File("C:\\Users\\MyName\\filename.txt");


-- Get file information using some of the file class methods

Ex:

import java.io.File; 

public class GetFileInfo { 
  public static void main(String[] args) { 
    File myObj = new File("filename.txt");
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());   // gets file name
      System.out.println("Absolute path: " + myObj.getAbsolutePath());  //get file path
      System.out.println("Writeable: " + myObj.canWrite());  //check if its writable
      System.out.println("Readable " + myObj.canRead());   // checks if its readable
      System.out.println("File size in bytes " + myObj.length()); // returns the file size in byte
    } else {
      System.out.println("The file does not exist.");
    }
  } 
}
The output will be:

File name: filename.txt
Absolute path: C:\Users\MyName\filename.txt
Writeable: true
Readable: true
File size in bytes: 0


--- write to a file :uing the FileWriter class and its  write() and close()  method----

Write To a File
In the following example, we use the FileWriter class together with its write() method to write some text to the file we 
created in the example above. Note that when you are done writing to the file, you should close it with the close() method:

Example
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile { 
  public static void main(String[] args) { 
    try { 
      FileWriter myWriter = new FileWriter("filename.txt");   //crates an object of the FileWrite class
      myWriter.write("Files in Java might be tricky, but it is fun enough!");  // write method takes String i/p which it writes to the file
      myWriter.close();   // close () closes the file
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  } 
}

The output will be:

Successfully wrote to the file.



-- Read from a file  uisng the Scanner class

Read a File
In the following example, we use the Scanner class to read the contents of the text file we created in the example above:

Example
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile { 
  public static void main(String[] args) { 
    try {
      File myObj = new File("filename.txt");   // crates an object of the File class
      Scanner myReader = new Scanner(myObj);  //Crates an object - myReader of the Scanner class
      while (myReader.hasNextLine()) {        //uisng the hasNextLine() 
        String data = myReader.nextLine();    // declared var of type string , object calls the nextLine()
        System.out.println(data);             // prints out the content of date
      }
      myReader.close();                        // object invokes the close() to close the file
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  } 
}
The output will be:

Files in Java might be tricky, but it is fun enough!

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Variable scope: its the variable visibility- where the varaible can be legally accessed
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Recursion
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Recursion 
-When a method is being called from within itself
EX: progran for calculating factorial

class FactorialExample2{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));     //factorial being called in the factorial method
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  int number=4;//It is the number to calculate factorial    
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  

is there a power() method in the java library???
power(base, exponent) yes

EX2:
package com.YomiOluwdara.RecursionPractises;
public class ExponentOfNumbers {
    //class vars
    static int base_number;
    static int exponent;
    
    //instance method
public static int power(int base_number, int exponent) {
    if( exponent == 0) {
        return 1;
    }
        else {
            return (base_number * power(base_number, exponent - 1));
        }   
    }
    
    public static void main(String[] args) {
        //use the class to invoke the static method
        System.out.println("final result is " + ExponentOfNumbers.power(10, 2) );
        //System.out.println(base_number  + "raised to the power of " + exponent + "is" + ExponentOfNumbers.power(4, 2) );  fix this
    }

}
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
WHEN TO USE LinkedList versus ArrayList
1. element insertion is faster in LinkedList compared to Arraylist (use this when u have freq insertion)
2. element deletion is faster in LinkedList compared to Arraylist (use this when u have freq deletion)
3.  search is faster in Arraylist  compared to LinkedList
4. LinkedList( each node holds data and the address of the previous nodes) have more memory overhead than 
   Arraylist(each index hold object)



@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ArrayList
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Normal arrays: one DISADVANTE OF REGULAR ARRAY Size is fizxed when array is declared 
ArrayList: size is dynamically assigned
    * to use ArrayList, import the inbuilt ArrayList class
    *Declare ArrayList 
   ArrayList <type> arrayname = new ArrayList<type>(initial number of array elements);
   *adding values to the ArrayList //invove the add()
   arrayname.add(1);
   arrayname.add(2);
   arrayname.add(3);

   *to get size of array, call the SIZE method
   System.out.println (arrayname.size());
   **SEE OPERATIONS/METHODS  ON ArrayList LIKE size(),clear(),add(),remove(),
   trimToSize() // trim size of arrays to the initial number of elements it contained 
    set()  // ask for initail value of an index and what to set/modify it to
    **remove element from an array

 System.out.println (arrayname.remove(2)); // remove element at index 2

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
LinkedList
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


declaration:
 LinkedList <type> name = new LinkedList <type> (initial number of array elements);
 to use LinkedList, import the inbuilt LinkedList class

  print the content of the LinkedList
for (String x : linkedlistname)
    System.out.println(x) 

 SEE OPERATIONS/METHODS  ON LinkedList add(),addFirst(),addLast(),removeLast(),set(),sort(),
 for ex:
    name.removeLast();
    name.size()
    name.add(inital, final) //kinda like set in Arraylisy


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ListIterator (video 34 )
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
ListIterator:  they iterate over a list
Thera are 4 ListIterator methods
1 public boolean hasNext(); // checks if list has next value,if yes, 
2 public Object next(); // this prints/ access  that next value
3 public boolean hadPrevious(); // checks if it has a previous value (starts from the last element)
4 public Object Previous() // prints or access that previous value

EX:
ListIterator <datatype> itr = new ListIterator(); // declaring ListIterator
while(itr.hasNext()) { //check if ite has next value starting from index 0
    System.out.println(itr.hasNext()) // prints the next element until end of lsit
}


see  more EX on video 34

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
HashSet  (video 35 )
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 good resource: https://www.geeksforgeeks.org/initializing-hashset-java/

*First: import java.util.*; 
HashSet;
- is a type of set (from math)
-it uses a hashing algorithm that checks for duplicates and filter them out
-it does not allow duplicates (dups) unlike Arraylist that allows insertion of duplicates
-hashset: not index based like Arraylist
declaration:
- you can convert an array to an hashset using the by invoking the appropriate java in built method

Set <data type> name = new HashSet<String>();
for ex: set<int> myhasset = new HashSet<int>();
     add values by invoking the add() method
 myhasset.add(1);
 myhasset.add(2);
 - to print the content of the hahset, you can invoke the iterator() method 
 OR (BETTER STILL)
  do
**** keep this***
for (i:myhasset){
    System.out.println(i)


}
***THIS IS SIMILAR TO HOW YOU PRINT AN A STRING ARRAY

 for (name: nameOfStringArray) {
    System.out.println(name)
 }


just like Arraylist and LinkedList, you can invoke a lot of methods. in eclipse, after the object,
add a . and the list of applicable methods will populate. The way you know what methid to use is that
after each method, the class where they are declared will be stated.That tells you if you can use your
object to invoke them




HashMap

************************************************************************************************************************
************************************************************************************************************************
Java HashMap and some methods that can be used on them : put() , get() , remove()
************************************************************************************************************************
************************************************************************************************************************
Unlike arrays that stores just elements, A HashMap however, store items in "key/value" pairs. An example of key/values could be

" currency, Dollar", " name, YomiOluwadara"

-- create a HashMap bject and add values pairs to it

The HashMap class has many useful methods. For example, to add items to it, use the put() method:

Example
// Import the HashMap class
import java.util.HashMap;

public class MyClass {
  public static void main(String[] args) {

    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");  //Engand is the key, London is the value
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities); 
  }
}


---Access an Item in a HashMap
To access a value in the HashMap, use the get() method and refer to its key:

EX:
capitalCities.get("England");

--Remove an Item
To remove an item, use the remove() method and refer to the key:

Example
capitalCities.remove("England");

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
bitset
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@





@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
STATIC MODIFER
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Now take a look at Java’s Math class. In this class, all of its methods are declared as static methods. A static method means that there is just one copy of that method,
 and you can call that method without having an instance of that class. For example, the abs method in the Math class is defined as a static method, 
 so you can call it like this:

int value = Math.abs(-42); // noticed its a static method, so there is no ned to use an instance/ object to call it
                            // let instance calle instance methods/member(typically defined in another class, but called in the main)
That works, and the reason it works as shown is because abs is defined as static. Static means:

There is only one copy of this method (as opposed to one version of the method for every instance)
You can call abs without needing to first create an instance of Math



@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
working with files files I/O
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
*do necessary imports
    import java.io.File;
    import java.io.PrintWriter;
* to crate a file, create an instance of the file class and "pass" the name of the file you want to create
    ex: File my_file = new File("filename.txt");


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@overridden
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Indicates that a method declaration is intended to override a method declaration in a superclass.
@Override—the @Override annotation informs the compiler that the element is meant to override an 
element declared in a superclass

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
char user_input (taking user input usig the Scaner class)
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
*taking char  input is done this way
EX:     System.out.println("Enter an alphabet");
        Scanner scan = new Scanner(System.in);
        char userInput = scan.next(".").charAt(0); 
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
how to  Determines if the specified character is a letter or digit/ an an alphabet
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 // userIput is the value we want to determine if its an a letter or digit
(isLetterOrDigit(userInput) 
 *  returns true if the character is a letter or digit; false otherwise.

public static boolean isAlphabetic(int codePoint)
Determines if the specified character (Unicode code point) is an alphabet.
Returns:
true if the character is a Unicode alphabet character, false otherwise.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
how to  use the return value of a non-stattic method in another non-static method
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Since the scope of a method variable is within that  method, that makes t impossible to be passed
dirrectly to another method. However, if you want to use the return values of that method, you will:
-call it in the main method
-then assign its return value to another variable (new)
- then use that variable as parameter input in another method(ensure you have earlier defined that method
 to be able to accept such i/p in the method definition)
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Enum
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
* Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command line flags, 
*The main objective of enum is to define our own data types(Enumerated Data Types).
*Enum can be defined inside and outside of the class but  NOT INSIDE A METHOD
Every enum internally implemented by using Class.
/* internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}*/
*Every enum constant represents an object of type enum.
enum type can be passed as an argument to switch statement.
EX:
import java.util.Scanner; 
  
// An Enum class 
enum Day 
{ 
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY; 
} 
  
// Driver class that contains an object of "day" and 
// main(). 
public class Test 
{ 
    Day day; 
  
    // Constructor 
    public Test(Day day) 
    { 
        this.day = day; 
    } 
  
    // Prints a line about Day using switch 
    public void dayIsLike() 
    { 
        switch (day) 
        { 
        case MONDAY: 
            System.out.println("Mondays are bad."); 
            break; 
        case FRIDAY: 
            System.out.println("Fridays are better."); 
            break; 
        case SATURDAY: 
        case SUNDAY: 
            System.out.println("Weekends are best."); 
            break; 
        default: 
            System.out.println("Midweek days are so-so."); 
            break; 
        } 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        String str = "MONDAY"; 
        Test t1 = new Test(Day.valueOf(str)); 
        t1.dayIsLike(); 
    } 
} 
Output:

Mondays are bad.

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
what is the difference between List and ArrayList?
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
* Well, the main difference between List and ArrayList is that List is an interface while ArrayList is a class.

*Most importantly, it implements the List interface, which also means that ArrayList is a subtype of List interface
* consider this ex, List(datatype) name = new Arraylist<datatype>(); --- declaration Syntax 
List<Movie> listOfMovies = new ArrayList<Movie>()
here we are using a List as a type of variable to store an object of ArrayList class, created using new() operator
*In fact, everywhere you need to declare a reference variable, you should always use the supertype e.g. Map for passing HashMap, Set for
passing HashSet and List for passing ArrayList, LinkedList or Vector. You should use interface as type on the return type of method, type
of arguments etc as shown below? Now big question comes, Why should you do that?
The answer is to take advantage of Polymorphism. If you use interface than in future if the new implementation is shipped then you are not
required to change your program. For example, any program written using List will work as expected whether you pass a LinkedList, Vector 
or ArrayList, because they all implements List interface, they obey the contract exposed by List interface.


Java Application Programming Interface (API)
Java application programming interface (API) is a list of all classes that are part of the
Java development kit (JDK). It includes all Java packages, classes, and interfaces,
along with their methods, fields, and constructors. These prewritten classes provide a
tremendous amount of functionality to a programmer. A programmer should be aware of
these classes and should know how to use them. A complete listing of all classes in
Java API can be found at Oracle’s website: http://docs.oracle.com/javase/7/docs/api/