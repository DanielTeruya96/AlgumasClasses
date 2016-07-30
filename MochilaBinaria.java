import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tokencio on 29/07/2016.
 */
public class MochilaBinaria {

    private int pesoMax;
    private int quantItem;
    private List<Integer> valores;
    private List<Integer> pesos;
    private int[][] matriz;
    private int a,b;

    /**
     * O Peso maximo que a mochila pode suportar
     * @param pesoMax max do peso da mochila
     */
    MochilaBinaria(int pesoMax){
        this.pesoMax = pesoMax;
        valores = new ArrayList<Integer>();
        pesos = new ArrayList<Integer>();
        quantItem = 0;
    }

    /**
     * O valor do ""Livro"" e o ""peso"" do livro
     * @param valor
     * @param peso
     */
    public void setElemento(int valor,int peso){
        valores.add(valor);
        pesos.add(peso);
        quantItem = valores.size();
    }

    /**
     *
     * @return a maior valor de combinação da mochila
     */
    public int getMaiorCombinacao(){
        matriz = new int[quantItem+1][pesoMax+1];
        for(int i = 1 ; i < quantItem+1;i++) {
            for (int j = 1; j < pesoMax+1; j++) {
                if(pesos.get(i)> j){
                    matriz[i][j] = matriz[i-1][j];
                }else{
                    a = matriz[i-1][j-pesos.get(i)]+valores.get(i);
                    b = matriz[i-1][j];
                    if(a > b){
                        b = a;
                    }
                    matriz[i][j] = b;
                }

            }
        }
        return matriz[quantItem][pesoMax];
    }

    /**
     *
     * @return toda a matriz
     */
    public int[][] getMatriz(){
        matriz = new int[quantItem+1][pesoMax+1];
        for(int i = 1 ; i < quantItem+1;i++) {
            for (int j = 1; j < pesoMax+1; j++) {
                if(pesos.get(i)> j){
                    matriz[i][j] = matriz[i-1][j];
                }else{
                    a = matriz[i-1][j-pesos.get(i)]+valores.get(i);
                    b = matriz[i-1][j];
                    if(a > b){
                        b = a;
                    }
                    matriz[i][j] = b;
                }

            }
        }
        return matriz;
    }










}
