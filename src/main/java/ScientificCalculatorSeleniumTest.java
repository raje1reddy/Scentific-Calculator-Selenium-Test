import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScientificCalculatorSeleniumTest {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        // open the browser and go to open www.calculator.net'
        driver.get("https://www.calculator.net/");

        // Click on Link Math Calculator Link
        WebElement elementMathCalcLink=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[2]/a[1]"));
        elementMathCalcLink.click();

        //use this code to wait
        // Wait for page load  Thread.sleep(2500);
        // Click on Scientific Calculator  Link
        WebElement elementScientificCalcLink = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/div[1]/a[1]"));
        elementScientificCalcLink.click();


        //calculate sin 90// how to do it//  Click sin // click 9 // click  0 // click =
        WebElement elementSinButton =  driver.findElement(By.xpath("//body//div[@id='content']//div//div[2]//div[1]//span[1]"));
        elementSinButton.click();

        WebElement elementnineButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[1]/span[3]"));
        elementnineButton.click();

        WebElement elementzeroButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[4]/span[1]"));
        elementzeroButton.click();

        WebElement elementisequaltoButton =
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]"));
        elementisequaltoButton .click();



        // Read result
        WebElement resultSin90 = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
        String result = resultSin90.getText();
        result = result.replaceAll("\\s+","");
        System.out.println("String value of Sin90 is " + result);
        //driver.findElement(By.xpath("//div[@id='sciOutPut']"))
        // verify if the result is 1
       /* if(result.equals("1")){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }*/

        String valueSin90=Check(result);
        System.out.println(valueSin90);
// Reset calculator by click "AC" button
        WebElement elementresetButton =
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[5]/span[3]"));
        elementresetButton .click();

// calculate cos 0
// Read result
// verify the result is 1.
// if reset is 1 print pass or print fail.

        WebElement elementCosButton = driver.findElement(By.xpath("//body//div[@id='content']//div//div[2]//div[1]//span[2]"));
        elementCosButton.click();
        WebElement elementzeroButton1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[4]/span[1]"));
        elementzeroButton1.click();

        WebElement elementisequaltoButton1 =
                driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]"));
        elementisequaltoButton1 .click();
// Read result
        WebElement resultCos0 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]"));
        String result1 = resultCos0.getText();
        result1 = result1.replaceAll("\\s+","");
        System.out.println("String value of Cos0 is " + result1);
        //driver.findElement(By.xpath("//div[@id='sciOutPut']"))
        // verify if the result is 1
        /*if(result1.equals("1")){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }*/

        String valueCos0=Check(result1);
        System.out.println(valueCos0);

        // Reset calculator by click "AC" button
        WebElement elementresetButton2 =
                driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[5]/span[3]"));
        elementresetButton2 .click();
// calculate tan 45

        WebElement elementtanButton = driver.findElement(By.xpath("//body//div[@id='content']//div//div[2]//div[1]//span[3]"));
        elementtanButton.click();

        WebElement elementfourButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[2]/span[1]"));
        elementfourButton.click();

        WebElement elementfiveButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[2]/span[2]"));
        elementfiveButton.click();

        WebElement elementisequaltoButton3 =
                driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]"));
        elementisequaltoButton3 .click();
// Read result
// verify the result is 1.
// if reset is 1 print pass or print fail.
// Read result
        WebElement resultTan45 = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
        String result3 = resultTan45.getText();
        result3 = result3.replaceAll("\\s+","");
        System.out.println("String value of Tan45 is " + result3);
        //driver.findElement(By.xpath("//div[@id='sciOutPut']"))
        // verify if the result is 1
       /* if(result3.equals("1")){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }*/
        String valuetan45=Check(result3);
        System.out.println(valuetan45);
        // Reset calculator by click "AC" button
// calculate tan 0
// Read result
// verify the result is 0.
// if reset is 0 print pass or print fail.
// Reset calculator by click "AC" button
        WebElement elementresetButton3 =
                driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[5]/span[3]"));
        elementresetButton3 .click();

        WebElement elementtanButton3 = driver.findElement(By.xpath("//body//div[@id='content']//div//div[2]//div[1]//span[3]"));
        elementtanButton3.click();
        WebElement elementzeroButton2 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[4]/span[1]"));
        elementzeroButton2.click();

        WebElement elementisequaltoButton2 =
                driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]"));
        elementisequaltoButton2 .click();
// Read result
        WebElement resultTan0 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]"));
        String result6 = resultTan0.getText();
        result6 = result6.replaceAll("\\s+","");
        System.out.println("String value of Tan0 is " + result6);
        //driver.findElement(By.xpath("//div[@id='sciOutPut']"))
        // verify if the result is 1
        /*if(result6.equals("0")){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }*/
        String valuetan0=Check(result6);
        System.out.println(valuetan0);
      /* //select text box1
        WebElement textBox1 =   driver.findElement(By.xpath("//input[@id='cpar1']"));
        // enter a value in Text box 1  ->> 10
        textBox1.sendKeys("10");


        // enter a value in Text box 2  ->> 50
        WebElement textBox2 =   driver.findElement(By.xpath("//input[@id='cpar2']"));
        textBox2.sendKeys("50");

        // Click Calculate button
        WebElement calculateButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[2]"));
        calculateButton.click();


        // Read result
        WebElement resultElement = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/p[2]/font[1]/b[1]"));
        String result = resultElement.getText();

        // verify if the result is 5
        if(result.equals("5")){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
        driver.close();
*/

        // open the browser and go to open www.calculator.net'
// Click on Link Math Calculator
// Click on Link Scientific Calculator
//calculate sin 90
        // how to do it
        //  Click sin
        // click 9
        // click  0
        // click =

// Read result
// verify the result is 1.
// if reset is 1 print pass or print fail.


// Reset calculator by click "AC" button
// calculate tan 45
// Read result
// verify the result is 1.
// if reset is 1 print pass or print fail.
// Reset calculator by click "AC" button
// calculate tan 0
// Read result
// verify the result is 0.
// if reset is 0 print pass or print fail.
// Reset calculator by click "AC" button
// calculate tan 90
// Read result
// verify the result is ∞.
// if reset is ∞ print pass or print fail.
        // Reset calculator by click "AC" button
        WebElement elementresetButton6 =
                driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[5]/span[3]"));
        elementresetButton6 .click();
        WebElement elementtanButton6 =  driver.findElement(By.xpath("//body//div[@id='content']//div//div[2]//div[1]//span[3]"));
        elementtanButton6.click();

        WebElement elementnineButton3 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[1]/span[3]"));
        elementnineButton3.click();

        WebElement elementzeroButton3 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[4]/span[1]"));
        elementzeroButton3.click();

        WebElement elementisequaltoButton5 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]"));
        elementisequaltoButton5 .click();
// Read result
        WebElement resultTan90 = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
        WebElement elementisequaltoButton9 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]"));
        elementisequaltoButton5 .click();
        String result8 = resultTan90.getText();
        result8 = result.replaceAll("\\s+","");
        System.out.println("String value of Tan90 is " + result8);
        //driver.findElement(By.xpath("//div[@id='sciOutPut']"))
        // verify if the result is 1
//        if(result8.equals("1")){
//            System.out.println("pass");
//        }
//        else {
//            System.out.println("fail");
//        }
        String valuetan90=Check(result8);
        System.out.println(valuetan90);

    }

    static  String Check(String results){
        String returnval = "";
        if(results == "1"){
            returnval = "pass";
        }
        else if(results == "0")
            returnval = "fail";
        else {
            returnval = "pass";
        }
        return  returnval;
    }
}

