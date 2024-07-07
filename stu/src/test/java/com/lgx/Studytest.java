package com.lgx;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class Studytest {

    WebDriver driver;
    //http://localhost:8081/index.html
    @Test
    public void open()throws InterruptedException{
        driver = new FirefoxDriver();
        driver.get("http://localhost:8081/index.html");
        //登录页面点击
        Thread.sleep(3000);
        driver.findElement(By.tagName("button")).click();
         //友情提示确定
        Thread.sleep(3000);
        driver.findElement(By.tagName("button")).click();
        //文章管理
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='el-submenu__title']/span[text()='文章管理']/..")).click();

        //文章列表
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@class='el-menu-item' and contains(normalize-space(), '文章列表')]")).click();

        //文章发表
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@class='el-menu-item' and contains(normalize-space(), '发表文章')]")).click();
        Thread.sleep(3000);

        //点击并写入古诗
        WebElement textarea=driver.findElement(By.cssSelector("textarea.auto-textarea-input.no-border.no-resize"));
        textarea.clear();
        Thread.sleep(1000);
        textarea.sendKeys("不求见面惟通谒，名纸朝来满敝庐。\n" +
                "我亦随人投数纸，世情嫌简不嫌虚。");

        //栏目
        driver.findElement(By.xpath("//input[@class='el-input__inner' and @type='text' and @placeholder='请选择文章栏目']")).click();
        //选择栏目
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[contains(concat(' ', normalize-space(@class), ' '), ' el-select-dropdown__item ') and .//span[text()='人生感悟']]")).click();
        Thread.sleep(3000);


        //题目
        WebElement tit=driver.findElement(By.xpath("//input[@class='el-input__inner' and @type='text' and contains(@placeholder, '请输入标题...')]"));
        Thread.sleep(3000);
        tit.sendKeys("拜年");
        Thread.sleep(5000);



        //确认发表文章
        driver.findElement(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' el-button--primary ') and .//span[text()='发表文章']]")).click();

        //删除
        //
        //
        //
        //
        //
        //
        //
        // driver.findElement(By.xpath("/html/body/div[1]/section/section/section/main/section/main/div/div[2]/div[2]/div/div[2]/div[3]/table/tbody/tr[2]/td[1]/div/label/span/span"));

    }

}