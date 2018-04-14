import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        double [] r = new double[5];

        for(int i = 0; i < r.length; i++){
            r[i] = Math.random() * 10;
        }
        System.out.println(Arrays.toString(r));
    }
}
