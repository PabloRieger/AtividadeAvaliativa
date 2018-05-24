/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pablo.teste.palindromo;

import org.junit.Assert;

/**
 *
 * @author aluno
 */
public class TestePalindromo {
    
    public void testaPalindromoVerdadeiro(){
    
    Palindromo palindromo = new Palindromo();
    boolean teste =  palindromo.testePalindromo("ANA");
    
    Assert.assertTrue(teste);
    }
   
}
