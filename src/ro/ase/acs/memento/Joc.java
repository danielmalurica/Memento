package ro.ase.acs.memento;

public class Joc {
    ManagerSalvari managerSalvari;
    TablaJoc tablaJoc;

    public Joc() {
        this.tablaJoc = new TablaJoc();
        this.managerSalvari=new ManagerSalvari();
    }

    public boolean verificaCastigator(){
        //....
        return false;
    }

    public void adaugaX(int linie, int coloana){
        tablaJoc.adaugaSimbol('X', linie, coloana);
    }

    public void adaugaO(int linie, int coloana){
        tablaJoc.adaugaSimbol('O', linie, coloana);
    }

    public void afiseazaTabla(){
        if(tablaJoc!=null){
            char m[][]= tablaJoc.getTabla();
            for(int i=0; i<m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j]+ "  ");

                }
                System.out.println();
            }
        }
    }

    public void salvare(){
        managerSalvari.salvare(tablaJoc);
    }

    public void restaurare(){
        tablaJoc=managerSalvari.restaurare();
    }

}
