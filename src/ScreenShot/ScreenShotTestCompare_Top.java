package ScreenShot;
	
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.File;
 
import javax.imageio.ImageIO;
 
public class ScreenShotTestCompare_Top {
 
    public static void main(String[] args) {
 
        try {
            String image1Location = "C:\\CiviTestScreenshot\\ExpectedImage.png"; 
            String image2Location = "C:\\CiviTestScreenshot\\ActualImage.png";
 
            File image1File = new File(image1Location);
            File image2File = new File(image2Location);
 
            Image image1 = ImageIO.read(image1File);
            Image image2 = ImageIO.read(image2File);
 
            PixelGrabber image1Grab = new PixelGrabber(image1, 0, 0, -1, -1, false);
            PixelGrabber image2Grab = new PixelGrabber(image2, 0, 0, -1, -1, false);
             
            int[] image1Data = null;
            int[] image2Data = null;
            if (image1Grab.grabPixels()) {
                int image1Width = image1Grab.getWidth();
                int image1Height = image1Grab.getHeight();
                image1Data = new int[image1Width * image1Height];
                image1Data = (int[]) image1Grab.getPixels();
            }
            if (image2Grab.grabPixels()) {
                int image2Width = image2Grab.getWidth();
                int image2Height = image2Grab.getHeight();
                image2Data = new int[image2Width * image2Height];
                image2Data = (int[]) image2Grab.getPixels();
            }
 
            if ((image1Grab.getHeight() != image2Grab.getHeight())
                    || (image1Grab.getWidth() != image2Grab.getWidth())) {
            	System.out.println("=============================");
                System.out.println("Size mismatched");
            	System.out.println("=============================");
            } else if (java.util.Arrays.equals(image1Data, image2Data)) {
            	System.out.println("=============================");
                System.out.println("Matched");
                System.out.println("=============================");
            } else {
            	System.out.println("=============================");
                System.out.println("Not matched");
                System.out.println("=============================");
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}

