package ChainOfResponsibilityPattern;

/**
 * Created by sanjav on 5/14/16.
 */
public class TopMostLayer implements HelpInterface {
    //No successor
    public TopMostLayer() {

    }

    @Override
    public void getHelp(Constants.HelpLevel helpLevel) {
        System.out.println("Help provided by top most layer for " + helpLevel.toString());
    }
}
