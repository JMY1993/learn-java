//过路费习题
public class ChargePasserBy {
    public static void main(String[] args) {
        double fund = 100000;
        int count = 0;

        while (fund > 0) {
            if (fund > 50000) {
                fund = 0.95*fund;
            } else {
                if ( fund < 1000 ){
                    break;
                }
                fund-=1000;
            }
            count++;
        }

        System.out.println(count + " " + fund);
    }
}
