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

    MochilaBinaria(int pesoMax){
        this.pesoMax = pesoMax;
        valores = new ArrayList<Integer>();
        pesos = new ArrayList<Integer>();
        quantItem = 0;
    }

    public void setElemento(int valor,int peso){
        valores.add(valor);
        pesos.add(peso);
        quantItem = valores.size();
    }

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
