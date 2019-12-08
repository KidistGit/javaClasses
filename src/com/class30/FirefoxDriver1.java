package com.class30;

public class FirefoxDriver1 implements WebDriver1 {
	@Override
	public void openBrowser() {
		System.out.println("The FirefoxDriver can open the Browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("The FirefoxDriver can close the  Browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("The FirefoxDriver can maximaze the Browser");
	}

	@Override
	public void findElement() {
		System.out.println("The FirefoxDriver can find an element in Browser");
	}

}
