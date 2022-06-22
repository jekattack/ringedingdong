package com.github.jekattack.ringedingdong;

import java.awt.*;
import javax.swing.JFrame;

public class RingedingdongCanvas extends Canvas{

    public void paint(Graphics g) {

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("../img/welcomeFriend.gif");
        g.drawImage(i, 120,100,this);

    }

}  