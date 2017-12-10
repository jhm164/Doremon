/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gear_final;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
/**
 *
 * @author saurabh
 */
public class bill extends javax.swing.JFrame {

    Connection con=null,c;
   ResultSet rs=null,r;
   PreparedStatement ps=null,p;
   public String fname1;
   public int p1=0;
   public int l1=0;
   public  String o=null;
   public static String dt;
    public bill() {
        initComponents();
    }

      public Connection getConnection(){
Connection con=null;
       
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/gearservice?zeroDateTimeBehavior=convertToNull","root","");
    //  JOptionPane.showMessageDialog(null,"connected");
           
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
       return con;
        
   }
      
      
      
      public int getcost(){
          int o=0;
          Connection c=getConnection();
        try {
            ps= c.prepareStatement("select tcost from service where cid=?");
            ps.setString(1,txt_vehicalnumber1.getText());
            rs=ps.executeQuery();
            while(rs.next()){
             o=  o+rs.getInt("tcost");
            }
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
          return o; 
          
      }
      
      
       public ResultSet find(String s) {
     Connection  con=getConnection();
     try{
     ps=con.prepareStatement("Select * from customer where vn=?");
         ps.setString(1, s);
    rs=ps.executeQuery();
  
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex);
   }
     return rs;
     
   }
       
       
       public void updatebill(){
           
        try {
            c=getConnection();
            p=c.prepareStatement("update customer set bill=0,paidstatus='paid' where vn=?" );
            
            p.setString(1,txt_vehicalnumber1.getText());
            p.executeUpdate();
           // JOptionPane.showMessageDialog(null, "bill paid");
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
      
      public void updatebill1(){
           
        try {
            c=getConnection();
            p=c.prepareStatement("update service set paidstatus='paid' where cid=?" );
            
            p.setString(1,txt_vehicalnumber1.getText());
            p.executeUpdate();
         JOptionPane.showMessageDialog(null, "bill paid");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
      
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txt_vehicalnumber1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        normal_s = new javax.swing.JRadioButton();
        normal_w_c = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        uid_num = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        gear_date = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_prise_description = new javax.swing.JTextField();
        txt_prise1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txt_price = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        gs = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(68, 66, 108));

        jLabel17.setFont(new java.awt.Font("URW Chancery L", 1, 34)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(246, 222, 222));
        jLabel17.setText("Gear Bill");

        txt_vehicalnumber1.setName(""); // NOI18N
        txt_vehicalnumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vehicalnumber1ActionPerformed(evt);
            }
        });

        jButton2.setText("Check Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(243, 229, 229));
        jLabel15.setText("Select Type of Servising");

        normal_s.setBackground(new java.awt.Color(68, 66, 108));
        buttonGroup1.add(normal_s);
        normal_s.setForeground(new java.awt.Color(245, 226, 226));
        normal_s.setText("Normal Servising");

        normal_w_c.setBackground(new java.awt.Color(68, 66, 108));
        buttonGroup1.add(normal_w_c);
        normal_w_c.setForeground(new java.awt.Color(246, 234, 234));
        normal_w_c.setText("Normal With customization");

        jLabel18.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(246, 230, 230));
        jLabel18.setText("Name");

        jLabel20.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(225, 214, 214));
        jLabel20.setText("UID number");

        uid_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uid_numActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(230, 213, 213));
        jLabel21.setText("Date");

        jLabel22.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(234, 213, 213));
        jLabel22.setText("Extra charges");

        txt_prise1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prise1ActionPerformed(evt);
            }
        });

        jButton3.setText("Calculate Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(245, 243, 243));
        jLabel19.setText("TOTAL");

        jButton1.setText("Print bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(246, 222, 222));
        jLabel23.setText("Enter Vehical number");

        jLabel24.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(234, 213, 213));
        jLabel24.setText("Extra charges");

        jLabel25.setFont(new java.awt.Font("URW Chancery L", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(234, 213, 213));
        jLabel25.setText("gear shop");

        gs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_vehicalnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(normal_s)
                                .addGap(59, 59, 59)
                                .addComponent(normal_w_c))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uid_num, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(gear_date, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_prise_description, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_prise1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gs, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(351, 351, 351)))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_vehicalnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(normal_s)
                    .addComponent(normal_w_c)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uid_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gear_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_prise_description, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_prise1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gs)
                        .addGap(6, 6, 6)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_vehicalnumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vehicalnumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vehicalnumber1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ResultSet rs=null;
        

        String fn="firast_name";
        String mn="middle_name";
        String ln="last_name";
        String cn="contact_number";
        String un="uid_number";
        String pn="permenent_address";
        String dt="Date";

        rs=find(txt_vehicalnumber1.getText());
        try {
           
            if(rs.next()){
                fname.setText(rs.getString("fname"));
                mname.setText(rs.getString("mname"));
                lname.setText(rs.getString("lname"));
                uid_num.setText(rs.getString("uidno"));
               gear_date.setText(rs.getString("todaydate"));

            }
           // fname.setText(rs.getString("firast_name"));

        } catch (Exception ex) {
            //  Logger.getLogger(gear_bill.class.getName()).log(Level.SEVERE, null, ex);
            fname.setText("");
            mname.setText("");
            lname.setText("");
            uid_num.setText("");
            gear_date.setText("");

            JOptionPane.showMessageDialog(null, "No Data For This NUMBER");

        }
        gear_bill_class gb=new gear_bill_class();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void uid_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uid_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uid_numActionPerformed

    private void txt_prise1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prise1ActionPerformed
        // TODO add your handling code here:
        //int i=0;
        // txt_prise1.setText("0"+i);
    }//GEN-LAST:event_txt_prise1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

     
        
        gs.setText("");
        if(normal_s.isSelected()){
            //  String p=txt_prise1.getText();
            p1 = Integer.parseInt(txt_prise1.getText());
            l1= p1+350+getcost();;
            
            o=Integer.toString(l1);
            // total_price.setText(o);

        }else if(normal_w_c.isSelected()){
            p1 = Integer.parseInt(txt_prise1.getText());
            l1= p1+550+getcost();
            o=Integer.toString(l1);

        }else{
            JOptionPane.showMessageDialog(null, "Please select any one option from above(Radio Button)");
        }
        txt_price.setText(o);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 updatebill();
  updatebill1();
           
        try {
            com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
            PdfWriter.getInstance(doc,new FileOutputStream("gearbillpdf16.pdf"));
            doc.open();
            doc.add(new Paragraph("---------------------------------- GEAR APP -----------------------------------")) ;
            doc.add(new Paragraph("_____________________________________________________________________________"));
            doc.add(new Paragraph("                                  BILL                                  ")) ;
            doc.add(new Paragraph("                                                              Date:-  "+gear_date.getText()        )) ;
            doc.add(new Paragraph("______________________________________________________________________________")) ;
            doc.add(new Paragraph("       "+" NAME          :"+fname.getText()+"  "+mname.getText()+"  "+lname.getText()));
            doc.add(new Paragraph("_____________________________________________________________________________")) ;
            doc.add(new Paragraph("          UID NUMBER      :"+uid_num.getText())) ;
            doc.add(new Paragraph("_____________________________________________________________________________")) ;
            doc.add(new Paragraph("          Vehical number     :"+txt_vehicalnumber1.getText())) ;
            doc.add(new Paragraph("_____________________________________________________________________________")) ;
            doc.add(new Paragraph("         "+"   Extra Services             "+"         "+txt_prise_description.getText())) ;
              doc.add(new Paragraph("         "+"   Gear Shop             "+"         "+getcost())) ;
            doc.add(new Paragraph("_____________________________________________________________________________")) ;
            doc.add(new Paragraph("         "+"  Extra Price         "+txt_prise1.getText())) ;
            //doc.add(new Paragraph("_____________________________________________________________________________")) ;
            //doc.add(new Paragraph("          UID NUMBER      :"+uid_num.getText())) ;
            doc.add(new Paragraph("__________________________________________________________________________ __")) ;
            if(normal_s.isSelected()||normal_w_c.isSelected()){
                
                doc.add(new Paragraph("        TOTAL              :"+txt_price.getText())) ;
                doc.add(new Paragraph("_____________________________________________________________________________")) ;
            }else{
                
                JOptionPane.showMessageDialog(null, "Please select any one option from above(Radio Button)");
            }
            doc.close();
            JOptionPane.showMessageDialog(null,"PDF Created Successfully!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
           

      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsActionPerformed
       
    }//GEN-LAST:event_gsActionPerformed

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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gear_date;
    private javax.swing.JTextField gs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JRadioButton normal_s;
    private javax.swing.JRadioButton normal_w_c;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_prise1;
    private javax.swing.JTextField txt_prise_description;
    private javax.swing.JTextField txt_vehicalnumber1;
    private javax.swing.JTextField uid_num;
    // End of variables declaration//GEN-END:variables
}
