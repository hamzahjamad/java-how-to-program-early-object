package com.hamzahjamad.practice.chapter_15_files_streams_and_object_serialization;

import javax.swing.*;
import java.io.IOException;

public class JFileChooserTest {

    public static void main(String[] args) throws IOException {
        JFileChooserDemo jFileChooserDemo = new JFileChooserDemo();
        jFileChooserDemo.setSize(400, 400);
        jFileChooserDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFileChooserDemo.setVisible(true);
    }

}
