import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(1, 2);
        
        Assert.assertEquals(3, resultado);
    }
}
