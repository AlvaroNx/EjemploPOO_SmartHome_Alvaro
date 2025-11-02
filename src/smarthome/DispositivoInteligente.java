package smarthome;

public abstract class DispositivoInteligente {
    private String nombre;
    private boolean encendido;

    public DispositivoInteligente(String nombre) {
        this.nombre = nombre;
        this.encendido = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        encendido = true;
        System.out.println(nombre + " se ha encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(nombre + " se ha apagado.");
    }


    public abstract void realizarAccion();
}
