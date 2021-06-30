package ejemplo.clase2TM;

public class Contador {

    private int cont;

    public Contador(){}

    public Contador(int cont) {
        this.cont = cont;
    }

    public Contador(Contador c) {
        this.cont = c.getCont();
    }

    public void incrementar(int valor) {
        cont += valor;
    }

    public void decrementar(int valor) {
        cont -= valor;
        if (cont < 0)
            cont = 0;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
