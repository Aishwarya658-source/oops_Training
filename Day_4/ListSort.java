import java.util.*;

public class ListSort{
    public static void main(String[] aregs){
        ArrayList<Integer> li = new ArrayList<>();
        li.add(12);
        li.add(67);
        li.add(45);
        li.add(34);
        li.add(86);
        int n = li.size();
        for(int i = 0;i<n-2;i++){
            for(int j = 0;j<n-2-i;j++){
                if(li.get(j)>li.get(j+1)){
                    int temp = li.get(j);
                    li.set(j,li.get(j+1));
                    li.set(j+1,temp);
                }
            }
        }
        System.out.println(li);

    }
}