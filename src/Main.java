import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Boolean close = false;
        while(close == false){
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ|€¶ŧ@&#đ~{}^Łł'`~đĐþøabcdefghijklmnopqrstuvwxyz+-/*.123456789";
            String characters[] = chars.split("");
            String password = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many characters should the password have?");
            int number = scanner.nextInt();
            for (int i = number;i!=0;--i){
                Random random = new Random();
               int randint = random.nextInt(87);
               password = password + characters[randint-1];
         }
            System.out.println(password);
            System.out.println("Do you want to generate another password? (Yes/No)");
            String option = scanner.next();
            if(option.contains("No")){
                close = true;
            }
        }
    }
}
