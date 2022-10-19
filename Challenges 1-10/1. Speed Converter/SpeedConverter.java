public class SpeedConverter {
   public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }

        else{
            double toMilesPerHour;
            toMilesPerHour = 1/1.609 * kilometersPerHour ;
            long rounded = Math.round(toMilesPerHour);
            return (long) rounded;
        }
    }
    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour!=-1){
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h" );
        }
        else
            System.out.println("Invalid Value");
    }

    //Main method
    public static void main(String[] args) {double number = 1.5;
        long rounded = Math.round(number);
        System.out.println("rounded= " + rounded);
        System.out.println("with 3.9= " + Math.round(3.9));
        System.out.println("with 4.5= " + Math.round(4.5));
        int sum = 45;
        int count = 10;
        // typecasting so result is double e.g. double / int -> double
        double average = (double) sum / count;
        long roundedAverage = Math.round(average);
        System.out.println("average= " + average);
        System.out.println("roundedAverage= " + roundedAverage);
    }

}