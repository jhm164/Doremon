/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doremon1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author saurabh
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Label label;
    public Ellipse outer,i1,i2,i3,i4;
    public Circle e1,e2;
    public Button normal,fear;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       e1.setFill(Color.BLACK);
       e2.setFill(Color.BLACK);
    }
     @FXML
    private void norm(ActionEvent event) {
       e1.setFill(Color.WHITE);
       e2.setFill(Color.WHITE);
    }
    
     @FXML
    private void fear1(ActionEvent event) {
      outer.setFill(Color.RED);
      i1.setVisible(true);
      i2.setVisible(true);
      i3.setVisible(true);
      i4.setVisible(true);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
