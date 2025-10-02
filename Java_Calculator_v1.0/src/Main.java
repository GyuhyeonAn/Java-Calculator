public class Main {
    public static void main(String[] args) {

        Calculator cal_add = new Calculator();
        cal_add.setNumbers(5,3);
        cal_add.add();
        cal_add.displayResult("+");

        Calculator cal_mul = new Calculator();
        cal_mul.setNumbers(10,3);
        cal_mul.multiply();
        cal_mul.displayResult("×");


    }
}   