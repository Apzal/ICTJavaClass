import java.util.Arrays;

public class Day2 {

    public static void main(String[] args) {

        // if else condition
        boolean javaLearned=true;
        boolean automationLearned=false;
        boolean isExperienced=true;
        boolean isEligible=(javaLearned || automationLearned) && (!isExperienced);

        if(isEligible){
            System.out.println("Call for Interview");
        }else{
            System.out.println("Not eligible");
        }

        // if else condition
        int temperature = 32;
        boolean expectedRain = false;

        if (temperature > 30) {
            expectedRain=false;
            System.out.println("Hot Day");
            System.out.println("High temperature");
        } else if (temperature > 20) {
            expectedRain=true;
            System.out.println("Normal Day");
        } else{
            System.out.println("Cold Day");
            expectedRain=true;
        }

        //Switch Case
        String browser="Browserless";
        switch (browser.toLowerCase()){
            case "chrome":
                System.out.println("Opening Chrome");
                break;
            case "ie":
                System.out.println("Opening ie");
                break;
            case "ff":
                System.out.println("Opening ff");
                break;
            case "opera":
                System.out.println("Opening opera");
                break;
            default:
                System.out.println("Edge");
        }

        //while loop
        boolean pageLoading=false;
        int counter=5;
        while (pageLoading){
            System.out.println(counter+" Page is still loading");
            counter--;
            if(counter==0){
                pageLoading=false;
            }
        }

        System.out.println("---------------------------------------------");

        //do while loop
        do{
            System.out.println(counter+" Page is still loading");
            counter--;
            if(counter==0){
                pageLoading=false;
            }
        }while (pageLoading);

        //for loop
        String[] cars={"BMW","Ferrai","TATA","FORD","BENZ"};
        for(int i=4;i>=0;i--){
            System.out.print(cars[i]+" ");
        }

        // escape character
        System.out.println("\n \"For Each Loop\"");

        // for each loop
        for(String car:cars){
            System.out.print(car+" ");
        }

    }
}
