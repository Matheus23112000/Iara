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
public class classe02 {

    String bairro;

    /* criando um atributo */

    /**
     * Método para imprimir Bairro
     * @param args String 
     * @return void - não retorna nada
     */
    public static void main(String[] args) {
        System.out.println("Bairro");
    }

    /**
     * Método para retorno bairro
     *
     * @return String - bairro (a variável que vai representar um bairro)
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Método para atribuir um valor ao bairro
     *
     * @param bairro String - bairro
     *
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
