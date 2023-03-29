public class Pile {

    private No top;
    public int elements;


    public void Pile(){
        top = null;
        elements = 0;
    }

    public boolean empty() {
        if (elements == 0)
            return true;
        else
            return false;

    }
    public int top(){
        if(empty()){
            return -1;
        }else{
            return top.getContent();
        }
    }

    public int pileSize(){
        if(empty()){
            return 0;
        }else{
            return elements;
        }
    }

    public boolean push(int valor){
        No novoNo = new No();

        novoNo.setContent(valor);

        novoNo.setNext(top);

        top = novoNo;
        elements++;
        return true;

    }
    public boolean pop(){
        No aux = top;

        int value = aux.getContent();

        top = aux.getNext();
        aux = null;
        elements--;
        return true;
    }
}