import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caluclator {
	
	
	public void add() {
		
		System.out.println("Adding some numbers: ");
	}
	
	public void sub() {
		
		System.out.println("subtract some numbers: ");
	}
	
	public void multi() {
	
	System.out.println("multiply some numbers: ");
}

	public void div() {
	
	System.out.println("divison some numbers: ");
}


	public static void main(String[] args) {
		
		// object of the class
		Caluclator calc = new Caluclator();	
		calc.add();
		calc.sub();
		calc.div();
		calc.multi();
		
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.way2automation.com");
		driver.get("https://www.apply-basic-criminal-record-check.service.gov.uk/");
		driver.findElement(By.id("cookie-banner-accept-all")).click();
		driver.findElement(By.id("confirm-privacy-policy")).click();
		driver.findElement(By.id("save-and-continue")).click();
		
		
		
		// id=confirm-privacy-policy
		// type=checkbox
		//cookie-banner-accept-all

	}

}
