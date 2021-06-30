package ejemplo.clase2TM;

import java.util.Date;

public class CuentaCorriente {

    private String nombre;
    private String numeroCuenta;
    private Date fechaCreacion;
    private double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombre, String numeroCuenta, Date fechaCreacion, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.fechaCreacion = fechaCreacion;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente c) {
        this.nombre = c.getNombre();
        this.numeroCuenta = c.getNumeroCuenta();
        this.saldo = c.getSaldo();
        this.fechaCreacion = c.getFechaCreacion();
    }

    public boolean ingreso(double valor) {
        if (valor < 0) {
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean egreso(double valor) {
        if (valor < 0 || this.saldo < valor)
            return false;
        this.saldo -= valor;
        return true;
    }

    public boolean reintegro(double valor) {
        if (valor < 0 || this.saldo < valor)
            return false;
        this.saldo -= valor;
        return true;
    }

    public boolean transferencia(CuentaCorriente c, double valor) {
        if (valor < 0) {
            return false;
        }
        return c.ingreso(valor) && this.egreso(valor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
