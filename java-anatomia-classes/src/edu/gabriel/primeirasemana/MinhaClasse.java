package edu.gabriel.primeirasemana;

public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Gabriel";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.print(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return " Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}