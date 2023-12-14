package teste;
public class Teste {

    public static void main(String[] args) {
        ThreadBanco t1 = new ThreadBanco("Thread #1", 100, "deposito");
        ThreadBanco t2 = new ThreadBanco("Thread #2", 900, "deposito");
        ThreadBanco t3 = new ThreadBanco("Thread #3", 10, "saque");
    }
}
