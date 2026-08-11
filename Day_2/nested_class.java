
import java.util.*;
public class nested_class{
    public static void main(String[] args) {
        Subject sub = new Subject(3, 2001);
        Subject.Web one = sub.new Web(100, 306, "AAA");
        one.disp();
        Subject.Acd two = sub.new Acd(100, 203, "BBB");
        two.disp();
        Subject.Mcp three = sub.new Mcp(100, 201, "CCC");
        three.disp();
    }
}
class Subject {
    int count;
    int roll;
    Subject(int count, int roll) {
        this.count = count;
        this.roll = roll;
        System.out.println(count);
        System.out.println(roll);
    }
    class Web {
        int mark;
        int code;
        String staff;
        Web(int mark, int code, String staff) {
            this.mark = mark;
            this.code = code;
            this.staff = staff;
        }
        void disp() {
            System.out.println(mark +" "+ code +" "+ staff);
        }
    }
    class Acd {
        int mark;
        int code;
        String staff;
        Acd(int mark, int code, String staff) {
            this.mark = mark;
            this.code = code;
            this.staff = staff;
        }
        void disp() {
            System.out.println(mark +" "+ code +" "+ staff);
        }
    }
    class Mcp {
        int mark;
        int code;
        String staff;
        Mcp(int mark, int code, String staff) {
            this.mark = mark;
            this.code = code;
            this.staff = staff;
        }
        void disp() {
            System.out.println(mark +" "+ code +" "+ staff);
        }
    }
}