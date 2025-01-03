package OOPS_LEC_03.HIERARCHIAL_INHERITANCE;

public class Parent {
    int a ;
    int b ;

    Parent(){
        this.a = 20;
        this.b = 30;
    }

    Parent(int c , int d){
        this.a = c;
        this.b = d;
    }

    Parent(Parent k ){
        this.a = k.a;
        this.b = k.b;
    }

    void Info(){
        System.out.println("INFO parent ==> a = "+a+" , b = "+b);
    }
}
