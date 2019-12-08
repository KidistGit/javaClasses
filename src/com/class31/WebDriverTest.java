package com.class31;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.openBrowser();
		driver.closeBrowser();
		driver.maximazeWindow();
		driver.findElement();
		driver.takesScreen();
		driver.takePictures();

		TakesScreenshot ts = new ChromeDriver();
		// ts.openBrowser();
		// ts.closeBrowser();
		// ts.maximazeWindow();
		// ts.findElement();
		ts.takesScreen();
		ts.takePictures();

	}

}
