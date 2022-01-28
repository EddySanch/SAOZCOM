/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utilities;

import com.UI.Example;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author eddy2
 */
public class FrameUtilities {

    private static Dimension screenSize = new Dimension();

    public static void setInitialSize(JFrame frame, double widthPercent, double heightPercent) {

        Dimension newSize = new Dimension();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        newSize.setSize(
                ((screenSize.width * widthPercent) / 100),
                ((screenSize.height * heightPercent) / 100)
        );
        frame.setPreferredSize(newSize);
    }

    public static void setInitialSizeInternalFrame(JInternalFrame frame, double widthPercent, double heightPercent) {

        Dimension newSize = new Dimension();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        newSize.setSize(
                ((screenSize.width * widthPercent) / 100),
                ((screenSize.height * heightPercent) / 100)
        );
        frame.setPreferredSize(newSize);
    }

    public static void centerWindow(JFrame frame) {
        Rectangle centerBounds = frame.getBounds();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        centerBounds.x = (screenSize.width / 2) - (frame.getPreferredSize().width / 2);
        centerBounds.y = (screenSize.height / 2) - (frame.getPreferredSize().height / 2);

        frame.setBounds(centerBounds);
    }

    public static void adaptImagenToLbl(JFrame frame, JLabel lbl, String ruta) {

        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(icon);
        frame.repaint();
    }

    public static void setImagenToLbl(JFrame frame, JLabel lbl, String ruta) {

        ImageIcon image = new ImageIcon(ruta);
        lbl.setIcon(image);
        frame.repaint();
    }

    public static void extender(JFrame frame) {
        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        frame.setMaximizedBounds(env.getMaximumWindowBounds());
        frame.setExtendedState(frame.getExtendedState() | frame.MAXIMIZED_BOTH);
    }

    public static boolean isClosed(Example main, JInternalFrame frame) {
        JInternalFrame[] actives = main.container.getAllFrames();
        boolean closed = true;
        int i = 0;

        while (i < actives.length && closed) {

            if (actives[i].getClass() == frame.getClass()) {

                closed = false;
            }

            i++;
        }
        return closed;
    }

    public static void OpenInternalFrame(JInternalFrame frame, Example main) {
        if (isClosed(main, frame)) {
            main.container.add(frame);
            frame.setVisible(true);
        }
    }

}
