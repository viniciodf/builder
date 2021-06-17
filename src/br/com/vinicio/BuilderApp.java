package br.com.vinicio;

import br.com.vinicio.builder.CarroBuilder;
import br.com.vinicio.builder.CarroLivroManualBuilder;
import br.com.vinicio.model.Carro;
import br.com.vinicio.model.CarroLivroManual;

public class BuilderApp {
    public static void main(String[] args) {
        DiretorCarro diretorCarro = new DiretorCarro();

        CarroBuilder carroBuilder = new CarroBuilder();

        diretorCarro.construirCarroSport(carroBuilder);

        Carro carro = carroBuilder.build();

        CarroLivroManualBuilder carroLivroManualBuilder = new CarroLivroManualBuilder();

        diretorCarro.construirCarroSport(carroLivroManualBuilder);

        CarroLivroManual carroLivroManual = carroLivroManualBuilder.build();

        System.out.println("Carro : " + carro.toString());

        System.out.println("Carro Livro Manual: " + carroLivroManual.toString());

    }
}
