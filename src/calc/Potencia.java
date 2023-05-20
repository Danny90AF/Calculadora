
package calc;

public class Potencia {
    float valor1,valor2,total;

    public Potencia(float va1, float va2) {
        this.valor1 = va1;
        this.valor2 = va2;
    }
    
    
    public Potencia(){}
    
    
    
    public float Potenciar(){
    
    total =(float)Math.pow(valor1, valor2);
    
    return total; 
    }
}
