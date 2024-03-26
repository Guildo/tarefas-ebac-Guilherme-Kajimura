public class Celular {

    private int codigo;

    private String marca;

    private String modelo;

    private int memoriaRam;

    private int memoriaRom;

    private double tamanhoTela;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaRom() {
        return memoriaRom;
    }

    public void setMemoriaRom(int memoriaRom) {
        this.memoriaRom = memoriaRom;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public void cadastrarCelular(
            int codigo,
            String marca,
            String modelo,
            Double tamanhoTela,
            int memoriaRam,
            int memoriaRom
    ) {
        this.setCodigo(codigo);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTamanhoTela(tamanhoTela);
        this.setMemoriaRam(memoriaRam);
        this.setMemoriaRom(memoriaRom);
    }

    /**
     * Exibe dados do novo celular cadastrado
     */
    public void exibirDadosDoCelular () {
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Tamanho da Tela: " + this.getTamanhoTela());
        System.out.println("Memória RAM: " + this.getMemoriaRam() + "GB");
        System.out.println("Memória ROM: " + this.getMemoriaRom() + "GB");
    }
}
