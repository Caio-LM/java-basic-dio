package Metodos;

public class smartTv {
    boolean ligada = false;
    int canal = 4;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }

    public void proximoCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

}
