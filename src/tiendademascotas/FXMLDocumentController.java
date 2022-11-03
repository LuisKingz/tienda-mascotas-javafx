/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendademascotas;

import tiendademascotas.FXMLNuevaVentanaController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author lfern
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private TextField usuario;
    @FXML
    private PasswordField psw;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Login(ActionEvent event) {
        String usu = usuario.getText();
        String pass = psw.getText();
        if (usu.equals("luis") && pass.equals("123abc")) {
            Stage stage = new Stage();
            Parent parent = null;
            FXMLNuevaVentanaController controlador = null; //nombre de la nueva de ventana
            try {
                FXMLLoader cargador = new FXMLLoader(
                        getClass().getResource("FXMLNuevaVentana.fxml"));
                parent = cargador.load();
                controlador = cargador.getController();
                stage.setResizable(false);
            } catch (IOException ex) {
                Logger.getLogger(
                        FXMLNuevaVentanaController.class.getName()).log(Level.SEVERE, null, ex); ///nombre de la nueva ventana
            }
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
            stage.close();
           

        } else {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
        }
    }

}
