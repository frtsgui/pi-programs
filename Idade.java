import java.util.*;
import java.lang.*;
import java.io.*;

public class Idade{
    public static void main (String []args){
        
        Scanner reader = new Scanner(System.in);
        String nome;
        int nascimento, atual, idade;
        atual = reader.nextInt();
        nome = reader.next();
        nascimento = reader.nextInt();
        idade = atual-nascimento;
        
    System.out.println(nome+", voce completa "+idade+" anos de idade neste ano.");
    }
}