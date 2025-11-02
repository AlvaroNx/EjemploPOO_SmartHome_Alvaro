package smarthome;

public class FocoInteligente extends DispositivoInteligente implements Conectividad {
    private int brillo;
    private String redConectada;

    public FocoInteligente(String nombre) {
        super(nombre);
        this.brillo = 50; // brillo inicial
    }

    @Override
    public void realizarAccion() {
        if (isEncendido()) {
            System.out.println(getNombre() + " está iluminando con un brillo del " + brillo + "%.");
        } else {
            System.out.println(getNombre() + " está apagado, no puede iluminar.");
        }
    }

    @Override
    public void conectarWifi(String red) {
        redConectada = red;
        System.out.println(getNombre() + " se ha conectado a la red Wi-Fi: " + redConectada);
    }

    @Override
    public void desconectarWifi() {
        System.out.println(getNombre() + " se ha desconectado de la red Wi-Fi: " + redConectada);
        redConectada = null;
    }

    public void ajustarBrillo(int nuevoBrillo) {
        if (nuevoBrillo >= 0 && nuevoBrillo <= 100) {
            brillo = nuevoBrillo;
            System.out.println(getNombre() + " ahora tiene un brillo del " + brillo + "%.");
        } else {
            System.out.println("Valor de brillo inválido. Debe estar entre 0 y 100.");
        }
    }
}
