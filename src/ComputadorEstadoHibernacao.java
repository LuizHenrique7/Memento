public class ComputadorEstadoHibernacao implements ComputadorEstado {

    private static ComputadorEstadoHibernacao  instance = new ComputadorEstadoHibernacao ();
    public static ComputadorEstadoHibernacao  getInstance() { return instance; }

    public String getNomeEstado() { return "Hibernação";}
}
