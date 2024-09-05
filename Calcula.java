package AtividadeAva;

public class Calcula {
    public void calcula(double lado, double lado2){
        double area = lado * lado2;
        if (lado != lado2){
            System.out.println("A área do retângulo é: " + area);
        }
        if (lado == lado2){
            System.out.println("A área do quadrado é: " + area);
        }
    }

    public void calcula(double raio){
        double area = 3.14 * (raio * raio);
        System.out.println("A área do circulo é: " + area);
    }

}
