public class Ex01AlturaDaArvore {

    static class No{
        String nome;
        No left;
        No right;

        No(String nome){
            this.nome=nome;
        }
    }
        public static int altura(No raiz){
            if(raiz==null){
                return 0;
            }

            int alturaEsquerda = altura(raiz.left);
            int alturaDireita=altura(raiz.right);

            return 1+ Math.max(alturaEsquerda, alturaDireita);

        }

        public static No exemploPastas(){
            No raiz= new No("/");
            raiz.left= new No("Home");
            raiz.right= new No("etc");
            raiz.left.left=new No("user");
            raiz.left.left.left= new No("name");
            return raiz;

        }

        public static void main(String[] args) {
            No raiz = exemploPastas();
    
            System.out.println(altura(raiz));
        }
    
}
