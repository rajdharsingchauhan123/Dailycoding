package hunderedquestion;

public class This_Test3 {
    void print()
    {
        // calling fuctionshow()
        this.show();

        System.out.println("Test_this:: print");
    }

    void show() {
        System.out.println("Test_this::show");
    }

    public static void main(String[] args) {
        This_Test3 t =new This_Test3();
        t.print();
    }
}
