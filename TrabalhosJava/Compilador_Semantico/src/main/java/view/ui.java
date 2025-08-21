/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

import model.Lexico;
import model.LexicalError;
//import model.Token;
import model.Sintatico;
import model.Semantico;
import model.SyntaticError;
import model.SemanticError;

/**
 *
 * @author lucas
 */
public class ui extends javax.swing.JFrame {

    /**
     * Creates new form ui
     */
    public ui() {
        initComponents();
        padronizarBotoesToolbar();
        adicionarAtalhosAosBotoes();

        jButton1.setIcon(new ImageIcon(getClass().getResource("/sources/paper.png")));

        jButton2.setIcon(new ImageIcon(getClass().getResource("/sources/open.png")));

        jButton3.setIcon(new ImageIcon(getClass().getResource("/sources/save.png")));

        jButton4.setIcon(new ImageIcon(getClass().getResource("/sources/copy.png")));

        jButton5.setIcon(new ImageIcon(getClass().getResource("/sources/paste.png")));

        jButton6.setIcon(new ImageIcon(getClass().getResource("/sources/recorte.png")));

        jButton7.setIcon(new ImageIcon(getClass().getResource("/sources/play.png")));

        jButton8.setIcon(new ImageIcon(getClass().getResource("/sources/team.png")));
    }
    
    private void adicionarAtalhosAosBotoes() {
        jButton1.getInputMap(JButton.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK), "novo");
        jButton1.getActionMap().put("novo", new javax.swing.AbstractAction() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.getInputMap(JButton.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK), "abrir");
        jButton2.getActionMap().put("abrir", new javax.swing.AbstractAction() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.getInputMap(JButton.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK), "salvar");
        jButton3.getActionMap().put("salvar", new javax.swing.AbstractAction() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.getInputMap(JButton.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK), "copiar");
        jButton4.getActionMap().put("copiar", new javax.swing.AbstractAction() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.getInputMap(JButton.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK), "colar");
        jButton5.getActionMap().put("colar", new javax.swing.AbstractAction() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.getInputMap(JButton.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK), "recortar");
        jButton6.getActionMap().put("recortar", new javax.swing.AbstractAction() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.getInputMap(JButton.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0), "compilar");
        jButton7.getActionMap().put("compilar", new javax.swing.AbstractAction() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton8.getActionMap().put("equipe", new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.getInputMap(JButton.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "equipe");
        jButton8.getActionMap().put("equipe", new javax.swing.AbstractAction() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setRollover(true);

        jButton1.setText("novo [ctrl + n]");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jButton1.getAccessibleContext().setAccessibleName("");
        jButton1.setSize(100, 50);

        jButton2.setText("abrir [ctrl + o]");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jButton2.getAccessibleContext().setAccessibleName("");

        jButton3.setText("salvar [ctrl + s]");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jButton3.getAccessibleContext().setAccessibleName("");

        jButton4.setText("copiar [ctrl + c]");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jButton4.getAccessibleContext().setAccessibleName("");

        jButton5.setText("colar [ctrl + v]");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);
        jButton5.getAccessibleContext().setAccessibleName("");

        jButton6.setText("recortar [ctrl + x]");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);
        jButton6.getAccessibleContext().setAccessibleName("");

        jButton7.setText("compilar [F7]");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);
        jButton7.getAccessibleContext().setAccessibleName("");

        jButton8.setText("equipe [F1]");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);
        jButton8.getAccessibleContext().setAccessibleName("");

        jLabel1.setText("jLabel1");

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane2.setResizeWeight(0.8);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);
        jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        jTextArea2.setCaretPosition(0);
        jScrollPane2.getHorizontalScrollBar().setValue(0);
        jTextArea2.setBorder(new NumberedBorder());

        jSplitPane2.setTopComponent(jScrollPane2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);
        jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        jSplitPane2.setRightComponent(jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1500,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1495,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isNewArchive = true;
    private java.io.File savedFile = null;

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new java.io.File("."));

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            java.io.File selectedFile = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                StringBuilder fileContent = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    fileContent.append(line).append("\n");
                }
                jTextArea2.setText(fileContent.toString());

                String fileName = selectedFile.getName();
                String filePath = selectedFile.getAbsolutePath();
                jLabel1.setText("Nome: " + fileName + " | Diretório: " + filePath);
                isNewArchive = false;
                savedFile = selectedFile; // <-- ADICIONE ESTA LINHA

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
        }
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        jTextArea2.setText("");
        jTextArea3.setText("");
        jLabel1.setText("");
        isNewArchive = true;
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
        jTextArea3.setText("");
        jTextArea3.setText("EQUIPE: \n"
                + "Lucas Gabriel Devigili e \n"
                + "Arthur Henrique Damann \n");
    }// GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        if (isNewArchive) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new java.io.File("."));

            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                savedFile = fileChooser.getSelectedFile();

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(savedFile))) {
                    writer.write(jTextArea2.getText());

                    jTextArea3.setText("");
                    jLabel1.setText("Nome: " + savedFile.getName() + " | Diretório: " + savedFile.getAbsolutePath());

                    isNewArchive = false;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
            }
        } else {
            if (savedFile != null) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(savedFile))) {
                    writer.write(jTextArea2.getText());

                    jTextArea3.setText("");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        String textoSelecionado = jTextArea2.getSelectedText();
        if (textoSelecionado != null && !textoSelecionado.isEmpty()) {
            StringSelection texto = new StringSelection(textoSelecionado);
            Clipboard a = Toolkit.getDefaultToolkit().getSystemClipboard();
            a.setContents(texto, null);
        }
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        try {
            String pastedText = (String) clipboard.getData(DataFlavor.stringFlavor);
            if (pastedText != null && !pastedText.isEmpty()) {
                jTextArea2.insert(pastedText, jTextArea2.getCaretPosition());
            }
        } catch (Exception e) {

        }
    }// GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
        String textoSelecionado = jTextArea2.getSelectedText();
        if (textoSelecionado != null && !textoSelecionado.isEmpty()) {
            StringSelection texto = new StringSelection(textoSelecionado);
            Clipboard a = Toolkit.getDefaultToolkit().getSystemClipboard();
            a.setContents(texto, null);
            jTextArea2.replaceSelection("");
        }
    }// GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
        jTextArea3.setText("");

        Lexico lexico = new Lexico();
        Sintatico sintatico = new Sintatico();
        Semantico semantico = new Semantico();
        lexico.setInput(jTextArea2.getText());

        try {
            sintatico.parse(lexico, semantico);
            jTextArea3.setText("programa compilado com sucesso");

            String ilCode = semantico.getCodigoGerado();

            // Salvar .il na mesma pasta do arquivo lido
            if (savedFile != null) {
                String parentDir = savedFile.getParent();
                String baseName = savedFile.getName();
                int dotIndex = baseName.lastIndexOf('.');
                if (dotIndex > 0) {
                    baseName = baseName.substring(0, dotIndex);
                }
                java.io.File ilFile = new java.io.File(parentDir, baseName + ".il");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(ilFile))) {
                    writer.write(ilCode);
                } catch (Exception e) {
                    jTextArea3.setText("Erro ao salvar arquivo .il: " + e.getMessage());
                }
            } else {
                jTextArea3.setText("Nenhum arquivo base aberto para salvar o .il.");
            }
        } catch (SyntaticError e) {
            int linhaErro = e.getRow(jTextArea2.getText());
            String errorMessage = "Erro na linha " + linhaErro + " – encontrado " + lexico.getCurrentLexeme() + " esperado " + e.getMessage();
            jTextArea3.setText(errorMessage);
        } catch (LexicalError e) {
            int linhaErro = e.getRow(jTextArea2.getText());
            String errorMessage = "Erro na linha " + linhaErro + " - " + e.getMessage();
            jTextArea3.setText(errorMessage);
        } catch (SemanticError e) {
            int linhaErro = e.getRow(jTextArea2.getText());
            String errorMessage = "Erro na linha " + linhaErro + " - " + e.getMessage();
            jTextArea3.setText(errorMessage);
        }
    }// GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui().setVisible(true);
            }
        });
    }

    private void padronizarBotoesToolbar() {
        Dimension tamanhoPadrao = new Dimension(100, 60);
        JButton[] botoes = {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8};

        for (JButton botao : botoes) {
            botao.setPreferredSize(tamanhoPadrao);
            botao.setMinimumSize(tamanhoPadrao);
            botao.setMaximumSize(tamanhoPadrao);
            botao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            botao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            botao.setFocusable(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
