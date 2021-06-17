package br.com.vinicio.builder;

import br.com.vinicio.model.Carro;
import br.com.vinicio.model.CarroLivroManual;

public class CarroBuilder implements CarBuilder {

    private Carro carro = new Carro();

    @Override
    public void reset() {
        carro = new Carro();
    }

    @Override
    public void setQtdBancos(Integer qtdBancos) {
        carro.setQtdBancos(qtdBancos);
    }

    @Override
    public void setMotor(String motor) {
        carro.setMotor(motor);
    }

    @Override
    public void setPossuiGPS(Boolean possuiGPS) {
        carro.setPossuiGPS(possuiGPS);
    }

    public Carro build(){
        return carro;
    }
}
