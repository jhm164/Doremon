/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gear_final;

import javax.swing.JOptionPane;

/**
 *
 * @author saurabh
 */
public class gear_bill_class extends gear_form1{
    public String fname1;
        public String vn1;
        public String mname1;
            public String lname1;
            public void tp(){
                 JOptionPane.showMessageDialog(null,vn1);
            }
     public static void main(String args[]) {
         gear_form1 gf=new gear_form1();
         gear_bill_class gb=new gear_bill_class();     
    gb.vn1=gf.returnvvehicalnumber();
       gb.tp();
   
     }    
      
}

