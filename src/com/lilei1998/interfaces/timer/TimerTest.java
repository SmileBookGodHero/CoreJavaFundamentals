package com.lilei1998.interfaces.timer;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
//import java.util.Timer;

/**
 * Created by lilei on 2017/8/23 下午4:30.
 * 接口与回调
 */

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        Timer timer = new Timer(10000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
