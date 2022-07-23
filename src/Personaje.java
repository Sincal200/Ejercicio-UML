public abstract class Personaje {

    private String nombre;
    private String descripcion;
    private long tamaño;
    private int poder;
    private int vida;

    public void desplazarse (){
        System.out.println("");
    }

    public int mostrarVida(){

        return 0;
    }

    public void mostrarPoder(){
        System.out.println("");
    }

    protected Personaje(){

    }
}
