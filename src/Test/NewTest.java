package Test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void Inicio() {
	  //Inicio
	  driver.findElement(By.xpath("//*[@id=\'menu-item-21\']/a")).click();
  }
	
  @Test (dependsOnMethods= {"Inicio"})
  public void Servicios() {
	  
	  //Servicios
	  ////Desarrollo
	  //////Asesor�a de interfaz y experiencia de usuario (UX)
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-2642\']/a")).click();
	  //////Desarrollo de software
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-2976\']/a")).click();
	  //////Dise�o de p�ginas web
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-226\']/a")).click();
	  //////Manejo de redes sociales para empresas
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-2895\']/a")).click();
	  //////Consultor�a Web 
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-1998\']/a")).click();
	  //////SEO (optimizaci�n en motores de b�squeda)
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-227\']/a")).click();
	  
	  ////Soporte
	  //////Mantenimiento preventivo  y correctivo
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-361\']/a")).click();
	  //////Evaluaci�n de infraestructura (IT)
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-392\']/a")).click();
	  //////Configuraci�n de respaldo
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-360\']/a")).click();
	  //////Instalaci�n de cableado estructurado
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-357\']/a")).click();
	  //////Instalaci�n y configuraci�n de redes Wi-Fi
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-358\']/a")).click();
	  //////Certificaci�n de cableado estructurado
	  Hover(driver);
	  driver.findElement(By.xpath("//*[@id=\'menu-item-356\']/a")).click();
	  
  }
  
  @Test (dependsOnMethods= {"Servicios"})
  public void Portafolio() {
	//Portafolio
	driver.findElement(By.xpath("//*[@id='menu-item-62']/a")).click();
  }
  
  @Test (dependsOnMethods= {"Portafolio"})
  public void Conocenos() {
	  //Conocenos
	  driver.findElement(By.xpath("//*[@id=\'menu-item-65\']/a")).click();
  }
  
  @Test (dependsOnMethods= {"Conocenos"})
  public void Empleos() {
	  //Empleos
	  driver.findElement(By.xpath("//*[@id=\'menu-item-126\']/a")).click();
  }
  
  @Test (dependsOnMethods= {"Empleos"})
  public void BLOG() {
	  //BLOG
	  driver.findElement(By.xpath("//*[@id=\'menu-item-20\']/a")).click();
  }
  
  public WebDriver Hover(WebDriver driver) {
	  
	  Actions action = new Actions(driver);
	  WebElement element = driver.findElement(By.xpath("//*[@id=\'menu-item-209\']/a"));
	  action.moveToElement(element).build().perform();
	  return driver;
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://gbh.com.do/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
	  
  }

}
