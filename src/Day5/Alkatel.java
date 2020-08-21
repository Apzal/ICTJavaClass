package Day5;//class Opera extends Day4.Chrome,IE not allowed
//class Opera implement Day4.Chrome,IE allowed

public class Alkatel implements Tablet,SmartPhone{
    @Override
    public void bigDisplay() {

    }

    @Override
    public void touchScreen() {
        System.out.println("Touch screen in Day5.Alkatel");
    }

    @Override
    public void call() {

    }

    @Override
    public void dialNumber(int number) {

    }

    @Override
    public void recivecall() {

    }

    @Override
    public int redial(int number) {
        return 0;
    }
}
