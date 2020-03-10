package fr.dawan.springcore.main;

import fr.dawan.springcore.beans.Adresse;
import fr.dawan.springcore.beans.Contact;
import fr.dawan.springcore.beans.Formation;
import fr.dawan.springcore.beans.Stagiaire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXml {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext contexte = new ClassPathXmlApplicationContext("bean.xml");

        // Test property
        Formation formation1 = contexte.getBean("formation1", Formation.class);
        System.out.println(formation1);

        // Test multi params constructor
        Formation formation2 = contexte.getBean("formation2", Formation.class);
        System.out.println(formation2);

        // Test bean xml import
        Adresse adresse1 = contexte.getBean("adresse1", Adresse.class);
        System.out.println(adresse1);

        // Test idem bean xml import
        Adresse adresse2 = contexte.getBean("adresse2", Adresse.class);
        System.out.println(adresse2);

        // For testing scope
        Formation formation11 = contexte.getBean("formation1", Formation.class);
        System.out.println(formation11);

        // Test constructor + property
        Contact contact1 = contexte.getBean("contact1", Contact.class);
        System.out.println(contact1);

        // Test constructor multi params
        Contact contact2 = contexte.getBean("contact2", Contact.class);
        System.out.println(contact2);

        // Test ref
        Contact contact3 = contexte.getBean("contact3", Contact.class);
        System.out.println(contact3);

        // Test heritage = extends
        Stagiaire stagiaire1 = contexte.getBean("stagiaire1", Stagiaire.class);
        System.out.println(stagiaire1);

        // Test parent
        Stagiaire stagiaire2 = contexte.getBean("stagiaire2", Stagiaire.class);
        System.out.println(stagiaire2);

        // Test parent and override property
        Stagiaire stagiaire3 = contexte.getBean("stagiaire3", Stagiaire.class);
        System.out.println(stagiaire3);

        // Test bean abstract
        // Test bean with list
        Contact contact4 = contexte.getBean("contact4", Contact.class);
        System.out.println(contact4);

        // Test bean with map
        Contact contact5 = contexte.getBean("contact5", Contact.class);
        System.out.println(contact5);
        System.out.println(contact5.getMapObject());

        // Test bean with list merge=true
        Stagiaire stagiaire4 = contexte.getBean("stagiaire4", Stagiaire.class);
        System.out.println(stagiaire4);


        ((ConfigurableApplicationContext) contexte).close();

    }

}
