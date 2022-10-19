public class Main {
    public static void main(String[] args) {
        
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, -3.175);
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.123,3.123);
        DecimalComparator.areEqualByThreeDecimalPlaces(4.0,5.0);
    }
}
