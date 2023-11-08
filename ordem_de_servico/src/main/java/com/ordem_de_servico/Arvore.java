package com.ordem_de_servico;

class NoArvore<T extends Comparable<T>> {
    T dado;
    NoArvore<T> esquerda;
    NoArvore<T> direita;

    public NoArvore(T dado) {
        this.dado = dado;
        esquerda = null;
        direita = null;
    }
}

public class Arvore<T extends Comparable<T>> {
    private NoArvore<T> raiz;

    public Arvore() {
        raiz = null;
    }

    public void inserir(T elemento) {
        raiz = inserirRecursivamente(raiz, elemento);
    }

    private NoArvore<T> inserirRecursivamente(NoArvore<T> no, T elemento) {
        if (no == null) {
            return new NoArvore<>(elemento);
        }

        if (elemento.compareTo(no.dado) < 0) {
            no.esquerda = inserirRecursivamente(no.esquerda, elemento);
        } else if (elemento.compareTo(no.dado) > 0) {
            no.direita = inserirRecursivamente(no.direita, elemento);
        }

        return no;
    }

    public void excluir(T elemento) {
        raiz = excluirRecursivamente(raiz, elemento);
    }

    private NoArvore<T> excluirRecursivamente(NoArvore<T> no, T elemento) {
        if (no == null) {
            return no;
        }

        if (elemento.compareTo(no.dado) < 0) {
            no.esquerda = excluirRecursivamente(no.esquerda, elemento);
        } else if (elemento.compareTo(no.dado) > 0) {
            no.direita = excluirRecursivamente(no.direita, elemento);
        } else {
            if (no.esquerda == null) {
                return no.direita;
            } else if (no.direita == null) {
                return no.esquerda;
            }
            no.dado = encontrarMenorValor(no.direita);
            no.direita = excluirRecursivamente(no.direita, no.dado);
        }

        return no;
    }

    private T encontrarMenorValor(NoArvore<T> no) {
        T minValor = no.dado;
        while (no.esquerda != null) {
            minValor = no.esquerda.dado;
            no = no.esquerda;
        }
        return minValor;
    }

    public void listarEmOrdem() {
        listarEmOrdemRecursivamente(raiz);
    }

    private void listarEmOrdemRecursivamente(NoArvore<T> no) {
        if (no != null) {
            listarEmOrdemRecursivamente(no.esquerda);
            System.out.println(no.dado);
            listarEmOrdemRecursivamente(no.direita);
        }
    }

    public void percorrerComPausa() {
        percorrerComPausaRecursivamente(raiz);
    }

    private void percorrerComPausaRecursivamente(NoArvore<T> no) {
        if (no != null) {
            percorrerComPausaRecursivamente(no.esquerda);
            System.out.println(no.dado);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre cada elemento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            percorrerComPausaRecursivamente(no.direita);
        }
    }

    public boolean pesquisar(T elemento) {
        return pesquisarRecursivamente(raiz, elemento);
    }

    private boolean pesquisarRecursivamente(NoArvore<T> no, T elemento) {
        if (no == null) {
            return false;
        }

        if (elemento.compareTo(no.dado) == 0) {
            return true;
        } else if (elemento.compareTo(no.dado) < 0) {
            return pesquisarRecursivamente(no.esquerda, elemento);
        } else {
            return pesquisarRecursivamente(no.direita, elemento);
        }
    }
}
