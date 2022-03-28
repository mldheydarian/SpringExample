package ir.myShop.Spring.context;


public class Student {

    private int age;
    private String name;
    private String family;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
