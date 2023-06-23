package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrameTest extends BaseTest{
    @Test
    public void openIFrame(){
        framePage.openAFrames();
        framePage.openAIFrame();
    }

    @Test

public void checkThatTheTextInsideTheParagraphIsTrue(){
framePage.openAFrames();
framePage.openAIFrame();
framePage.getTextByFrame();
String textByFrame = framePage.getTextByFrame();
assertEquals(textByFrame,"Your content goes here.","Текст сообщения не верный");

    }

}
