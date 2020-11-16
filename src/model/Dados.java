package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class Dados {
    private Date data;
    private String satelite; // n√£o precisa ordenar
    private String pais; // n√£o precisa ordenar
    private String estado; 
    private String municipio;
    private String bioma; //n√£o precisa ordenar
    private int diasSemChuva;
    private double precipitacao;
    private double riscoDeFogo;
    private double latitude; // n√£o precisa ordenar
    private double longitude; // n√£o precisa ordenar
    private double frp;

    public Dados(){
    }
    
    public Dados(Date data, String satelite, String pais, String estado, String municipio, String bioma, double latitude, 
            double longitude) {
        this.data = data;
        this.satelite = satelite;
        this.pais = pais;
        this.estado = estado;
        this.municipio = municipio;
        this.bioma = bioma;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getSatelite() {
        return satelite;
    }

    public void setSatelite(String satelite) {
        this.satelite = satelite;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBioma() {
        return bioma;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }

    public int getDiasSemChuva() {
        return diasSemChuva;
    }

    public void setDiasSemChuva(int diasSemChuva) {
        this.diasSemChuva = diasSemChuva;
    }

    public double getPrecipitacao() {
        return precipitacao;
    }

    public void setPrecipitacao(double precipitacao) {
        this.precipitacao = precipitacao;
    }

    public double getRiscoDeFogo() {
        return riscoDeFogo;
    }

    public void setRiscoDeFogo(double riscoDeFogo) {
        this.riscoDeFogo = riscoDeFogo;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getFrp() {
        return frp;
    }

    public void setFrp(double frp) {
        this.frp = frp;
    }
    
    
    //pegando dados e tratando eles
    public static Dados[] vetorDados(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Dados dados[] = new Dados[545699];
        String path = "C:\\temp\\ws - javafx\\APSDados\\Focos_2020-08-01_2020-10-25.txt";
        String dadoBruto[] = new String[12];
        int cont = 0;
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String entrada = br.readLine();
            entrada = br.readLine();
            while (entrada != null) {
                entrada += " ";
                dadoBruto = entrada.split(",");
                
                Dados dado = new Dados(sdf.parse(dadoBruto[0]), dadoBruto[1], dadoBruto[2], dadoBruto[3], 
                        dadoBruto[4], dadoBruto [5], Double.parseDouble(dadoBruto[9]), Double.parseDouble(dadoBruto[10]));
                
                //Tratando dados nulos
                if(!dadoBruto[6].equals(""))   dado.setDiasSemChuva(Integer.parseInt(dadoBruto[6]));
                else                           dado.setDiasSemChuva(-999);
                if(!dadoBruto[7].equals(""))   dado.setPrecipitacao(Double.parseDouble(dadoBruto[7]));
                else                           dado.setPrecipitacao(-999);
                if(!dadoBruto[8].equals(""))   dado.setRiscoDeFogo(Double.parseDouble(dadoBruto[8]));
                else                           dado.setRiscoDeFogo(-999);
                if(!dadoBruto[11].equals(" ")) dado.setFrp(Double.parseDouble(dadoBruto[11]));
                else                           dado.setFrp(-999);
                
                dados[cont++] = dado;
                entrada = br.readLine();
            }
            System.out.println("Dados coletados.");
            
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } catch (ParseException e){
            System.out.println("Error: " + e.getMessage());
        }
        return dados;
    }
    
    public static DefaultTableModel getTableModel(Dados[] lista){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Data");
        modelo.addColumn("Estado");
        modelo.addColumn("MunicÌpio");
        modelo.addColumn("Dias Sem Chuva");
        modelo.addColumn("PrecipitaÁ„o");
        modelo.addColumn("Risco de Fogo");
        modelo.addColumn("Latitude");
        modelo.addColumn("Longitude");
        modelo.addColumn("FRP");
        String diasSemChuva = "Sem dados", precipitacao = "Sem dados", riscoDeFogo = "Sem dados", frp = "Sem dados";
        for (Dados d : lista){
            if(d.getDiasSemChuva() != -999) diasSemChuva = "" + d.getDiasSemChuva();
            if(d.getPrecipitacao() != -999) precipitacao = "" + d.getPrecipitacao();
            if(d.getRiscoDeFogo() != -999)  riscoDeFogo  = "" + d.getRiscoDeFogo();
            if(d.getFrp()!= -999)           frp          = "" + d.getFrp();
            String[] reg = {d.getSatelite(), d.getData().toString(), d.getEstado(), d.getMunicipio(), diasSemChuva, 
                precipitacao, riscoDeFogo, "" + d.getLatitude(), "" + d.getLongitude(), frp};
            modelo.addRow(reg);
        }
        return modelo;
    }
}
