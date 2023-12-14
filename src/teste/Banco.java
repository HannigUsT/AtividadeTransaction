package teste;
public class Banco {
    private int conta = 1000;
    
    public synchronized int movement(int valor, String tipo){
        System.out.println(+conta);
        switch(tipo){
            case "saque":  
                conta -= valor;
                System.out.println(Thread.currentThread().getName() +" Valor: "+valor+" Total: " +this.conta);
            break;
            case "deposito":
                conta += valor;
                System.out.println(Thread.currentThread().getName() +" Valor: "+valor+" Total: " +this.conta);
            break;
        }
        try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
        }
        return conta;
    }
    
    
}
