package atividade;

public class main {
    public static void main(String[] args) {
        Programa conta1 = new Programa("123", 1000.0f, "14/03/2024", true, 0);
        Programa conta2 = new Programa("456", 500.0f, "14/03/2024", true, 0);
        
        System.out.println(conta1);
        
        conta1.transferir(300, conta2);
        
        
        System.out.println(conta1);
        System.out.println(conta2);
        conta2.depositar(200);
        System.out.println(conta2);
        conta2.sacar(400);
        System.out.println(conta2);
    }
}

