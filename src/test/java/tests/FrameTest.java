package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrameTest extends BaseTest{

    @Test

public void checkThatTheTextInsideTheParagraphIsTrue(){
framePage.openAFrames();
framePage.openAIFrame();
String textByFrame = framePage.getTextByFrame();
assertEquals(textByFrame,"Your content goes here.","Текст сообщения не верный");

    }

}
