package Day6;

public class Day6Main {
    public static void main(String[] args)  {


        //try ,catch ,finally run time exception
//        int i=30;
//        int j=0;
//        String[] seasons={"Autumn","Winter","Spring","Summer"};
//        String name=null;
//        try{
//            System.out.println("opening file");
//            System.out.println(name.toUpperCase());
//
//        }
//
//        catch(ArithmeticException ex){
//            System.out.println("exception "+ex.getMessage());
//        }
//        catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println("exception "+ex.getMessage());
//        }
//        catch (Exception ex){
//            System.out.println("exception "+ex.getMessage());
//        }
//        finally {
//            System.out.println("close file");
//        }
//        System.out.println(i);



//            Day6.ExceptionPredicted.FileOperaton();

        //amount read from user

        try {
            ExceptionPredicted.Calculation(200);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}
