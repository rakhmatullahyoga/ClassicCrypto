/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classiccrypto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Rakhmatullah Yoga S
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        super("Classic Crypto Tools");
        initComponents();
        plainOutputButton.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        inputText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputText = new javax.swing.JTextArea();
        stdVigenereEncButton = new javax.swing.JRadioButton();
        stdVigenereDecButton = new javax.swing.JRadioButton();
        extVigenereEncButton = new javax.swing.JRadioButton();
        extVigenereDecButton = new javax.swing.JRadioButton();
        playFairEncButton = new javax.swing.JRadioButton();
        playFairDecButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        openFileButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        keyText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        plainOutputButton = new javax.swing.JRadioButton();
        noSpaceOutputButton = new javax.swing.JRadioButton();
        fiveCharOutputButton = new javax.swing.JRadioButton();
        saveOutputButton = new javax.swing.JButton();
        execButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputText.setColumns(20);
        inputText.setRows(5);
        jScrollPane1.setViewportView(inputText);

        outputText.setColumns(20);
        outputText.setRows(5);
        jScrollPane2.setViewportView(outputText);

        stdVigenereEncButton.setText("Encrypt Vigenere (Standard)");
        stdVigenereEncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdVigenereEncButtonActionPerformed(evt);
            }
        });

        stdVigenereDecButton.setText("Decrypt Vigenere (Standard)");
        stdVigenereDecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdVigenereDecButtonActionPerformed(evt);
            }
        });

        extVigenereEncButton.setText("Encrypt Vigenere (Extended)");
        extVigenereEncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extVigenereEncButtonActionPerformed(evt);
            }
        });

        extVigenereDecButton.setText("Decrypt Vigenere (Extended)");
        extVigenereDecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extVigenereDecButtonActionPerformed(evt);
            }
        });

        playFairEncButton.setText("Encrypt Playfair");
        playFairEncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playFairEncButtonActionPerformed(evt);
            }
        });

        playFairDecButton.setText("Decrypt Playfair");
        playFairDecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playFairDecButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Algorithm");

        jLabel2.setText("Input");

        jLabel3.setText("Output");

        openFileButton.setText("Open...");
        openFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Key");

        jLabel5.setText("Output Mode");

        plainOutputButton.setText("as plaintext");
        plainOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainOutputButtonActionPerformed(evt);
            }
        });

        noSpaceOutputButton.setText("no spacing");
        noSpaceOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSpaceOutputButtonActionPerformed(evt);
            }
        });

        fiveCharOutputButton.setText("5-chars group");
        fiveCharOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveCharOutputButtonActionPerformed(evt);
            }
        });

        saveOutputButton.setText("Save as...");
        saveOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOutputButtonActionPerformed(evt);
            }
        });

        execButton.setText("Execute");
        execButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                execButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("(c) Rakhmatullah Yoga Sutrisna - 2016");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(keyText))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(openFileButton)
                                .addGap(18, 18, 18)
                                .addComponent(saveOutputButton)
                                .addGap(18, 18, 18)
                                .addComponent(execButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fiveCharOutputButton)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(extVigenereDecButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(stdVigenereDecButton)
                                    .addComponent(stdVigenereEncButton))
                                .addComponent(playFairDecButton)
                                .addComponent(playFairEncButton)
                                .addComponent(jLabel5)
                                .addComponent(plainOutputButton)
                                .addComponent(noSpaceOutputButton))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addContainerGap()))
                    .addComponent(extVigenereEncButton)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(keyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(openFileButton)
                            .addComponent(saveOutputButton)
                            .addComponent(execButton)
                            .addComponent(jLabel6))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stdVigenereEncButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stdVigenereDecButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(extVigenereEncButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(extVigenereDecButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playFairEncButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playFairDecButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plainOutputButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noSpaceOutputButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveCharOutputButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stdVigenereEncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdVigenereEncButtonActionPerformed
        stdVigenereEncButton.setSelected(true);
        stdVigenereDecButton.setSelected(false);
        extVigenereEncButton.setSelected(false);
        extVigenereDecButton.setSelected(false);
        playFairEncButton.setSelected(false);
        playFairDecButton.setSelected(false);
    }//GEN-LAST:event_stdVigenereEncButtonActionPerformed

    private void stdVigenereDecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdVigenereDecButtonActionPerformed
        stdVigenereEncButton.setSelected(false);
        stdVigenereDecButton.setSelected(true);
        extVigenereEncButton.setSelected(false);
        extVigenereDecButton.setSelected(false);
        playFairEncButton.setSelected(false);
        playFairDecButton.setSelected(false);
    }//GEN-LAST:event_stdVigenereDecButtonActionPerformed

    private void extVigenereEncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extVigenereEncButtonActionPerformed
        stdVigenereEncButton.setSelected(false);
        stdVigenereDecButton.setSelected(false);
        extVigenereEncButton.setSelected(true);
        extVigenereDecButton.setSelected(false);
        playFairEncButton.setSelected(false);
        playFairDecButton.setSelected(false);
    }//GEN-LAST:event_extVigenereEncButtonActionPerformed

    private void extVigenereDecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extVigenereDecButtonActionPerformed
        stdVigenereEncButton.setSelected(false);
        stdVigenereDecButton.setSelected(false);
        extVigenereEncButton.setSelected(false);
        extVigenereDecButton.setSelected(true);
        playFairEncButton.setSelected(false);
        playFairDecButton.setSelected(false);
    }//GEN-LAST:event_extVigenereDecButtonActionPerformed

    private void playFairEncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playFairEncButtonActionPerformed
        stdVigenereEncButton.setSelected(false);
        stdVigenereDecButton.setSelected(false);
        extVigenereEncButton.setSelected(false);
        extVigenereDecButton.setSelected(false);
        playFairEncButton.setSelected(true);
        playFairDecButton.setSelected(false);
    }//GEN-LAST:event_playFairEncButtonActionPerformed

    private void playFairDecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playFairDecButtonActionPerformed
        stdVigenereEncButton.setSelected(false);
        stdVigenereDecButton.setSelected(false);
        extVigenereEncButton.setSelected(false);
        extVigenereDecButton.setSelected(false);
        playFairEncButton.setSelected(false);
        playFairDecButton.setSelected(true);
    }//GEN-LAST:event_playFairDecButtonActionPerformed

    private void plainOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainOutputButtonActionPerformed
        plainOutputButton.setSelected(true);
        noSpaceOutputButton.setSelected(false);
        fiveCharOutputButton.setSelected(false);
    }//GEN-LAST:event_plainOutputButtonActionPerformed

    private void noSpaceOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSpaceOutputButtonActionPerformed
        plainOutputButton.setSelected(false);
        noSpaceOutputButton.setSelected(true);
        fiveCharOutputButton.setSelected(false);
    }//GEN-LAST:event_noSpaceOutputButtonActionPerformed

    private void fiveCharOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveCharOutputButtonActionPerformed
        plainOutputButton.setSelected(false);
        noSpaceOutputButton.setSelected(false);
        fiveCharOutputButton.setSelected(true);
    }//GEN-LAST:event_fiveCharOutputButtonActionPerformed

    private void execButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_execButtonActionPerformed
        if(!stdVigenereEncButton.isSelected()&&!stdVigenereDecButton.isSelected()&&!extVigenereEncButton.isSelected()&&!extVigenereDecButton.isSelected()&&!playFairEncButton.isSelected()&&!playFairDecButton.isSelected()&&!stdVigenereEncButton.isSelected())
            JOptionPane.showMessageDialog(this, "Algorithm haven't selected!");
        else {
            if(keyText.getText().isEmpty())
                JOptionPane.showMessageDialog(this, "Cipher key must not be empty!");
            else {
                String output = "";
                if(stdVigenereEncButton.isSelected())
                    output = output.concat(CipherTools.encryptVigenereStandard(inputText.getText(), keyText.getText()));
                else if(stdVigenereDecButton.isSelected())
                    output = output.concat(CipherTools.decryptVigenereStandard(inputText.getText(), keyText.getText()));
                else if(extVigenereEncButton.isSelected())
                    output = output.concat(CipherTools.encryptVigenereExtended(inputText.getText(), keyText.getText()));
                else if(extVigenereDecButton.isSelected())
                    output = output.concat(CipherTools.decryptVigenereExtended(inputText.getText(), keyText.getText()));
                else if(playFairEncButton.isSelected())
                    output = output.concat(CipherTools.encryptPlayfair(inputText.getText(), keyText.getText()));
                else if(playFairDecButton.isSelected())
                    output = output.concat(CipherTools.decryptPlayfair(inputText.getText(), keyText.getText()));
                if(noSpaceOutputButton.isSelected())
                    output = CipherTools.removeSpaces(output);
                else if(fiveCharOutputButton.isSelected())
                    output = CipherTools.groupFiveChars(output);
                outputText.setText(output);
            }
        }
    }//GEN-LAST:event_execButtonActionPerformed

    private void openFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileButtonActionPerformed
        JFileChooser openFile = new JFileChooser();
        String input = "";
        
        openFile.setCurrentDirectory(new File(System.getProperty("user.dir")));
        openFile.showOpenDialog(null);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(openFile.getSelectedFile()));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            input = sb.toString();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Cannot open File!\nThe selected file might be corrupted or lost.");
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Cannot open File!\nThe selected file might be corrupted or lost.");
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        inputText.setText(input);
    }//GEN-LAST:event_openFileButtonActionPerformed

    private void saveOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOutputButtonActionPerformed
        if(outputText.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Output is empty.\nNothing to save.");
        else {
            FileWriter fw = null;
            try {
                JFileChooser saveFile = new JFileChooser();
                saveFile.setCurrentDirectory(new File(System.getProperty("user.dir")));
                saveFile.showSaveDialog(null);
                fw = new FileWriter(saveFile.getSelectedFile());
                fw.write(outputText.getText());
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error: Cannot save File!");
            } finally {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_saveOutputButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton execButton;
    private javax.swing.JRadioButton extVigenereDecButton;
    private javax.swing.JRadioButton extVigenereEncButton;
    private javax.swing.JRadioButton fiveCharOutputButton;
    private javax.swing.JTextArea inputText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keyText;
    private javax.swing.JRadioButton noSpaceOutputButton;
    private javax.swing.JButton openFileButton;
    private javax.swing.JTextArea outputText;
    private javax.swing.JRadioButton plainOutputButton;
    private javax.swing.JRadioButton playFairDecButton;
    private javax.swing.JRadioButton playFairEncButton;
    private javax.swing.JButton saveOutputButton;
    private javax.swing.JRadioButton stdVigenereDecButton;
    private javax.swing.JRadioButton stdVigenereEncButton;
    // End of variables declaration//GEN-END:variables
}
