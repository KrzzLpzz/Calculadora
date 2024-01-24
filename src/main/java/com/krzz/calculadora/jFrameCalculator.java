package com.krzz.calculadora;

import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.*;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.UIManager;

/**
 * @author Krzz.
 */

public class jFrameCalculator extends javax.swing.JFrame {

    private boolean igual, inicio = true, op1, op2;
    private double a,b,c,memoria = 0,resultado,valor1,valor2;
    private String cadena,funciones,tipoOperaciones;
    /**
     * Creates new form frame
     */
    public jFrameCalculator() {
        initComponents();
        this.setLocationRelativeTo(null); // Centra la ventana en la pantalla.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jBtnDel = new javax.swing.JButton();
        jBtnAC = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnDividedBy = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnTimes = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtnEqual = new javax.swing.JButton();
        jBtnPlus = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ToggleTheme = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jTxtPrincipal = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jBtnPi = new javax.swing.JButton();
        jBtnSqrt = new javax.swing.JButton();
        jBtnRoundBracket1 = new javax.swing.JButton();
        jBtnRoundBracket2 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jBtnLn = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        ToggleSqrt = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton7.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jButton7.setText("xʸ");
        jButton7.setFocusPainted(false);

        jBtnDel.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnDel.setText("DEL");
        jBtnDel.setFocusPainted(false);

        jBtnAC.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnAC.setText("AC");
        jBtnAC.setFocusPainted(false);

        jBtn7.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jBtn7.setText("7");
        jBtn7.setFocusPainted(false);
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.setFocusPainted(false);
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.setFocusPainted(false);
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnDividedBy.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnDividedBy.setText("÷");
        jBtnDividedBy.setFocusPainted(false);
        jBtnDividedBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDividedByActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jBtn4.setText("4");
        jBtn4.setFocusPainted(false);
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jBtn5.setText("5");
        jBtn5.setFocusPainted(false);
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jBtn6.setText("6");
        jBtn6.setFocusPainted(false);
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtnTimes.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnTimes.setText("×");
        jBtnTimes.setFocusPainted(false);
        jBtnTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTimesActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jBtn1.setText("1");
        jBtn1.setFocusPainted(false);
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jBtn2.setText("2");
        jBtn2.setFocusPainted(false);
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jBtn3.setText("3");
        jBtn3.setFocusPainted(false);
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnMinus.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnMinus.setText("-");
        jBtnMinus.setFocusPainted(false);
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jBtn0.setText("0");
        jBtn0.setFocusPainted(false);
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnDot.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnDot.setText(".");
        jBtnDot.setFocusPainted(false);
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        jBtnEqual.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnEqual.setText("=");
        jBtnEqual.setFocusPainted(false);
        jBtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualActionPerformed(evt);
            }
        });

        jBtnPlus.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnPlus.setText("+");
        jBtnPlus.setFocusPainted(false);
        jBtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPlusActionPerformed(evt);
            }
        });

        ToggleTheme.setBackground(java.awt.Color.white);
        ToggleTheme.setForeground(java.awt.Color.white);
        ToggleTheme.setSelected(true);
        ToggleTheme.setFocusPainted(false);
        ToggleTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleThemeActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jTxtPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ToggleTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToggleTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton12.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jButton12.setText("x²");
        jButton12.setFocusPainted(false);

        jBtnPi.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnPi.setText("π");
        jBtnPi.setFocusPainted(false);

        jBtnSqrt.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnSqrt.setText("√ ");
        jBtnSqrt.setFocusPainted(false);

        jBtnRoundBracket1.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnRoundBracket1.setText("(");
        jBtnRoundBracket1.setFocusPainted(false);

        jBtnRoundBracket2.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnRoundBracket2.setText(")");
        jBtnRoundBracket2.setFocusPainted(false);

        jButton22.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jButton22.setText("log");
        jButton22.setFocusPainted(false);

        jBtnLn.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jBtnLn.setText("ln");
        jBtnLn.setFocusPainted(false);

        jButton13.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jButton13.setText("x-¹");
        jButton13.setFocusPainted(false);

        ToggleSqrt.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        ToggleSqrt.setText("⇄");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ToggleSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtnRoundBracket1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jBtnRoundBracket2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jBtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnDividedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 60, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnRoundBracket1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnRoundBracket2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ToggleSqrt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnDividedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToggleThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleThemeActionPerformed
        // Create a new event for theme switching (Dark | White)
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (ToggleTheme.isSelected()) {
                    // If the ToggleButton is selected we put the Dark Theme
                    FlatMacDarkLaf.setup();
                    FlatLaf.updateUI();
                    ToggleTheme.setBackground(Color.white);
                } else {
                    // If the ToggleButton isn't selected we put the White Theme
                    FlatMacLightLaf.setup();
                    FlatLaf.updateUI();
                    ToggleTheme.setBackground(Color.black);
                }
            }
        });
    }//GEN-LAST:event_ToggleThemeActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        if (inicio == true) {
            jTxtPrincipal.setText("");
            jTxtPrincipal.setText("1");
            inicio = false;
        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + "1");
        }
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        if (inicio == true) {
            jTxtPrincipal.setText("");
            jTxtPrincipal.setText("2");
            inicio = false;
        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + "2");
        }
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        if (inicio == true) {
            jTxtPrincipal.setText("");
            jTxtPrincipal.setText("3");
            inicio = false;
        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + "3");
        }
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        if (inicio == true) {
            jTxtPrincipal.setText("");
            jTxtPrincipal.setText("4");
            inicio = false;
        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + "4");
        }
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        if (inicio == true) {
            jTxtPrincipal.setText("");
            jTxtPrincipal.setText("5");
            inicio = false;
        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + "5");
        }
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        if (inicio == true) {
            jTxtPrincipal.setText("");
            jTxtPrincipal.setText("6");
            inicio = false;
        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + "6");
        }
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        if (inicio == true) {
            jTxtPrincipal.setText("");
            jTxtPrincipal.setText("7");
            inicio = false;
        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + "7");
        }
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        if (inicio == true) {
            jTxtPrincipal.setText("");
            jTxtPrincipal.setText("8");
            inicio = false;
        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + "8");
        }
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        if (inicio == true) {
            jTxtPrincipal.setText("");
            jTxtPrincipal.setText("9");
            inicio = false;
        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + "9");
        }
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        if (inicio == true) {
            jTxtPrincipal.setText("");
            jTxtPrincipal.setText("0");
            inicio = false;
        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + "0");
        }
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        if (jTxtPrincipal.getText().contains(".")) {

        } else {
            jTxtPrincipal.setText(jTxtPrincipal.getText() + ".");
            inicio = false;
        }
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void jBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPlusActionPerformed
        igual = true;
        inicio = true;

        if (op1 = true) {
            valor1 = Double.parseDouble(jTxtPrincipal.getText());
            jTextField1.setText("");
            jTextField1.setText(jTxtPrincipal.getText() + " + ");
            op1 = false;
        } else {
            if (op2 = true) {
                valor2 = Double.parseDouble(jTxtPrincipal.getText());
                jTextField1.setText(jTxtPrincipal.getText() + " + ");
                op2 = false;
            } else {
                jTextField1.setText(jTxtPrincipal.getText() + " + ");
                Operaciones(resultado, valor2);
            }
        }
        
        tipoOperaciones = "+";
    }//GEN-LAST:event_jBtnPlusActionPerformed

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMinusActionPerformed
        igual = true;
        inicio = true;

        if (op1 = true) {
            valor1 = Double.parseDouble(jTxtPrincipal.getText());
            jTextField1.setText("");
            jTextField1.setText(jTxtPrincipal.getText() + " - ");
            op1 = false;
        } else {
            if (op2 = true) {
                valor2 = Double.parseDouble(jTxtPrincipal.getText());
                jTextField1.setText(jTxtPrincipal.getText() + " - ");
                op2 = false;
            } else {
                jTextField1.setText(jTxtPrincipal.getText() + " - ");
                Operaciones(resultado, valor2);
            }
        }
        
        tipoOperaciones = "-";
    }//GEN-LAST:event_jBtnMinusActionPerformed

    private void jBtnTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTimesActionPerformed
        igual = true;
        inicio = true;

        if (op1 = true) {
            valor1 = Double.parseDouble(jTxtPrincipal.getText());
            jTextField1.setText("");
            jTextField1.setText(jTxtPrincipal.getText() + " × ");
            op1 = false;
        } else {
            if (op2 = true) {
                valor2 = Double.parseDouble(jTxtPrincipal.getText());
                jTextField1.setText(jTxtPrincipal.getText() + " × ");
                op2 = false;
            } else {
                jTextField1.setText(jTxtPrincipal.getText() + " × ");
                Operaciones(resultado, valor2);
            }
        }
        
        tipoOperaciones = "×";
    }//GEN-LAST:event_jBtnTimesActionPerformed

    private void jBtnDividedByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDividedByActionPerformed
        igual = true;
        inicio = true;

        if (op1 = true) {
            valor1 = Double.parseDouble(jTxtPrincipal.getText());
            jTextField1.setText("");
            jTextField1.setText(jTxtPrincipal.getText() + " ÷ ");
            op1 = false;
        } else {
            if (op2 = true) {
                valor2 = Double.parseDouble(jTxtPrincipal.getText());
                jTextField1.setText(jTxtPrincipal.getText() + " ÷ ");
                op2 = false;
            } else {
                jTextField1.setText(jTxtPrincipal.getText() + " ÷ ");
                Operaciones(resultado, valor2);
            }
        }
        
        tipoOperaciones = "÷";
    }//GEN-LAST:event_jBtnDividedByActionPerformed

    private void Operaciones(double valor1, double valor2) {
        switch (tipoOperaciones) {
            case "+":
                resultado = valor1 + valor2;
                jTxtPrincipal.setText(resultado + "");
                valor1 = Double.parseDouble(jTxtPrincipal.getText());
                break;
            case "-":
                resultado = valor1 - valor2;
                jTxtPrincipal.setText(resultado + "");
                valor1 = Double.parseDouble(jTxtPrincipal.getText());
                break;
            case "×":
                resultado = valor1 * valor2;
                jTxtPrincipal.setText(resultado + "");
                valor1 = Double.parseDouble(jTxtPrincipal.getText());
                break;
            case "÷":
                if (valor2 == 0) {
                    jTxtPrincipal.setText("Error");
                    break;
                } else {
                    resultado = valor1 / valor2;
                    jTxtPrincipal.setText(resultado + "");
                    valor1 = Double.parseDouble(jTxtPrincipal.getText());
                    break;
                }
        }
    }
    
    private void jBtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualActionPerformed
        inicio = true;
        op1 = true;
        
        if (igual == true) {
            if (tipoOperaciones == null) {
                
            } else {
                valor2 = Double.parseDouble(jTxtPrincipal.getText());
                jTextField1.setText(jTextField1.getText() + jTxtPrincipal.getText());
                Operaciones(valor1, valor2);
                igual = false;
            }
        } else {
            jTextField1.setText("");
            Operaciones(valor1, valor2);
        }
    }//GEN-LAST:event_jBtnEqualActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        // Import FlatLaf for custom themes
        try {
            // Setting the dark theme as main
            FlatMacDarkLaf.setup();
        } catch (Exception ex) {
            // Throw error if FlatLaf initialization failed
            System.err.println("Failed to initialize LaF");
        }
        
        // Putting the rounded buttons, using UIManager
        UIManager.put("Button.arc", 999);

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ToggleSqrt;
    private javax.swing.JToggleButton ToggleTheme;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnAC;
    private javax.swing.JButton jBtnDel;
    private javax.swing.JButton jBtnDividedBy;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEqual;
    private javax.swing.JButton jBtnLn;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnPi;
    private javax.swing.JButton jBtnPlus;
    private javax.swing.JButton jBtnRoundBracket1;
    private javax.swing.JButton jBtnRoundBracket2;
    private javax.swing.JButton jBtnSqrt;
    private javax.swing.JButton jBtnTimes;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtPrincipal;
    // End of variables declaration//GEN-END:variables
}
