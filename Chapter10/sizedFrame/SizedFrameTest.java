package Chapter10.sizedFrame;

import javax.swing.*;
import java.awt.*;

public class SizedFrameTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(()->
        {

        });
    }
}

class SizedFrame extends JFrame{
    public SizedFrame()
    {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWeight = screenSize.width;

        setSize(screenWeight/2,screenHeight/2);
        setLocationByPlatform(true);

        Image image = new ImageIcon("icon.gif").getImage();
        setIconImage(image);
    }
}