public class Calculator {
    String displayCalculation = "";

    public int add(int a, int b) {
        displayCalculation = a + " + " + b + " = " + (a + b);
        return a + b;
    }

    public int multiply(int a, int b) {
        displayCalculation = a + " * " + b + " = " + (a + b);
        return a * b;
    }

    public boolean bigger(int a, int b) {
        displayCalculation = a + " bigger than " + b + " = " + (a > b);
        return a > b;
    }

    public int square(int a) {
        displayCalculation = "square" +  a + " = " + (a * a);
        return a * a;
    }

    public void setDisplayCalculation() {
        System.out.println(displayCalculation);
    }



}

