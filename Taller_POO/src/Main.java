public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("10812345", "Jaime Anchico");

        Producto p1 = new Producto(101);
        Producto p2 = new Producto(102);
        Producto[] productos = {p1, p2};

        Pedido pedido = new Pedido(c1, productos, 12345678);
        pedido.mostrarPedido();

        Foto f1 = new Foto("imagen1.jpg");
        Foto f2 = new Foto("imagen2.jpg");
        Foto[] fotos = {f1, f2};

        Impresion imp = new Impresion("Color", fotos);
        imp.imprimirTodas();
    }
}