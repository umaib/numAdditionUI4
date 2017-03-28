/*
 *Programmer: Umai Balendra
 *Date: 2017-03-26
 */
package my.numberaddition;

//import java.io.*;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Goodluck
 */
public class numberAdditionUI4 extends javax.swing.JFrame {

    /**
     * Creates new form numberAdditionUI
     */
    public numberAdditionUI4() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jToolBar1 = new javax.swing.JToolBar();
        jToolBar2 = new javax.swing.JToolBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        titledBorder1 = javax.swing.BorderFactory.createTitledBorder("");
        buttonGroup2 = new javax.swing.ButtonGroup();
        imgPanel1 = new javax.swing.JPanel();
        mypanelNew = new javax.swing.JPanel();
        fNameLabel1 = new javax.swing.JLabel();
        imgLabe = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JPanel();
        fNameLabel = new javax.swing.JLabel();
        lastNames = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        attendanceLabel = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        firstNames = new javax.swing.JComboBox<>();

        jToolBar1.setRollover(true);

        jToolBar2.setRollover(true);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        imgPanel1.setLayout(new java.awt.GridBagLayout());

        mypanelNew.setOpaque(false);

        fNameLabel1.setBackground(new java.awt.Color(0, 0, 0));
        fNameLabel1.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        fNameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        fNameLabel1.setText("First Name:");

        javax.swing.GroupLayout mypanelNewLayout = new javax.swing.GroupLayout(mypanelNew);
        mypanelNew.setLayout(mypanelNewLayout);
        mypanelNewLayout.setHorizontalGroup(
            mypanelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mypanelNewLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(fNameLabel1)
                .addContainerGap(531, Short.MAX_VALUE))
        );
        mypanelNewLayout.setVerticalGroup(
            mypanelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mypanelNewLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(fNameLabel1)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = -1.0;
        imgPanel1.add(mypanelNew, gridBagConstraints);

        imgLabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/numberaddition/applBacl.jpg"))); // NOI18N
        imgLabe.setText("jLabel5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = -27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = -1.0;
        gridBagConstraints.weighty = -1.0;
        imgPanel1.add(imgLabe, gridBagConstraints);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ms. Balendra's Class ");

        lNameLabel.setBackground(new java.awt.Color(255, 204, 204));
        lNameLabel.setBorder(javax.swing.BorderFactory.createTitledBorder("Attendance Tracker"));
        lNameLabel.setAutoscrolls(true);
        lNameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lNameLabel.setFocusCycleRoot(true);
        lNameLabel.setFocusTraversalPolicyProvider(true);
        lNameLabel.setFocusable(false);
        lNameLabel.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lNameLabel.setName("Attendance Tracker AM/PM"); // NOI18N

        fNameLabel.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        fNameLabel.setText("First Name:");

        lastNames.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        lastNames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Addams", "Cabellero", "Dupain", "Haruno", "Harvey", "Jacques", "Martinez", "Rajkumaran", "Roberts", "Singh", "Vega", "Wachowitz", " ", " " }));
        lastNames.setName(""); // NOI18N
        lastNames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastNamesMouseClicked(evt);
            }
        });
        lastNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNamesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        jLabel2.setText("Last Name:");

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        jCheckBox2.setText("Absent");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        attendanceLabel.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N
        attendanceLabel.setText("Attendance:");

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        jCheckBox1.setText("Present");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        jButton3.setText("Save");
        jButton3.setName("jBtnSave"); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        firstNames.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        firstNames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camilla", "Carlos", "Dave", "Gurneet", "Jessica", "José", "Julia", "Marinette", "Melanie", "Pierre", "Sakura", "Simran", " ", " " }));
        firstNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNamesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lNameLabelLayout = new javax.swing.GroupLayout(lNameLabel);
        lNameLabel.setLayout(lNameLabelLayout);
        lNameLabelLayout.setHorizontalGroup(
            lNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lNameLabelLayout.createSequentialGroup()
                .addGroup(lNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lNameLabelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(lNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attendanceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(lNameLabelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(lNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(fNameLabel))))
                        .addGap(86, 86, 86)
                        .addGroup(lNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNames, 0, 155, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lNameLabelLayout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox2))
                            .addComponent(firstNames, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(lNameLabelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton3)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        lNameLabelLayout.setVerticalGroup(
            lNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lNameLabelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(lNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(firstNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(lNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(lNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lNameLabelLayout.createSequentialGroup()
                        .addGroup(lNameLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1))
                        .addGap(40, 40, 40)
                        .addComponent(jButton3)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(lNameLabelLayout.createSequentialGroup()
                        .addComponent(attendanceLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        lNameLabel.getAccessibleContext().setAccessibleName("Attendance Tracker AM/PM");
        lNameLabel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Your entry has been saved!");
        //Code for getting user's colour choice
//        JColorChooser brush=new JColorChooser();
//        Object bucket=brush;
//        int x=JOptionPane.showConfirmDialog(null, bucket, "bucket",JOptionPane.OK_CANCEL_OPTION); 
//        if (x==0)
//            getContentPane().setBackground(brush.getColor());

//JOptionPane.setBackground(Color.BLUE);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("C:\\temp_Umai\\shopOut1.rtf");
        } catch (IOException ex) {
            Logger.getLogger(numberAdditionUI4.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter myPrinter= new PrintWriter(myWriter);
        //some code here
        if (jCheckBox1.isSelected()) {
            myPrinter.println(" " + "-Present-");
            myPrinter.println(" ");
            //FileWriter(shopOut1.rtf,true); TRY TO APPEND THE FILE
        }
        //some code here
        try {
            myWriter.close();
            //myPrinter.close();
        } catch (IOException ex) {
            Logger.getLogger(numberAdditionUI4.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jCheckBox1.isSelected()) {
            System.out.print(" " + "-Present-");
            System.out.println(" ");
            
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
          FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("C:\\temp_Umai\\shopOut1.rtf");
        } catch (IOException ex) {
            Logger.getLogger(numberAdditionUI4.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter myPrinter= new PrintWriter(myWriter);
        //some code here
         if (jCheckBox2.isSelected()) {
            myPrinter.println(" " + "-Absent-");
            myPrinter.println(" ");
            //FileWriter(myWriter,true);
        }
//        myPrinter.println("Check box 2 printing...");
        try {
            myWriter.close();
            //myPrinter.close();
        } catch (IOException ex) {
            Logger.getLogger(numberAdditionUI4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if (jCheckBox2.isSelected()) {
            System.out.print(" " + "-Absent-");
            System.out.println(" ");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void lastNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNamesActionPerformed
        // TODO add your handling code here:
        String lastNamesVal2 = (String) lastNames.getSelectedItem();
        System.out.print(lastNamesVal2);
        
          FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("C:\\temp_Umai\\shopOut1.rtf");
        } catch (IOException ex) {
            Logger.getLogger(numberAdditionUI4.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter myPrinter= new PrintWriter(myWriter);
        //some code here
        myPrinter.println(lastNames.getSelectedItem());
        //some code here
        try {
            myWriter.close();
            //myPrinter.close();
        } catch (IOException ex) {
            Logger.getLogger(numberAdditionUI4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_lastNamesActionPerformed

    private void lastNamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNamesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNamesMouseClicked

    private void firstNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNamesActionPerformed
        // TODO add your handling code here:
        try(FileWriter fw = new FileWriter("outfilename", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    out.println("the text");
    //more code
    out.println("more text");
    //more code
} catch (IOException e) {
    //exception handling left as an exercise for the reader
}
        
        
        
//        String firstNamesVal1 = (String) firstNames.getSelectedItem();
//        System.out.print(firstNamesVal1 + " ");
//        
//          FileWriter myWriter = null;
//        try {
//            myWriter = new FileWriter("C:\\temp_Umai\\shopOut1.rtf");
//        } catch (IOException ex) {
//            Logger.getLogger(numberAdditionUI4.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        PrintWriter myPrinter= new PrintWriter(myWriter);
//        //some code here
//        myPrinter.println(firstNamesVal1);
        //myPrinter.println(firstNames.getSelectedItem());
//        if (firstNames.toString().equals("Camilla")){
//        myPrinter.println(firstNamesVal1);
//        }
  
                
        //some code here
//        try {
//            myWriter.close();
//            //myPrinter.close();
//        } catch (IOException ex) {
//            Logger.getLogger(numberAdditionUI4.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_firstNamesActionPerformed

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
            java.util.logging.Logger.getLogger(numberAdditionUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(numberAdditionUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(numberAdditionUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(numberAdditionUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new numberAdditionUI4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attendanceLabel;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JLabel fNameLabel1;
    private javax.swing.JComboBox<String> firstNames;
    private javax.swing.JLabel imgLabe;
    private javax.swing.JPanel imgPanel1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JPanel lNameLabel;
    private javax.swing.JComboBox<String> lastNames;
    private javax.swing.JPanel mypanelNew;
    private javax.swing.border.TitledBorder titledBorder1;
    // End of variables declaration//GEN-END:variables
}
