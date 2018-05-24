/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.pablo.teste;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author aluno
 */
public class TesteSalario {
    @Test
    public void testaPorcentagem()throws Exception {
    
                int salario = 100;
                int porcentagem = 10;
		Calculadora calculadora = new Calculadora();
		int calcula = calculadora.calcula(salario, porcentagem);

                assertEquals(110, calcula);
                
    }
    
}
