package com.ordem_de_servico;

import java.util.LinkedList;
import java.util.Queue;


import java.util.Iterator;

public class Fila<T> {
    private Queue<T> fila = new LinkedList<>();

    
    public void inserir(T elemento) {
        fila.offer(elemento);
    }

    
    public void excluir( T elemento) {
        fila.remove(elemento);
    }

    
    public void listarElementos() {
        Iterator<T> iterator = fila.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    
    public void percorrerPausadamente() {
        for (T elemento : fila) {
            System.out.println(elemento);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean pesquisar(T elemento) {
        return fila.contains(elemento);
    }
}

