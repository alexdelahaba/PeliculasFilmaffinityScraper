package org.seleniumdemo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class PaginaImagen {
    private final WebDriver driver;

    public PaginaImagen(final WebDriver driver) {
        Objects.requireNonNull(driver);
        this.driver = driver;
    }

    public void loadHomePage(String url) {
        driver.get(url);
    }


    public PaginaPelicula saveImage(String nombre, int i) throws IOException {
        WebElement Image = driver.findElement(By.xpath("/html/body/img"));
        String src = Image.getAttribute("src");
        BufferedImage bufferedImage = ImageIO.read(new URL(src));
        File outputfile = new File("Portadas/" + nombre + "-" + i + ".jpg");
        ImageIO.write(bufferedImage, "png", outputfile);
        return new PaginaPelicula(driver);
    }
}
