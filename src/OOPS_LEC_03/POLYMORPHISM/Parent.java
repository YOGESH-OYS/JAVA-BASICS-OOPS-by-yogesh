package OOPS_LEC_03.POLYMORPHISM;

public class Parent {
    void info(){
        System.out.println("im in parent");
        System.out.println("==> a = "+a+" , b = "+b);
    }
    int a;
    int b;
    float c;

    Parent(){
        this.a = 10;
        this.b = 90;
        this.c = 10.0f;
    }

    Parent(int u,int v,float x){
        this.a = u;
        this.b = v;
        this.c = x;
    }

    Parent(int u,float x,int v){
        this.a = u;
        this.b = v;
        this.c = x;
    }

    Parent(float x,int v,int u){
        this.a = u;
        this.b = v;
        this.c = x;
    }

}
