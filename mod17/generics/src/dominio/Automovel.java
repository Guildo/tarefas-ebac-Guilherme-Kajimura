package dominio;

public abstract class Automovel {

    private String modelo;

    private String marca;

    private Integer cavalos;

    public Automovel(String modelo, String marca, Integer cavalos) {
        this.modelo = modelo;
        this.marca = marca;
        this.cavalos = cavalos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }
}
