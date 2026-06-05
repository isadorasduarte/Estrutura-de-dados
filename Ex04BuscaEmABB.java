public class Ex04BuscaEmABB {

    static class No{
        int codigo;
        No esquerda;
        No direita;
    

    No(int codigo){
        this.codigo=codigo;
    }
}

    public static boolean buscar(No raiz, int codigo){
        No atual = raiz;
        while(atual!=null){
            if(codigo==atual.codigo){
                return true;
            } else if(codigo<atual.codigo){
                atual=atual.esquerda;
            }else{
                atual=atual.direita;
            }
            }
            return false;
        }

        public static No inserir(No raiz, int codigo){
            if(raiz==null){
                return new No(codigo);
            } 
            if(codigo<raiz.codigo){
                raiz.esquerda=inserir(raiz.esquerda, codigo);
            }else if(codigo>raiz.codigo){
                raiz.direita=inserir(raiz.direita, codigo);
            }
            return raiz;
            }

        public static No exemplo(){
            No raiz = null;
            raiz = inserir(raiz, 10);
            raiz = inserir(raiz, 5);
            raiz = inserir(raiz, 15);
            raiz = inserir(raiz, 3);
            raiz = inserir(raiz, 7);

            return raiz;

        }

        public static void main(String[] args) {
            No raiz = exemplo();

            System.out.println(buscar(raiz, 7)); 
            System.out.println(buscar(raiz, 4)); 
        }
    
    }


    

