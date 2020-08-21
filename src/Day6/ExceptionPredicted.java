package Day6;

import java.io.File;
import java.util.Scanner;

public class ExceptionPredicted {
    public static void FileOperaton() throws Exception {
        File f=new File("abc.txt");
        Scanner scanner=new Scanner(f);

    }

    public static void Calculation(int amount) throws CustomException  {
        //get the amount reduce from balance;
        int balance=100;
        if(amount>=balance){
            throw new CustomException("amount is > balance");
        }

        balance=balance-amount;
        System.out.println(balance);

        //update credit balance
        //update the account balance
    }
}
