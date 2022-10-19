public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true,1);
        shouldWakeUp(false,2);
        shouldWakeUp(true,8);
        shouldWakeUp(true,-1);
    }
    public static boolean shouldWakeUp(boolean dogBarking, int hourOfDay){
        if(dogBarking){
            if (hourOfDay<0 || hourOfDay>23){
                //System.out.println("false");
                return false;
            }
            else if (hourOfDay<8 || hourOfDay>22) {
                //System.out.println("true");
                return true;
            }
            else{
                //System.out.println("false");
                return false;
            }

        }
        else{
            //System.out.println("false");
            return false;
        }

    }
}
