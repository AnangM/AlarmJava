/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import java.io.File;

/**
 *
 * @author AnangM
 */
public class filterLagu extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File f) {
        return f.isDirectory() || f.getAbsolutePath().endsWith(".mp3");
    }

    @Override
    public String getDescription() {
        return "Tipe File : *.mp3";
    }
    
}
