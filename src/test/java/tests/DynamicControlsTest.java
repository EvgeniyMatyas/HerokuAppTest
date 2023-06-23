package tests;

import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest{
    @Test
    public void clickOnTheRemoveButtonNearTheCheckbox(){
        dynamicControlsPage.openDynamicControls();
        dynamicControlsPage.removeButton();
    }
    @Test
    public void waitForThInscriptionItIsGone(){
        dynamicControlsPage.openDynamicControls();
        dynamicControlsPage.removeButton();
        dynamicControlsPage.expectation();
    }
    @Test
    public void checkThatThereIsNoCheckbox(){
        dynamicControlsPage.openDynamicControls();
        dynamicControlsPage.checkBox();
        dynamicControlsPage.openDynamicControls();
        dynamicControlsPage.removeButton();
        dynamicControlsPage.expectation();
       //todo

    }

}
