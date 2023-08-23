import java.util.Scanner;

public class Binary {
    public static void main(String[] args){
        Scanner k= new Scanner(System.in);

        int data[]=new int[10];
        for(int i=0;i<data.length;i++ )
        {
            System.out.println("Enter the number : ");
            data[i]=k.nextInt();
        }

    }
}
