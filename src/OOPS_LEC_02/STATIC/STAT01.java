package OOPS_LEC_02.STATIC;

public class STAT01 {
    int age;
    String name;
    int salary;
    boolean married;
    static long pop;

    public STAT01(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        STAT01.pop += 1;
    }
}
