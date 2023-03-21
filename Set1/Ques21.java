package Set1;

public class Ques21 {
    public static void main(String[] args) {
        int y=10;
        int z = (++y * (y++ + 5));
        System.out.println(z);
        int x=5;
        int x1=++x - x++ + --x;

        System.out.println(x1);
    }
}
