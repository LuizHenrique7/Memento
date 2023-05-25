public class ComputadorEstadoReinicializacao implements ComputadorEstado {

    private static ComputadorEstadoReinicializacao instance = new ComputadorEstadoReinicializacao();
    public static ComputadorEstadoReinicializacao getInstance() { return instance; }

    public String getNomeEstado() { return "Reinicialização";}
}
