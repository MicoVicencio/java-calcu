/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Mico
 */
public class NewJFrame extends javax.swing.JFrame {
     double num1 = 0, ans = 0, num2 = 0; int operation = 0;
     double prev_ans;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        cls = new javax.swing.JButton();
        times = new javax.swing.JButton();
        ans_p = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        divide = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        negative = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(0, 0, 255));

        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n7.setText("7");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n4.setText("4");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n5.setText("5");
        n5.setToolTipText("");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        n0.setText("0");
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        n9.setText("9");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        cls.setText("Clear Text");
        cls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsActionPerformed(evt);
            }
        });

        times.setText("X");
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });

        jLabel2.setText("Previous Ans");

        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        negative.setText("(-)");
        negative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativeActionPerformed(evt);
            }
        });

        delete.setText("DEL");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cls))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n4)
                                .addGap(18, 18, 18)
                                .addComponent(n5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(add)
                                            .addGap(18, 18, 18)
                                            .addComponent(n0))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(n1)
                                            .addGap(18, 18, 18)
                                            .addComponent(n2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(times)
                                        .addGap(18, 18, 18)
                                        .addComponent(divide))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(n7)
                                        .addGap(18, 18, 18)
                                        .addComponent(n8)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n6)
                                    .addComponent(n3)
                                    .addComponent(n9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(minus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(decimal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(equal)
                                        .addGap(18, 18, 18)
                                        .addComponent(negative, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(ans_p, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cls))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n1)
                            .addComponent(n2)
                            .addComponent(n3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n6)
                            .addComponent(n5)
                            .addComponent(n4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(ans_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equal)
                            .addComponent(times)
                            .addComponent(divide))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n8)
                                    .addComponent(n9)
                                    .addComponent(n7))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n0)
                                    .addComponent(add)
                                    .addComponent(minus)
                                    .addComponent(decimal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(negative, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(9, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO addyour handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
       
        text.setText(text.getText()+ 1);
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
        
        text.setText(text.getText()+ 2);
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        // TODO add your handling code here:
        
        text.setText(text.getText()+ 3);
    }//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        // TODO add your handling code here:
        
        text.setText(text.getText()+ 4);
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        // TODO add your handling code here:
       
        text.setText(text.getText()+ 5);
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        // TODO add your handling code here:
        
        text.setText(text.getText()+ 6);
    }//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        // TODO add your handling code here:
        
        text.setText(text.getText()+ 7);
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        // TODO add your handling code here:
        
        text.setText(text.getText()+ 8);
    }//GEN-LAST:event_n8ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
        // TODO add your handling code here:
        
        text.setText(text.getText()+ 9);
    }//GEN-LAST:event_n9ActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        // TODO add your handling code here:
        text.setText(text.getText()+ 0);
    }//GEN-LAST:event_n0ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if (num1 == 0) {
        num1 = Double.parseDouble(text.getText());
        ans = num1;
        text.setText("");
        
        } 
        else if(num1 != 0) {
        if(operation == 0){
        num2 = Double.parseDouble(text.getText());
        ans = ans + num2;
        text.setText("");
        ans_p.setText(Double.toString(ans));
        operation = 1;
        
        }
        else{
        if(operation == 2){
        prev_ans = Double.parseDouble(text.getText());
        prev_ans = ans - prev_ans;
        ans = prev_ans;
        num2 = prev_ans;
        ans_p.setText(Double.toString(ans));
        text.setText(Double.toString(ans));
        num2 = Double.parseDouble(text.getText());
        text.setText("");
        operation = 1;
       
        
        }
        else if(operation == 1){
        if (num2 == 0){
        num1 = Double.parseDouble(text.getText());
        ans = ans + num1;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        else{
        num1 = Double.parseDouble(text.getText());
        ans = num2 + num1;
        ans_p.setText(Double.toString(ans));
        num2 = 0;
        text.setText("");
        }
        }
        else if(operation == 3){
        num2 = Double.parseDouble(text.getText());
        ans = ans * num2;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        else if(operation == 4){
        num2 = Double.parseDouble(text.getText());
        ans = ans / num2;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        }
    }
     operation = 1;
    }//GEN-LAST:event_addActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        // TODO add your handling code here:
        if (num1 == 0) {
        num1 = Double.parseDouble(text.getText());
        ans = num1;
        text.setText("");
        } 
        else if(num1 != 0) {
        if(operation == 0){
        num2 = Double.parseDouble(text.getText());
        ans = ans - num2;
        text.setText("");
        ans_p.setText(Double.toString(ans));
        operation = 2;
        
        }
        else{
        if(operation == 1){
        prev_ans = Double.parseDouble(text.getText());
        prev_ans = ans + prev_ans;
        ans = prev_ans;
        num2 = prev_ans;
        
        ans_p.setText(Double.toString(ans));
        text.setText(Double.toString(ans));
        num2 = Double.parseDouble(text.getText());
        text.setText("");
        operation = 2;
   
        }
        else if(operation == 2){
        if (num2 == 0){
        num1 = Double.parseDouble(text.getText());
        ans = ans - num1;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        else{
        num1 = Double.parseDouble(text.getText());
        ans = num2 - num1;
        ans_p.setText(Double.toString(ans));
        num2 = 0;
        text.setText("");
        }
        }
        else if(operation == 3){
        num2 = Double.parseDouble(text.getText());
        ans = ans * num2;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        else if(operation == 4){
        num2 = Double.parseDouble(text.getText());
        ans = ans / num2;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        }
    }
     operation = 2;
    }//GEN-LAST:event_minusActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        // TODO add your handling code here:
        if(operation == 1)
        {
        num2 = Double.parseDouble(text.getText());
        ans = ans + num2;
        text.setText(Double.toString(ans));
        ans_p.setText(Double.toString(ans));
        
        }
        else if(operation == 2){
        num2 = Double.parseDouble(text.getText());
        ans = ans - num2;
        text.setText(Double.toString(ans));
        ans_p.setText(Double.toString(ans));
       
        }
        else if(operation == 3){
        num2 = Double.parseDouble(text.getText());
        ans = ans * num2;
        text.setText(Double.toString(ans));
        ans_p.setText(Double.toString(ans));
        }
        else if(operation == 4){
        num2 = Double.parseDouble(text.getText());
        ans = ans / num2;
        text.setText(Double.toString(ans));
        ans_p.setText(Double.toString(ans));
        }
        num1 = 0;
        operation = 0;
      
                               
    }//GEN-LAST:event_equalActionPerformed

    private void clsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsActionPerformed
        // TODO add your handling code here:
        text.setText("");
    }//GEN-LAST:event_clsActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
    if (num1 == 0) {
        num1 = Double.parseDouble(text.getText());
        ans = num1;
        text.setText("");
        } 
        else if(num1 != 0) {
        if(operation == 0){
        num2 = Double.parseDouble(text.getText());
        ans = ans * num2;
        text.setText("");
        ans_p.setText(Double.toString(ans));
        operation = 3;
        }
        else{
        if(operation == 2){
        prev_ans = Double.parseDouble(text.getText());
        prev_ans = ans - prev_ans;
        ans = prev_ans;
        num2 = prev_ans;
        ans_p.setText(Double.toString(ans));
        text.setText(Double.toString(ans));
        num2 = Double.parseDouble(text.getText());
        text.setText("");
        operation = 3;
        }
        else if(operation == 1){
        if (num2 == 0){
        num1 = Double.parseDouble(text.getText());
        ans = ans + num1;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        else{
        num1 = Double.parseDouble(text.getText());
        ans = num2 + num1;
        ans_p.setText(Double.toString(ans));
        num2 = 0;
        text.setText("");
        }
        }
        else if(operation == 3){
        num2 = Double.parseDouble(text.getText());
        ans = ans * num2;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        else if(operation == 4){
        num2 = Double.parseDouble(text.getText());
        ans = ans / num2;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        }
    }
     operation = 3;
    }//GEN-LAST:event_timesActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        // TODO add your handling code here:
        if (num1 == 0) {
        num1 = Double.parseDouble(text.getText());
        ans = num1;
        text.setText("");
        } 
        else if(num1 != 0) {
        if(operation == 0){
        num2 = Double.parseDouble(text.getText());
        ans = ans / num2;
        text.setText("");
        ans_p.setText(Double.toString(ans));
        operation = 4;
        }
        else{
        if(operation == 2){
        prev_ans = Double.parseDouble(text.getText());
        prev_ans = ans - prev_ans;
        ans = prev_ans;
        num2 = prev_ans;
        ans_p.setText(Double.toString(ans));
        text.setText(Double.toString(ans));
        num2 = Double.parseDouble(text.getText());
        text.setText("");
        operation = 4;
        }
        else if(operation == 1){
        if (num2 == 0){
        num1 = Double.parseDouble(text.getText());
        ans = ans + num1;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        else{
        num1 = Double.parseDouble(text.getText());
        ans = num2 + num1;
        ans_p.setText(Double.toString(ans));
        num2 = 0;
        text.setText("");
        }
        }
        else if(operation == 3){
        num2 = Double.parseDouble(text.getText());
        ans = ans * num2;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
        else if(operation == 4){
        num2 = Double.parseDouble(text.getText());
        ans = ans / num2;
        ans_p.setText(Double.toString(ans));
        text.setText("");
        }
    }
     
      }
    operation = 4;    
    }//GEN-LAST:event_divideActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        // TODO add your handling code here:
        text.setText(text.getText()+ ".");
    }//GEN-LAST:event_decimalActionPerformed

    private void negativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeActionPerformed
        // TODO add your handling code here:
        text.setText(text.getText()+ "-");
    }//GEN-LAST:event_negativeActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String currentText = text.getText();
        if (!currentText.isEmpty()) {
        String newText = currentText.substring(0, currentText.length() - 1);
        text.setText(newText);
        }
        
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField ans_p;
    private javax.swing.JButton cls;
    private javax.swing.JButton decimal;
    private javax.swing.JButton delete;
    private javax.swing.JButton divide;
    private javax.swing.JButton equal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton minus;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton negative;
    private javax.swing.JTextField text;
    private javax.swing.JButton times;
    // End of variables declaration//GEN-END:variables
}
