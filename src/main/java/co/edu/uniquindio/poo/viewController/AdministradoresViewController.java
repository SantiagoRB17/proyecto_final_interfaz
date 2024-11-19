package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AdministradorController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Sede;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdministradoresViewController {
    App app;
    AdministradorController administradorController;
    ObservableList<Administrador> listaAdministradores = FXCollections.observableArrayList();
    Administrador selectedAdministrador;
    private void cargarSedes() {
        cbx_Sede.setItems(FXCollections.observableArrayList(app.concesionario.getSedes()));
    }
    @FXML
    private TableColumn<Administrador, String> C1_NombreAdmin;

    @FXML
    private TableColumn<Administrador, String> C2_CedulaAdmin;

    @FXML
    private TableColumn<Administrador, Long> C3_TelefonoAdmin;

    @FXML
    private TableColumn<Administrador, String> C4_UusarioAdmin;

    @FXML
    private TableColumn<Administrador, String> C5_ContraseniaAdmin;

    @FXML
    private TableColumn<Administrador, String> C6_PalabraAdmin;

    @FXML
    private Button btn_GestionSedeADMIN;

    @FXML
    private Button btn_actualizarAdmin;

    @FXML
    private Button btn_agregarAdmin;

    @FXML
    private Button btn_limpiarAdmin;

    @FXML
    private Button btn_volverLoginAdmin;

    @FXML
    private ComboBox<Sede> cbx_Sede;

    @FXML
    private TextField txt_PalabraSeguridad;

    @FXML
    private TextField txt_cedulaAdmin;

    @FXML
    private TextField txt_contraseniaAdmin;

    @FXML
    private TextField txt_nombreAdmin;

    @FXML
    private TextField txt_telefonoAdmin;

    @FXML
    private TextField txt_usuarioAdmin;

    @FXML
    private TableView<Administrador> tb_Administradores;

    @FXML
    void CapturarCedulaAdmin(ActionEvent event) {

    }

    @FXML
    void CapturarContraseniaAdmin(ActionEvent event) {

    }

    @FXML
    void CapturarNombreAdmin(ActionEvent event) {

    }

    @FXML
    void CapturarPalabraAdmin(ActionEvent event) {

    }

    @FXML
    void CapturarTelefonoAdmin(ActionEvent event) {

    }

    @FXML
    void CapturarUsarioAdmin(ActionEvent event) {

    }

    @FXML
    void LimpiarCamposAdmin(ActionEvent event) {

    }

    @FXML
    void Sede(ActionEvent event) {

    }

    @FXML
    void abrirGestionSedeADMIN(ActionEvent event) {

    }

    @FXML
    void actualizarAdmin(ActionEvent event) {

    }

    @FXML
    void agregarAdmin(ActionEvent event) {

    }

    @FXML
    void volverLoginAdmin(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert C1_NombreAdmin != null
                : "fx:id=\"C1_NombreAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert C2_CedulaAdmin != null
                : "fx:id=\"C2_CedulaAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert C3_TelefonoAdmin != null
                : "fx:id=\"C3_TelefonoAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert C4_UusarioAdmin != null
                : "fx:id=\"C4_UusarioAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert C5_ContraseniaAdmin != null
                : "fx:id=\"C5_ContraseniaAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert C6_PalabraAdmin != null
                : "fx:id=\"C6_PalabraAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert btn_GestionSedeADMIN != null
                : "fx:id=\"btn_GestionSedeADMIN\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert btn_actualizarAdmin != null
                : "fx:id=\"btn_actualizarAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert btn_agregarAdmin != null
                : "fx:id=\"btn_agregarAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert btn_limpiarAdmin != null
                : "fx:id=\"btn_limpiarAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert btn_volverLoginAdmin != null
                : "fx:id=\"btn_volverLoginAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert cbx_Sede != null
                : "fx:id=\"cbx_Sede\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txt_PalabraSeguridad != null
                : "fx:id=\"txt_PalabraSeguridad\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txt_cedulaAdmin != null
                : "fx:id=\"txt_cedulaAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txt_contraseniaAdmin != null
                : "fx:id=\"txt_contraseniaAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txt_nombreAdmin != null
                : "fx:id=\"txt_nombreAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txt_telefonoAdmin != null
                : "fx:id=\"txt_telefonoAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert txt_usuarioAdmin != null
                : "fx:id=\"txt_usuarioAdmin\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        assert tb_Administradores != null
                : "fx:id=\"tb_Administradores\" was not injected: check your FXML file 'GestionAdministrador.fxml'.";
        administradorController = new AdministradorController(app.concesionario);
        cargarSedes();
        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerListaAdministradores();

        // Limpiar la tabla
        tb_Administradores.getItems().clear();

        // Agregar los elementos a la tabla
        tb_Administradores.setItems(listaAdministradores);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        C1_NombreAdmin.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        C2_CedulaAdmin.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        C3_TelefonoAdmin.setCellValueFactory(cellData -> new SimpleObjectProperty<Long>(cellData.getValue().getTelefono()));
        C4_UusarioAdmin.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getUsuario()));
        C5_ContraseniaAdmin.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getClave()));
        C6_PalabraAdmin.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPalabraSeguridad()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }
    private void obtenerListaAdministradores() {
        listaAdministradores.addAll(administradorController.obtenerListaAdministradores());
    }

    private void listenerSelection() {
        tb_Administradores.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> 
        {selectedAdministrador = newSelection;mostrarInformacionAdministrador(selectedAdministrador);});
    }
    private void mostrarInformacionAdministrador(Administrador administrador) {
        if (administrador != null) {
            txt_nombreAdmin.setText(administrador.getNombre());
            txt_cedulaAdmin.setText(administrador.getCedula());
            txt_telefonoAdmin.setText(String.valueOf(administrador.getTelefono()));
            txt_usuarioAdmin.setText(administrador.getUsuario());
            txt_contraseniaAdmin.setText(administrador.getClave());
            txt_contraseniaAdmin.setText(administrador.getClave());
            txt_PalabraSeguridad.setText(administrador.getPalabraSeguridad());
        }
        Sede sede=administrador.getSede();
        if(sede !=null){
            cbx_Sede.setValue(sede);
        }

    }

    private void agregarAdministrador() {
        Administrador administrador = buildAdministrador();
        if (administradorController.crearAdministrador(administrador)) {
            listaAdministradores.add(administrador);
            limpiarCamposAdministrador();
        }
    }
    private Administrador buildAdministrador() {
        Administrador administrador= new Administrador(input_nombre.getText(), input_cedula.getText(), Long.parseLong(input_telefono.getText()),input_direccion.getText());
        return cliente;
    }
    public void setApp(App app) {
        this.app = app;
    }
}
