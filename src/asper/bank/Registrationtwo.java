/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asper.bank;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author remix_alpha
 */
public class Registrationtwo extends javax.swing.JFrame {

    /**
     * Creates new form Registrationtwo
     */
    public Registrationtwo() {
        initComponents();
        setLocation(350, 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panno = new javax.swing.JTextField();
        aadno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        occupation = new javax.swing.JComboBox<>();
        religion = new javax.swing.JComboBox<>();
        category = new javax.swing.JComboBox<>();
        income = new javax.swing.JComboBox<>();
        eduqual = new javax.swing.JComboBox<>();
        eno = new javax.swing.JRadioButton();
        eyes = new javax.swing.JRadioButton();
        syes = new javax.swing.JRadioButton();
        sno = new javax.swing.JRadioButton();
        Applicationlabal = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asper/bank/images/[removal.ai]_tmp-62c19609521e7.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 430, 420));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel4.setText("Religion");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel5.setText("Category");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel6.setText("Income");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel7.setText("Occupation");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel8.setText("Qualification");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 338, -1, 30));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel9.setText("PAN Number");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel10.setText("Aadhar Number");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, -1, -1));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel11.setText("Senior Citizen");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 568, -1, 20));

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel12.setText("Existing Account");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 130, 50));

        panno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannoActionPerformed(evt);
            }
        });
        jPanel3.add(panno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 276, 34));

        aadno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadnoActionPerformed(evt);
            }
        });
        jPanel3.add(aadno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 276, 34));

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel16.setText("Educational");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, 30));

        occupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Other", "Salaried", "Self Employed", "Bussiness", "Student", "Retired" }));
        jPanel3.add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 280, 40));

        religion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Other", "Hindu", "Muslim", "Sikh", "Christian" }));
        jPanel3.add(religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 280, 40));

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Other", "General", "OBC", "SC", "T", "OEC" }));
        category.setBorder(null);
        jPanel3.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 280, 40));

        income.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NULL", "< 1,50,000", "< 2,50,0000", "< 5,00,000", "Upto 10,00,000" }));
        income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeActionPerformed(evt);
            }
        });
        jPanel3.add(income, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 280, 40));

        eduqual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Other", "Non-Graduation", "Graduation", "Post-Graduation", "Doctrate", " " }));
        jPanel3.add(eduqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 280, 40));

        eno.setBackground(new java.awt.Color(255, 255, 255));
        eno.setText("No");
        jPanel3.add(eno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, -1, -1));

        eyes.setBackground(new java.awt.Color(255, 255, 255));
        eyes.setText("Yes");
        jPanel3.add(eyes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, -1));

        syes.setBackground(new java.awt.Color(255, 255, 255));
        syes.setText("Yes");
        jPanel3.add(syes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, -1, -1));

        sno.setBackground(new java.awt.Color(255, 255, 255));
        sno.setText("No");
        jPanel3.add(sno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, -1, -1));

        Applicationlabal.setFont(new java.awt.Font("Mukti Narrow", 1, 18)); // NOI18N
        Applicationlabal.setText("Page 2 : Personal Details");
        jPanel3.add(Applicationlabal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -50, 720, 660));

        jLabel15.setBackground(new java.awt.Color(25, 24, 37));
        jLabel15.setFont(new java.awt.Font("Abyssinica SIL", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(25, 24, 37));
        jLabel15.setText("ASPER BANK");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, -1));

        jButton1.setBackground(new java.awt.Color(105, 51, 151));
        jButton1.setFont(new java.awt.Font("aakar", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asper/bank/images/small_logo-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asper/bank/images/[removal.ai]_tmp-62c196dbd1e08.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, 350, -1));

        Back.setForeground(new java.awt.Color(46, 138, 243));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asper/bank/images/Untitled design (5).png"))); // NOI18N
        Back.setAlignmentX(5.0F);
        Back.setAlignmentY(5.0F);
        Back.setBorder(null);
        Back.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Back.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Back.setMargin(new java.awt.Insets(5, 14, 5, 14));
        Back.setPreferredSize(new java.awt.Dimension(50, 50));
        Back.setVerifyInputWhenFocusTarget(false);
        Back.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, -3, 42, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asper/bank/images/regisbackground.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(1270, 675));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pannoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pannoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pannoActionPerformed

    private void aadnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
        String sql = "Select * from account.Account";
        String sreligion = (String) religion.getSelectedItem();
        String scategory= (String) category.getSelectedItem();
        String sincome= (String) income.getSelectedItem();
        String seducation= (String) eduqual.getSelectedItem();
        String soccupation= (String)occupation.getSelectedItem();
        
        
        String senior_citizen =null;
        if (syes.isSelected())
        {
            senior_citizen = "YES";
        }
        else if (sno.isSelected())
        {
            senior_citizen = "NO";
        }
        
   
        String Exisiting_account =null;
        if (eyes.isSelected())
        {
            Exisiting_account = "YES";
        }
        else if (eno.isSelected())
        {
            Exisiting_account = "NO";
        }
        String span=panno.getText();
        String saadhar=aadno.getText();
        
        try
        {
          if((religion.equals(""))||(category.equals(""))||(income.equals(""))||(eduqual.equals(""))||(occupation.equals(""))||(senior_citizen.equals(""))||(Exisiting_account.equals(""))||(panno.equals(""))||(aadno.equals(""))){
              JOptionPane.showMessageDialog(null,"Every field is reqiured");
          }
      
          else
          {
              
              int i=JOptionPane.showConfirmDialog(null, "Are you sure to continue","Confirmation Box",JOptionPane.YES_NO_OPTION);
              if(i==0)
              {
              conn c = new  conn();
              String query = "insert into accounts values('"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+senior_citizen+"','"+Exisiting_account+"','"+span+"','"+saadhar+"')";
              c.s.executeUpdate(query);
              
       
              }
                setVisible(false);
                new Registrationthree().setVisible(true);
          }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void incomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Registrationone().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Registrationtwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrationtwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrationtwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrationtwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrationtwo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Applicationlabal;
    private javax.swing.JButton Back;
    private javax.swing.JTextField aadno;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JComboBox<String> eduqual;
    private javax.swing.JRadioButton eno;
    private javax.swing.JRadioButton eyes;
    private javax.swing.JComboBox<String> income;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> occupation;
    private javax.swing.JTextField panno;
    private javax.swing.JComboBox<String> religion;
    private javax.swing.JRadioButton sno;
    private javax.swing.JRadioButton syes;
    // End of variables declaration//GEN-END:variables
}