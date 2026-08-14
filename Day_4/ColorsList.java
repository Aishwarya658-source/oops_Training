
import java.util.*;
public class ColorsList {
    public static void main(String[] args) {
        Colors c = new Colors(1,"Pink",false);
        Colors s = new Colors(2,"Black",true);
        Colors d = new Colors(3,"Blue",true);

        ArrayList<Colors> li = new ArrayList<>();
        li.add(c);
        li.add(s);
        li.add(d);
        System.out.println(li);

    }
}
class Colors{
    int id;
    String name;
    boolean favourite;
    Colors(int id, String name,boolean favourite){
        this.id = id;
        this.name = name;
        this.favourite = favourite;
    }
}
