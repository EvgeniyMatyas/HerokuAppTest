package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenuTest extends BaseTest{

    @Test
    public void textValidationOnAlert(){
        contextMenuPage.openContextMenu();
        contextMenuPage.rightClickOnAnElement();
        contextMenuPage.getText();
        String alertText = contextMenuPage.getText();
        assertEquals(alertText,"You selected a context menu","Текст сообщения не верный");
        contextMenuPage.alertAccept();

    }

}
