public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes>=0){
            long hour = minutes/60;
            long day = hour/24;
            long year = day/365;
            day = day%365;
            String newMinutes = minutes+" min = ";
           

            String newYear = year+" y ";
           
            String newDay = "and "+day+" d";
            
            System.out.println(newMinutes+ newYear+ newDay);
        }
        else
            System.out.println("Invalid Value");

    }
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
}
