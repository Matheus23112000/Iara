/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iara Letícia e Matheus Gabriel
 * @since '06-08-2019'
 */
public class classe01 {

    /**/

    String end;

    /* criando um atributo */

    /**
     * Método para imprimir end
     * @param args String 
     * @return void - não retorna nada
     */
    public static void main(String[] args) {
        System.out.println("end");
        System.out.println("end segundo");
    }
      
    /**
     * Método para retorno endereço
     *
     * @return String - end (a variável que vai representar um endereço)
     */
    public String getEnd() {
        return end;
    }

    /**
     * Método para atribuir um valor ao endereço
     *
     * @param end String - endereço
     *
     */
    public void setEnd(String end) {
        this.end = end;
    }

}
