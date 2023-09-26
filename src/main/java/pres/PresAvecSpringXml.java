package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXml {
    public static void main(String[] args) {
        ApplicationContext springcontext= new ClassPathXmlApplicationContext("config.xml");//au demmarage de l'application allez vers le fichier config.xml et le lire pour injecter les objets
        IMetier metier = springcontext.getBean(IMetier.class);//on demande à spring de nous donner un objet qui implémente l'interface IMetier
        System.out.println("RES="+metier.calcul());
    }
}
