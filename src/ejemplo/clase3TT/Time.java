package ejemplo.clase3TT;

import java.util.Date;

public class Time {

    private long tiempoInicio;
    private long tiempoFin;

    public void start() {
        this.tiempoInicio = (new Date()).getTime();
    }

    public void stop() {
        this.tiempoFin = (new Date()).getTime();
    }

    public long elapsedTime() {
        return this.tiempoFin - this.tiempoInicio;
    }

    public long getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(long tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public long getTiempoFin() {
        return tiempoFin;
    }

    public void setTiempoFin(long tiempoFin) {
        this.tiempoFin = tiempoFin;
    }
}
