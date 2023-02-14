package hunderedquestion;

public class This_test4 {
    int val_a;
    int val_b;

    //Default constructor
    This_test4(){
        val_a=23;
        val_b=34;

    }

    This_test4 get()
    {
        return this;
    }

    void display()
    {
        System.out.println("val_a = " + val_a + "  val_b = " + val_b);
    }

    public static void main(String[] args) {
        This_test4 t =new This_test4();
        t.get().display();
    }
}
