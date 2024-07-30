package Condicionais;

public class saldoBancario {

    public static void main(String[] args) {

        double saldo = 89.02;
        double valorSolicitado = 98.29;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);}
        else
            System.out.println("Saldo insuficiente");
    }

}


