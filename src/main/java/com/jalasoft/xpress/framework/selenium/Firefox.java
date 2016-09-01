package com.jalasoft.xpress.framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox implements IDriver {


    @Override
    public WebDriver initDriver() {
        return new FirefoxDriver();
    }
}
