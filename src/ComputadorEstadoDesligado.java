public class ComputadorEstadoDesligado implements ComputadorEstado {

    private static ComputadorEstadoDesligado instance = new ComputadorEstadoDesligado();
    public static ComputadorEstadoDesligado getInstance() { return instance; }

    public String getNomeEstado() { return "Desligado";}
}
