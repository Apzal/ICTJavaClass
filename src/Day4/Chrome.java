package Day4;

public abstract class Chrome extends Browser {


    public Chrome(){
    super("text");
    }
//    public Day4.Chrome(String name){
//        super(name);
//        System.out.println("Day4.Chrome Constructor");
//
//    }
    public abstract void incognitiveWindow();

    public void ChromeSettings(){
        System.out.println("In Day4.Chrome Class -ChromeSettings method");
    }

    @Override
    public void NavigatePages(){
        super.NavigatePages();
        System.out.println("Day4.Chrome class -NavigatePages method");

    }
}
