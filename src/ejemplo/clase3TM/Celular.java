package ejemplo.clase3TM;

public class Celular implements Precedable<Celular> {

    private long numero;
    private String titular;

    public Celular() {
    }

    public Celular(long numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public boolean precedeA(Celular celular) {
        return this.numero > celular.getNumero();
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                '}';
    }
}
