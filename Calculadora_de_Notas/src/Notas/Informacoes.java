/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

/**
 *
 * @author Joao
 */
public class Informacoes {
    String nome, matricula;
    
    public void setnome(String snome){this.nome = snome;}
    public void setmatricula(String smatricula){this.matricula = smatricula;}
    
    public String retorna_nome(){return nome;}
    public String retorna_matricula(){return matricula;}
}
