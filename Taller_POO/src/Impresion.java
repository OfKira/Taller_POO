public class Impresion {
    private String color;
    private Foto[] fotos;

    public Impresion(String color, Foto[] fotos) {
        this.color = color;
        this.fotos = fotos;
    }

    public void imprimirTodas() {
        for (Foto f : fotos) {
            f.print();
        }
    }
}