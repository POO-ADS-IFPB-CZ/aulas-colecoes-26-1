package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ficha {

    private UUID identificador;
    private LocalDateTime dataHora;

    public Ficha(){
        identificador = UUID.randomUUID();
        dataHora = LocalDateTime.now();
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "identificador=" + identificador +
                ", dataHora=" + dataHora +
                '}';
    }
}
