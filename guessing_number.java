
import java.util.Random;
import java.util.Scanner;


class game{
    int n;
    int user;

    game(){
        Random rand = new Random();
        n = rand.nextInt(100)+1;
    }
    public void G(){
        System.out.println("Rendom number is :- " + n);
    }

    public void user_num(int user){
        if(user == n){
            System.out.println("Your number is Correct " + n);
        }
        else if (user<n) {
            System.out.println("Your Number is Smaller, So please try greater number");
        }
        else if (user>n) {
            System.out.println("Your number is Larger so please try smaller number");
        }
       
    }

}

public class guessing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        game s1 = new game();

        for(int i=1;i<=5;i++){
            System.out.println("Enter the guessing number :- ");
             int user = sc.nextInt();

             s1.user_num(user);
        }
        s1.G();
        
    }
}
