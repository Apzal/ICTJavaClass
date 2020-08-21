package Day4;

public class Day4Main {

    public static void main(String[] args) {


        // Instantiate Day4.Chrome class and save reference to Day4.Browser class
//        Day4.Browser browser=new Day4.Chrome(); //chrome is an abstract class
//        browser.NavigatePages();// refers to chrome class method,since navigate pages is overridden method
//        browser.UserInterface();//refers to browser class method
//
//        // Instantiate Day4.Chrome class and save reference to Day4.Chrome class
//        Day4.Chrome chrome=new Day4.Chrome(); //chrome is an abstract class
//        chrome.NavigatePages();// refers to chrome class method,since navigate pages is overridden method
//        chrome.UserInterface();//refers to browser class method



        ChromeWindow chromeWindow=new ChromeWindow();
        chromeWindow.incognitiveWindow();
        chromeWindow.ChromeSettings();
        chromeWindow.Security();
    }
}
