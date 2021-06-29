package ejemplo.clase2;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;

    public Libro() {
    }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Libro(Libro n) {
        this.titulo = n.getTitulo();
        this.isbn = n.getIsbn();
        this.autor = n.getAutor();
    }

    public void prestamo() {
        System.out.println("----------------------");
        System.out.println("Se ha prestado el libro " + this.titulo + " con ISBN " + this.isbn);
        System.out.println("----------------------");
    }

    public void devolucion() {
        System.out.println("----------------------");
        System.out.println("Se ha devuelto el libro " + this.titulo);
        System.out.println("----------------------");
    }

    @Override
    public String toString() {
        return this.titulo + " " + this.isbn + " " + this.autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
