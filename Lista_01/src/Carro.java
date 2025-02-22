import javax.swing.*;

public class Carro {

    // variáveis de dados primitivos
    public int ano ;
    public float velocidade ;

    // variáveis de dados Classes
    public String marca, modelo ;

    //método Costrutor
    public Carro(){
        this.marca = "Não definida";
        this.modelo = "Não definido";
    }

    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodos
    public void exibirDetalhes(){
        // this representa o objeto que  chama o método
        JOptionPane.showMessageDialog(null,"Marca:" + this.marca +
                "\n Modelo:"+ this.modelo +
                "\n Ano:"+ this.ano +
                "\n Velocidade:" + this.velocidade);
    }
    // acelerar o carro x unidades
    public void acelerar(float x) {
        this.velocidade = this.velocidade + x;
    }

    // frear o carro de x unidades
    /*public void frear(float x){
        this.velocidade = this.velocidade - x;
        if(this.velocidade < 0) {
            System.out.println("Velocidade negativa!");
            this.velocidade = this.velocidade + x;

        }
    }*/
    public void frear(float x) {
        if(this.velocidade >= x) {
            ;
            this.velocidade -= x;
        }
        else{
            JOptionPane.showMessageDialog(null,"Velocidade não pode ficar negativa");
        }

    }


}
