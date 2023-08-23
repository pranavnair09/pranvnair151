import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){
        Random k=new Random();
        int x= k.nextInt(6)+1;
        double y=k.nextDouble();
        boolean z=k.nextBoolean();
        System.out.println(y);
        System.out.println(z);
        System.out.println(x);
    }
}
