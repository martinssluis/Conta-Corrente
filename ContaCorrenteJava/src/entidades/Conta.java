package entidades;
public class Conta {

    private int numero;
    private String titular;
    private double extrato;
    public Conta(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }
    public Conta(int numero, String titular, double depositoInicial){
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial); // caso a regra de deposito do banco mude, como uma taxa, apenas o metodo de deposito será alterado
    }

    public int getNumero() {
        return numero;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getExtrato() {
        return extrato;
    }

    public void deposito(double quantia){ // principio do encapsulamento
        extrato += quantia;
    }
    public void saque(double quantia){
        extrato -= quantia + 5.0; //5 de taxa
    }
    public String toString(){
        return "Conta "
                + numero
                + ", Titular: "
                + titular
                + ", Extrato: $ "
                + String.format("%.2f", extrato);
    }
}
