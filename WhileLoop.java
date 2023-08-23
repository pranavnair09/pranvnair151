import java.util.*;

public class WhileLoop {
    public static void main(String[] args){
        Scanner k= new Scanner(System.in);
        String name="";

        while(name.isBlank()){
            System.out.println("enter your name ");
            name=k.nextLine();
        }
        System.out.println("hello my friend "+name);


    }
}
