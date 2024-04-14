package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    // private static final int BRANCO = -1;
    // private static final int CINZA = 0;
    // private static final int PRETO = 1;

    private int[] cor;
    private int[] distancia;
    private Integer[] ante;
    private Queue<Integer> fila;
    private Integer[][] grafo;
    private Queue<Integer> result;
    
    public BFS(Integer[][] grafo){
        this.grafo = grafo;
        this.fila = new LinkedList<Integer>();
        this.result = new LinkedList<Integer>();
        this.cor = new int[this.grafo.length];
        this.distancia = new int[this.grafo.length];
        this.ante = new Integer[this.grafo.length];
    }

    public Queue<Integer> solution(int s){
        for(int i =0; i<this.grafo.length; i++){
            this.cor[i] = -1;
            this.distancia[i] = -1;
            this.ante[i] = null; 
        }
        this.cor[s] = 0;
        this.distancia[s] = 0;
        this.fila.add(s);
        while (!this.fila.isEmpty()) {
            int u = this.fila.poll();
            for(int i =0; i<this.grafo[u].length; i++){
                if(this.grafo[u][i] == 1 && this.cor[i] == -1){
                    this.cor[i] = 0;
                    this.distancia[i] = this.distancia[u] +1;
                    this.ante[i] = u;
                    this.fila.add(i);
                }
            }
            this.cor[u] = 1;
            this.result.add(u);
        }
        return this.result;
    }
    //
    //
    //Getters and Setters
    public int[] getCor() {
        return cor;
    }

    public void setCor(int[] cor) {
        this.cor = cor;
    }

    public int[] getDistancia() {
        return distancia;
    }

    public void setDistancia(int[] distancia) {
        this.distancia = distancia;
    }

    public Integer[] getAnte() {
        return ante;
    }

    public void setAnte(Integer[] ante) {
        this.ante = ante;
    }

    public Queue<Integer> getFila() {
        return fila;
    }

    public void setFila(Queue<Integer> fila) {
        this.fila = fila;
    }

    public Integer[][] getGrafo() {
        return grafo;
    }

    public void setGrafo(Integer[][] grafo) {
        this.grafo = grafo;
    }

}
