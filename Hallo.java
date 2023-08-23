public class Hallo {
    public static void main(String[] args ){
        Scanner k= new Scanner(System.in);
        Data[] d= new Data[6];

        for (int i=0;i<d.length;i++){
            System.out.println("Enter the name: ");
            String n= k.next();
            System.out.println("enter the percentage: ");
            int p=k.nextInt();
            d[1]=new Data(n,p);
        }
        System.out.println("The data is as follows: ");
        for(int i=0;i<d.length;i++){
            d[i].display();
        }
    }
}
