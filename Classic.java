/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.monocalculator;

import java.text.DecimalFormat;


public class Classic extends javax.swing.JFrame {
    static final char ADDITION = '+', SUBTRACTION = '-', MULTIPLICATION = 'x', DIVISION = '÷';
    
    private double previousNum;
    private double currentNum;
    
    private char operation = 0;
    
    private String primaryPrefix = "";

    private boolean justEquals = false;
    
    private double lastResult;
    private boolean hasSetPrimary = false;
    
    DecimalFormat valueFormat = new DecimalFormat("0.#");
    
    
    private void appendNum(float num) {
        if (justEquals) {
            currentNum = 0;
        }
        
        setCurrentNum(num + currentNum * 10);
        justEquals = false;
    }
    
    
    private void setCurrentNum(double newPrimaryValue) {
        currentNum = newPrimaryValue;
        String text = valueFormat.format(currentNum);
        primaryLabel.setText(primaryPrefix + text);
    }
    
    private void setOperation(char newOperation) {
        if (operation != 0) {
            equals();
        }
        
        if (justEquals == false) {
            previousNum = currentNum;
        }
        
        operation = newOperation;
        currentNum = 0;
        
        primaryPrefix = String.format("%s %c ", primaryLabel.getText(), operation);
        primaryLabel.setText(primaryPrefix);
        justEquals = false;
    }
    
    private void equals() {
        contextLabel.setText(primaryLabel.getText() + " =");
        
        switch (operation) {
            case ADDITION:
                previousNum += currentNum;
                break;
            case SUBTRACTION:
                previousNum -= currentNum;
                break;
            case MULTIPLICATION:
                previousNum *= currentNum; 
                break;
            case DIVISION:
                previousNum /= currentNum;
                break;
            default:
                
                return;
        }
        
        String valueText = valueFormat.format(previousNum);
        
        clearPrimary();
        justEquals = true;
        primaryLabel.setText(valueText);
    }
    
    private void clearPrimary() {
        primaryPrefix = "";
        operation = 0;
        setCurrentNum(0);
    }

    /**
     * Creates new form Test
     */
    public Classic() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contextLabel = new javax.swing.JLabel();
        primaryLabel = new javax.swing.JLabel();
        percent = new javax.swing.JButton();
        clearEntry = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        over = new javax.swing.JButton();
        square = new javax.swing.JButton();
        squareroot = new javax.swing.JButton();
        division = new javax.swing.JButton();
        num_7 = new javax.swing.JButton();
        num_8 = new javax.swing.JButton();
        num_9 = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        num_4 = new javax.swing.JButton();
        num_5 = new javax.swing.JButton();
        num_6 = new javax.swing.JButton();
        subtraction = new javax.swing.JButton();
        num_1 = new javax.swing.JButton();
        num_2 = new javax.swing.JButton();
        num_3 = new javax.swing.JButton();
        addition = new javax.swing.JButton();
        negate = new javax.swing.JButton();
        num_0 = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contextLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        primaryLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        primaryLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        primaryLabel.setText("0");

        percent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        percent.setText("%");
        percent.setMinimumSize(new java.awt.Dimension(65, 30));

        clearEntry.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clearEntry.setText("CE");
        clearEntry.setMinimumSize(new java.awt.Dimension(65, 30));
        clearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEntryActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clear.setText("C");
        clear.setMinimumSize(new java.awt.Dimension(65, 30));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backspace.setText("<-");
        backspace.setMinimumSize(new java.awt.Dimension(65, 30));

        over.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        over.setText("1/x");
        over.setMinimumSize(new java.awt.Dimension(65, 30));

        square.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        square.setText("x²");
        square.setMinimumSize(new java.awt.Dimension(65, 30));

        squareroot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        squareroot.setText("√");
        squareroot.setMinimumSize(new java.awt.Dimension(65, 30));

        division.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        division.setText("÷");
        division.setMinimumSize(new java.awt.Dimension(65, 30));
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        num_7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_7.setText("7");
        num_7.setMinimumSize(new java.awt.Dimension(65, 30));
        num_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_7ActionPerformed(evt);
            }
        });

        num_8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_8.setText("8");
        num_8.setMinimumSize(new java.awt.Dimension(65, 30));
        num_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_8ActionPerformed(evt);
            }
        });

        num_9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_9.setText("9");
        num_9.setMinimumSize(new java.awt.Dimension(65, 30));
        num_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_9ActionPerformed(evt);
            }
        });

        multiplication.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        multiplication.setText("x");
        multiplication.setMinimumSize(new java.awt.Dimension(65, 30));
        multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationActionPerformed(evt);
            }
        });

        num_4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_4.setText("4");
        num_4.setMinimumSize(new java.awt.Dimension(65, 30));
        num_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_4ActionPerformed(evt);
            }
        });

        num_5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_5.setText("5");
        num_5.setMinimumSize(new java.awt.Dimension(65, 30));
        num_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_5ActionPerformed(evt);
            }
        });

        num_6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_6.setText("6");
        num_6.setMinimumSize(new java.awt.Dimension(65, 30));
        num_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_6ActionPerformed(evt);
            }
        });

        subtraction.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subtraction.setText("-");
        subtraction.setMinimumSize(new java.awt.Dimension(65, 30));
        subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionActionPerformed(evt);
            }
        });

        num_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_1.setText("1");
        num_1.setMinimumSize(new java.awt.Dimension(65, 30));
        num_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_1ActionPerformed(evt);
            }
        });

        num_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_2.setText("2");
        num_2.setMinimumSize(new java.awt.Dimension(65, 30));
        num_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_2ActionPerformed(evt);
            }
        });

        num_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_3.setText("3");
        num_3.setMinimumSize(new java.awt.Dimension(65, 30));
        num_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_3ActionPerformed(evt);
            }
        });

        addition.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addition.setText("+");
        addition.setMinimumSize(new java.awt.Dimension(65, 30));
        addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionActionPerformed(evt);
            }
        });

        negate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        negate.setText("+/-");
        negate.setMinimumSize(new java.awt.Dimension(65, 30));

        num_0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num_0.setText("0");
        num_0.setMinimumSize(new java.awt.Dimension(65, 30));
        num_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_0ActionPerformed(evt);
            }
        });

        dot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dot.setText(".");
        dot.setMinimumSize(new java.awt.Dimension(65, 30));

        equals.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        equals.setText("=");
        equals.setMinimumSize(new java.awt.Dimension(65, 30));
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(over, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(square, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(squareroot, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num_1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addition, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num_7, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_8, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_9, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplication, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(negate, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_0, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dot, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(percent, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearEntry, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addComponent(contextLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(primaryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num_4, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_5, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_6, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtraction, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(primaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(percent, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(clearEntry, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(over, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(square, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(squareroot, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(num_7, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(num_8, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(num_9, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(multiplication, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(num_4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(num_5, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(num_6, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(subtraction, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(num_1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(num_2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(num_3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(addition, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(negate, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(num_0, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(dot, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void num_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_2ActionPerformed
        appendNum(2);
    }//GEN-LAST:event_num_2ActionPerformed

    private void additionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionActionPerformed
        setOperation(ADDITION);
    }//GEN-LAST:event_additionActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        equals();
    }//GEN-LAST:event_equalsActionPerformed

    private void num_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_0ActionPerformed
        appendNum(0);
    }//GEN-LAST:event_num_0ActionPerformed

    private void num_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_1ActionPerformed
        appendNum(1);
    }//GEN-LAST:event_num_1ActionPerformed

    private void num_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_3ActionPerformed
        appendNum(3);
    }//GEN-LAST:event_num_3ActionPerformed

    private void num_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_4ActionPerformed
        appendNum(4);
    }//GEN-LAST:event_num_4ActionPerformed

    private void num_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_5ActionPerformed
        appendNum(5);
    }//GEN-LAST:event_num_5ActionPerformed

    private void num_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_6ActionPerformed
        appendNum(6);
    }//GEN-LAST:event_num_6ActionPerformed

    private void num_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_7ActionPerformed
        appendNum(7);
    }//GEN-LAST:event_num_7ActionPerformed

    private void num_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_8ActionPerformed
        appendNum(8);
    }//GEN-LAST:event_num_8ActionPerformed

    private void num_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_9ActionPerformed
        appendNum(9);
    }//GEN-LAST:event_num_9ActionPerformed

    private void subtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionActionPerformed
        setOperation(SUBTRACTION);
    }//GEN-LAST:event_subtractionActionPerformed

    private void multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationActionPerformed
        setOperation(MULTIPLICATION);
    }//GEN-LAST:event_multiplicationActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        setOperation(DIVISION);
    }//GEN-LAST:event_divisionActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        contextLabel.setText("");
        clearPrimary();
    }//GEN-LAST:event_clearActionPerformed

    private void clearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearEntryActionPerformed
        setCurrentNum(0);
    }//GEN-LAST:event_clearEntryActionPerformed

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
            java.util.logging.Logger.getLogger(Classic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addition;
    private javax.swing.JButton backspace;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearEntry;
    private javax.swing.JLabel contextLabel;
    private javax.swing.JButton division;
    private javax.swing.JButton dot;
    private javax.swing.JButton equals;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton negate;
    private javax.swing.JButton num_0;
    private javax.swing.JButton num_1;
    private javax.swing.JButton num_2;
    private javax.swing.JButton num_3;
    private javax.swing.JButton num_4;
    private javax.swing.JButton num_5;
    private javax.swing.JButton num_6;
    private javax.swing.JButton num_7;
    private javax.swing.JButton num_8;
    private javax.swing.JButton num_9;
    private javax.swing.JButton over;
    private javax.swing.JButton percent;
    private javax.swing.JLabel primaryLabel;
    private javax.swing.JButton square;
    private javax.swing.JButton squareroot;
    private javax.swing.JButton subtraction;
    // End of variables declaration//GEN-END:variables
}
