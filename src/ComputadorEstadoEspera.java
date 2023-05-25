public class ComputadorEstadoEspera implements ComputadorEstado {

    private static ComputadorEstadoEspera  instance = new ComputadorEstadoEspera();
    public static ComputadorEstadoEspera getInstance() { return instance; }

    public String getNomeEstado() { return "Espera";}
}