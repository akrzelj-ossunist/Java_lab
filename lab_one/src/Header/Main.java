package Header;


public class Main {
    public static void main(String[] args) {

        String hexColor = "0x1FF0FF";

        Color c = Color.decode(hexColor);
        System.out.println(c);
        float[] hsbCode = new float[3];
        double[] hsl = Color.RGBtoHSL(c.getRed(), c.getGreen(), c.getBlue());
        double[] cmyk = Color.RGBtoCMYK(c.getRed(), c.getGreen(), c.getBlue());

        Color.RGBtoHSB(c.getRed(), c.getGreen(), c.getBlue(), hsbCode);
        System.out.println("Boja u HEX formatu: 0x" + Integer.toHexString(c.getRGB() & 0x00FFFFFF));
        System.out.println("Boja u RGB formatu: " + c.getRed() + ", " + c.getGreen() + ", " + c.getBlue());
        System.out.println("Boja u HSB formatu: " + hsbCode[0] * 360 + "°, " + hsbCode[1] * 100 + "%, " + hsbCode[2] * 100 + "%");
        System.out.println("Boja u HSL formatu: Hue:" + hsl[0] + "; Saturation:" + hsl[1] + "; Lightness:" + hsl[2]);
        System.out.println("Boja u CMYK formatu: Cyan: " + cmyk[0] + " Magenta: " + cmyk[1] + " Yellow: " + cmyk[2] + " Key (Black): " + cmyk[3]);
    }
}
