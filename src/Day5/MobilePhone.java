package Day5;

public class MobilePhone implements  Telephone{
    int number=897978;
    @Override
    public void call() {
        System.out.println("call using Day5.MobilePhone"+number);
    }

    @Override
    public void dialNumber(int number) {
        System.out.println("dial number "+number+" using Day5.MobilePhone");
    }

    @Override
    public void recivecall() {
        System.out.println("receive call using Day5.MobilePhone");
    }

    @Override
    public int redial(int number) {
        return number;
    }

    public void textMessage(String message){
        System.out.println("Sending text msg from mobilephone:"+message);
    }
}
