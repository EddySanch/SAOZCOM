/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utilities;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JFrame;

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

    public static void centerWindow(JFrame frame) {
        Rectangle centerBounds = frame.getBounds();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        centerBounds.x = (screenSize.width / 2) - (frame.getPreferredSize().width / 2);
        centerBounds.y = (screenSize.height / 2) - (frame.getPreferredSize().height / 2);

        frame.setBounds(centerBounds);
    }

}
