import javax.swing.JOptionPane;

public class ATMGui extends javax.swing.JFrame {

    //home message to print 
    String home = "Welcome to Maddies ATM Machine\n\n"
            + "What would you like to do today?\n"
            + "Please use any of the grey keys";
    
    //help message to print
    String helpText = "Welcome to Maddies ATM Machine\n\n"
            + "Please, start choose what you need to get done today.\n"
            + "Use grey keys right under screen for that.\n"
            + "When you have decided that, the system will ask you\n"
            + "what account you would like to use.\n"
            + "Please use number keys to choose.\n"
            + "If you have any further questions, please don't ask!";
    
    
    //creating a state and accountchoice to be able to manage what state 
    //user is in regarding to what buttons they have pressed
    String state = "idle"; //idle, withdraw, deposit, balance, enterWithdraw or enterDeposit
    String accountChoice; //accountChoiceSavings, accountChoiceNet, accountChoiceCheque, accountChoiceFixed
    
    String numString = ""; //numstring to use when user enters amount based of numbers
    
    //creating accounts
    Saving saving1 = new Saving();
    Net netbank1 = new Net();
    Cheque cheque1 = new Cheque();
    Fixed fixed1 = new Fixed();
    
    //function to start the program
    public ATMGui() {
        initComponents();
        textArea.setText(home); //what message will display while starting program
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnBalance = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        textArea.setColumns(20);
        textArea.setRows(8);
        jScrollPane1.setViewportView(textArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        btn1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn1.setLabel("1");
        btn1.setPreferredSize(new java.awt.Dimension(80, 70));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        getContentPane().add(btn1, gridBagConstraints);

        btn2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn2.setLabel("2");
        btn2.setPreferredSize(new java.awt.Dimension(80, 70));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        getContentPane().add(btn2, gridBagConstraints);

        btn3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn3.setLabel("3");
        btn3.setPreferredSize(new java.awt.Dimension(80, 70));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        getContentPane().add(btn3, gridBagConstraints);

        btn4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn4.setLabel("4");
        btn4.setPreferredSize(new java.awt.Dimension(80, 70));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        getContentPane().add(btn4, gridBagConstraints);

        btn5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn5.setLabel("5");
        btn5.setPreferredSize(new java.awt.Dimension(80, 70));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        getContentPane().add(btn5, gridBagConstraints);

        btn6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn6.setLabel("6");
        btn6.setPreferredSize(new java.awt.Dimension(80, 70));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        getContentPane().add(btn6, gridBagConstraints);

        btn7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn7.setLabel("7");
        btn7.setPreferredSize(new java.awt.Dimension(80, 70));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        getContentPane().add(btn7, gridBagConstraints);

        btn8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn8.setLabel("8");
        btn8.setPreferredSize(new java.awt.Dimension(80, 70));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        getContentPane().add(btn8, gridBagConstraints);

        btn9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn9.setLabel("9");
        btn9.setPreferredSize(new java.awt.Dimension(80, 70));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        getContentPane().add(btn9, gridBagConstraints);

        btn0.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn0.setLabel("0");
        btn0.setPreferredSize(new java.awt.Dimension(80, 70));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        getContentPane().add(btn0, gridBagConstraints);

        btnCancel.setBackground(new java.awt.Color(255, 153, 153));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setPreferredSize(new java.awt.Dimension(120, 70));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        getContentPane().add(btnCancel, gridBagConstraints);

        btnEnter.setBackground(new java.awt.Color(153, 255, 153));
        btnEnter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.setPreferredSize(new java.awt.Dimension(120, 70));
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        getContentPane().add(btnEnter, gridBagConstraints);

        btnHelp.setBackground(new java.awt.Color(255, 255, 255));
        btnHelp.setText("Help");
        btnHelp.setPreferredSize(new java.awt.Dimension(120, 70));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        getContentPane().add(btnHelp, gridBagConstraints);

        btnBalance.setBackground(new java.awt.Color(102, 102, 102));
        btnBalance.setText("Balance");
        btnBalance.setPreferredSize(new java.awt.Dimension(80, 40));
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        getContentPane().add(btnBalance, gridBagConstraints);

        btnWithdraw.setBackground(new java.awt.Color(102, 102, 102));
        btnWithdraw.setText("Withdraw");
        btnWithdraw.setPreferredSize(new java.awt.Dimension(80, 40));
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(btnWithdraw, gridBagConstraints);

        btnDeposit.setBackground(new java.awt.Color(102, 102, 102));
        btnDeposit.setText("Deposit");
        btnDeposit.setPreferredSize(new java.awt.Dimension(80, 40));
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        getContentPane().add(btnDeposit, gridBagConstraints);

        btnClear.setBackground(new java.awt.Color(255, 255, 102));
        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(120, 70));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        getContentPane().add(btnClear, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


//actions of buttons
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        switch (state) {
            case "withdraw":
                accountChoice = "accountChoiceSavings";
                textArea.setText("Please enter amount you'd like to withdraw: ");
                state = "enterWithdraw";
                break;
            case "balance":
                accountChoice = "accountChoiceSavings";
                textArea.setText("Your current balance in your Saving account is: " +saving1.balance);
                break;
            case "deposit":
                accountChoice = "accountChoiceSavings";
                textArea.setText("Please enter amount you'd like to deposit: ");
                state = "enterDeposit";
                break;
        //for checking
            case "enterWithdraw":
            case "enterDeposit":
                numString += "1"; //users choose amount    
                textArea.setText("Please enter amount: " +numString);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        state = "idle";
        dispose();//window will close 
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        switch (state) {
            case "withdraw":
                accountChoice = "accountChoiceCheque";
                textArea.setText("Please enter amount you'd like to withdraw: ");
                state = "enterWithdraw";
                break;
            case "balance":
                accountChoice = "accountChoiceCheque";
                textArea.setText("Your current balance in your Cheque account is: " +cheque1.balance);
                break;
            case "deposit":
                accountChoice = "accountChoiceCheque";
                textArea.setText("Please enter amount you'd like to deposit: ");
                state = "enterDeposit";
                break;
        //for checking
            case "enterWithdraw":
            case "enterDeposit":
                numString += "3"; //users choose amount    
                textArea.setText("Please enter amount: " +numString);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        switch (state) {
            case "withdraw":
                accountChoice = "accountChoiceNet";
                textArea.setText("Please enter amount you'd like to withdraw: ");
                state = "enterWithdraw";
                break;
            case "balance":
                accountChoice = "accountChoiceNet";
                textArea.setText("Your current balance in your Netbank account is: " +netbank1.balance);
                break;
            case "deposit":
                accountChoice = "accountChoiceNet";
                textArea.setText("Please enter amount you'd like to deposit: ");
                state = "enterDeposit";
                break;
        //for checking
            case "enterWithdraw":
            case "enterDeposit":
                numString += "2"; //users choose amount    
                textArea.setText("Please enter amount: " +numString);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        switch (state) {
            case "withdraw":
                accountChoice = "accountChoiceFixed";
                textArea.setText("Please enter amount you'd like to withdraw: ");
                state = "enterWithdraw";
                break;
            case "balance":
                accountChoice = "accountChoiceFixed";
                textArea.setText("Your current balance in your Fixed account is: " +fixed1.balance);
                break;
            case "deposit":
                accountChoice = "accountChoiceFixed";
                textArea.setText("Please enter amount you'd like to deposit: ");
                state = "enterDeposit";
                break;
        //for checking
            case "enterWithdraw":
            case "enterDeposit":
                numString += "4"; //users choose amount    
                textArea.setText("Please enter amount: " +numString);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(state.equals("enterWithdraw") || (state.equals("enterDeposit")))//for checking
                {
                    numString += "5"; //users choose amount    
                    textArea.setText("Please enter amount: " +numString);
                }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       if(state.equals("enterWithdraw") || (state.equals("enterDeposit")))//for checking
                {
                    numString += "6"; //users choose amount    
                    textArea.setText("Please enter amount: " +numString);
                }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       if(state.equals("enterWithdraw") || (state.equals("enterDeposit")))//for checking
                {
                    numString += "7"; //users choose amount    
                    textArea.setText("Please enter amount: " +numString);
                }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       if(state.equals("enterWithdraw") || (state.equals("enterDeposit")))//for checking
                {
                    numString += "8"; //users choose amount    
                    textArea.setText("Please enter amount: " +numString);
                }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
      if(state.equals("enterWithdraw") || (state.equals("enterDeposit")))//for checking
                {
                    numString += "9"; //users choose amount    
                    textArea.setText("Please enter amount: " +numString);
                }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if(state.equals("enterWithdraw") || (state.equals("enterDeposit")))//for checking
                {
                    numString += "0"; //users choose amount    
                    textArea.setText("Please enter amount: " +numString);
                }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        //exception to catch if error occur        
        try{
        if(state.equals("enterWithdraw")){
            switch (accountChoice) {
                case "accountChoiceSavings":
                    saving1.makeWithdrawal(Double.parseDouble(numString));
                    textArea.setText(saving1.message);
                    // textArea.setText("You have just withdrawn: $" + numString
                    //       + "\nYour new balance in your Saving account is: $" + saving1.balance);
                    break;
                case "accountChoiceNet":
                    netbank1.makeWithdrawal(Double.parseDouble(numString));
                    textArea.setText(netbank1.message);
                    break;
                case "accountChoiceCheque":
                    cheque1.makeWithdrawal(Double.parseDouble(numString));
                    textArea.setText(cheque1.message);
                    break;
                case "accountChoiceFixed":
                    fixed1.makeWithdrawal(Double.parseDouble(numString));
                    textArea.setText(fixed1.message);
                    break;
                default:
                    break;
            }
                }
                else if(state.equals("enterDeposit")){
            switch (accountChoice) {
                case "accountChoiceSavings":
                    saving1.makeDeposit(Double.parseDouble(numString));
                    textArea.setText("You have just deposit: $" +numString
                            + "\nYour new balance in your Saving account is: $" +saving1.balance);
                    break;
                case "accountChoiceNet":
                    netbank1.makeDeposit(Double.parseDouble(numString));
                    textArea.setText("You have just deposit: $" +numString
                            + "\nYour new balance in your Netbank account is: $" +netbank1.balance);
                    break;
                case "accountChoiceCheque":
                    cheque1.makeDeposit(Double.parseDouble(numString));
                    textArea.setText("You have just deposit: $" +numString
                            + "\nYour new balance in your Cheque account is: $" +cheque1.balance);
                    break;
                case "accountChoiceFixed":
                    fixed1.makeDeposit(Double.parseDouble(numString));
                    textArea.setText("You have just deposit: $" +numString
                            + "\nYour new balance in your Fixed account is: $" +fixed1.balance);
                    break;
                default:
                    break;
            }
                }
        }catch(amountZeroException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        textArea.setText(""); //resets the textarea
                textArea.append("What account would you like to use?\n"
                        + "Press 1 for Savings\n"
                        + "Press 2 for Netbank\n"
                        + "Press 3 for Cheque\n"
                        + "Press 4 for Fixed\n"); 
                state = "withdraw";
                numString = "";
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        textArea.setText(""); //resets the textarea
                textArea.append("What account would you like to use?\n"
                        + "Press 1 for Savings\n"
                        + "Press 2 for Netbank\n"
                        + "Press 3 for Cheque\n"
                        + "Press 4 for Fixed\n"); 
                state = "deposit";
                numString = "";
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
        textArea.setText(""); //resets the textarea
                textArea.append("What account would you like to use?\n"
                        + "Press 1 for Savings\n"
                        + "Press 2 for Netbank\n"
                        + "Press 3 for Cheque\n"
                        + "Press 4 for Fixed\n"); 
                state = "balance";
                numString = "";
    }//GEN-LAST:event_btnBalanceActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        textArea.setText(helpText);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        state = "idle";
        textArea.setText(home);
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(ATMGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMGui().setVisible(true);//creates the system
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}