package ProjetoTeste1.ProjetoTeste1;

import static org.testng.AssertJUnit.assertEquals;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.gl.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class Steps {

	 public WebDriver driver;
	 
	 public Steps()    
	 {
	     driver = Config.driver;
	 }
	 
	 @Dado("^que eu acesse a url do Walmart$")
	 public void que_eu_acesse_a_url_do_Walmart() throws Throwable {
		 driver.get("http://www.walmart.com.br");    
		 Thread.sleep(3000);
	 }

	 @Então("^devo ser direcionado para a página do Walmart$")
	 public void devo_ser_direcionado_para_a_página_do_Walmart() throws Throwable {
		assertEquals("http://www.walmart.com.br/", driver.getCurrentUrl());
	 }

	 @Quando("^eu pesquisar a palavra tv$")
	 public void eu_pesquisar_a_palavra_tv() throws Throwable {
		 WebElement element = driver.findElement(By.name("ft"));
		 element.sendKeys("tv");
		 element.submit();
	 }
	 
	 @Então("^deverá ser exibido resultados da palavra tv$")
	 public void deverá_ser_exibido_resultados_da_palavra_tv() throws Throwable {
		 assertEquals("Busca por tv - Walmart.com", driver.getTitle());
		 assertEquals("Resultados de busca para \"tv\"", driver.findElement(By.className("search-title")).getText()); 	 	 
	 }
	 	 
	 @Quando("^clicar em um dos resultados da pesquisa$")
	 public void clicar_em_um_dos_resultados_da_pesquisa() throws Throwable {
		 WebElement firstprod = driver.findElement(By.className("item-0")).findElement(By.cssSelector("a[itemprop='url']"));
		 firstprod.click();
		 Thread.sleep(3000);
	}
		 
	 @Quando("^eu clicar no botão adicionar ao carrinho$")
	 public void eu_clicar_no_botão_adicionar_ao_carrinho() throws Throwable {
		WebElement adic = driver.findElement(By.xpath("//*[@id=\"buybox-Walmart\"]/div[2]/div/div[4]/button"));
		adic.click();
		Thread.sleep(3000);
	}
	 
	 @Quando("^a tela de garantia estendida for apresentada$")
	 public void a_tela_de_garantia_estendida_for_apresentada() throws Throwable {
	     String Actualtext = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/p")).getText();
	     assertEquals(Actualtext, "Contrate o Seguro Garantia Estendida Original e fique tranquilo ;)");
	 }
	 
	 @Quando("^eu clicar no botão continuar$")
	 public void eu_clicar_no_botão_continuar() throws Throwable {
		 WebElement cont = driver.findElement(By.className("btn-success"));
		 cont.click();
		 Thread.sleep(3000); 		 
	 }

	 @Quando("^eu clicar no botão carrinho$")
	 public void eu_clicar_no_botão_carrinho() throws Throwable {
		 WebElement car = driver.findElement(By.className("topbar-buttons"));
		 car.click();
	 }

	 @Então("^o produto deverá estar adicionado ao carrinho com sucesso$")
	 public void o_produto_deverá_estar_adicionado_ao_carrinho_com_sucesso() throws Throwable {	 
	 }
}
