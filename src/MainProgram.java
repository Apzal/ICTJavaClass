import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        LoanProgram loanProgram=new LoanProgram();

        //reduce points
        loanProgram.setCreditPoints(50);
        System.out.println(loanProgram.getCreditPoints());
        //reduce points
        loanProgram.setCreditPoints(50);
        System.out.println(loanProgram.getCreditPoints());

        //reduce points
        loanProgram.setCreditPoints(30);
        System.out.println(loanProgram.getCreditPoints());

        System.out.println(loanProgram.getCreditPoints());





    }
}
