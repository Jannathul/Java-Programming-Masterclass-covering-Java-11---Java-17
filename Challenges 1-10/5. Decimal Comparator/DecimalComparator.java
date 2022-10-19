public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double first = num1 * 1000;
        double sec = num2 * 1000;
        first = first%1000;
        sec = sec%1000;
        if ((int)first == (int)sec){
            if((int)num1 == (int) num2){
                System.out.println("true");
                return true;
            }
            else {
                System.out.println("false");
                return false;
            }
        }
        else {
            System.out.println(false);
            return false;
        }

    }
}
