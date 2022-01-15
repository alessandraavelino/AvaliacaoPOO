import java.util.Scanner;
public class Quadrado {
    
    Scanner entrada = new Scanner(System.in);
    double lado, area, perimetro;
    
    
    double calcularArea (){
        
        area = lado*lado;
        
        return area;
    }
     double calcularPerimetro (){
        
        perimetro = 4*lado;
        
        return perimetro;
    }
     
    void imprimir(){
        
        System.out.println("O quadrado com o lado: "
                +lado+"\nPossui Área: "+calcularArea()
                +"\nPossui Perimetro: "+calcularPerimetro());
    }
    
    void construtor(){
        
        System.out.println("Lado do quadrado: ");
        lado = entrada.nextDouble();
    }
    
}
