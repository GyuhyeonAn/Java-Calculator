public class ScientificCalculator extends Calculator {

    public int calcFactorial(int num1) {
        num2 = num1;
        result = 1;
        while(num1 >= 1) {
            result *= num1;
            num1--;
        }
        return result;
    }

    public void display() {
        System.out.println(num2 + "! = " + result);
    }
}