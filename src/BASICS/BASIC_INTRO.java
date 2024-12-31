package BASICS;

import java.util.Arrays;

public class BASIC_INTRO {
    public static void main(String[] args) {
//        ASSUME
//        enters the element of five number
        int[] a = new int[5];
//        enters the name of 5 student
        String[] s = new String[5];


//        1.what these will help is us to enter the element one by one
//        BUT WHAT IF THEY ASK US TO ENTER THE 5 DATA OF STUDENT (not elements)

//        1st thought is
        int[] b = new int[2];
        String[] na = new String[2];
        int[] ag = new int[2];

//        THIS IS WHERE A CLASS HELPS US OUT

//        BY CLASS WE CAN COMBINE THE MULTIPLE ENTITY OF DIFFERENT DATATYPES

//        let's say that we create a class called "BASICS.Student" in this student we have to have all the entity ,and also need access the element or entities

//        TO ACCESS AND ENTER ELEMENT ( syntax )
        Student[] student = new Student[5];
//        the size is nothing but the number of students data to be entered

//        2.here I have the student to access the array but if I name it into another I can use it for some other stuff

        Student[] std_only12th = new Student[5];
        Student[] std_only11th = new Student[5];
        Student[] std_only10th = new Student[5];
//        now I can use the single class for the different ways by creating different object and by that object I can access only the one that I required

//        object is physical reality ( ACTUAL MEMORY )
//        class is just a blueprint

//        HOW CAN I ACCESS AND USE MY TEMPLATE

//----------------------------------------------------------------------------DEFAULT CONSTRUCTOR----------------------------------------------------------------------------//

        Student access = new Student();
        System.out.println(Arrays.toString(student));
        System.out.println(access.name);
        System.out.println(access.age);
        System.out.println(access.roll);
        access.age = 16;
        System.out.println(access.age);
        access.prin();
        Student access2 = new Student();
        access2.prin();

//----------------------------------------------------------------------------PARAMETERIZED CONSTRUCTOR----------------------------------------------------------------------------//

//        O1 IS FOR INITIALIZING THE VALUE WITHOUT USING this KEYWORD
        Student o1 = new Student(12,"hello",17);
//        what it does is that it gets the value ,but it returns the declaration value it does not change the value Since we used the same variable name as we used for declaration in the parameter
        System.out.println(o1.roll);
        System.out.println(o1.name);
        System.out.println(o1.age);
//        O2 WITH USING this KEYWORD
        Student o2 = new Student("hello",14,18);
        System.out.println(o2.name);
        System.out.println(o2.roll);
        System.out.println(o2.age);
//        03 WITH DIFFERENT NAME THAN WE DECLARE
        Student o3 = new Student(12,15,"its o3");
        System.out.println(o3.age);
        System.out.println(o3.roll);
        System.out.println(o3.name);
//        O4 and O3 OBJECT AS PARAMETER
        Student o4 = new Student(o3);
        System.out.println(o4.name);
        System.out.println(o4.age);
        System.out.println(o4.roll);

    }
}

//---------------------------------------------------------------------------------CLASS STUDENT----------------------------------------------------------------------------//

class Student{
    int roll;
    String name ;
    int age;

//----------------------------------------------------------------------------DEFAULT CONSTRUCTOR----------------------------------------------------------------------------//

    Student(){
//        In the constructor you can initialize or add a value like you add in the main using object , but you cannot use the object name ...since the
//        objet name is for the template of class you are about to initialize...
//        EXAMPLE OF YOU CAN'T :

//        access.roll = 12;
//        access.name = "yogesh";
//        access.age  = 15;

//        but what you can do is you can initialize for the template using "this" keyword

        this.roll = 12;
        this.name = "yogesh"; //output in 46,47,48
        this.age  = 15; //you can also change the initialized value using dot ( line 49 )

//        where this will be usefull ( prin() ) useful for different object with different name
    }
    void prin(){
        System.out.println("hello my name is "+ name); //In line 51 I printed the method using existing object ,In 53 with a new object but still it gave me the same answer because of the initialization
    }

//----------------------------------------------------------------------------PARAMETERIZED CONSTRUCTOR----------------------------------------------------------------------------//

//    TO INITIALIZE FOR DIFFERENT OBJECT WITH DIFFERENT VALUES YOU NEED TO ADD PARAMETERS AND ARGUMENTS
//    o1 and o2 are the objects used for this with same variable name used in parameter like declare
    Student(int roll,String name, int age){
        roll = roll;
        name = name;
        age = age;
    }
    Student(String name,int roll, int age){
        this.roll = roll;
        this.name = name;
        this.age = age;
    }
//    o3 object used to initialize with different name in the parameter
    Student(int rol, int ge,String ame){
        roll = rol;
        name = ame;
        age = ge;
    }

//  YOU CAN PASS A WHOLE OBJECT INTO A CONSTRUCTOR AS A PARAMETER ()  REF VARIABLE O4 WITH O3 AS OBJECT
//  timeline 1h:14m:10s
    Student(Student access3){
        this.name = access3.name;//access.name is equal to O3.name
        this.age = access3.age;
        this.roll = access3.roll;
    }
//    BASICS.Student(){
//        this (61,"Yogesh",18); //WAY TO DEFAULT
//    }
}
