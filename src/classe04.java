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
public class classe04 {

    String nome;

    /* criando um atributo */

    /**
     * Método para imprimir Nome
     * @param args String 
     * @return void - não retorna nada
     */
    public static void main(String[] args) {
        System.out.println("Nome");
        System.out.println("Nome segundo");

    }

    /**
     * Método para retorno de nome
     *
     * @return String - nome (a variável que vai representar um nome)
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para atribuir um valor ao nome
     *
     * @param nome String - nome
     *
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
