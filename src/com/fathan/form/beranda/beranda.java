/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fathan.form.beranda;

import com.fathan.main.*;
import com.fathan.db.configdb;
import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Fathan
 */
public class beranda extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    com.fathan.user.user usr = new com.fathan.user.user();

    public beranda() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        panel_top.setBackground(new Color(255, 255, 255, 240));
        panel_top1.setBackground(new Color(255, 255, 255, 230));
        if (usr.getNama() == null) {
            label_ucapan.setText("Selamat Datang, fulan");
            label_nama.setText("nothing else");
        } else {
            label_ucapan.setText("Selamat Datang, " + usr.getNama());
            label_nama.setText(usr.getNama_lengkap());
            label_nama1.setText(usr.getRole().toUpperCase());
        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBordeer1 = new com.fathan.swing.PanelBordeer();
        panel_top1 = new com.fathan.swing.PanelRound();
        panelBorderGradient1 = new com.fathan.swing.PanelBorderGradient();
        jLabel2 = new javax.swing.JLabel();
        button1 = new com.fathan.form.beranda.Button();
        button2 = new com.fathan.form.beranda.Button();
        button3 = new com.fathan.form.beranda.Button();
        button4 = new com.fathan.form.beranda.Button();
        button5 = new com.fathan.form.beranda.Button();
        button6 = new com.fathan.form.beranda.Button();
        button7 = new com.fathan.form.beranda.Button();
        panelBorderGradient11 = new com.fathan.swing.PanelBorderGradient1();
        panelBorderGradient21 = new com.fathan.swing.PanelBorderGradient2();
        jLabel1 = new javax.swing.JLabel();
        panel_top = new com.fathan.swing.PanelRound();
        label_nama1 = new javax.swing.JLabel();
        label_nama = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_ucapan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1294, 679));
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBordeer1.setForeground(new java.awt.Color(247, 247, 247));
        panelBordeer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_top1.setBackground(new java.awt.Color(255, 255, 255));
        panel_top1.setRoundBottomLeft(15);
        panel_top1.setRoundBottomRight(15);
        panel_top1.setRoundTopLeft(15);
        panel_top1.setRoundTopRight(15);
        panel_top1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_top1MouseClicked(evt);
            }
        });
        panel_top1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout panelBorderGradient1Layout = new javax.swing.GroupLayout(panelBorderGradient1);
        panelBorderGradient1.setLayout(panelBorderGradient1Layout);
        panelBorderGradient1Layout.setHorizontalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        panelBorderGradient1Layout.setVerticalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_top1.add(panelBorderGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Daftar Menu");
        panel_top1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 475, 60));

        button1.setBackground(new java.awt.Color(75, 201, 217));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Transaksi");
        button1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        panel_top1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 280, 50));

        button2.setBackground(new java.awt.Color(75, 201, 217));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Kategori");
        button2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        panel_top1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 270, 50));

        button3.setBackground(new java.awt.Color(75, 201, 217));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Produk");
        button3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        panel_top1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 270, 50));

        button4.setBackground(new java.awt.Color(75, 201, 217));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Pengguna");
        button4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        panel_top1.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 270, 50));

        button5.setBackground(new java.awt.Color(75, 201, 217));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Laporan");
        button5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        panel_top1.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 270, 50));

        button6.setBackground(new java.awt.Color(75, 201, 217));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("Riwayat Transaksi");
        button6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        panel_top1.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 270, 50));

        button7.setBackground(new java.awt.Color(75, 201, 217));
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("Supplier");
        button7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        panel_top1.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 270, 50));

        panelBorderGradient11.setPreferredSize(new java.awt.Dimension(370, 150));

        javax.swing.GroupLayout panelBorderGradient11Layout = new javax.swing.GroupLayout(panelBorderGradient11);
        panelBorderGradient11.setLayout(panelBorderGradient11Layout);
        panelBorderGradient11Layout.setHorizontalGroup(
            panelBorderGradient11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        panelBorderGradient11Layout.setVerticalGroup(
            panelBorderGradient11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_top1.add(panelBorderGradient11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 370, 150));

        javax.swing.GroupLayout panelBorderGradient21Layout = new javax.swing.GroupLayout(panelBorderGradient21);
        panelBorderGradient21.setLayout(panelBorderGradient21Layout);
        panelBorderGradient21Layout.setHorizontalGroup(
            panelBorderGradient21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        panelBorderGradient21Layout.setVerticalGroup(
            panelBorderGradient21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panel_top1.add(panelBorderGradient21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 370, 150));

        panelBordeer1.add(panel_top1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1220, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fathan/form/beranda/bg_beranda.png"))); // NOI18N
        panelBordeer1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, 440));

        panel_top.setBackground(new java.awt.Color(255, 255, 255));
        panel_top.setRoundBottomLeft(15);
        panel_top.setRoundBottomRight(15);
        panel_top.setRoundTopLeft(15);
        panel_top.setRoundTopRight(15);
        panel_top.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_topMouseClicked(evt);
            }
        });
        panel_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_nama1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        label_nama1.setForeground(new java.awt.Color(51, 51, 51));
        label_nama1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_nama1.setText("label_role");
        panel_top.add(label_nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 250, 40));

        label_nama.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        label_nama.setForeground(new java.awt.Color(51, 51, 51));
        label_nama.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_nama.setText("label_nama");
        label_nama.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panel_top.add(label_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 250, 40));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fathan/form/beranda/icon_person.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        panel_top.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 70));

        label_ucapan.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 22)); // NOI18N
        label_ucapan.setForeground(new java.awt.Color(51, 51, 51));
        label_ucapan.setText("Selamat Datang, fulan!");
        panel_top.add(label_ucapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 0, 475, 70));

        panelBordeer1.add(panel_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1220, 70));

        getContentPane().add(panelBordeer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.25) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            System.out.println(f);
            try {
                Thread.sleep(1);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        for (double i = 1.0; i >= 0.1; i = i - 0.25) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            System.out.println(f);
            try {
                Thread.sleep(1);
                if (this.getOpacity() <= 0.25) {
                    this.dispose();
                }
                
            } catch (Exception e) {
            }
            
        }
        new com.fathan.form.kategori.kategori().setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        for (double i = 1.0; i >= 0.1; i = i - 0.25) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            System.out.println(f);
            try {
                Thread.sleep(1);
                if (this.getOpacity() <= 0.25) {
                    this.dispose();
                }
                
            } catch (Exception e) {
            }
            
        }
        new com.fathan.form.produk.produk().setVisible(true);
    }//GEN-LAST:event_button3ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        new com.fathan.form.about.lainnya(this, true).setVisible(true);
        if (new com.fathan.form.about.logout().yn==true) {
//            new com.fathan.form.about.lainnya(this, true).stampLog_out();
            new com.fathan.form.about.logout().setLog_out(false);
            for (double i = 1.0; i >= 0.1; i = i - 0.25) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            System.out.println(f);
            try {
                Thread.sleep(1);
                if (this.getOpacity() <= 0.25) {
                    this.dispose();
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void panel_topMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_topMouseClicked
        
    }//GEN-LAST:event_panel_topMouseClicked

    private void panel_top1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_top1MouseClicked
        
    }//GEN-LAST:event_panel_top1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.fathan.form.beranda.Button button1;
    private com.fathan.form.beranda.Button button2;
    private com.fathan.form.beranda.Button button3;
    private com.fathan.form.beranda.Button button4;
    private com.fathan.form.beranda.Button button5;
    private com.fathan.form.beranda.Button button6;
    private com.fathan.form.beranda.Button button7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel label_nama;
    public javax.swing.JLabel label_nama1;
    public javax.swing.JLabel label_ucapan;
    private com.fathan.swing.PanelBordeer panelBordeer1;
    private com.fathan.swing.PanelBorderGradient panelBorderGradient1;
    private com.fathan.swing.PanelBorderGradient1 panelBorderGradient11;
    private com.fathan.swing.PanelBorderGradient2 panelBorderGradient21;
    private com.fathan.swing.PanelRound panel_top;
    private com.fathan.swing.PanelRound panel_top1;
    // End of variables declaration//GEN-END:variables
}
