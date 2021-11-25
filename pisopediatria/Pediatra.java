
package pisopediatria;

import java.util.*;

public class Pediatra {
    private String Code;
    private String NombreApellido;
    private int NumConsultorio;
    private Scanner scan = new Scanner(System.in);
    
    public Pediatra(String Cod, String Nom, int NumCon){
        Code = Cod;
        NombreApellido = Nom;
        NumConsultorio = NumCon;
    }
    
    public String GenerarDiag(Niño Paciente){
        String diagnostico;
        System.out.print("Luego de la revisión al niño " + Paciente.getNom() + ". EL diagnostico a remitir es: ");
        diagnostico = scan.nextLine();
        return diagnostico;
    }
    
    public String getCod(){
        return Code;
    }

}
