package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAvecSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext springcontextann = new AnnotationConfigApplicationContext("dao","metier");//scan des packages dao et metier pour trouver les classes annotées
        IMetier metier = springcontextann.getBean(IMetier.class);//on demande à spring de nous donner un objet qui implémente l'interface IMetier
//        IMetier metier = (IMetier) springcontextann.getBean("metier");//on demande à spring de nous donner un objet qui implémente l'interface IMetier
        System.out.println("RES="+metier.calcul());
    }
}
