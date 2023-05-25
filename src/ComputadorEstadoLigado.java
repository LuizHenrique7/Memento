public class ComputadorEstadoLigado implements ComputadorEstado {

    private static ComputadorEstadoLigado instance = new ComputadorEstadoLigado();
    public static ComputadorEstadoLigado getInstance() { return instance; }

    public String getNomeEstado() { return "Ligado";}
}
