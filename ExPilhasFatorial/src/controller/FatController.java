package controller;

public class FatController {

    // Definir uma classe interna para a pilha de inteiros
    private class Pilha {
        private int[] elementos;
        private int topo;

        // Construtor da pilha
        public Pilha(int capacidade) {
            elementos = new int[capacidade];
            topo = -1;
        }

        // Método para empilhar (push)
        public void push(int valor) {
            topo++;
            elementos[topo] = valor;
        }

        // Método para desempilhar (pop)
        public int pop() {
            int valor = elementos[topo];
            topo--;
            return valor;
        }

        // Verifica se a pilha está vazia
        public boolean isEmpty() {
            return topo == -1;
        }
    }

    // Método que calcula o fatorial usando a pilha
    public int fatorial(int valor) {
        if (valor == 0) {
            return 1;  // Fatorial de 0 é 1
        }

        Pilha pilha = new Pilha(valor); // Criar uma pilha com a capacidade do valor
        int resultado = 1;

        // Empilhar todos os números de valor até 1
        for (int i = valor; i > 0; i--) {
            pilha.push(i);
        }

        // Desempilhar e multiplicar os valores
        while (!pilha.isEmpty()) {
            resultado *= pilha.pop();
        }

        return resultado;
    }
}
