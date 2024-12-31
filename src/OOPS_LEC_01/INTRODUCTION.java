//   PLEASE REFER WITH THE PAPER NOTES PROVIDED













package OOPS_LEC_01;

public class INTRODUCTION {
    public static void main(String[] args) {
        student print = new student(9,88);
        student p = new student(10);
        System.out.println(print.a);
        System.out.println(print.b);
        p.jj();
    }
}
class student{ //by default constructor function will be the name of the class
    int a ;
    int b ;

    void jj(){
        System.out.println("the age is "+a);
    }
    student(int u){
        this.a=u;//used to update the value inside the class during run time
    }
    student(int a,int b){
        this.b = b;
        this.a = a;
    }
}

//01 IF YOU DON'T USE ANY CONSTRUCTOR WITH ATTRIBUTE JAVA WILL TAKE THE CONSTRUCTOR AS DEFAULT FROM CLASS NAME
//02 DECLARING A DATATYPE INSIDE THE CLASS WILL HELP YOU TO USE A DEFAULT VALUE ANYWHERE INSIDE THE CLASS (line:15,16)
//03 TO CHANGE THE OBJECT OF THE TEMPLATE WHILE RUN TIME "THIS" KEYWORD IS USED
//04 FOR ALL METHOD USED INSIDE THE CLASS NEEDS NEW OBJECT CREATION IN MAIN (ex:(method jj()) line:9)
//05 YOU CAN USE THE CONSTRUCTORS VALUE IN AN FUNCTION (line:22 in line:19 print by line:11)