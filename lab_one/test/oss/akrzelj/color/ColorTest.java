package oss.akrzelj.color;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ColorTest {

    @Test
    public void decodeTest(){
        String hexColor = "0x1FF0FF";

        //Case 1: Checking if hexColor value is correct
        System.out.println("decodeTest 1:");
        if(hexColor.substring(2, hexColor.length()).length() == 6)
            System.out.println("Passed case 1 test!");
        else System.out.println("Failed case 1 test!");

        //Case 2: Checking correct conversion
        Color c = Color.decode(hexColor);
        System.out.println("\ndecodeTest 2: ");
        if(c.getRed() >= 0 && c.getRed() <= 255 && c.getBlue() >= 0 && c.getBlue() <= 255 && c.getGreen() >= 0 && c.getGreen() <= 255)
            System.out.println("Passed case 2 test!" + " Red:" + c.getRed() + " Blue:" + c.getBlue() + " Green:" + c.getGreen());
        else System.out.println("Failed case 2 test!");

    }

    @Test
    public void RGBtoCMYKTest(){
        double[] cmyk = Color.RGBtoCMYK(31, 240, 255);
        //Case 1: Checking cmyk length should be 4
        if(cmyk.length == 4)
            System.out.println("RGBtoCMYKTest 1: \nPassed case 1 test!\n");
        else
            System.out.println("RGBtoCMYKTest 1: \nFailed case 1 test!\n");
    }

    @Test
    public void RGBtoHSLTest(){
        double[] cmyk = Color.RGBtoHSL(31, 240, 255);
        //Case 1: Checking cmyk length should be 4
        if(cmyk.length == 3)
            System.out.println("\nRGBtoHSLTest 1: \nPassed case 1 test!\n");
        else
            System.out.println("\nRGBtoHSLTest 1: \nFailed case 1 test!\n");
    }
}
