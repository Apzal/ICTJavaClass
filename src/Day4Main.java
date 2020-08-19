public class Day4Main {

    public static void main(String[] args) {


        // Instantiate Chrome class and save reference to Browser class
//        Browser browser=new Chrome(); //chrome is an abstract class
//        browser.NavigatePages();// refers to chrome class method,since navigate pages is overridden method
//        browser.UserInterface();//refers to browser class method
//
//        // Instantiate Chrome class and save reference to Chrome class
//        Chrome chrome=new Chrome(); //chrome is an abstract class
//        chrome.NavigatePages();// refers to chrome class method,since navigate pages is overridden method
//        chrome.UserInterface();//refers to browser class method



        ChromeWindow chromeWindow=new ChromeWindow();
        chromeWindow.incognitiveWindow();
        chromeWindow.ChromeSettings();
        chromeWindow.Security();
    }
}
