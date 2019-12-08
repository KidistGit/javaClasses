package com.class30;

public class ChromeDriver1 implements WebDriver1 {
	@Override
	public void openBrowser() {
		System.out.println("The ChromeDriver can open the Browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("The ChromeDriver can close the  Browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("The ChromeDriver can maximaze the Browser");
	}

	@Override
	public void findElement() {
		System.out.println("The ChromeDriver can find an element in Browser");
	}

}
