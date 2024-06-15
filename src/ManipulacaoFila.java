import java.util.NoSuchElementException;

public class ManipulacaoFila {

    No head = null;

    No fim = null;

    public void add(int valor){
        No no = new No();
        no.setValor(valor);

        if (head == null){
            head = no; //DIZEMOS QUE O INICIO DA FILA É AGORA O NOSSO NOVO NÓ
            fim = no; //DIZEMOS QUE O FIM DA FILA É TAMBÉM ESSE NOVO NÓ, PORQUE ELE É O UNICO NÓ NA FILA

            no.setNext(null);
        }else {
            fim.setNext(no); //DIZEMOS QUE O NÓ ATUAL NO FINAL DA FILA, DEVE APONTAR PARA O NOVO NÓ.
            no.setNext(null); //CONFIGURAMOS O PROXIMO NÓ DO NOVO NÓ COMO NULL PORQUE ELE É O NOVO ULTIMO NÓ DA FILA

            fim = no; //GRAÇAS A DEUS, ATUALIZAMOS O FIM, PARA APONTAR PARA O NOVO NÓ, DIZENDO QUE ELE É AGORA O FINAL DA FILA.
        }
    }

    public void listar(){
        No list = head;

        while (list != null){
            System.out.println("Valores: " + list.getValor());
            list = list.getNext();
        }
    }

    public int deletar(){
        if (head == null){
            throw new NoSuchElementException("A fila está vazia!!");
        }else {
            No del = head; //FRIST IN - FIRST OUT

            if (head == fim && head != null){
                head = null; //CONFIGURAMOS QUE HEAD PARA NULL, INDICANDO QUE A FILA AGORA ESTÁ VAZIA.
                fim = null; //FIM PARA NULL, PORQUE NÃO HÁ ELEMENTOS NA FILA

                }else {
                head = head.getNext();
            }
            return del.getValor();
        }


    }

}
