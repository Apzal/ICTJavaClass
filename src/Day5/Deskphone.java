package Day5;

public   class Deskphone implements Telephone {
    @Override
    public void call() {
        System.out.println("call using deskphone"+number);
    }

    @Override
    public void dialNumber(int number) {
        System.out.println("dial number "+number+" using deskphone");
    }

    @Override
    public void recivecall() {
        System.out.println("receive call using deskphone");
    }

    @Override
    public int redial(int number) {
        return number;
    }

    public void wiredReceiver(){
        System.out.println("receive call using wired receiver deskphone");
    }



}
