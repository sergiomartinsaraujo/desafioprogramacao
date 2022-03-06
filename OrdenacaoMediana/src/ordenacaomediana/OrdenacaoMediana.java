/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacaomediana;

import java.util.Arrays;

/**
 *
 * @author A
 */
public class OrdenacaoMediana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int vet[] = {18, 9, 5, 2, 23, 14, 25};
    Arrays.sort(vet);
        System.out.println("A ordenação da lista de números é: ");
    for (int valor: vet){        
    System.out.print((valor + " "));
    }
    System.out.println();
    int esq = 0;
    int dir = vet.length-1;
    int meio;
    meio = (dir - esq)/2 ;
        System.out.println("o valor da mediana è: ");
        System.out.println( vet [meio]);


// TODO code application logic here
    }
    
}
