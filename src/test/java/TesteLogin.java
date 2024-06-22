import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TesteLogin {
    public static void main(String[] args) {
        // Configuração do WebDriver
        WebDriver driver = new ChromeDriver();

        // URL da página de login
        String loginUrl = "https://sistema.gbsegurosbrasil.com/login/";

        try {
            // Teste de cadastro login com credenciais válidas
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            driver.get(loginUrl);

//            WebElement inputLogin = driver.findElement(By.xpath("//*[@id=\":r0:\"]"));
//            inputLogin.sendKeys("email");
//
//            WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"auth-login-v2-password\"]"));
//            inputPassword.sendKeys("password");
//            WebElement buttonContinue = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div[2]/div[2]/div/div/form/button"));
//            buttonContinue.click();
//
//            Thread.sleep(5000);
//            if (driver.getCurrentUrl().contains("sol-mais/admin")) {
//                System.out.println("Teste de login com credenciais válidas passou.");
//            } else {
//                System.out.println("Teste de login com credenciais válidas falhou.");
//            }

            // Teste de login com credenciais inválidas
//            WebElement inputLogin = driver.findElement(By.xpath("//*[@id=\":r0:\"]"));
//            inputLogin.sendKeys("teste@teste");
//
//            WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"auth-login-v2-password\"]"));
//            inputPassword.sendKeys("qualqueruma");
//            WebElement buttonContinue = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div[2]/div[2]/div/div/form/button"));
//            buttonContinue.click();
//
//            Thread.sleep(5000);
//
//            WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div[2]/div[2]/div/div/form/div[1]/p"));
//            if (errorMessage.isDisplayed()) {
//                System.out.println("Teste de login com credenciais inválidas passou.");
//            } else {
//                System.out.println("Teste de login com credenciais inválidas falhou.");
//            }

            // Teste de login com campos em branco
            WebElement buttonContinue = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div[2]/div[2]/div/div/form/button"));
            buttonContinue.click();
            WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div[2]/div[2]/div/div/form/div[1]/p"));

            Thread.sleep(5000);
            if (errorMessage.isDisplayed()) {
                System.out.println("Teste de login com campos em branco passou.");
            } else {
                System.out.println("Teste de login com campos em branco falhou.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar o navegador
            driver.quit();
        }
    }
}
