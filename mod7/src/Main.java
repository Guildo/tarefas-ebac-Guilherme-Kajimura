public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        /*
        celular.setCodigo(1);
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy S23");
        celular.setTamanhoTela(6.1);
        celular.setMemoriaRom(128);
        celular.setMemoriaRam(8);
        ou...
         */
        
        celular.cadastrarCelular(1,
                "Samsung",
                "Galaxy S23",
                6.1,
                8,
                128
        );

        celular.exibirDadosDoCelular();
    }
}