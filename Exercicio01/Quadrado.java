/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

/**
 *
 * @author Aluno
 */
public class Quadrado extends Retangulo{
    
    private float lado;
    
    @Override
    public void calculoArea(float lado){
        area = (float) (lado * lado);
    }
    
    @Override
    public void calculoPerimetro(float lado){
        area = (float) (lado + lado);
    }
    
    
}
