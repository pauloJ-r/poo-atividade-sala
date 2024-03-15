package atividade;

import java.util.Objects;

public class Programa {
	
    String numero;
    float saldo;
    String data;
    boolean status;
    int contador;
    // Classe construtor
    public Programa (String numero, float saldo,
    		       String data, boolean status, int contador) {
    	this.numero = numero;
    	this.data = data;
    	this.saldo = saldo;
        this.status = status;  	
        this.contador = contador;
    }
    // Metodo para sacar o dinheiro
    public boolean sacar (double valor) {
    	if(this.status && this.saldo >= valor && valor > 0) {
    		this.saldo -= valor;
    		return true;
    	} else {
    		return false;
    	}
    }
    // Metodo para depositar o dinheiro
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }
    // Método para transferir entre contas
    public boolean transferir(float quantia, Programa destino) {
        if (this.sacar(quantia)) {
            destino.depositar(quantia);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Programa programa = (Programa) obj;
        return Objects.equals(numero, programa.numero);
    } 
    @Override
    public String toString() {
        return "Programa{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", data='" + data + '\'' +
                ", status=" + status +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
