import javax.swing.JOptionPane;

public class Aula1403 {

    public static void main(String[] args) {
        
        // int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        
        // if(idade <0){
        //     JOptionPane.showMessageDialog(null, "idade invalida: " + idade);
        // } else if(idade <= 17 ){
        //     JOptionPane.showMessageDialog(null, "Você é menor de idade: " + idade);
        // } else if(idade <= 64) {
        //     JOptionPane.showMessageDialog(null, "Você é maior de idade: " + idade);
        // } else {
        //     JOptionPane.showMessageDialog(null, "Você é idoso: " + idade);
        // }

        boolean valido = true;

         int salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o salario"));
        if(salario < 100) {
            JOptionPane.showMessageDialog(null, "Salário inválido");
            valido = false;
        } else if (salario <= 300) {
            salario = (int) (salario * 1.5);
        } else if(salario <= 500) {
            salario = (int) (salario * 1.3);
        } else if(salario <= 700 ) {
            salario = (int) (salario * 1.15);
        } else {
            salario = (int) (salario * 1.05);
        }
        if(valido) {
            JOptionPane.showMessageDialog(null,"Seu novo salário será de R$" + salario );
    }
}}