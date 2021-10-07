package br.com.chronosAcademy.appium;

import io.appium.java_client.MobileBy;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void validarMultiplicacao() throws MalformedURLException {
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setCapabilities("Android", "ChronosAcademy", "uiautomator2",
                "com.android.calculator2", "com.android.calculator2.Calculator");
        driverFactory.setDriver();
        driverFactory.getDriver().findElement(MobileBy.id("digit_1")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_8")).click();
        driverFactory.getDriver().findElement(MobileBy.id("op_mul")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_2")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_9")).click();
        driverFactory.getDriver().findElement(MobileBy.id("eq")).click();
        String resultado = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("522", resultado);
    }

    @Test
    public void validarAdicao() throws MalformedURLException, InterruptedException {
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setCapabilities("Android", "ChronosAcademy", "uiautomator2",
                "com.android.calculator2", "com.android.calculator2.Calculator");
        driverFactory.setDriver();
        driverFactory.getDriver().findElement(MobileBy.id("digit_5")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_2")).click();
        driverFactory.getDriver().findElement(MobileBy.id("op_add")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_4")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_9")).click();
        driverFactory.getDriver().findElement(MobileBy.id("eq")).click();
        String resultado = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("101", resultado);
    }

    @Test
    public void validarSubtracao() throws MalformedURLException {
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setCapabilities("Android", "ChronosAcademy", "uiautomator2",
                "com.android.calculator2", "com.android.calculator2.Calculator");
        driverFactory.setDriver();
        driverFactory.getDriver().findElement(MobileBy.id("digit_4")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_0")).click();
        driverFactory.getDriver().findElement(MobileBy.id("op_sub")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_2")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_3")).click();
        driverFactory.getDriver().findElement(MobileBy.id("eq")).click();
        String resultado = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("17", resultado);
    }

    @Test
    public void validarDivisao() throws MalformedURLException {
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setCapabilities("Android", "ChronosAcademy", "uiautomator2",
                "com.android.calculator2", "com.android.calculator2.Calculator");
        driverFactory.setDriver();
        driverFactory.getDriver().findElement(MobileBy.id("digit_8")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_8")).click();
        driverFactory.getDriver().findElement(MobileBy.id("op_div")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_4")).click();
        driverFactory.getDriver().findElement(MobileBy.id("digit_4")).click();
        driverFactory.getDriver().findElement(MobileBy.id("eq")).click();
        String resultado = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();

        assertEquals("2", resultado);
        driverFactory.getDriver().quit();
    }
}
