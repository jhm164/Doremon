package gear_final;


import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurabh
 */
public class gear_form1 extends javax.swing.JFrame {

      Connection con=null;
   ResultSet rs=null;
   PreparedStatement ps=null;
   public String ImgPath;
   public String fname;
   public String mname;
   public String lname;
   public  String vn=null;
    public gear_form1() {
        initComponents();
    }
    
   

       public Connection getConnection(){
Connection con=null;
      
          try {
              con=DriverManager.getConnection("jdbc:mysql://localhost:3307/gearservice?zeroDateTimeBehavior=convertToNull","root","");
            JOptionPane.showMessageDialog(null,"connected");
          } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
              Logger.getLogger(gear_form1.class.getName()).log(Level.SEVERE, null, ex);
          }
           
            return con;
      
   }
   public boolean checkInpute(){
       if(txt_vehicalnumber.getText()==null||txt_first_name.getText()==null||txt_last_name.getText()==null||txt_middle_name.getText()==null||txt_contact_number.getText()==null||txt_uid_number.getText()==null||txt_permenent_address.getText()==null){
       
           JOptionPane.showMessageDialog(null, "one or more field is empty");
           return false;
   }else{
           return true;
       }
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
   
   
   public ImageIcon ResizeImage(String imagePath,byte[] pic){
      
      ImageIcon myImage=null;
      if(imagePath!=null){
          myImage=new ImageIcon(imagePath);
          
      }else{
          myImage=new ImageIcon(pic);
      }
      
      Image img=myImage.getImage();
      Image img2= img.getScaledInstance(lbl_image.getWidth(),lbl_image.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon image=new ImageIcon(img2);
    return image;
  }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_search_vehical_number = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txt_vehicalnumber = new javax.swing.JTextField();
        txt_first_name = new javax.swing.JTextField();
        txt_middle_name = new javax.swing.JTextField();
        txt_last_name = new javax.swing.JTextField();
        txt_contact_number = new javax.swing.JTextField();
        txt_uid_number = new javax.swing.JTextField();
        txt_residensial_address = new javax.swing.JTextField();
        txt_permenent_address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();
        btn_submit_data = new javax.swing.JButton();
        btn_choose_image = new javax.swing.JButton();
        txt_vehicalnumber1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(109, 98, 159));

        jPanel1.setBackground(new java.awt.Color(68, 66, 108));

        jPanel2.setBackground(new java.awt.Color(148, 138, 128));

        btn_search_vehical_number.setText("Search");
        btn_search_vehical_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_vehical_numberActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 204, 204));
        jLabel1.setText("Search by Vehical  number");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btn_search_vehical_number, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txt_vehicalnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(txt_vehicalnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_search_vehical_number, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_first_nameActionPerformed(evt);
            }
        });

        txt_middle_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_middle_nameActionPerformed(evt);
            }
        });

        txt_residensial_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_residensial_addressActionPerformed(evt);
            }
        });

        txt_permenent_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_permenent_addressActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 243, 243));
        jLabel2.setText(" First Name ");

        jLabel3.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 228, 228));
        jLabel3.setText(" Middle Name ");

        jLabel4.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 216, 216));
        jLabel4.setText("contact number");

        jLabel5.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 216, 216));
        jLabel5.setText("UID number");

        jLabel6.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(235, 216, 216));
        jLabel6.setText("Last Name");

        jLabel7.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 224, 224));
        jLabel7.setText("Residential address");

        jLabel8.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(227, 212, 212));
        jLabel8.setText("Permenent Address");

        lbl_image.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        lbl_image.setText("                             image not available");
        lbl_image.setOpaque(true);

        btn_submit_data.setText("create new");
        btn_submit_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submit_dataActionPerformed(evt);
            }
        });

        btn_choose_image.setText("Choose Image");
        btn_choose_image.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(236, 121, 121), new java.awt.Color(227, 102, 102), null, new java.awt.Color(102, 83, 83)));
        btn_choose_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_choose_imageActionPerformed(evt);
            }
        });

        txt_vehicalnumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vehicalnumber1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(235, 216, 216));
        jLabel9.setText("vehical number");

        rb1.setBackground(new java.awt.Color(88, 86, 102));
        buttonGroup1.add(rb1);
        rb1.setForeground(new java.awt.Color(243, 241, 241));
        rb1.setText("two wheeler");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        rb2.setBackground(new java.awt.Color(94, 93, 106));
        buttonGroup1.add(rb2);
        rb2.setForeground(new java.awt.Color(239, 232, 232));
        rb2.setText("four wheeler");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(68, 66, 108));
        jLabel10.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 228, 228));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/neg.png"))); // NOI18N
        jLabel10.setText(" Middle Name ");
        jLabel10.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(235, 216, 216));
        jLabel11.setText("Vehical type");

        jButton1.setText("Go for BILL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_permenent_address, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_residensial_address, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btn_submit_data, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(62, 62, 62))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb1)
                                .addGap(54, 54, 54)
                                .addComponent(rb2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_first_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_vehicalnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_middle_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_last_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_contact_number, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txt_uid_number, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(134, 134, 134)
                                    .addComponent(btn_choose_image))
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_middle_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txt_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txt_contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_choose_image, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_vehicalnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb1)
                            .addComponent(rb2)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_uid_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_residensial_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_permenent_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_submit_data, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_search_vehical_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_vehical_numberActionPerformed
        ResultSet rs=null;

        String fn="firast_name";
        String mn="middle_name";
        String ln="last_name";
        String cn="contact_number";
        String un="uid_number";
        String pn="permenent_address";
        rs=find(txt_vehicalnumber.getText());

       
          try {
              if(rs.next()){
                  txt_first_name.setText(rs.getString("fname"));
                  txt_middle_name.setText(rs.getString("mname"));
                  txt_last_name.setText(rs.getString("lname"));
                  txt_contact_number.setText(rs.getString("contact"));
                  txt_uid_number.setText(rs.getString("uidno"));
                  txt_permenent_address.setText(rs.getString("address"));
              }else{
                  JOptionPane.showMessageDialog(null, "No Data For This NUMBER");
              }
          } catch (SQLException ex) {
              Logger.getLogger(gear_form1.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
          
          
       
    }//GEN-LAST:event_btn_search_vehical_numberActionPerformed

    private void txt_first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_first_nameActionPerformed

    }//GEN-LAST:event_txt_first_nameActionPerformed

    private void txt_middle_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_middle_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_middle_nameActionPerformed

    private void txt_residensial_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_residensial_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_residensial_addressActionPerformed

    private void txt_permenent_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_permenent_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_permenent_addressActionPerformed

    private void btn_submit_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submit_dataActionPerformed
        if(checkInpute()){

            try {
                Connection con=getConnection();
                PreparedStatement ps= con.prepareStatement("INSERT INTO  customer(vn,fname,mname,lname,contact,uidno,address,wheel,image)VALUES(?,?,?,?,?,?,?,?,?)");
                ps.setString(1,txt_vehicalnumber1.getText());
                ps.setString(2,txt_first_name.getText());
                ps.setString(3,txt_middle_name.getText());
                ps.setString(4,txt_last_name.getText());
                ps.setString(5,txt_contact_number.getText());
                ps.setString(6,txt_uid_number.getText());
                ps.setString(7,txt_permenent_address.getText());
                if(rb1.isSelected()){
                     ps.setString(8,"two");
                }else if(rb2.isSelected()){
                    ps.setString(8,"four");
                }
                ps.setString(9, lbl_image.getText());
               

                //     InputStream img= new FileInputStream(new File((String) ImgPath));
                //     ps.setBlob(5,img);
                ps.executeUpdate();
                //   show_products_in_Jtable();
                JOptionPane.showMessageDialog(null,"Data entered");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }

        }else{
            JOptionPane.showMessageDialog(null,"One or More fields are empty");
        }
    }//GEN-LAST:event_btn_submit_dataActionPerformed

    private void btn_choose_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_choose_imageActionPerformed
        JFileChooser file =new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.images","jpg","png");
        file.addChoosableFileFilter(filter);
        int result=file.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile=file.getSelectedFile();
            String path= selectedFile.getAbsolutePath();
            lbl_image.setIcon(ResizeImage(path,null));
            ImgPath=path;
        }else{
            System.out.println("nofile selected");
        }
        
      
    }//GEN-LAST:event_btn_choose_imageActionPerformed

    private void txt_vehicalnumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vehicalnumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vehicalnumber1ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
b.setVisible(true);
      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(gear_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gear_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gear_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gear_form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gear_form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_choose_image;
    private javax.swing.JButton btn_search_vehical_number;
    private javax.swing.JButton btn_submit_data;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTextField txt_contact_number;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JTextField txt_middle_name;
    private javax.swing.JTextField txt_permenent_address;
    private javax.swing.JTextField txt_residensial_address;
    private javax.swing.JTextField txt_uid_number;
    private javax.swing.JTextField txt_vehicalnumber;
    public javax.swing.JTextField txt_vehicalnumber1;
    // End of variables declaration//GEN-END:variables

public String returnvvehicalnumber(){
    vn=txt_vehicalnumber.getText();
    return vn;
}
bill b=new bill();

}
