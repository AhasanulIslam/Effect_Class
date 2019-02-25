import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class BlueImage {

    BufferedImage img = null;
    File f = null;

    public BlueImage() throws IOException {

        f = new File("E:\\phn pic\\sakib.jpg");

        img = ImageIO.read(f);

    }


    public void setBlueFilter() {

        //get width and height
        int width = img.getWidth();
        int height = img.getHeight();


        //convert to blue image

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = img.getRGB(x, y);

                int a = (p>>24)&0xff;
                int b = p&0xff;

                //set new RGB
                p = (a<<24) | (0<<16) | (0<<8) | b;

                img.setRGB(x, y, p);
            }
        }

    }

    public void blueFilter() throws IOException {
        //write image
        f = new File("blue.jpg");
        ImageIO.write(img, "jpg", f);
    }


}