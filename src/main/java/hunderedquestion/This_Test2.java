package hunderedquestion;

public class This_Test2 {
    int var1;
    int var2;

    public This_Test2(){
        var1 =10;
        var2=20;

    }
    void printValue(This_Test2 obj){
        System.out.println("val1"+obj.var1 + " "+ "var2"+ obj.var2);
    }
    void get(){
        printValue(this);
    }

    public static void main(String[] args) {
        This_Test2 o =new This_Test2();
        o.get();
    }
}
