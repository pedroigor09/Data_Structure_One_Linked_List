//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ManipulacaoFila fila = new ManipulacaoFila(); //AGORA TEMOS UMA FILA VAZIA PRONTA PRA SER USADA

        fila.add(9);
        fila.add(14);
        fila.add(20);
        fila.add(25);
        fila.add(40);
        fila.add(90);

        fila.listar();

        System.out.println("Elemento a ser removido: " + fila.deletar() + " e " + fila.deletar());

        fila.listar();
    }
}