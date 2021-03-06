
package com.xadrez.graphic;

import java.awt.Color;
import javax.swing.ImageIcon;



public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        this.setLocation(550,300);
        this.setResizable(false);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvasBackgrounds1 = new com.xadrez.graphic.CanvasBackgrounds();
        btn_jogar = new javax.swing.JButton();
        btn_creditos = new javax.swing.JButton();
        btn_tutorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        canvasBackgrounds1.setImg(new ImageIcon("C:\\Users\\Jander\\Documents\\GitHub\\XadrezMaluco\\Xadrez\\src\\com\\xadrez\\imagens\\menu.jpg"));
        canvasBackgrounds1.setMaximumSize(new java.awt.Dimension(266, 257));
        canvasBackgrounds1.setMinimumSize(new java.awt.Dimension(266, 257));
        canvasBackgrounds1.setPreferredSize(new java.awt.Dimension(266, 257));

        btn_jogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jogarActionPerformed(evt);
            }
        });

        btn_creditos.setText("CREDITOS");
        btn_creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditosActionPerformed(evt);
            }
        });

        btn_tutorial.setText("TUTORIAL");
        btn_tutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tutorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout canvasBackgrounds1Layout = new javax.swing.GroupLayout(canvasBackgrounds1);
        canvasBackgrounds1.setLayout(canvasBackgrounds1Layout);
        canvasBackgrounds1Layout.setHorizontalGroup(
            canvasBackgrounds1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, canvasBackgrounds1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_creditos))
            .addGroup(canvasBackgrounds1Layout.createSequentialGroup()
                .addGroup(canvasBackgrounds1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 119, Short.MAX_VALUE))
        );
        canvasBackgrounds1Layout.setVerticalGroup(
            canvasBackgrounds1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canvasBackgrounds1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(btn_jogar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tutorial)
                .addGap(60, 60, 60)
                .addComponent(btn_creditos))
        );

        btn_jogar.setBackground(new Color(0,0,0,0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvasBackgrounds1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvasBackgrounds1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jogarActionPerformed
        // TODO add your handling code here:
        new TelaDeJogadores().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_jogarActionPerformed

    private void btn_tutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tutorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tutorialActionPerformed

    private void btn_creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_creditosActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_creditos;
    private javax.swing.JButton btn_jogar;
    private javax.swing.JButton btn_tutorial;
    private com.xadrez.graphic.CanvasBackgrounds canvasBackgrounds1;
    // End of variables declaration//GEN-END:variables
}
