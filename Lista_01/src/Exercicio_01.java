public class Exercicio_01 {
    public static void main(String[] args){
        Feramenta f1 = new Feramenta();
        f1.Dono = "Higor Cavallini";
        f1.Telefone = "99131-1700";
        f1.Modelo = "Fs-220";
        f1.Problema = "Eixo quebrado";
        f1.Exibir_OS();

        System.out.println();

        Feramenta f2 = new Feramenta("Marcos", "99231-9130","Ms-170", "Mal funcionamento");
        f2.Exibir_OS();

    }
}
