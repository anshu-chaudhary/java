import java.util.Scanner;
public class C1 {
    private String name;

    public void setName(String n) {
        name = n;

    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        C1 a = new C1();
        C1 b = new C1();
        a.setName("Aarna");
        b.setName("Gorav");
        System.out.println("a.getName");
      System.out.println("b.getName");
}
}
