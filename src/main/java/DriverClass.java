import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverClass {

    public static AndroidDriver<AndroidElement> androidCapability() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver;

        File srcDir = new File("src");
        File app = new File(srcDir, "snapdealTest.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel Api 28");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\asus\\Desktop\\MedtronicTest\\src\\main\\resources\\snapdealTest.apk");

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        return driver;


    }

}
