/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pablo.teste.palindromo;

import org.junit.Test;

/**
 *
 * @author aluno
 */
public class Palindromo {

    
    @Test
   public boolean testePalindromo(String frase) {
        
       String testPalindromo = frase.toUpperCase().replace(" ", "").replace("-", "");

        for(int i = 0; i < testPalindromo.length(); i++) {
            int outroLado = testPalindromo.length() -i - 1;
            if(testPalindromo.charAt(i) != testPalindromo.charAt(outroLado)) {
                return false;
            }
        }
        return true;
    }
         
}