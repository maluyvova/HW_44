package core.HW44;
import org.openqa.selenium.WebDriver;
public class main {
static long start;
static long finish;
static WebDriver driver;
public static void main (String [] args) {
	System.out.println("Browser:HtmlUnit");
	start = System.currentTimeMillis();
	SignUp lo = new SignUp();
	lo.validate(driver,"http://alex.academy/exe/signup/v1/index.php");
}
}
