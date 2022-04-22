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
            System.out.println(ANSI_GREEN + "How many characters should the password have?" + ANSI_RESET);
            int number = scanner.nextInt();
            for (int i = number;i!=0;--i){
                Random random = new Random();
               int randint = random.nextInt(87);
               password = password + characters[randint];
         }
            System.out.println(ANSI_BLUE + password+ ANSI_RESET);
            System.out.println(ANSI_PURPLE + "Do you want to generate another password? (Yes/No)"+ ANSI_RESET);
            String option = scanner.next();
            if(option.contains("No")){
                close = true;
            }
        }
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

}
