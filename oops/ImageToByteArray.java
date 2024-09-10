import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class ImageToByteArray {
    public static void main(String[] args) throws Exception {
        BufferedImage img = ImageIO.read(new File("sample.png"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(img, "png", bos);
        byte[] arr = bos.toByteArray();
        for (byte b : arr) {
            System.out.println(b);
        }

        ByteArrayInputStream bis = new ByteArrayInputStream(arr);
        BufferedImage bImage2 = ImageIO.read(bis);
        ImageIO.write(bImage2, "png", new File("output.png"));
        System.out.println("image created");
    }
}
