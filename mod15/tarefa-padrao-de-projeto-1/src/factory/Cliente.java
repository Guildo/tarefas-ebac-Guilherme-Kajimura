package factory;

public class Cliente {

    private final String notaSolicitada;
    private final boolean temContratoEmpresa;

    public Cliente(String notaSolicitada, boolean temContratoEmpresa) {
        this.notaSolicitada = notaSolicitada;
        this.temContratoEmpresa = temContratoEmpresa;
    }
    public boolean temContratoEmpresa() {
        return temContratoEmpresa;
    }
    public String getNotaSolicitada() {
        return notaSolicitada;
    }
}
