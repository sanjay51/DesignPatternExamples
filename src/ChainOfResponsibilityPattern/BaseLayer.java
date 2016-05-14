package ChainOfResponsibilityPattern;

/**
 * Created by sanjav on 5/14/16.
 */
public class BaseLayer implements HelpInterface {
    HelpInterface successor;

    public BaseLayer(HelpInterface successor) {
        this.successor = successor;
    }

    @Override
    public void getHelp(Constants.HelpLevel helpLevel) {
        if (helpLevel == Constants.HelpLevel.BASE_LAYER) {
            System.out.println("Help provided by base layer for " + helpLevel.toString());
        } else {
            successor.getHelp(helpLevel);
        }
    }
}
