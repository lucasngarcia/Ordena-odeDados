package controller;

import javax.sound.midi.SysexMessage;
import model.Dados;
import model.Metodos;
import view.Tela;

public class Principal {
    public static void main(String[] args) {
        
        Tela tela = new Tela();
        tela.setVisible(true);
  
        /* Analise de performance 
        tempo = Metodos.quickDiasSemChuva(total);
        System.out.println("Tempo 'dias sem chuva' em quick: " + tempo + "ms");
        
        tempo = Metodos.quickData(total);
        System.out.println("Tempo 'data' em quick: " + tempo + "ms");
        
        tempo = Metodos.quickSatelite(total);
        System.out.println("Tempo 'Satelite' em quick: " + tempo + "ms");
        
        tempo = Metodos.quickEstado(total);
        System.out.println("Tempo 'Estado' em quick: " + tempo + "ms");
        
        tempo = Metodos.quickMunicipio(total);
        System.out.println("Tempo 'Municipio' em quick: " + tempo + "ms");
        
        tempo = Metodos.quickPrecipitacao(total);
        System.out.println("Tempo 'Precipitacao' em quick: " + tempo + "ms");
        
        tempo = Metodos.quickRiscoDeFogo(total);
        System.out.println("Tempo 'Risco de Fogo' em quick: " + tempo + "ms");
        
        tempo = Metodos.quickFrp(total);
        System.out.println("Tempo 'FRP' em quick: " + tempo + "ms");
        
        tempo = Metodos.insertionData(total);
        System.out.println("Tempo 'Data' em insert: " + tempo + "ms");
        
        tempo = Metodos.insertionSatelite(total);
        System.out.println("Tempo 'Satelite' em insert: " + tempo + "ms");
        
        tempo = Metodos.insertionEstado(total);
        System.out.println("Tempo 'Estado' em insert: " + tempo + "ms");
        
        tempo = Metodos.insertionMunicipio(total);
        System.out.println("Tempo 'Municipio' em insert: " + tempo + "ms");
        
        tempo = Metodos.insertionDiasSemChuva(total);
        System.out.println("Tempo 'Dias sem chuva' em insert: " + tempo + "ms");
        
        tempo = Metodos.insertionPrecipitacao(total);
        System.out.println("Tempo 'Precipitação' em insert: " + tempo + "ms");
        
        tempo = Metodos.insertionRiscoDeFogo(total);
        System.out.println("Tempo 'Risco de fogo' em insert: " + tempo + "ms");
        
        tempo = Metodos.insertionFrp(total);
        System.out.println("Tempo 'FRP' em insert: " + tempo + "ms");
        
        tempo = Metodos.bubbleData(total);
        System.out.println("Tempo 'Data' em bubble: " + tempo + "ms");
        
        tempo = Metodos.bubbleSatelite(total);
        System.out.println("Tempo 'Satelite' em bubble: " + tempo + "ms");
        
        tempo = Metodos.bubbleEstado(total);
        System.out.println("Tempo 'Estado' em bubble: " + tempo + "ms");
        
        tempo = Metodos.bubbleMunicipio(total);
        System.out.println("Tempo 'Municipio' em bubble: " + tempo + "ms");
        
        tempo = Metodos.bubbleDiasSemChuva(total);
        System.out.println("Tempo 'Dias sem chuva' em bubble: " + tempo + "ms");
        
        tempo = Metodos.bubblePrecipitacao(total);
        System.out.println("Tempo 'Precipitacao' em bubble: " + tempo + "ms");
        
        tempo = Metodos.bubbleRiscoDeFogo(total);
        System.out.println("Tempo 'Risco de fogo' em bubble: " + tempo + "ms");
        
        tempo = Metodos.bubbleFrp(total);
        System.out.println("Tempo 'FRP' em bubble: " + tempo + "ms"); */
    }
}
