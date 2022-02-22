package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void CaptureScreenshot(WebDriver driver,String ScreenshotName) {
		
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			// . Current working directory
			try {
			File dest = new File("./snaps/"+ScreenshotName+".png");
			FileUtils.copyFile(src, dest);
			System.out.println("Screenshot taken");
		} catch (Exception e) {
           System.out.println("Exception while taking screensot"+e.getMessage());
		}

	}

}
