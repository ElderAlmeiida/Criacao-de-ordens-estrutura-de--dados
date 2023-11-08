package com.ordem_de_servico;

import java.util.Stack;

public class Pilha<T> {
    private Stack<T> pilha = new Stack<>();

    // Inserir elemento na pilha
    public void inserir(T elemento) {
        pilha.push(elemento);
    }

    // Excluir elemento da pilha
    public void excluir(T elemento) {
        Stack<T> tempStack = new Stack<>();
        
        while (!pilha.isEmpty()) {
            T topElement = pilha.pop();
            if (!topElement.equals(elemento)) {
                tempStack.push(topElement);
            }
        }
        
        // Agora, restaura a pilha original sem o elemento a ser excluído
        while (!tempStack.isEmpty()) {
            pilha.push(tempStack.pop());
        }
    }

    // Listar todos os elementos da pilha
    public void listarElementos() {
        for (T elemento : pilha) {
            System.out.println(elemento);
        }
    }

    // Percorrer pausadamente todos os elementos
    public void percorrerPausadamente() {
        for (T elemento : pilha) {
            System.out.println(elemento);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre cada elemento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Pesquisar elemento específico na pilha
    public boolean pesquisar(T elemento) {
        return pilha.contains(elemento);
    }
}
