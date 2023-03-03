package SERVICIOS;

public class ClaseMantenimiento {

    private String Cilindraje;
    private String Referencia_motor;
    private String Referencia_chasis;
    private String Aceite;
    private String Prox_Servicio;

    public ClaseMantenimiento(String cilindraje, String referencia_motor, String referencia_chasis, String aceite, String prox_Servicio) {
        Cilindraje = cilindraje;
        Referencia_motor = referencia_motor;
        Referencia_chasis = referencia_chasis;
        Aceite = aceite;
        Prox_Servicio = prox_Servicio;
    }

    public String getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        Cilindraje = cilindraje;
    }

    public String getReferencia_motor() {
        return Referencia_motor;
    }

    public void setReferencia_motor(String referencia_motor) {
        Referencia_motor = referencia_motor;
    }

    public String getReferencia_chasis() {
        return Referencia_chasis;
    }

    public void setReferencia_chasis(String referencia_chasis) {
        Referencia_chasis = referencia_chasis;
    }

    public String getAceite() {
        return Aceite;
    }

    public void setAceite(String aceite) {
        Aceite = aceite;
    }

    public String getProx_Servicio() {
        return Prox_Servicio;
    }

    public void setProx_Servicio(String prox_Servicio) {
        Prox_Servicio = prox_Servicio;
    }
}
