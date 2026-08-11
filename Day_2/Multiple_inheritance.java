public class Multiple_inheritance {
    public static void main(String[] args) {
        Staff s = new Staff();
        s.cashing();
        s.papers();
    
    }
}
interface College{
    void cashing();

}
interface Department{
        void papers();
}

class Staff implements College,Department{
    public void cashing(){
        System.out.println("cash");
    }
    public void papers(){
        System.out.println("papers");
    }
}
