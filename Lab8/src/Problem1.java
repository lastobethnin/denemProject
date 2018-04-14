public class Problem1 {
    public static void main(String[] args) {
        midtermQuestions();
    }
    public static void midtermQuestions(){
        System.out.println("bad"+"communication");
        System.out.println("21 / 4 + 13 % 5 * 8 = " + 21 / 4 + 13 % 5 * 8 + "...why?");
        System.out.println("21 / 4 + 13 % 5 * 8 = " + (21 / 4 + 13 % 5 * 8) + "...why?");
        int x = 1; int y = 5; int z = (x--) + (++y);
        x = 0; y = 6; z = 7;
        System.out.printf("x=%d, y=%d, z=%d", x, y, z);
    }
}
