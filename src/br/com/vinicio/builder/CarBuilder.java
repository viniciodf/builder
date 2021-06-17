package br.com.vinicio.builder;

public interface CarBuilder {
    void reset();
    void setQtdBancos(Integer qtdBancos);
    void setMotor(String motor);
    void setPossuiGPS(Boolean possuiGPS);
}
