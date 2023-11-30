public class Conversor extends Variavel{
    public void verificaCompare(){
        if(this.getTipo() == 1){
            System.out.println("Erro: Não é possível comparar um valor do tipo String.");
            System.exit(0);
        }

    }
}