package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTest extends BaseTest{

    @Test
    public void CheckThatTheFileNamesMatch(){
        fileUploadPage.openFileUploader();
        fileUploadPage.downloadFile();
        String fileNameText = fileUploadPage.getTextFileUploader();
        assertEquals(fileNameText,"i.webp","Не верное название файла");





    }

}
