public class Day5Main {

    public static void main(String[] args) {

        //access methods from deskphone
        Deskphone deskphone = new Deskphone();
        deskphone.call();
        deskphone.dialNumber(8798789);
        deskphone.recivecall();
        System.out.println(deskphone.redial(87897));
        deskphone.wiredReceiver();//specific to Deskphone

        //access methods from mobilephone
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.call();
        mobilePhone.dialNumber(879658789);
        mobilePhone.recivecall();
        System.out.println(mobilePhone.redial(87897));
        mobilePhone.textMessage("Hi");

        System.out.println("---------------------------------");
        Telephone phone;
        phone = new Deskphone();
        phone.call();

        phone = new MobilePhone();
        phone.call();

//       Telephone phone2=new Deskphone();
//       Telephone phone=new MobilePhone();
//
//        //int x=10;
//        int x;//declare x
//        x=10;//assign value of x;


        Alkatel alkatel=new Alkatel();
        alkatel.touchScreen();
    }
}
