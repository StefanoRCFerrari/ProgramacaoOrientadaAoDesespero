package aula0224;

public class Aula0224 {

    public static void main(String[] args) {
        TV tvSala = new TV("CCE");
        TV tvQuarto = new TV("Philco-Hitachi");
        
        System.out.println(tvSala.toString());
        System.out.println(tvQuarto.toString());
        tvSala.ligar();
        tvQuarto.ligar();
        System.out.println(tvSala.toString());
        System.out.println(tvQuarto.toString());
        tvSala.desligar();
        tvQuarto.desligar();
        System.out.println(tvSala.toString());
        System.out.println(tvQuarto.toString());
        tvSala.setCanal(-20);
        tvSala.ligar();
        tvSala.setCanal(-20);
        tvSala.setCanal(8001);
        tvSala.setCanal(20);
        System.out.println(tvSala.toString());
        while (tvSala.volume > 0){
            tvSala.mudarVolume('-');
        }
        tvSala.mudarVolume('-');
        while (tvSala.volume < 100){
            tvSala.mudarVolume('+');
        }
        tvSala.mudarVolume('+');
        tvSala.desligar();
        tvSala.ligar();
        tvSala.mudarVolume('+');
    }
}
