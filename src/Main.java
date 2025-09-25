public class Main {
    public static void main(String[] args) {

        Calculator cal_add = new Calculator();
        cal_add.setNumbers(5,3);
        cal_add.add();
        cal_add.displayResult("+");

        Calculator cal_sub = new Calculator();
        cal_sub.setNumbers(7,3);
        cal_sub.subtract();
        cal_sub.displayResult("-");

        Calculator cal_mul = new Calculator();
        cal_mul.setNumbers(10,3);
        cal_mul.multiply();
        cal_mul.displayResult("×");

        Calculator cal_div = new Calculator();
        cal_div.setNumbers(10,2);
        cal_div.divide();
        cal_div.displayResult("÷");

    }
}