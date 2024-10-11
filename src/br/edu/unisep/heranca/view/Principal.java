package br.edu.unisep.heranca.view;
import br.edu.unisep.heranca.model.Frota;
import br.edu.unisep.heranca.model.Carro;
import br.edu.unisep.heranca.model.Moto;
import br.edu.unisep.heranca.model.Caminhao;

public class Principal {
    public static void main(String[] args) {

        Frota frota = new Frota();


        frota.adicionarVeiculo(new Carro("Toyota", "Corolla", 2020, 4));
        frota.adicionarVeiculo(new Moto("Honda", "CB500", 2019, 500));
        frota.adicionarVeiculo(new Caminhao("Volvo", "FH", 2018, "Granel"));


        frota.exibirFrota();
    }
}
