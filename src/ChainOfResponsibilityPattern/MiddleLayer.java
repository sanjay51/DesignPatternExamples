package ChainOfResponsibilityPattern;

/**
 * Created by sanjav on 5/14/16.
 */
public class MiddleLayer implements HelpInterface {
    HelpInterface successor;

    public MiddleLayer(HelpInterface successor) {
        this.successor = successor;
    }

    @Override
    public void getHelp(Constants.HelpLevel helpLevel) {
        if (helpLevel == Constants.HelpLevel.MIDDLE_LAYER) {
            System.out.println("Help provided by middle layer for " + helpLevel.toString());
        } else {
            successor.getHelp(helpLevel);
        }
    }
}
