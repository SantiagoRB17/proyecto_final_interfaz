package co.edu.uniquindio.poo.model;
public class Vehiculo {
    /**
     * Atributos de la clase Vehiculo
     */
    protected int codigoIdentificador;
    protected Tipo_Transmision tipoTransmision;
    protected String marca;
    protected boolean esNuevo;
    protected String modelo;
    protected int numeroCambios;
    protected double maximaVelocidad;
    protected int cilindraje;
    protected static final double precioDiaAlquiler = 100000;
    protected boolean revisionTecnica;
    protected static final double precioVenta = 150000;

    public Vehiculo(int codigoIdentificador, Tipo_Transmision tipoTransmision, String marca, boolean esNuevo,
            String modelo, int numeroCambios,
            double maximaVelocidad, int cilindraje) {
        this.codigoIdentificador = codigoIdentificador;
        this.tipoTransmision = tipoTransmision;
        this.marca = marca;
        this.esNuevo = esNuevo;
        this.modelo = modelo;
        this.numeroCambios = numeroCambios;
        this.maximaVelocidad = maximaVelocidad;
        this.cilindraje = cilindraje;

        this.revisionTecnica = false;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;

    }

    public Tipo_Transmision getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(Tipo_Transmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroCambios() {
        return numeroCambios;
    }

    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }

    public double getMaximaVelocidad() {
        return maximaVelocidad;
    }

    public void setMaximaVelocidad(double maximaVelocidad) {
        this.maximaVelocidad = maximaVelocidad;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPrecioDiaAlquiler() {
        return precioDiaAlquiler;
    }

    public boolean isRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public String toString() {
        return "Vehiculo: codigo=" + codigoIdentificador + "tipoTransmision=" + tipoTransmision + ", marca=" + marca
                + ", esNuevo=" + esNuevo
                + ", modelo=" + modelo + ", numeroCambios=" + numeroCambios + ", maximaVelocidad=" + maximaVelocidad
                + ", cilindraje=" + cilindraje + ", precioDiaAlquiler=" + precioDiaAlquiler + ", precioVenta="
                + precioVenta + ", Revision= " + (revisionTecnica ? "Aprobada" : "No Aprobada");
    }

}
