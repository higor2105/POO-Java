import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criação dos Objetos da Classe carro

        Carro obj1 = new Carro();
        obj1.ano =Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro"));
        obj1.velocidade =Float.parseFloat(JOptionPane.showInputDialog("Velocidade"));
        obj1.marca = JOptionPane.showInputDialog("Informe o Marca");
        obj1.modelo = JOptionPane.showInputDialog("Informe o Modelo");
        obj1.acelerar(50);
        obj1.exibirDetalhes();
        obj1.frear(51);

        System.out.println();

        Carro obj2 = new Carro(2023,30,"Chevrolet","Corsa");
        obj2.acelerar(60);

        System.out.println();

        obj2.frear(10);
        obj2.exibirDetalhes();



    }
}