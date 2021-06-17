package br.com.vinicio;

import br.com.vinicio.builder.CarBuilder;

public class DiretorCarro {
    public void construirCarroSUV(CarBuilder builder){
        builder.setMotor("Motor Tiguan");
        builder.setPossuiGPS(true);
        builder.setQtdBancos(7);
    }

    public void construirCarroSport(CarBuilder builder){
        builder.setMotor("Motor Ferrari");
        builder.setPossuiGPS(true);
        builder.setQtdBancos(2);
    }
}

