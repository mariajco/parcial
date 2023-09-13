public class LibroTexto extends Libro {
    private String curso;

    public LibroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    