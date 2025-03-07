
import exe4.Rio;
public class MainRio {

    public static void main(String[] args) {
        Rio rio = new Rio();
        rio.Estatos();

        Rio rio2 = new Rio();
        rio2.nome = "Rio Doce";
        rio2.nivel = 8;
        rio2.poluido = true;
        rio2.Chover(3);
        rio2.Sol(2);
        rio2.Limpar("Limpo");

        rio2.Estatos();

    }

}
