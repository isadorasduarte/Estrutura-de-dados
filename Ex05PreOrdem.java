import java.util.ArrayList;
import java.util.List;

public class Ex05PreOrdem{

    static class No{
        String etapa;
        No esquerda;
        No direita;
    

    No(String etapa){
        this.etapa=etapa;
    }
}

    public static List<String> preOrdem(No raiz){
        List<String> resultado = new ArrayList<>();
        preOrdemRec(raiz, resultado);
        return resultado;
    }

    public static void preOrdemRec(No atual, List<String> resultado){
        if(atual==null){
            return;
        }
        resultado.add(atual.etapa);
        preOrdemRec(atual.esquerda, resultado);
        preOrdemRec(atual.direita, resultado);
    }

    public static No exemplo(){
        No raiz= new No("Deploy");
        raiz.esquerda=new No("Build");
        raiz.direita= new No("Testar");
        raiz.esquerda.esquerda= new No("Compilar");
        raiz.esquerda.direita= new No("Gerar JAR");
        return raiz;
    }

      public static void main(String[] args) {

        No raiz = exemplo();

        List<String> resultado = preOrdem(raiz);

        System.out.println(resultado);
    }


}