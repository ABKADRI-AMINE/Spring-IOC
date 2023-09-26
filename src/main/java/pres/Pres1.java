package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args){
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
//        metier.setDao(dao);//Injection de dépendance
        System.out.println("RES="+metier.calcul());
    }
}
