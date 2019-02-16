package Chapter13.resource;


import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.net.URL;
import java.io.*;
import java.util.*;

public class ResourceTest {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame jFrame = new ResourceTestFrame();
            jFrame.setTitle("ResourceTest");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setVisible(true);
        });
    }
}
class ResourceTestFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 300;

    public ResourceTestFrame()
    {
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
//        URL aboutUrl = getClass().getResource("about.gif");
//        Image image = new ImageIcon(aboutUrl).getImage();
//        setIconImage(image);

        JTextArea textArea = new JTextArea();
        InputStream stream = getClass().getResourceAsStream("about.txt");
        try(Scanner in = new Scanner(stream, "UTF-8"))
        {
            while (in.hasNext())
                textArea.append(in.nextLine() + "\n");
        }
        add(textArea);
    }
}
