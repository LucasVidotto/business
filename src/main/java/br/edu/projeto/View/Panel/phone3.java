/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto.View.Panel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author qwert
 */
public class phone3 extends javax.swing.JPanel {

    /**
     * Creates new form phone3
     */
     BufferedImage imagemFundo;
    public phone3
        () {
        initComponents();
        try {
            this.imagemFundo = ImageIO.read(new File("C:\\Users\\qwert\\Desktop\\imagens\\phone3.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(phone3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(imagemFundo.getScaledInstance(195, 195, 0), 0, 0, null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
