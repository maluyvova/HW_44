package core.HW44;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SignUp {
public void validate (WebDriver driver,String url) {
	my id = new my();
	id.safari ("http://alex.academy/exe/signup/v1/index.php");
	String [] idnumber= {"01.Element(Quotes) ","02.Element(Current Location) ","03.Element (Weather Icon) ","04.Element(Quotes) ","05.Element [Title]"};
	for (String name : idnumber)
		System.out.printf("%s", name);
	
	String x []  = {"id_quotes","id_current_location","id_weather_icon","id_temperature","id_f_title","id_f_label_fn"};
	for (int i =0;i<x.length;i++ )
if (!driver.findElements(By.xpath(x[i])).isEmpty()) {
	System.out.println("Element is Present");
}
else {System.out.println("Element is not present");
}}}