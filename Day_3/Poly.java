package Day_3;
import java.util.*;
public class Poly {
    public static void main(String[] args) {
        Parent p = new Child();
        p.amount();
    }
}
class Parent{
    void amount(){
        System.out.println("saving");
    }
}
class Child extends Parent{
    void amount(){
        System.out.println("spending");
    }
}
