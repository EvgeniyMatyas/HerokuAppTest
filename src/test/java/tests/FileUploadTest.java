package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTest extends BaseTest{

    @Test
    public void checkingTheFileAddition(){
        fileUploadPage.openFileUploader();
        fileUploadPage.downloadFile();

    }
    @Test
    public void CheckThatTheFileNamesMatch(){
        fileUploadPage.openFileUploader();
        fileUploadPage.downloadFile();
        fileUploadPage.equalsNames();



    }

}
