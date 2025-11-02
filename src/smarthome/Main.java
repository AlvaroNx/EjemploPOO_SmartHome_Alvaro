package smarthome;

public class Main {
    public static void main(String[] args) {
        FocoInteligente focoSala = new FocoInteligente("Foco de la sala");

        focoSala.conectarWifi("Casa_Wifi");
        focoSala.encender();
        focoSala.ajustarBrillo(80);
        focoSala.realizarAccion();
        focoSala.apagar();
        focoSala.desconectarWifi();
    }
}
