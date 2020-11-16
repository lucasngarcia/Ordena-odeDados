package model;

public class Metodos {
    
    public Metodos(){
    }

// ordenacao por bubble data
public static int bubbleData(Dados v[]) {
    long tIni = System.currentTimeMillis();
    int ini = 1, fim;
    Dados chg;
    while (ini < v.length) {
        fim = v.length - 1;
        while (fim >= ini) {
            if (v[fim - 1].getData().compareTo(v[fim].getData() ) > 0) {
                chg      = v[fim-1];
                v[fim-1] = v[fim];
                v[fim]   = chg;
            }
            fim--;
        }
        ini++;
    }
    return (int) (System.currentTimeMillis() - tIni);
}

// ordenacao por bubble Estado
public static int bubbleSatelite(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, fim;
        Dados chg;
        while (ini < v.length) {
            fim = v.length - 1;
            while (fim >= ini) {
                if (v[fim - 1].getSatelite().compareTo(v[fim].getSatelite()) > 0) {
                    chg      = v[fim-1];
                    v[fim-1] = v[fim];
                    v[fim]   = chg;
                }
                fim--;
            }
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

// ordenacao por bubble Estado
public static int bubbleEstado(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, fim;
        Dados chg;
        while (ini < v.length) {
            fim = v.length - 1;
            while (fim >= ini) {
                if (v[fim - 1].getEstado().compareTo(v[fim].getEstado()) > 0) {
                    chg      = v[fim-1];
                    v[fim-1] = v[fim];
                    v[fim]   = chg;
                }
                fim--;
            }
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

// ordenacao por bubble Municipio
public static int bubbleMunicipio(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, fim;
        Dados chg;
        while (ini < v.length) {
            fim = v.length - 1;
            while (fim >= ini) {
                if (v[fim - 1].getMunicipio().compareTo(v[fim].getMunicipio()) > 0) {
                    chg      = v[fim-1];
                    v[fim-1] = v[fim];
                    v[fim]   = chg;
                }
                fim--;
            }
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

// ordenacao por bubble dias sem chuva
public static int bubbleDiasSemChuva(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, fim;
        Dados chg;
        while (ini < v.length) {
            fim = v.length - 1;
            while (fim >= ini) {
                if (v[fim - 1].getDiasSemChuva() > v[fim].getDiasSemChuva()) {
                    chg      = v[fim-1];
                    v[fim-1] = v[fim];
                    v[fim]   = chg;
                }
                fim--;
            }
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

// ordenacao por bubble dias sem chuva
public static int bubblePrecipitacao(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, fim;
        Dados chg;
        while (ini < v.length) {
            fim = v.length - 1;
            while (fim >= ini) {
                if (v[fim - 1].getPrecipitacao()> v[fim].getPrecipitacao()) {
                    chg      = v[fim-1];
                    v[fim-1] = v[fim];
                    v[fim]   = chg;
                }
                fim--;
            }
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

// ordenacao por bubble risco de fogo
public static int bubbleRiscoDeFogo(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, fim;
        Dados chg;
        while (ini < v.length) {
            fim = v.length - 1;
            while (fim >= ini) {
                if (v[fim - 1].getRiscoDeFogo()> v[fim].getRiscoDeFogo()) {
                    chg      = v[fim-1];
                    v[fim-1] = v[fim];
                    v[fim]   = chg;
                }
                fim--;
            }
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

// ordenacao por bubble frp
public static int bubbleFrp(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, fim;
        Dados chg;
        while (ini < v.length) {
            fim = v.length - 1;
            while (fim >= ini) {
                if (v[fim - 1].getFrp()> v[fim].getFrp()) {
                    chg      = v[fim-1];
                    v[fim-1] = v[fim];
                    v[fim]   = chg;
                }
                fim--;
            }
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

//Ordenacao por Insercao Data

    public static int insertionData(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, chg;
        Dados men;
        while (ini < v.length) {
            men = v[ini];
            chg = ini - 1;
            while (chg >= 0 && men.getData().compareTo(v[chg].getData() ) < 0) {
                v[chg + 1] = v[chg];
                chg--;
            }
            v[chg + 1] = men;
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }
    
//Ordenacao por Insercao Estado

     public static int insertionSatelite(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, chg;
        Dados men;
        while (ini < v.length) {
            men = v[ini];
            chg = ini - 1;
            while (chg >= 0 && men.getSatelite().compareTo(v[chg].getSatelite()) < 0) {
                v[chg + 1] = v[chg];
                chg--;
            }
            v[chg + 1] = men;
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }
     
//Ordenacao por Insercao Estado

     public static int insertionEstado(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, chg;
        Dados men;
        while (ini < v.length) {
            men = v[ini];
            chg = ini - 1;
            while (chg >= 0 && men.getEstado().compareTo(v[chg].getEstado()) < 0) {
                v[chg + 1] = v[chg];
                chg--;
            }
            v[chg + 1] = men;
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

//Ordenacao por Insercao Municipio

     public static int insertionMunicipio(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, chg;
        Dados men;
        while (ini < v.length) {
            men = v[ini];
            chg = ini - 1;
            while (chg >= 0 && men.getMunicipio().compareTo(v[chg].getMunicipio()) < 0) {
                v[chg + 1] = v[chg];
                chg--;
            }
            v[chg + 1] = men;
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

// Ordenacao por Insercao dias sem chuva
    public static int insertionDiasSemChuva(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, chg;
        Dados men;
        while (ini < v.length) {
            men = v[ini];
            chg = ini - 1;
            while (chg >= 0 && men.getDiasSemChuva() < v[chg].getDiasSemChuva()) {
                v[chg + 1] = v[chg];
                chg--;
            }
            v[chg + 1] = men;
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }
    
// Ordenacao por Insercao precipitacao
    public static int insertionPrecipitacao(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, chg;
        Dados men;
        while (ini < v.length) {
            men = v[ini];
            chg = ini - 1;
            while (chg >= 0 && men.getPrecipitacao()< v[chg].getPrecipitacao()) {
                v[chg + 1] = v[chg];
                chg--;
            }
            v[chg + 1] = men;
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }
    
// Ordenacao por Insercao risco de fogo
    public static int insertionRiscoDeFogo(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, chg;
        Dados men;
        while (ini < v.length) {
            men = v[ini];
            chg = ini - 1;
            while (chg >= 0 && men.getRiscoDeFogo()< v[chg].getRiscoDeFogo()) {
                v[chg + 1] = v[chg];
                chg--;
            }
            v[chg + 1] = men;
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

// Ordenacao por Insercao frp
    public static int insertionFrp(Dados v[]) {
        long tIni = System.currentTimeMillis();
        int ini = 1, chg;
        Dados men;
        while (ini < v.length) {
            men = v[ini];
            chg = ini - 1;
            while (chg >= 0 && men.getFrp()< v[chg].getFrp()) {
                v[chg + 1] = v[chg];
                chg--;
            }
            v[chg + 1] = men;
            ini++;
        }
        return (int) (System.currentTimeMillis() - tIni);
    }

// Ordenacao por QuickSort data
    public static int quickData(Dados v[]) {
        long tIni = System.currentTimeMillis();
        quickData(v, 0, v.length - 1);
        return (int) (System.currentTimeMillis() - tIni);
   }
    private static void quickData(Dados v[], int lef, int rig) {
        int aPiv, aLef, aRig;
        Dados piv;
        aLef = lef;
        aRig = rig;
        piv  = v[lef];
            while (lef < rig) {
                while ((v[rig].getData().compareTo(piv.getData()) > 0) && (lef < rig)) {
                rig--;
                }
            if (lef != rig) {
                v[lef] = v[rig];
                lef++;
            }
            while ((v[lef].getData().compareTo(piv.getData()) < 0) && (lef < rig)) {
                lef++;
            }
            if (lef != rig) {
                v[rig] = v[lef];
                rig--;
            }
        }
        v[lef] = piv;
        aPiv   = lef;
        if (aLef < aPiv) quickData(v, aLef, aPiv - 1);
        if (aRig > aPiv) quickData(v, aPiv + 1, aRig);
    }
    
// Ordenacao por QuickSort estado
    public static int quickSatelite(Dados v[]) {
        long tIni = System.currentTimeMillis();
        quickSatelite(v, 0, v.length - 1);
        return (int) (System.currentTimeMillis() - tIni);
    }
    
    private static void quickSatelite(Dados v[], int lef, int rig) {
        int aPiv, aLef, aRig;
        Dados piv;
        aLef = lef;
        aRig = rig;
        piv  = v[lef];
            while (lef < rig) {
                while ((v[rig].getSatelite().compareTo(piv.getSatelite()) > 0) && (lef < rig)) {
                rig--;
                }
            if (lef != rig) {
                v[lef] = v[rig];
                lef++;
            }
            while ((v[lef].getSatelite().compareTo(piv.getSatelite()) < 0) && (lef < rig)) {
                lef++;
            }
            if (lef != rig) {
                v[rig] = v[lef];
                rig--;
            }
        }
        v[lef] = piv;
        aPiv   = lef;
        if (aLef < aPiv) quickSatelite(v, aLef, aPiv - 1);
        if (aRig > aPiv) quickSatelite(v, aPiv + 1, aRig);
    }

// Ordenacao por QuickSort estado
    public static int quickEstado(Dados v[]) {
        long tIni = System.currentTimeMillis();
        quickEstado(v, 0, v.length - 1);
        return (int) (System.currentTimeMillis() - tIni);
    }
    
    private static void quickEstado(Dados v[], int lef, int rig) {
        int aPiv, aLef, aRig;
        Dados piv;
        aLef = lef;
        aRig = rig;
        piv  = v[lef];
            while (lef < rig) {
                while ((v[rig].getEstado().compareTo(piv.getEstado()) > 0) && (lef < rig)) {
                rig--;
                }
            if (lef != rig) {
                v[lef] = v[rig];
                lef++;
            }
            while ((v[lef].getEstado().compareTo(piv.getEstado()) < 0) && (lef < rig)) {
                lef++;
            }
            if (lef != rig) {
                v[rig] = v[lef];
                rig--;
            }
        }
        v[lef] = piv;
        aPiv   = lef;
        if (aLef < aPiv) quickEstado(v, aLef, aPiv - 1);
        if (aRig > aPiv) quickEstado(v, aPiv + 1, aRig);
    }
    
// Ordenacao por QuickSort municipio
    public static int quickMunicipio(Dados v[]) {
        long tIni = System.currentTimeMillis();
        quickMunicipio(v, 0, v.length - 1);
        return (int) (System.currentTimeMillis() - tIni);
   }
    private static void quickMunicipio(Dados v[], int lef, int rig) {
        int aPiv, aLef, aRig;
        Dados piv;
        aLef = lef;
        aRig = rig;
        piv  = v[lef];
            while (lef < rig) {
                while ((v[rig].getMunicipio().compareTo(piv.getMunicipio()) > 0) && (lef < rig)) {
                rig--;
                }
            if (lef != rig) {
                v[lef] = v[rig];
                lef++;
            }
            while ((v[lef].getMunicipio().compareTo(piv.getMunicipio()) < 0) && (lef < rig)) {
                lef++;
            }
            if (lef != rig) {
                v[rig] = v[lef];
                rig--;
            }
        }
        v[lef] = piv;
        aPiv   = lef;
        if (aLef < aPiv) quickMunicipio(v, aLef, aPiv - 1);
        if (aRig > aPiv) quickMunicipio(v, aPiv + 1, aRig);
    }
    
// Ordenacao por QuickSort dias sem chuva DESC
    public static int quickDiasSemChuva(Dados v[]) {
        long tIni = System.currentTimeMillis();
        quickDiasSemChuva(v, 0, v.length - 1);
        return (int) (System.currentTimeMillis() - tIni);
   }
    private static void quickDiasSemChuva(Dados v[], int lef, int rig) {
        int aPiv, aLef, aRig;
        Dados piv;
        aLef = lef;
        aRig = rig;
        piv  = v[lef];
        while (lef < rig) {
            while ((v[rig].getDiasSemChuva() < piv.getDiasSemChuva()) && (lef < rig)) {
                rig--;
            }
            if (lef != rig) {
                v[lef] = v[rig];
                lef++;
            }
            while ((v[lef].getDiasSemChuva() > piv.getDiasSemChuva()) && (lef < rig)) {
                lef++;
            }
            if (lef != rig) {
                v[rig] = v[lef];
                rig--;
            }
        }
        v[lef] = piv;
        aPiv   = lef;
        if (aLef < aPiv) quickDiasSemChuva(v, aLef, aPiv - 1);
        if (aRig > aPiv) quickDiasSemChuva(v, aPiv + 1, aRig);
    }
    
// Ordenacao por QuickSort precipitacao
    public static int quickPrecipitacao(Dados v[]) {
        long tIni = System.currentTimeMillis();
        quickPrecipitacao(v, 0, v.length - 1);
        return (int) (System.currentTimeMillis() - tIni);
   }
    private static void quickPrecipitacao(Dados v[], int lef, int rig) {
        int aPiv, aLef, aRig;
        Dados piv;
        aLef = lef;
        aRig = rig;
        piv  = v[lef];
            while (lef < rig) {
                while ((v[rig].getPrecipitacao()< piv.getPrecipitacao()) && (lef < rig)) {
                rig--;
                }
            if (lef != rig) {
                v[lef] = v[rig];
                lef++;
            }
            while ((v[lef].getPrecipitacao()> piv.getPrecipitacao()) && (lef < rig)) {
                lef++;
            }
            if (lef != rig) {
                v[rig] = v[lef];
                rig--;
            }
        }
        v[lef] = piv;
        aPiv   = lef;
        if (aLef < aPiv) quickPrecipitacao(v, aLef, aPiv - 1);
        if (aRig > aPiv) quickPrecipitacao(v, aPiv + 1, aRig);
    }
    
 // Ordenacao por QuickSort risco de fogo
    public static int quickRiscoDeFogo(Dados v[]) {
        long tIni = System.currentTimeMillis();
        quickRiscoDeFogo(v, 0, v.length - 1);
        return (int) (System.currentTimeMillis() - tIni);
   }
    private static void quickRiscoDeFogo(Dados v[], int lef, int rig) {
        int aPiv, aLef, aRig;
        Dados piv;
        aLef = lef;
        aRig = rig;
        piv  = v[lef];
            while (lef < rig) {
                while ((v[rig].getRiscoDeFogo() < piv.getRiscoDeFogo()) && (lef < rig)) {
                rig--;
                }
            if (lef != rig) {
                v[lef] = v[rig];
                lef++;
            }
            while ((v[lef].getRiscoDeFogo() > piv.getRiscoDeFogo()) && (lef < rig)) {
                lef++;
            }
            if (lef != rig) {
                v[rig] = v[lef];
                rig--;
            }
        }
        v[lef] = piv;
        aPiv   = lef;
        if (aLef < aPiv) quickRiscoDeFogo(v, aLef, aPiv - 1);
        if (aRig > aPiv) quickRiscoDeFogo(v, aPiv + 1, aRig);
    }
    
// Ordenacao por QuickSort frp
    public static int quickFrp(Dados v[]) {
        long tIni = System.currentTimeMillis();
        quickFrp(v, 0, v.length - 1);
        return (int) (System.currentTimeMillis() - tIni);
   }
    private static void quickFrp(Dados v[], int lef, int rig) {
        int aPiv, aLef, aRig;
        Dados piv;
        aLef = lef;
        aRig = rig;
        piv  = v[lef];
            while (lef < rig) {
                while ((v[rig].getFrp()< piv.getFrp()) && (lef < rig)) {
                rig--;
                }
            if (lef != rig) {
                v[lef] = v[rig];
                lef++;
            }
            while ((v[lef].getFrp()> piv.getFrp()) && (lef < rig)) {
                lef++;
            }
            if (lef != rig) {
                v[rig] = v[lef];
                rig--;
            }
        }
        v[lef] = piv;
        aPiv   = lef;
        if (aLef < aPiv) quickFrp(v, aLef, aPiv - 1);
        if (aRig > aPiv) quickFrp(v, aPiv + 1, aRig);
    }
}
