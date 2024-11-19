package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InicioViewController {
    App app;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_AdminInicio;

    @FXML
    private Button btn_clienteInicio;

    @FXML
    private Button btn_gerente;

    @FXML
    void AbrirGestionEmpleado(ActionEvent event) {

    }

    @FXML
    void abrirCatalogo(ActionEvent event) {

    }

    @FXML
    void abrirLogin(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_AdminInicio != null
                : "fx:id=\"btn_AdminInicio\" was not injected: check your FXML file 'Inicio.fxml'.";
        assert btn_clienteInicio != null
                : "fx:id=\"btn_clienteInicio\" was not injected: check your FXML file 'Inicio.fxml'.";
        assert btn_gerente != null : "fx:id=\"btn_gerente\" was not injected: check your FXML file 'Inicio.fxml'.";

    }

    public void setApp(App app) {
        this.app = app;
    }
}
