import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnalistaTest {
    Analista barba;
    
    @BeforeEach 
    public void setUp(){
        barba = new Analista("Barba", "000.000.000-57");      
    }

    @Test 
    public void pagamentoRecebidoEstaCorreto(){
        //Act
        barba.addHorasExtras(3);
        barba.addHorasExtras(5);
        double valor = 4836d + ((4836d * (1d/90)) * 8);
        double res = barba.registrarPagamento();
        //Assert
        assertEquals(valor, res, 0.01);
    }

    @Test 
    public void adicionandoHorasExtrasAcimaDoLimite(){
        barba.addHorasExtras(30);
        double res = barba.addHorasExtras(11);
        assertEquals(30d, res, 0.01);
    }
    

}   
