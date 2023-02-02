public class Cubo extends Figura3D{

    private int arestas;

    public int getArestas() {
        return arestas;
    }

    public void setArestas(int arestas) {
        this.arestas = arestas;
    }

    @Override
    public double calcularVolume() {
        return 6 * (arestas * arestas);
    }
}
