/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asper.bank;

import com.mysql.cj.Query;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
import javax.swing.JTextField;





/** 
 *
 * @author remix_alpha
 *
 */
public class Registrationone extends javax.swing.JFrame {
    

    /**
     * Creates new form Registrationone
     */
    Connection c;
    public Registrationone() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        accname = new javax.swing.JTextField();
        accfathname = new javax.swing.JTextField();
        accemail = new javax.swing.JTextField();
        accadress = new javax.swing.JTextField();
        acccity = new javax.swing.JTextField();
        accpin = new javax.swing.JTextField();
        Applicationlabal = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        accstate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Unnmarried = new javax.swing.JRadioButton();
        unmarried = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        dob = new com.toedter.calendar.JDateChooser();
        married1 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nextjButton = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asper/bank/images/Online_payments_re_y8f2-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 150, 500, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asper/bank/images/Mobile_pay_re_sjb8-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 450, 390));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yrsa SemiBold", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 12, 42));
        jLabel3.setText("Create new account");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel4.setText("Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 172, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel5.setText("Father's Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 227, -1, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel6.setText("Date of Birth");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 276, -1, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel7.setText("Email Address");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 358, -1, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel8.setText("Genter");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel9.setText("Address");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 472, -1, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel10.setText("City");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 516, -1, -1));

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel11.setText("State");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 560, -1, -1));

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel12.setText("Pin Code");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 604, -1, -1));

        accname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accnameActionPerformed(evt);
            }
        });
        jPanel3.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 165, 276, 33));

        accfathname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accfathnameActionPerformed(evt);
            }
        });
        jPanel3.add(accfathname, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 220, 276, 33));

        accemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accemailActionPerformed(evt);
            }
        });
        jPanel3.add(accemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 350, 276, 34));

        accadress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accadressActionPerformed(evt);
            }
        });
        jPanel3.add(accadress, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 464, 276, 34));

        acccity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acccityActionPerformed(evt);
            }
        });
        jPanel3.add(acccity, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 508, 276, 34));

        accpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accpinActionPerformed(evt);
            }
        });
        jPanel3.add(accpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 596, 276, 34));

        Applicationlabal.setFont(new java.awt.Font("Mukti Narrow", 1, 18)); // NOI18N
        Applicationlabal.setText("Page 1 : Personal Details");
        jPanel3.add(Applicationlabal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        male.setBackground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel3.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 318, -1, -1));

        female.setBackground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel3.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 318, -1, -1));

        accstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accstateActionPerformed(evt);
            }
        });
        jPanel3.add(accstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 552, 276, 34));

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 3, 15)); // NOI18N
        jLabel13.setText("Marital status");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 392, -1, -1));

        Unnmarried.setBackground(new java.awt.Color(255, 255, 255));
        Unnmarried.setText("Unmarried");
        Unnmarried.setPreferredSize(new java.awt.Dimension(70, 22));
        jPanel3.add(Unnmarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 94, -1));

        unmarried.setBackground(new java.awt.Color(255, 255, 255));
        unmarried.setText("Unmarried");
        jPanel3.add(unmarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 104, -1));

        other.setBackground(new java.awt.Color(255, 255, 255));
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        jPanel3.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 430, 72, -1));
        jPanel3.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 271, 276, 29));

        married1.setBackground(new java.awt.Color(255, 255, 255));
        married1.setText("Married");
        married1.setPreferredSize(new java.awt.Dimension(70, 22));
        jPanel3.add(married1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 390, 94, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, -30, 520, 640));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asper/bank/images/small logo.jpg"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel15.setBackground(new java.awt.Color(25, 24, 37));
        jLabel15.setFont(new java.awt.Font("Abyssinica SIL", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(25, 24, 37));
        jLabel15.setText("ASPER BANK");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, -1));

        nextjButton.setBackground(new java.awt.Color(105, 51, 151));
        nextjButton.setFont(new java.awt.Font("aakar", 1, 15)); // NOI18N
        nextjButton.setForeground(new java.awt.Color(255, 255, 255));
        nextjButton.setText("Next");
        nextjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(nextjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, 90, 30));

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
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 42, 97));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 520, 510));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asper/bank/images/regisbackground.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1274, 650));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accadressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accadressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accadressActionPerformed

    private void acccityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acccityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acccityActionPerformed

    private void accpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accpinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accpinActionPerformed

    private void accnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accnameActionPerformed

    private void nextjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextjButtonActionPerformed
        // TODO add your handling code here:
          
       
        

        String Name=accname.getText();
        String f_name=accfathname.getText();
        String DOB=((JTextField) dob.getDateEditor().getUiComponent()).getText();
        
        
        String gender =null;
        if (male.isSelected())
        {
            gender = "Male";
        }
        else if (female.isSelected())
        {
            gender = "Female";
        }
        
        
        String Email_Address=accemail.getText();
       
        
        String Marital_status =null;
        if (Unnmarried.isSelected())
        {
            Marital_status = "Married";
        }
        else if (unmarried.isSelected())
        {
            Marital_status = "Unmarried";
        }
            
        else if (other.isSelected())
        {
            Marital_status = "Other";
        }
        
        
        String Address=accadress.getText();
        String city=acccity.getText();
        String state=accstate.getText();
        String pincode=accpin.getText();
        
        
        try
        {
          if((Name.equals(""))||(f_name.equals(""))||(DOB.equals(""))||(gender.equals(""))||(Email_Address.equals(""))||(Marital_status.equals(""))||(Address.equals(""))||(city.equals(""))||(state.equals(""))||(pincode.equals(""))){
              JOptionPane.showMessageDialog(null,"Every field is reqiured");
          }
      
          else
          {
              
              int i=JOptionPane.showConfirmDialog(null, "Are you sure to continue","Confirmation Box",JOptionPane.YES_NO_OPTION);
              if(i==0)
              {
              conn c = new  conn();
              String query = "insert into regone values('"+Name+"','"+f_name+"','"+DOB+"','"+gender+"','"+Email_Address+"','"+Marital_status+"','"+Address+"','"+city+"','"+state+"','"+pincode+"')";
              c.s.executeUpdate(query);
             
       
                setVisible(false);
                new Registrationtwo().setVisible(true);
              }
                
          }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        
          
      
        
    }//GEN-LAST:event_nextjButtonActionPerformed

    private void accfathnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accfathnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accfathnameActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void accstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accstateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accstateActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherActionPerformed

    private void accemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accemailActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Sidehome().setVisible(true);
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
      
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registrationone().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Applicationlabal;
    private javax.swing.JButton Back;
    private javax.swing.JRadioButton Unnmarried;
    private javax.swing.JTextField accadress;
    private javax.swing.JTextField acccity;
    private javax.swing.JTextField accemail;
    private javax.swing.JTextField accfathname;
    private javax.swing.JTextField accname;
    private javax.swing.JTextField accpin;
    private javax.swing.JTextField accstate;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton married1;
    private javax.swing.JButton nextjButton;
    private javax.swing.JRadioButton other;
    private javax.swing.JRadioButton unmarried;
    // End of variables declaration//GEN-END:variables

}