package OOPS_LEC_03.SINGLE_INHERITANCE;

class Parent{
    int l;
    int b;
    int h;

    Parent(){
        this.l = -1;
        this.h = -1;
        this.b = -1;
    }

    Parent(int a,int b,int c){
        this.l = a;
        this.b = b;
        this.h = c;
    }

    Parent(Parent object){
        this.l = object.l;
        this.b = object.b;
        this.h = object.h;
    }

    void Information(){
        System.out.println("INFO parent ==> l = "+l+" , b = "+b+" , h = "+h);
    }
}


