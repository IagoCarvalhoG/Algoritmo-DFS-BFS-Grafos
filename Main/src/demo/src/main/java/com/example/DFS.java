package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class DFS {
    private LinkedList<LinkedList<Integer>> grafo;
    private String cor[];
    private Integer i[];
    private Integer f[];
    private Integer ante[];
    private Integer tempo = 0;
    private Queue<Integer> result;

    public DFS(LinkedList<LinkedList<Integer>> grafo) {
        this.grafo = grafo;
        this.cor = new String [grafo.size()];
        this.i = new Integer[grafo.size()];
        this.f = new Integer[grafo.size()];
        this.ante = new Integer[grafo.size()];
        this.result = new LinkedList<Integer>();
    }

    public Queue<Integer> dfs_start(int s){
        for(int i =0; i<grafo.size(); i++){
            this.cor[i] = "branco";
        }
        
        this.i[s] = -2;
        this.f[s] = -2;
        this.ante[s] = -2;
        this.tempo = 0;
        dfsVisit(grafo, s);
        return this.result;
    }

    private void dfsVisit(LinkedList<LinkedList<Integer>> grafo,int s ){
        this.cor[s] = "cinza";
        this.i[s] = this.tempo++;
        for(int i =0; i<grafo.get(s).size();i++){
            int v = grafo.get(s).get(i);
            if(cor[v] == "branco"){
                
                this.ante[v] = s;
                dfsVisit(grafo, v);
            }
        }
        this.cor[s] = "preto";
        this.result.add(s);
        this.f[s] = tempo++;
    }
    
    //
    //Getters and Setters
    public LinkedList<LinkedList<Integer>> getGrafo() {
        return grafo;
    }

    public void setGrafo(LinkedList<LinkedList<Integer>> grafo) {
        this.grafo = grafo;
    }

    public String[] getCor() {
        return cor;
    }

    public void setCor(String[] cor) {
        this.cor = cor;
    }

    public Integer[] getI() {
        return i;
    }

    public void setI(Integer[] i) {
        this.i = i;
    }

    public Integer[] getF() {
        return f;
    }

    public void setF(Integer[] f) {
        this.f = f;
    }

    public Integer[] getAnte() {
        return ante;
    }

    public void setAnte(Integer[] ante) {
        this.ante = ante;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Queue<Integer> getResult() {
        return result;
    }

    public void setResult(Queue<Integer> result) {
        this.result = result;
    }
}