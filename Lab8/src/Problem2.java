
public class Problem2 {
    public static void main(String[] args) {
        printNumberRanges();
    }
    static void printNumberRanges(){
        System.out.printf("byte range=[%d to %d] ", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("\nshort range=[%d to %d] ", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("\nint range=[%d to %d] ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("\nlong range=[%d to %d] ", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("\nfloat range=[%e to %e] ", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("\ndouble range=[%e to %e] ", Double.MIN_VALUE, Float.MAX_VALUE);
    }
}
