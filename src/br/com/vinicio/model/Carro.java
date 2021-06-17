package br.com.vinicio.model;

public class Carro {

    private Integer qtdBancos;
    private String motor;
    private Boolean possuiGPS;

    public Integer getQtdBancos() {
        return qtdBancos;
    }

    public void setQtdBancos(Integer qtdBancos) {
        this.qtdBancos = qtdBancos;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Boolean getPossuiGPS() {
        return possuiGPS;
    }

    public void setPossuiGPS(Boolean possuiGPS) {
        this.possuiGPS = possuiGPS;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "qtdBancos=" + qtdBancos +
                ", motor='" + motor + '\'' +
                ", possuiGPS=" + possuiGPS +
                '}';
    }
}
