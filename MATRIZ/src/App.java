import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
    
        int[] meu_array = new int [5];
        meu_array[0] = 10;
        meu_array[1] = 20;
        meu_array[2] = 30;
        meu_array[3] = 40;
        meu_array[4] = 50;

        int element0 = meu_array[0];
        int element1 = meu_array[1];

        System.out.println(element0);
        System.out.println(element1);

        String [] lista_aluno = new String[5];
        lista_aluno [0] = "João";
        lista_aluno [1] = "Vanessa";
        lista_aluno [2] = "Davi";
        lista_aluno [3] = "Lucas";
        lista_aluno [4] = "Igor";

        String [] lista_cidades = {"Poá", "Itaim Paulista", "Suzano", "Itu"};

        System.out.println (lista_cidades[3]);

        for (int i = 0; i < meu_array.length; i++) {
            System.out.println ("Elemento " + i + ": " + meu_array[i]);
        }
        
        for(int i=0; i <lista_aluno.length; i++){
            System.out.println("Elemento " +i+ ": " +lista_aluno[i]);
        }

        for(int i=0; i <lista_cidades.length; i++){
            System.out.println("Elemento " +i+ ": " +lista_cidades[i]);
    }

        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(lista_aluno));

        System.out.println(array.length);
        int [] copia = array.clone();
        String [] copia_cidades = lista_cidades;

        String [] copia_sel = Arrays.copyOf(lista_cidades,2);
        System.out.println("Copia: " + Arrays.toString(copia_sel));

        int [] nova_array = {5,6,4,2,3};
        Arrays.sort(nova_array);
        System.out.println("Ordenada em: " + Arrays.toString(nova_array));

        int [] array_vazia = new int [5];
        Arrays.fill(array_vazia, 10);
        System.out.println(Arrays.toString(array_vazia));

        boolean resposta = Arrays.equals(lista_cidades, copia_cidades);
        System.out.println("São iguais: "+resposta);

        if (Arrays.equals(lista_cidades, copia_cidades)){
            System.out.println("Elas são iguais");
        } else {
            System.out.println("Elas são diferentes");
        }

        int posicao = Arrays.bynarySearch(nova_array, "6");
        System.out.println ("Foi localizado na posição: "+posicao);
        
}
}