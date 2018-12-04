package Chapter7.logging;

import jdk.internal.org.objectweb.asm.Handle;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A modification of the image view
 */
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
                Logger.getLogger("com.yangchengkai.corejava").log(Level.SEVERE,"Can't create log file handler",e);
            }
        }
    }
}
/**
 * The frame that shows the image.
 */
class ImageViewerFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HIGHT = 400;

    private JLabel label;
    private static Logger logger = Logger.getLogger("com.yangchengkai.corejava");

    public ImageViewerFrame(){
        logger.entering("ImageViewerFrame","<init>");
        setSize(DEFAULT_WIDTH,DEFAULT_HIGHT);

        //set up menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);

        //use a label to display the images

    }
}


/* *
 * A handler for displaying log records in a window.
 **/
class WindowHandler extends StreamHandler
{
    private JFrame frame;

    public WindowHandler(){
        frame = new JFrame();
        final JTextArea output = new JTextArea();
        output.setEditable(false);
        frame.setSize(200, 200);
        frame.add(new JScrollPane(output));
        frame.setFocusableWindowState(false);
        frame.setVisible(true);

        setOutputStream(new OutputStream() {
            public void write(int b){

            }
            public void write(byte[] b, int off, int len){
                output.append(new String(b, off, len));
            }
        });

    }

    public void publish(LogRecord record){
        if(!frame.isVisible()){
            return;
        }
        super.publish(record);
        flush();
    }
}