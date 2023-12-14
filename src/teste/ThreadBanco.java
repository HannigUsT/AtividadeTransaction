package teste;
public class ThreadBanco implements Runnable{
    private String nome;
    private int valor;
    private String tipo;
    
    private Banco conta1 = new Banco();
    
    public ThreadBanco(String nome, int valor, String tipo){
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " começou.");
        int movement = conta1.movement(this.valor, this.tipo);
    }
}

