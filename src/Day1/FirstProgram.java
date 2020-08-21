package Day1;

import java.util.Arrays;

public class FirstProgram {
    public static void main(String[] args){
        //data types and casting
        //byte -> short -> char -> int -> long -> float -> double
        int intValue=200;
        byte byteValue=(byte) intValue;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        float floatResult=5.0f/3.0f;
        double doubleResult=5.0/3.0;
        System.out.println("floatResult is "+floatResult);
        System.out.println("doubleResult is "+doubleResult);

        // operator (++)
        int viewsCount=100;
        int anotherviewsCount=++viewsCount;

        System.out.println(anotherviewsCount);
        System.out.println(viewsCount);

        //asignment operator
        int xValue=10;
        int yValue=xValue;
        yValue=xValue+20;

        System.out.println(xValue);
        System.out.println(yValue);

        //reference data type ,
        String[] browsers={"Day4.Chrome","IE","FF"};
        String[] newBrowser=browsers;
        newBrowser[2]="Safari";
        System.out.println(browsers[2]);// FF
        System.out.println(Arrays.toString(newBrowser)); //null,null,Safari

        //final keyword
        final double PI=3.14;
        System.out.println(PI*3*3);


        //string
        String myMessage="Aug 15 falls on saturday.My Bad!!";
        String otherMessage=myMessage+"Its OKAy";
        System.out.println(otherMessage);
        System.out.println(myMessage);




    }

}

