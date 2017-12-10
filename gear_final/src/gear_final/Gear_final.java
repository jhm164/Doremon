/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gear_final;

/**
 *
 * @author saurabh
 */
public class Gear_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        gearspash1 gsp=new gearspash1();
        gsp.setVisible(true);
        String z;
     login gear=new login();
        for(int i=0;i<=100;i++){
            Thread.sleep(45);
            z=Integer.toString(i);  
         gsp.lb.setText(Integer.toString(i)+"%");
         gsp.gearprg.setValue(i);
                  if(i==100){
                gsp.setVisible(false);
        gear.setVisible(true);
            }
        }
        
    }
    
}
