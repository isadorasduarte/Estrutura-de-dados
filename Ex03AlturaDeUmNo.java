public class Ex03AlturaDeUmNo {

    static class No{
        int id;
        No esquerda;
        No direita;
    

    No(int id){
        this.id=id;
    }
}

    public static int alturaDoNo(No raiz, int alvo){
       No noAlvo= buscarNo(raiz, alvo);
       if (noAlvo==null){
        return -1;
       }
       return alturaSubarvore(noAlvo); 

    }

    private static No buscarNo(No atual, int alvo){

        if(atual==null){
            return null;
        }

        if(atual.id==alvo){
            return atual;
        }

        No esquerda = buscarNo(atual.esquerda, alvo);
        if(esquerda!=null){
            return esquerda;
        }

        return buscarNo(atual.direita, alvo);

    }

    private static int alturaSubarvore(No raiz){
        if(raiz==null){
            return 0;
        }
        int alturaEsquerda=alturaSubarvore(raiz.esquerda);
        int alturaDireita=alturaSubarvore(raiz.direita);
        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }

    public static No exemplo(){
        No raiz = new No(1);
        raiz.esquerda= new No(2);
        raiz.direita= new No(3);
        raiz.esquerda.esquerda= new No(4);
        raiz.esquerda.direita= new No(5);
        raiz.esquerda.direita.esquerda= new No(6);
        return raiz;
    }
    public static void main(String[] args) {
        No raiz = exemplo();

        System.out.println(alturaDoNo(raiz, 2)); 
        System.out.println(alturaDoNo(raiz, 3)); 
        System.out.println(alturaDoNo(raiz, 5)); 
        System.out.println(alturaDoNo(raiz, 6)); 
        System.out.println(alturaDoNo(raiz, 7)); 
    }

}
