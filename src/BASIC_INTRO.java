import java.util.Arrays;

public class BASIC_INTRO {
    public static void main(String[] args) {
//        ASSUME
//        enters the element of five number
        int[] a = new int[5];
//        enters the name of 5 student
        String[] s = new String[5];


//        1.what these will help is us to enter the element one by one
//        BUT WHT IF THEY ASK US TO ENTER THE 5 DATA OF STUDENT (not elements)

//        1st thought is
        int[] b = new int[2];
        String[] na = new String[2];
        int[] ag = new int[2];

//        THIS IS WHERE A CLASS HELPS US OUT

//        BY CLASS WE CAN COMBINE THE MULTIPLE ENTITY OF DIFFERENT DATATYPES

//        let's say that we create a class called "Student" in this student we have to have all the entity ,and also need access the element or entities

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

//        dot operator plays a vital role in the class and object concept

        Student access = new Student();
        access.name = "yogesh";
        access.age = 19;
        System.out.println(Arrays.toString(student));
        System.out.println(access.name);
        System.out.println(access.age);
        System.out.println();

    }
}

class Student{
    int roll;
    String name ;
    int age;
    Student(){
        System.out.println("hello");
    }
}
