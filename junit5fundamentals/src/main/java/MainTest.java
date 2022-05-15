public class MainTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int a = 24;
        int b = 33;
        c.add(a,b);
        c.showDisplayCalculation();
        c.multiply(a,b);
        c.showDisplayCalculation();
        c.bigger(a,b);
        c.showDisplayCalculation();
        c.square(a);
        c.showDisplayCalculation();
    }
}
