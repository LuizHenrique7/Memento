public class ComputadorEstadoRecuperacao implements ComputadorEstado {

    private static ComputadorEstadoRecuperacao instance = new ComputadorEstadoRecuperacao();
    public static ComputadorEstadoRecuperacao getInstance() { return instance; }

    public String getNomeEstado() { return "Recuperação";}
}
