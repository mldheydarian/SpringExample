package ir.myShop.Spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class Student {

    private int age;
    private String name;
    private String family;
    @Autowired
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", book=" + book +
                '}';
    }

    public  Student(){
    System.out.println("from Constractor");

}
    public void Myinit(){

        System.out.println("From init");

    }

    public int sum(int a , int b){

        return  a+b;
    }
}
