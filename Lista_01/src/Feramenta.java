public class Feramenta {
    public String Dono, Telefone, Modelo, Problema ;

    public Feramenta(){
        this.Dono = "Não definido";
        this.Telefone = "Não definido";
        this.Modelo = "Não definido";
        this.Problema = "Não definido";
    }

    public Feramenta( String Dono, String Telefone, String Modelo, String Problema){
        this.Dono = Dono;
        this.Telefone = Telefone;
        this.Modelo = Modelo;
        this.Problema = Problema;
    }

    public void Exibir_OS(){
        System.out.println("Dono: " + this.Dono +
                            "\nTelefone: " + this.Telefone +
                                "\nModelo: " + this.Modelo +
                                    "\nProblema: " + this.Problema);
    }



}
