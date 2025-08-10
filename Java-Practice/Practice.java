class Calculator {
    int sum(int n1, int n2) {
        return n1 + n2;
    }
}

class Practice {
    public static void main(String a[]) {
        /*
         * example of switch case
         * //this is the new sytnax for switch case in java
         * String day = "Mon";
         * String result = "";
         * 
         * result = switch (day) {
         * case "Monday" -> "6AM";
         * case "Sunday","Saturday" -> "8AM";
         * default -> "Sleep the whole day";
         * };
         * System.out.println(result);
         * 
         * // this is also a new change if you don't want to use ->
         * result = switch (day) {
         * case "Monday" :yield "6AM";
         * case "Sunday","Saturday": yield "8AM";
         * default :yield "Sleep the whole day";
         * };
         * System.out.println(result);
         */

        // example of using basic class
        Calculator calc = new Calculator();
        int res = calc.sum(4, 5);
        System.out.println(res);

    }
}