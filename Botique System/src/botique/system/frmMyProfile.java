/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package botique.system;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmMyProfile extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs= null;
    /**
     * Creates new form frmMyProfile
     */
    public frmMyProfile() {
        initComponents();
        txtuname.setEditable(false);
        conn=BotiqueSystem.conn_db();
        lbluser.setText(BotiqueSystem.user);
        loaduser();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtblockno = new javax.swing.JTextField();
        txtcontactno = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtlotno = new javax.swing.JTextField();
        txtzone = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        txtprovince = new javax.swing.JTextField();
        txtstreet = new javax.swing.JTextField();
        txtuname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnregister1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnregister = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtnewpass2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtnewpass = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        txtoldpass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Register User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Contact no.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel2.setText("Lastname");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setText("Firstname");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel5.setText("Zone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setText("Street");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel7.setText("Lot no");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel8.setText("Block no");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel9.setText("City");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        txtblockno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtblockno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtblocknoKeyPressed(evt);
            }
        });
        jPanel1.add(txtblockno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 130, -1));

        txtcontactno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 160, -1));

        txtlname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtlname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlnameKeyReleased(evt);
            }
        });
        jPanel1.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, -1));

        txtfname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfnameKeyReleased(evt);
            }
        });
        jPanel1.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, -1));

        txtlotno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtlotno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlotnoActionPerformed(evt);
            }
        });
        txtlotno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlotnoKeyPressed(evt);
            }
        });
        jPanel1.add(txtlotno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 50, -1));

        txtzone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtzone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtzoneKeyPressed(evt);
            }
        });
        jPanel1.add(txtzone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, -1));

        txtcity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });
        txtcity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcityKeyReleased(evt);
            }
        });
        jPanel1.add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 230, -1));

        txtprovince.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtprovince.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprovinceKeyReleased(evt);
            }
        });
        jPanel1.add(txtprovince, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, -1));

        txtstreet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtstreet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtstreetMouseReleased(evt);
            }
        });
        txtstreet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstreetKeyReleased(evt);
            }
        });
        jPanel1.add(txtstreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 160, -1));

        txtuname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 140, -1));

        jLabel10.setText("Province");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        btnregister1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregister1.setText("Save");
        btnregister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregister1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnregister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Change password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregister.setText("Change");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, 50));

        jLabel12.setText("Re-type New Password");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel2.add(txtnewpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        jLabel4.setText("New Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel2.add(txtnewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, -1));

        jLabel14.setText("Old Password");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel2.add(txtoldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 200, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 780, 460));

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel13.setText("User's Profile");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbluser.setText("Welcome");
        jPanel4.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Welcome");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        String[] textboxes ={ txtoldpass.getText().trim(), txtnewpass.getText().trim(), txtnewpass2.getText().trim()};
        if ((BotiqueSystem.isTextEmpty(textboxes))) {

            JOptionPane.showMessageDialog(null, "Check Empty Textbox");
        }
        else if (!(txtoldpass.getText().trim().equals(BotiqueSystem.loginpass))) {
            JOptionPane.showMessageDialog(null, "Invalid Old password!");
            txtoldpass.setText("");
            txtoldpass.requestFocus();
            
        }
        else if (!(txtnewpass.getText().trim().equals(txtnewpass2.getText().trim()))) {
            JOptionPane.showMessageDialog(null, "New password mismatched!");
            txtnewpass.setText("");
             txtnewpass2.setText("");
             txtnewpass.requestFocus();
        }
        else{
           
                sqlcode="update tbluseraccount set fld_password='"+ txtnewpass.getText().trim() +"'"
                // + "fld_username='"+ txtuname.getText() +"', "
                
              
                + "where "
                + "fld_username='"+ txtuname.getText() +"'" ;
            
            if (BotiqueSystem.addupdatedel(sqlcode, conn)) {
                JOptionPane.showMessageDialog(null, "Save!");
            }
        }
    }//GEN-LAST:event_btnregisterActionPerformed
String sqlcode;
    private void txtstreetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstreetKeyReleased
        if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
         //do nothing
         }
        else{ txtstreet.setText(BotiqueSystem.toTitleCase(txtstreet.getText()));}
    }//GEN-LAST:event_txtstreetKeyReleased
public void loaduser(){
          
                
                
               sqlcode="select * from tblusers where fld_username='"+ lbluser.getText() +"'" ;
            try {
                  rs=BotiqueSystem.selectquery(sqlcode, conn);
                  
                while (rs.next()) {
                    
                        
                       txtuname.setText(rs.getString("fld_username")); 
                        txtlname.setText(rs.getString("fld_lname"));
                            txtfname.setText(rs.getString("fld_fname"));
                            
                             txtzone.setText(rs.getString("fld_zone"));
                            txtlotno.setText(rs.getString("fld_lotno"));
                            txtblockno.setText(rs.getString("fld_blockno"));
                            txtstreet.setText(rs.getString("fld_street"));
                            txtcity.setText(rs.getString("fld_city"));
                           txtprovince.setText( rs.getString("fld_province"));
                           txtcontactno.setText( rs.getString("fld_contactno"));
                            
                            
                            
                          
                    
               
                                  }
              
                //hidecolumn();
                rs.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
              
                
                
            
            
            
            
    }
    private void txtstreetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtstreetMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstreetMouseReleased

    private void txtprovinceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprovinceKeyReleased
         if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
         //do nothing
         }
        else{txtprovince.setText(BotiqueSystem.toTitleCase(txtprovince.getText()));}
    }//GEN-LAST:event_txtprovinceKeyReleased

    private void txtcityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcityKeyReleased
         if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
         //do nothing
         }
        else{txtcity.setText(BotiqueSystem.toTitleCase(txtcity.getText()));}
    }//GEN-LAST:event_txtcityKeyReleased

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed

    private void txtzoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtzoneKeyPressed
        if (BotiqueSystem.isNumber(evt)) {
            txtzone.setText("");
            txtzone.requestFocus();
        }
    }//GEN-LAST:event_txtzoneKeyPressed

    private void txtlotnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlotnoKeyPressed
        if (BotiqueSystem.isNumber(evt)) {
            txtlotno.setText("");
            txtlotno.requestFocus();
        }
    }//GEN-LAST:event_txtlotnoKeyPressed

    private void txtlotnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlotnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlotnoActionPerformed

    private void txtfnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnameKeyReleased
         if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
         //do nothing
         }
        else{txtfname.setText(BotiqueSystem.toTitleCase(txtfname.getText()));}
    }//GEN-LAST:event_txtfnameKeyReleased

    private void txtlnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlnameKeyReleased
         if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
         //do nothing
         }
        else{txtlname.setText(BotiqueSystem.toTitleCase(txtlname.getText()));}
    }//GEN-LAST:event_txtlnameKeyReleased

    private void txtblocknoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtblocknoKeyPressed
        if (BotiqueSystem.isNumber(evt)) {
            txtblockno.setText("");
            txtblockno.requestFocus();
        }
    }//GEN-LAST:event_txtblocknoKeyPressed

    private void btnregister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregister1ActionPerformed
         String[] textboxes ={ txtcity.getText().trim(), 
            txtcontactno.getText().trim(),
            txtfname.getText().trim(),
            txtlname.getText().trim(), 
            //txtlotno.getText().trim(), 
            //txtblockno.getText().trim(),
            txtuname.getText().trim(),
            txtprovince.getText().trim(),
           // txtstreet.getText().trim(),
            //txtzone.getText().trim(),
            txtuname.getText().trim()
                
        };
        if ((BotiqueSystem.isTextEmpty(textboxes)) ) {
            
            JOptionPane.showMessageDialog(null, "Check for Empty Textbox"); 
            
        }
        else{
             sqlcode="update tblusers set "
                   // + "fld_username='"+ txtuname.getText() +"', "
                    + "fld_city='"+  txtcity.getText().trim() +"', "
                    + "fld_contactno='"+  txtcontactno.getText().trim() +"', "
                    + "fld_fname='"+ txtfname.getText().trim() +"', "
                    + "fld_lname='"+ txtlname.getText().trim() +"', "
                    + "fld_lotno='"+ txtlotno.getText().trim() +"', "
                    + "fld_blockno='"+  txtblockno.getText().trim() +"', "
                    //+ "fld_username='"+ txtuname.getText().trim() +"', "
                    + "fld_province='"+ txtprovince.getText().trim() +"', "
                    + " fld_street='"+  txtstreet.getText().trim() +"', "
                    + " fld_zone='"+ txtzone.getText().trim() +"' "
                    
                        + "where "
                        + "fld_username='"+ txtuname.getText() +"'" ;
            }
            if (BotiqueSystem.addupdatedel(sqlcode, conn)) {
                JOptionPane.showMessageDialog(null, "Success!");
                loaduser();
            }
        
    }//GEN-LAST:event_btnregister1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMyProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnregister1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField txtblockno;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtlotno;
    private javax.swing.JPasswordField txtnewpass;
    private javax.swing.JPasswordField txtnewpass2;
    private javax.swing.JPasswordField txtoldpass;
    private javax.swing.JTextField txtprovince;
    private javax.swing.JTextField txtstreet;
    private javax.swing.JTextField txtuname;
    private javax.swing.JTextField txtzone;
    // End of variables declaration//GEN-END:variables
}
