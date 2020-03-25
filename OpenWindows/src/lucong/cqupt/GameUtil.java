package lucong.cqupt;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
 //GameUtil工具类，用于插入图片
public class GameUtil {
    // 工具类最好将构造器私有化。
    private GameUtil() {
    } 
 
    
    /**
     * 返回指定路径文件的图片对象
     * @param path
     * @return
     */
    public static Image getImage(String path) {
        BufferedImage bi = null;
        try {
            URL u = GameUtil.class.getClassLoader().getResource(path);
            bi = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }
}
