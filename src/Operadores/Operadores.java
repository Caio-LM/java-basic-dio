package Operadores;

public class Operadores {
    public static void main(String[] args) {

        int numero = 5;
        // x incrementação
        numero++;
        System.out.println(numero);

        int numero2 = 7;
        // x decrementação
        numero2 --;
        System.out.println((numero2));

        boolean valor = true;
        // mudança
        valor = !true;
        System.out.println(valor);

        //Operador ternario

        int a, b;
        a = 5;
        b = 5;
        String resultado = "";
        if(a==b)
            resultado = "true";
        else
            resultado = "false";

        System.out.println(resultado);

        //Aplicando o operador ternario

        String resultadot = a==b ?"true" : "false";
        System.out.println(resultadot);

        //Operadores relacionais

        int c, d;
        c = 2;
        d = 2;

        boolean simNao = c == d;
        System.out.println(simNao);

       simNao = c != d;
        System.out.println(simNao);

        simNao = a > d;
        System.out.println(simNao);

        //Operadores lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");}
            else{
                System.out.println("fim");
            }



    }
}
