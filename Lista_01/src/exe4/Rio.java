
package exe4 ;
public class Rio {
    public String nome ;
    public float nivel ;
    public boolean poluido;

    public Rio() {
        this.nome = "Sem Nome";
        this.nivel = 0;
        this.poluido = false;
    }

    public Rio(String nome, float nivel , boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void Chover(float volume){
        this.nivel += volume;
    }

    public void Sol(float calor){
        if(nivel >= calor){
            this.nivel -= calor;
        }
        else{
            System.out.println("Nivel do Rio não foi alterado");
        }


    }

    public void Sujar(String sujo){
        if(sujo.equals("Poluido")){
            this.poluido = true;
        }
    }

    public void Limpar(String limpo){
        if(limpo.equals("Limpo")){
            this.poluido = false;
        }
    }

    public void Estatos(){
        System.out.println("Nome do Rio: " + this.nome + "\n Nivel do Rio: " + this.nivel + "\n Poluido: " + this.poluido);
    }
}
