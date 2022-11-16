package com.example;
import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        System.out.println("------------");
        Studenti lista=new Studenti();
        XmlMapper xmlMapper = new XmlMapper();
        
        Studente s1=new Studente(1,"a","aa","2007-02-09",5);
        Studente s2=new Studente(2,"b","bb","2006-03-08",4);
        Studente s3=new Studente(3,"c","cc","2005-04-07",6);
        Studente s4=new Studente(4,"d","dd","2004-05-06",7);

        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);

        // Serializzazione        
        xmlMapper.writeValue(new File("test.xml"), lista);
        String myXml = xmlMapper.writeValueAsString(lista);
        System.out.println("Oggetto serializzato:" + myXml);
        

        /* 
        // Deserializzazione        
        Classe c2 = xmlMapper.readValue(myXml, Classe.class);
        System.out.println("Oggetto deserializzato da stringa:" + c2.getNome());

        Classe c3 = xmlMapper.readValue(new File("test.xml"), Classe.class);
        System.out.println("Oggetto deserializzato da file: " + c3.getNome());*/
    }


}
