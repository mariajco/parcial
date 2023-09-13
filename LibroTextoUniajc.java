public class LibroTextoUniajc extends LibroTexto {
    private String facultad;

    public LibroTextoUniajc(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Facultad: " + facultad);
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }