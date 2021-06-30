package ejemplo.clase2TM;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private GregorianCalendar fecha;
    private int year;
    private int month;
    private int dayOfMonth;

    public Fecha() {
    }

    public Fecha(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.fecha = new GregorianCalendar(this.year, this.month, this.dayOfMonth);
    }

    public Fecha(Fecha f ) {
        this.year = f.getYear();
        this.month = f.getMonth();
        this.dayOfMonth = f.getDayOfMonth();
        this.fecha = new GregorianCalendar(this.year, this.month, this.dayOfMonth);
    }

    public boolean validarFecha(int anio, int mes, int dia) {
        GregorianCalendar valid = new GregorianCalendar();
        valid.setLenient(false);
        valid.set(anio, mes, dia, 0, 0, 0);
        try {
            valid.getTime();
            System.out.println("Validacion " + valid.getTime());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void sumarDia() {
        this.fecha.add(Calendar.DAY_OF_MONTH, 1);
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }
}
