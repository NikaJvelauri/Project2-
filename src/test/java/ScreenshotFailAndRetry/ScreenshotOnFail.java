package ScreenshotFailAndRetry;

import com.codeborne.selenide.Screenshots;

import com.google.common.io.Files;
import org.testng.ITestListener;

import io.qameta.allure.Attachment;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;

public  class ScreenshotOnFail implements ITestListener {

    @AfterMethod
    public void tearDown() throws IOException {
        screenshot();
    }
    @Attachment(value ="Screenshot on failure", type = "image/png")
    public byte[] screenshot() throws IOException {
        File screenshot = Screenshots.getLastScreenshot();
        return screenshot == null ? null : Files.toByteArray(screenshot);
    }

}
