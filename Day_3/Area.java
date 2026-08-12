package Day_3;

public class Area {
    public static void main(String[] args){
        Shapes s = new Shapes();
        s.area();
        s.area(3);
        s.area(3,5);
        s.area(3.14,2);
        s.area(1.5f,2,3);
    }
}

class Shapes{
    void area(){
        System.out.println("Area of the shapes");
    }
    void area(int a){
        System.out.println("Square"+" "+a);
    }
    void area(int a,int b){
        System.out.println("Rectangle"+" "+a*b);
    }
    void area(float a,int b,int c){
        System.out.println("Triangle"+" "+a*b*c);
    }
    void area(double a, int b){
        System.out.println("Circle"+" "+a*b*b);
    }
}
