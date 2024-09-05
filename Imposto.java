public class Imposto {
    private String nome;
    private double salarioBruto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double calcularImposto(){
        double salarioFinal = 0;

        //Até 2.112,00
        if (salarioBruto <= 2112){
            salarioFinal = salarioBruto;
            System.out.println("O seu salário final vai ser de: R$%.2f" + salarioFinal);
        }

        //De 2.112,01 até 2.826,65
        else if (salarioBruto >= 2112.01 || salarioBruto <= 2826.65){
            double valorTaxado = 0.075 * salarioBruto;
            salarioFinal = salarioBruto - valorTaxado;
            System.out.printf("O seu salário final vai ser de: R$%.2f", salarioFinal);
        }

        //De 2.826,66 até 3.751,05
        else if (salarioBruto >= 2826.66 || salarioBruto <= 3751.05){
            double valorTaxado = 0.15 * salarioBruto;
            salarioFinal = salarioBruto - valorTaxado;
            System.out.printf("O seu salário final vai ser de: R$%.2f", salarioFinal);
        }

        //De 3.751,06 até 4.664,68
        else if(salarioBruto >= 3751.06 || salarioBruto <= 4664.68){
            double valorTaxado = 0.225 * salarioBruto;
            salarioFinal = salarioBruto - valorTaxado;
            System.out.printf("O seu salário final vai ser de: R$%.2f", salarioFinal);
        }

        //Acima de 4.664,68
        else if(salarioBruto > 4664.68){
            double valorTaxado = 0.275 * salarioBruto;
            salarioFinal = salarioBruto - valorTaxado;
            System.out.printf("O seu salário final vai ser de: R$%.2f" + salarioFinal);
        }

        return salarioFinal;
    }

}
