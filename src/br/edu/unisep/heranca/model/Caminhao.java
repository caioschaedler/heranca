package br.edu.unisep.heranca.model;

public class Caminhao extends Veiculo{
    private String tipoCarga;

    public Caminhao(String marca, String modelo, int ano, String tipoCarga) {
        super(marca, modelo, ano);
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String exibirDetalhes() {
        return "Caminhão: " + marca + " " + modelo + ", Ano: " + ano + ", Tipo de Carga: " + tipoCarga;
    }
}
