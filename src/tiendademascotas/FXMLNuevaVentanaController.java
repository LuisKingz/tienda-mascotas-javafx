/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendademascotas;

import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author lfern
 */
public class FXMLNuevaVentanaController implements Initializable {

    @FXML
    private TextField nombreDueño;
    @FXML
    private TextField EdadDueño;
    @FXML
    private TextField Telefono;
    @FXML
    private TextField NomMascota;
    @FXML
    private TableView<DatosDueño> TablaDueño;
    @FXML
    private TableColumn<DatosDueño, Integer> idDueñoCol;
    @FXML
    private TableColumn<DatosDueño, String> NombreDueñoCol;
    @FXML
    private TableColumn<DatosDueño, Integer> TelefonoCol;
    @FXML
    private TableColumn<DatosDueño, Integer> EdadDueñoCol;
    @FXML
    private TableColumn<DatosDueño, String> NomMascotaCol;
    @FXML
    private TextField NombreMascota;
    @FXML
    private TextField EdadMascota;
    @FXML
    private TextField ColorMascota;
    @FXML
    private TextField NomDueño;
    @FXML
    private RadioButton Macho;
    @FXML
    private ToggleGroup Sexo;
    @FXML
    private RadioButton Hembra;
    @FXML
    private TableView<DatosMascota> TablaMascota;
    @FXML
    private TableColumn<DatosMascota, Integer> IdMascotaCol;
    @FXML
    private TableColumn<DatosMascota, String> NombreMascotaCol;
    @FXML
    private TableColumn<DatosMascota, Integer> EdadMascotaCol;
    @FXML
    private TableColumn<DatosMascota, String> ColorMascotaCol;
    @FXML
    private TableColumn<DatosMascota, String> NomDueñoCol;
    @FXML
    private TableColumn<DatosMascota, String> SexoCol;
    //variables necesarias
    int posicionDueño;

    List<DatosDueño> dueño = new ArrayList();//lista de datos del dueño
    //List<DatosMascota> mascota = new ArrayList();//lista de datos de la mascota
    ObservableList<DatosDueño> DatDueño;
    //ObservableList<DatosMascota> DatMascota;

    //intancia de las clases de dueño y mascota
    DatosDueño Datosdueño = new DatosDueño();
    //DatosMascota Datosmascota = new DatosMascota();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CargarDatosDueño();
        DatDueño = TablaDueño.getSelectionModel().getSelectedItems();
        
    }

    @FXML
    private void RegistroDueño(ActionEvent event) {
        String nombre = NomDueño.getText();
        int edad = Integer.parseInt(EdadDueño.getText());
        int tel = Integer.parseInt(Telefono.getText());
        String nomMas = NomMascota.getText();
        int idDueño = 1;
        Datosdueño = new DatosDueño(idDueño, nombre, edad, tel, nomMas);
        idDueño += 1;
        dueño.add(Datosdueño);

    }

    @FXML
    private void EliminarDueño(ActionEvent event) {
    }

    @FXML
    private void ModificarDueño(ActionEvent event) {
    }

    @FXML
    private void ConsultarDueño(ActionEvent event) {
    }
// METODOS DEL DUEÑO

    public DatosDueño SeleccionarRegistros() {
        if (TablaDueño != null) {
            List<DatosDueño> Dueño = TablaDueño.getSelectionModel().getSelectedItems();
            if (Dueño.size() == 1) {
                DatosDueño SeleccionDueño = Dueño.get(0);
                return SeleccionDueño;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Registro invalido");
        }
        return null;
    }

    public void DueñoSeleccionado() {
        DatosDueño Dueño = SeleccionarRegistros();
        posicionDueño = DatDueño.indexOf(Dueño);
        
        if (Dueño !=null) {
            nombreDueño.setText(Dueño.getNombre());
            EdadDueño.setText(String.valueOf(Dueño.getEdad()));
            Telefono.setText(String.valueOf(Dueño.getTelefono()));
            NomMascota.setText(Dueño.getNombreMascota());
        }
        
    }

    private void CargarDatosDueño() {
        idDueñoCol.setCellValueFactory(new PropertyValueFactory<DatosDueño, Integer>("IdDueño"));
        NombreDueñoCol.setCellValueFactory(new PropertyValueFactory<DatosDueño, String>("nombre"));
        TelefonoCol.setCellValueFactory(new PropertyValueFactory<DatosDueño, Integer>("edad"));
        EdadDueñoCol.setCellValueFactory(new PropertyValueFactory<DatosDueño, Integer>("telefono"));
        NomMascotaCol.setCellValueFactory(new PropertyValueFactory<DatosDueño, String>("nombreMascota"));

        TablaDueño.getItems().clear();
        TablaDueño.getItems().addAll(dueño);

        DatDueño = FXCollections.observableArrayList();
        DatDueño.addAll(dueño);
    }

    @FXML
    private void RegistroMascota(ActionEvent event) {
    }

    @FXML
    private void EliminarMascota(ActionEvent event) {
    }

    @FXML
    private void ModificarMascota(ActionEvent event) {
    }

    @FXML
    private void ConsultarMascota(ActionEvent event) {
    }

//METODOS GENERALES
    @FXML
    private void SoloNumeros(KeyEvent event) {
        char c = event.getCharacter().charAt(0);
        if (Character.isLetter(c)) {
            event.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }

    @FXML
    private void SoloLetras(KeyEvent event) {
        char c = event.getCharacter().charAt(0);
        if (Character.isDigit(c)) {
            event.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
