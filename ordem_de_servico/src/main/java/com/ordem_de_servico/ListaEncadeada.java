package com.ordem_de_servico;



class No<T> {
    T dado;
    No<T> proximo;

    public No(T dado) {
        this.dado = dado;
    }
}

public class ListaEncadeada<T> {
    private No<T> primeiro;

    public void inserir(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No<T> atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void excluir(T elemento) {
        if (primeiro == null) {
            return;
        }
        if (primeiro.dado.equals(elemento)) {
            primeiro = primeiro.proximo;
            return;
        }
        No<T> atual = primeiro;
        No<T> anterior = null;
        while (atual != null && !atual.dado.equals(elemento)) {
            anterior = atual;
            atual = atual.proximo;
        }
        if (atual != null) {
            anterior.proximo = atual.proximo;
        }
    }

    public void listarTodos() {
        No<T> atual = primeiro;
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }

    public boolean pesquisar(String nomeOrdem) {
        No<T> atual = primeiro;
        while (atual != null) {
            if (atual.dado instanceof String && ((String) atual.dado).equals(nomeOrdem)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
    
    
    public void listarPausadamente() {
        No<T> atual = primeiro;
        while (atual != null) {
            System.out.println(atual.dado);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre cada elemento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            atual = atual.proximo;
        }
    }
}
