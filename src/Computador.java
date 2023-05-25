import java.util.ArrayList;
import java.util.List;

public class Computador {

    private ComputadorEstado estado;
    private List<ComputadorEstado> memento = new ArrayList<ComputadorEstado>();

    public ComputadorEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ComputadorEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ComputadorEstado> getEstados() {
        return this.memento;
    }
}
