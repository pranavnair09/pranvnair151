public class Disarium {

    public static void main(String[] args) {

        int number = 253;
        int Original;
        int rem;
        int result = 0;

        Original = number;

        while (Original!= 0)
        {
            rem = Original % 10;
            result = result + rem*rem*rem;
            Original= Original/10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
//write 20 programs based on loops and oops