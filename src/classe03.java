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
public class classe03 {

    String n;

    /* criando um atributo */

    /**
     * Método para imprimir Número
     * @param args String 
     * @return void - não retorna nada
     */
    public static void main(String[] args) {
        System.out.println("Número");
        System.out.println("Número segundo");
    }

    /**
     * Método para retorno de número
     *
     * @return String - n (a variável que vai representar um número)
     */
    public String getNumero() {
        return n;
    }

    /**
     * Método para atribuir um valor ao n
     *
     * @param n String - número
     *
     */
    public void setNumero(String n) {
        this.n = n;
    }

}
