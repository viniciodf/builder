package br.com.vinicio.builder;

import br.com.vinicio.model.Carro;
import br.com.vinicio.model.CarroLivroManual;

public class CarroLivroManualBuilder implements CarBuilder {

    private CarroLivroManual carroLivroManual = new CarroLivroManual();

    @Override
    public void reset() {
        carroLivroManual = new CarroLivroManual();
    }

    @Override
    public void setQtdBancos(Integer qtdBancos) {
        carroLivroManual.setQtdBancos(qtdBancos);
    }

    @Override
    public void setMotor(String motor) {
        carroLivroManual.setMotor(motor);
    }

    @Override
    public void setPossuiGPS(Boolean possuiGPS) {
        carroLivroManual.setPossuiGPS(possuiGPS);
    }

    public CarroLivroManual build(){
        return carroLivroManual;
    }


}
