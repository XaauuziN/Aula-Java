package aula.um.e.dois;

import javax.swing.JOptionPane;

public class Exemplos {

	//linha de comentário
	
	//executar comando:F2
	
	public static void main(String args[]) {



// int, numeros inteiros
// double, numeros quebrados e inteiros
// String, é uma classe
// boolean, true or false

    
    String nome = JOptionPane.showInputDialog("Digite seu nome");

    //conversão  de String para int
    
    //String auxiliar = JOptionPane.showInputDialog("Entre com a idade");
    
    
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade")    );
    
    		
     
     //Conversão de String para Double: Double.parseDouble(String)
    double precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o preço unitário"));
    int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
    String endereco = JOptionPane.showInputDialog("Entre com o endereço");
    
    // Conversão de String para boolean: Boolean.parseBoolean(String)
    boolean maior = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite: true ou false"));
    
    
     
     
     
     //int idade = 18;
    // double precoUnitario = 2.5;
    // int quantidade = 100;
    // String endereco = "Rua Afonso Giannico, nº350";
    // boolean maior = true;
     
     //identação de código
     
     // concatenação: +
     
        // System.out.printIn("Seu nome é " + nome + " ");
             //sysout + ctrl espaço
       // System.out.printIn("Você mora na " + endereco);
      // System.out.printIn("Sua idade é " + idade + "anos!")
     
     double total = precoUnitario * quantidade;
     
     System.out.println("seu nome é "          + nome            +
    		           "\nVocê mora na "       + endereco        +
    		           "\nSua idade é "        + idade + " anos!"+
    		           "\nTotal a pagar: R$ "  + total);
     
     
     /*Bloco de comentários
      * 
      */
     
     /* 
      *Operadores Aritméticos: - * + /
      *Operadores Relacionais:
      *   > maior
      *   >= maior ou igual
      *   < menor
      *   <= menor ou igual
      */
     
     
     
     
     
     JOptionPane.showMessageDialog(null, "seu nome é "             + nome            +
	                                     "\nVocê mora na "         + endereco        +
	                                      "\nSua idade é "         + idade + " anos!"+
	                                      "\nTotal a pagar: R$ "   + total); 
     
     JOptionPane.showInputDialog("Digite seu nome");
     
     
     
     
     
     
     
	}}  		 
