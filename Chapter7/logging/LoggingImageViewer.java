package Chapter7.logging;

import jdk.internal.org.objectweb.asm.Handle;

import javax.swing.*;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingImageViewer {
    public static void main(String[] args){
        if (System.getProperty("java.util.logging.class") == null
                && System.getProperty("java.util.logging.config.file") == null){
            try {
                Logger.getLogger("com.yangchengkai.corejava").setLevel(Level.ALL);
                final int LOG_ROTATION_COUNT = 10;
                Handle handle = FileHandler("%h/LoggingImageViewer.log",0,LOG_ROTATION_COUNT);
                Logger.getLogger("com.yangchengkai.corejava").addHandler(handle);
            }
            catch (IOException e)
            {
                Logger.getLogger("com.yangchengkai.corejava").log(Level.SEVERE,"Cannot");
            }
        }
    }
}
class ImageViewerFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HIGHT = 400;

    private JLabel label;
    private static Logger logger = Logger.getLogger("com.yangchengkai.corejava");

    public ImageViewerFrame(){
        logger.entering("ImageViewerFrame","<init>");
        setSize(DEFAULT_WIDTH,);
    }
}
