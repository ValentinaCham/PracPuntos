
package pisopediatria;

import java.text.*;
import java.util.*;

public class Niño {
    private String NombreApellido; //Imp
    //private int Edad;
    private String Antecedentes;
    private String NomPadre; // imp
    private String NomMadre; //Imp
    private Date FechaNacimiento; //Imp
    private boolean PresenciaPadres;
    private HashMap<String, String> Diagnosticos = new HashMap<>();
    private DateFormat fechaFormato = DateFormat.getDateInstance(DateFormat.LONG);
    
    public String getNom(){
        return NombreApellido;
    }
    
    public String getPa(){
        return NombreApellido;
    }
    
    public String getMa(){
        return NombreApellido;
    }
    
    public String getNac(){
        return fechaFormato.format(FechaNacimiento);
    }
    
    public int Edad(){
        Date fechaHoy = new Date();
        return fechaHoy.getYear() - FechaNacimiento.getYear();
    }
    
    public Niño(String Nom, String Ant, String NomPa, String NomMa, Date Fech){
        NombreApellido = Nom;
        Antecedentes = Ant;
        NomPadre = NomPa;
        NomMadre = NomMa;
        FechaNacimiento = Fech;
    }
    
    public void GenerarDiagnostico(String code, String Diag){
        //El codigo estará formado por: Código_Pediatra + Fecha_del_Diagnostico
        Diagnosticos.put(code, Diag);
    }
    
    public String toString(){
        //Se sacará su edad
        String presPadre;
        if (PresenciaPadres){
            presPadre = "Necesita la presencia de sus padres, ya que tiene ";
        }
        else {
            presPadre = "No necesita obligatoriamente la presencia de los padres, porque tiene ";
        }
        
        return "Nombre: " + NombreApellido + "\nAntecedentes: " + Antecedentes + "\nNombre del Padre: " + NomPadre+ "\nNombre de la Madre: " + NomMadre
                + "\nFecha de Nacimiento: " + fechaFormato.format(FechaNacimiento) + "\n" + presPadre + Edad() /*Diagnosticos()*/;
    }
    

    public void Lista(){
        System.out.printf( "%40s%30s%30s%10s%6d\n", getNom(), getPa(), getMa(), getNac(), Edad());
    }
    
    public void Diagnosticos(){
        for (String key: Diagnosticos.keySet()){
            System.out.printf( "%15s%20s\n", key,Diagnosticos.get(key));
            break;
        }
    }
}
