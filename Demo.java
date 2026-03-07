
class Calculator {
    int a;

    public int add() {
        System.out.println("in add");
        return 0;
    }
}

public class Demo {
    public void test() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        // Properties -- What I know
        // behaviors -- What you can do with the knowledge
        int num1 = 4;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);
        Calculator c = new Calculator(); // new class() is to consume the space
        c.add();
        new Calculator().add();
        int result1 = c.add();
        System.out.println(result1);

    }
}