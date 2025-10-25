public class ScientificCalculator extends AdvancedCalculator {
    int count;
    public int calcFactorial(int num) {
        this.count = num;
        this.num1 = num;
        int factNum = 1;

        if (this.num1 < 0 ) {
            System.out.println("잘못 입력했습니다.");
            this.result = 0;
            return this.result;
        }

        if (count == 0 | count == 1 ) {
            this.result = 1;
            return this.result;
        }


        for (int i = 2; i <= count; i++) {

            super.setNumbers(factNum, i);

            int saveNum = super.multiply();

            factNum = saveNum;
        }
        this.result = factNum;
        return this.result;
    }

    public void displayResult() {
        System.out.println(this.count + "!의 값 = " + this.result);
    }

}