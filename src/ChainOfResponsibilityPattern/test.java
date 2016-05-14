package ChainOfResponsibilityPattern;

import org.testng.annotations.Test;

/**
 * Created by sanjav on 5/14/16.
 */
public class test {
    TopMostLayer topMostLayer;
    MiddleLayer middleLayer;
    BaseLayer baseLayer;

    public test() {
        topMostLayer = new TopMostLayer();
        middleLayer = new MiddleLayer(topMostLayer);
        baseLayer = new BaseLayer(middleLayer);
    }

    @Test
    public void testHelpForBaseLayer() {
        baseLayer.getHelp(Constants.HelpLevel.BASE_LAYER);
    }

    @Test
    public void testHelpForMiddleLayer() {
        baseLayer.getHelp(Constants.HelpLevel.MIDDLE_LAYER);
    }

    @Test
    public void testHelpForTopLayer() {
        baseLayer.getHelp(Constants.HelpLevel.TOP_LAYER);
    }

    @Test
    public void testHelpForAnyOtherLayer() {
        baseLayer.getHelp(Constants.HelpLevel.ANY_OTHER_LEVEL);
    }
}
