/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package botique.system;
import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Admin
 */
public class frmCustomerDetails extends javax.swing.JFrame {
String sqlcode;
long refid;
Connection conn;
ResultSet rs= null;
Statement stmt =null;

    /**
     * Creates new form frmCustomerDetails
     */
    public frmCustomerDetails() {
        initComponents();
        conn=BotiqueSystem.conn_db();
        loadcustomer();
        btncancelActionPerformed(null);
        Timer t= new Timer(1000, dateTime);  
        t.start();
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbtindi);
        bg.add(rbtnonindi);
        rbtnonindi.setSelected(true);
        gpindi.setEnabled(false);
        txtfname.setEnabled(false);
        txtmname.setEnabled(false);
        txtlname.setEnabled(false);
        txtcustomercode.setText("CUS"+BotiqueSystem.nextCustomerCode());
    }

    public void loadcustomer(){
        sqlcode="select * from tblcustomer";
        DefaultTableModel dtm = new DefaultTableModel(){ public boolean isCellEditable(int rowIndex, int colIndex){return false;}};
        dtm.addColumn("ID");
        dtm.addColumn("Code");
        //dtm.addColumn("Fisrtname");
        dtm.addColumn("Name");
        
        //dtm.addColumn("Lastname");
        //dtm.addColumn("Zone");
        dtm.addColumn("Street");
        dtm.addColumn("City");
        dtm.addColumn("Province");
        try {
            rs= BotiqueSystem.selectquery(sqlcode, conn);
            while(rs.next()){
                dtm.addRow(new Object[]{
                rs.getString("fld_customer_id"),
                    rs.getString("fld_customer_code"),
                     rs.getString("fld_fname")+" "
                     +rs.getString("fld_mname")+" "
                   + rs.getString("fld_lname"),
                   // rs.getString("fld_zone"),
                    rs.getString("fld_st"),
                    rs.getString("fld_city"),
                    rs.getString("fld_province")
                            });
                        }
            tblcustomer.setModel(dtm);
            rs.close();
            hidecolumn();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcustomer = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnselectcustomer = new javax.swing.JButton();
        btncancelselection = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcustomercode = new javax.swing.JTextField();
        txtstreet = new javax.swing.JTextField();
        txtprovince = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        rbtindi = new javax.swing.JRadioButton();
        rbtnonindi = new javax.swing.JRadioButton();
        gpnonindi = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtnoninvi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        gpindi = new javax.swing.JPanel();
        txtmname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 288, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Selecet Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblcustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblcustomer.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcustomerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblcustomerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblcustomerMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblcustomer);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 402));

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 140, 30));

        jLabel10.setText("Search Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 20));

        btnselectcustomer.setText("Select");
        btnselectcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectcustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btnselectcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 90, 40));

        btncancelselection.setText("Cancel");
        btncancelselection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelselectionActionPerformed(evt);
            }
        });
        jPanel1.add(btncancelselection, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 500, 540));

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel12.setText("Select/Register Customer");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbluser.setText("Welcome");
        jPanel4.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbldate.setText("Welcome");
        jPanel4.add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Welcome");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbltime.setText("Welcome");
        jPanel4.add(lbltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 920, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Customer Code");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        jLabel6.setText("Street");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel7.setText("City");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 90, -1));

        jLabel8.setText("Province");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        txtcustomercode.setEditable(false);
        txtcustomercode.setFocusable(false);
        jPanel2.add(txtcustomercode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 83, -1));

        txtstreet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstreetKeyReleased(evt);
            }
        });
        jPanel2.add(txtstreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, -1));

        txtprovince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprovinceActionPerformed(evt);
            }
        });
        txtprovince.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprovinceKeyReleased(evt);
            }
        });
        jPanel2.add(txtprovince, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 180, -1));

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
        jPanel2.add(txtcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 150, -1));

        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 170, 40));

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 170, 40));

        rbtindi.setText("Individual");
        rbtindi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtindiItemStateChanged(evt);
            }
        });
        jPanel2.add(rbtindi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        rbtnonindi.setText("Non Individual");
        rbtnonindi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnonindiItemStateChanged(evt);
            }
        });
        rbtnonindi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnonindiActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnonindi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        gpnonindi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Non Individual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N
        gpnonindi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Non Individual");
        gpnonindi.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtnoninvi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnoninviKeyReleased(evt);
            }
        });
        gpnonindi.add(txtnoninvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, -1));

        jLabel13.setText("Name");
        gpnonindi.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel2.add(gpnonindi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 320, 80));

        gpindi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Individual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N
        gpindi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmnameActionPerformed(evt);
            }
        });
        txtmname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmnameKeyReleased(evt);
            }
        });
        gpindi.add(txtmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 82, -1));

        jLabel4.setText("Middlename");
        gpindi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        txtfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfnameKeyReleased(evt);
            }
        });
        gpindi.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 83, -1));

        jLabel3.setText("Firstname");
        gpindi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        txtlname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlnameKeyReleased(evt);
            }
        });
        gpindi.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 83, -1));

        jLabel2.setText("Lastname");
        gpindi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel2.add(gpindi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 320, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 410, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void hidecolumn() {
       
        TableColumn col = tblcustomer.getColumnModel().getColumn(0);
        col.setPreferredWidth(0);
        col.setMaxWidth(0);
        col.setMinWidth(0);
        
        col.setPreferredWidth(0);
        col.setMaxWidth(0);
        col.setMinWidth(0);
        col = tblcustomer.getColumnModel().getColumn(2);
        col.setPreferredWidth(100);
        col.setMaxWidth(200);
        col.setMinWidth(200);
}
    private void tblcustomerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomerMousePressed
        if (tblcustomer.getSelectedRowCount()>0) {
           // btndelete.setEnabled(true);
           // btnregister.setEnabled(true);
        }
        else{
            //btndelete.setEnabled(false);
            //btnregister.setEnabled(false);
        }
        
//        if (btnedit.getText().equals("Update")) {
//            JOptionPane.showMessageDialog(null, "Finish Update/Cancel transaction first!");
//            btnedit.requestFocus();
//        }
//        else{
//                    if (tblcustomer.getSelectedRowCount()>0) {
//                    refid=Integer.parseInt(tblcustomer.getValueAt(tblcustomer.getSelectedRow(), 0).toString());
//                    btnedit.setEnabled(true);
//                    btndelete.setEnabled(true);
//
//                }
//                else{
//                refid=0;
//                 btnedit.setEnabled(false);
//                    btndelete.setEnabled(false);
//                }
//    }

    }//GEN-LAST:event_tblcustomerMousePressed

    private void tblcustomerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomerMouseReleased
       
    }//GEN-LAST:event_tblcustomerMouseReleased
public void deletecode(){
    
//        if (tblcustomer.getSelectedRowCount()>0) 
//        {
//                     if (JOptionPane.showConfirmDialog(null, "Delete selecte item?", "Deleting",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
//                sqlcode="delete from tblcustomer where fld_customer_id="+ tblcustomer.getValueAt(tblcustomer.getSelectedRow(), 0).toString()+"";
//               if (BotiqueSystem.addupdatedel(sqlcode, conn)) {
//                   JOptionPane.showMessageDialog(null, "Deleted!");
//                   loadcustomer();
//                   btncancelActionPerformed(evt);
//               }
//                    }
//                else {
//                    JOptionPane.showMessageDialog(null, "No item selected!");
//                }
//        }
//        else{
//            btncancelActionPerformed(evt);
//        }
}
    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        if (txtsearch.getText().trim().equals("")) {
            loadcustomer();
        }
        else{
            sqlcode="select * from tblcustomer where fld_fname like '%"+ txtsearch.getText() +"%' OR fld_mname like '%"+ txtsearch.getText() +"%' "
                + "OR fld_lname like '%"+ txtsearch.getText() +"%'";
        DefaultTableModel dtm = new DefaultTableModel(){ public boolean isCellEditable(int rowIndex, int colIndex){return false;}};
        dtm.addColumn("ID");
        dtm.addColumn("Code");
        //dtm.addColumn("Fisrtname");
        dtm.addColumn("Name");
        
        //dtm.addColumn("Lastname");
        //dtm.addColumn("Zone");
        dtm.addColumn("Street");
        dtm.addColumn("City");
        dtm.addColumn("Province");
        try {
            rs= BotiqueSystem.selectquery(sqlcode, conn);
            while(rs.next()){
                dtm.addRow(new Object[]{
                rs.getString("fld_customer_id"),
                    rs.getString("fld_customer_code"),
                     rs.getString("fld_fname")+" "
                     +rs.getString("fld_mname")+" "
                   + rs.getString("fld_lname"),
                    rs.getString("fld_zone"),
                    rs.getString("fld_st"),
                    rs.getString("fld_city"),
                    rs.getString("fld_province")
                            });
                        }
            tblcustomer.setModel(dtm);
            rs.close();
            hidecolumn();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        }
        
    }//GEN-LAST:event_txtsearchKeyReleased

    
    private void btnselectcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectcustomerActionPerformed
        try {
                 if (tblcustomer.getSelectedRowCount()>0) {
                 frmCreateInvoice.txtcustomercode.setText(tblcustomer.getValueAt(tblcustomer.getSelectedRow(), 1).toString());
                 frmCreateInvoice.txtcustomerdetails.setText(tblcustomer.getValueAt(tblcustomer.getSelectedRow(),2).toString()+ "\n"
                         +tblcustomer.getValueAt(tblcustomer.getSelectedRow(),3).toString()+" "+tblcustomer.getValueAt(tblcustomer.getSelectedRow(),4).toString()+"\n"
                         +tblcustomer.getValueAt(tblcustomer.getSelectedRow(),5).toString()
                 );

                 //            frmPO.txtposup.setText(tblcustomer.getValueAt(tblcustomer.getSelectedRow(),3).toString());
                 //            frmCreateInvoice.supstreet=tblcustomer.getValueAt(tblcustomer.getSelectedRow(),4).toString();
                 //             frmCreateInvoice.supcity=tblcustomer.getValueAt(tblcustomer.getSelectedRow(),5).toString();
                 //             frmCreateInvoice.supprov=tblcustomer.getValueAt(tblcustomer.getSelectedRow(),6).toString();
                 this.dispose();
             }
             else{
                 JOptionPane.showMessageDialog(null, "No Selection");
             } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not applicable");
            btnselectcustomer.setEnabled(false);
        }

    }//GEN-LAST:event_btnselectcustomerActionPerformed

    private void btncancelselectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelselectionActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelselectionActionPerformed

    private void tblcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomerMouseClicked
        if (evt.getClickCount()==2) {
            btnselectcustomerActionPerformed(null);
        }
    }//GEN-LAST:event_tblcustomerMouseClicked

    private void txtlnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlnameKeyReleased
        if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
            //do nothing
        }
        else{ txtlname.setText(BotiqueSystem.toTitleCase(txtlname.getText()));}
    }//GEN-LAST:event_txtlnameKeyReleased

    private void txtfnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnameKeyReleased
        if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
            //do nothing
        }
        else{txtfname.setText(BotiqueSystem.toTitleCase(txtfname.getText())); }       // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameKeyReleased

    private void txtmnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmnameKeyReleased
        if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
            //do nothing
        }
        else{txtmname.setText(BotiqueSystem.toTitleCase(txtmname.getText()));}// TODO add your handling code here:
    }//GEN-LAST:event_txtmnameKeyReleased

    private void txtmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmnameActionPerformed

    private void txtnoninviKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoninviKeyReleased
        if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
            //do nothing
        }
        else{ txtnoninvi.setText(BotiqueSystem.toTitleCase(txtnoninvi.getText()));}
    }//GEN-LAST:event_txtnoninviKeyReleased

    private void rbtnonindiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnonindiItemStateChanged
        if (rbtnonindi.isSelected()) {
            gpnonindi.setEnabled(true);
        }
        else{
            gpnonindi.setEnabled(false);
        }
    }//GEN-LAST:event_rbtnonindiItemStateChanged

    private void rbtindiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtindiItemStateChanged
        if (rbtindi.isSelected()) {
            gpindi.setEnabled(true);
            txtfname.setEnabled(true);
            txtmname.setEnabled(true);
            txtlname.setEnabled(true);
            txtnoninvi.setEnabled(false);
        }
        else{
            gpindi.setEnabled(false);
            txtfname.setEnabled(false);
            txtmname.setEnabled(false);
            txtlname.setEnabled(false);
            txtnoninvi.setEnabled(true);
        }
    }//GEN-LAST:event_rbtindiItemStateChanged

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        txtcustomercode.setEditable(true);
        // btnedit.setText("Edit");
        txtfname.setText(null);
        txtmname.setText(null);
        txtlname.setText(null);
        //txtzone.setText(null);
        txtstreet.setText(null);
        txtcity.setText(null);
        txtprovince.setText(null);
        txtcustomercode.setText(null);
        txtnoninvi.setText(null);

        //btndelete.setEnabled(false);
        //btnedit.setEnabled(false);
        btnregister.setEnabled(true);
        txtcustomercode.setText("CUS"+BotiqueSystem.nextCustomerCode());

        loadcustomer();
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtcityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcityKeyReleased
        if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
            //do nothing
        }
        else{txtcity.setText(BotiqueSystem.toTitleCase(txtcity.getText()));}
    }//GEN-LAST:event_txtcityKeyReleased

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed

    private void txtprovinceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprovinceKeyReleased
        if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
            //do nothing
        }
        else{txtprovince.setText(BotiqueSystem.toTitleCase(txtprovince.getText())); }       // TODO add your handling code here:
    }//GEN-LAST:event_txtprovinceKeyReleased

    private void txtprovinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprovinceActionPerformed
        btnregisterActionPerformed(evt);
    }//GEN-LAST:event_txtprovinceActionPerformed

    private void txtstreetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstreetKeyReleased
        if ((evt.getKeyCode()==KeyEvent.VK_LEFT) || (evt.getKeyCode()==KeyEvent.VK_RIGHT)|| (evt.getKeyCode()==KeyEvent.VK_BACKSPACE)) {
            //do nothing
        }
        else{txtstreet.setText(BotiqueSystem.toTitleCase(txtstreet.getText()));}
    }//GEN-LAST:event_txtstreetKeyReleased
    
    
@SuppressWarnings("empty-statement")
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        
        String name="";
        String[] text= {txtcity.getText().trim(), txtstreet.getText().trim(), txtprovince.getText().trim()};
        if (BotiqueSystem.isTextEmpty(text)) {
             JOptionPane.showMessageDialog(null, "Null input not allowed");
        }
        else{
           

            if (rbtindi.isSelected()) {
                     
               String[] text2={txtlname.getText().trim(), txtfname.getText().trim(), txtmname.getText().trim()};
               
                     if (BotiqueSystem.isTextEmpty(text2)) {
                         JOptionPane.showMessageDialog(null, "Null imput not allowed");
                         return;
                     }
                     else{
                         name=", fld_lname='"+ txtlname.getText().trim() +"', "
                            + "fld_fname='"+ txtfname.getText().trim() +"', "
                            + "fld_mname='"+ txtmname.getText().trim() +"'";
                     }

            }
            else {
                    if (txtnoninvi.getText().trim().equals("")) {
                       JOptionPane.showMessageDialog(null, "Null imput not allowed");
                       return;
                   }
                    else{
                      name=", fld_mname='"+ txtnoninvi.getText().trim() +"'";  
                    }

        }
        sqlcode = "insert into tblcustomer set "
                + "fld_customer_code='"+ txtcustomercode.getText() +"', "
                + "fld_st='"+ txtstreet.getText().trim() +"', "
                + "fld_city='"+ txtcity.getText().trim() +"', "
                + "fld_province='"+ txtprovince.getText().trim() +"'"+name;
                if (BotiqueSystem.addupdatedel(sqlcode, conn)) {
                JOptionPane.showMessageDialog(null, "Registered!");
                loadcustomer();
            }
            }
        
    }//GEN-LAST:event_btnregisterActionPerformed

    private void rbtnonindiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnonindiActionPerformed
      
    }//GEN-LAST:event_rbtnonindiActionPerformed
  ActionListener dateTime =new  ActionListener() {
            
          
      @Override
      public void actionPerformed(ActionEvent e) {
          SimpleDateFormat df=new SimpleDateFormat("M-dd-yyyy");
          SimpleDateFormat df2 = new SimpleDateFormat("EEEE");
          SimpleDateFormat df3 = new SimpleDateFormat("hh:mm:ss a");
           Date now= new Date();
          String strdate= df.format(new Date());
          String strday= df2.format(now);
          
          String strtime= df3.format(now);
          
          lbltime.setText(strtime);
           lbldate.setText(strdate+", "+strday);//To change body of generated methods, choose Tools | Templates.
      }
  };
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
            java.util.logging.Logger.getLogger(frmCustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCustomerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncancelselection;
    private javax.swing.JButton btnregister;
    public static javax.swing.JButton btnselectcustomer;
    private javax.swing.JPanel gpindi;
    private javax.swing.JPanel gpnonindi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbltime;
    private javax.swing.JLabel lbluser;
    private javax.swing.JRadioButton rbtindi;
    private javax.swing.JRadioButton rbtnonindi;
    private javax.swing.JTable tblcustomer;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcustomercode;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmname;
    private javax.swing.JTextField txtnoninvi;
    private javax.swing.JTextField txtprovince;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtstreet;
    // End of variables declaration//GEN-END:variables
}
