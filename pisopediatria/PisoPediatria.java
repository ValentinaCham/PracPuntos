
package pisopediatria;

import java.text.DateFormat;
import java.util.*;

public class PisoPediatria {

    public static void main(String[] args) {
        ArrayList<Niño> NiñosAtendidos = new ArrayList<>();
        ArrayList<Pediatra> Pediatras  = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        DateFormat fechaFormato = DateFormat.getDateInstance(DateFormat.LONG);
        int desicion;
        
        NiñosAtendidos.add(new Niño("Juan Carlos Gosme Contreras", "Abuela: Asma - Abuelo: Hipertensión - Madre: Asma", "Mauricio Gosme Rodrigez", "Lucia Contreras Mamani", new Date(104, 4,21)));
        NiñosAtendidos.add(new Niño("Miguel Mamani Sucari", "Padre: Vena Cruzada - Madre: Aritmia", "Ricardo Mamani Mamani", "Carolina Sucari Aica", new Date(112, 9,15)));
        Pediatras.add(new Pediatra("0001", "Maria Rosas Prado", 25));
        Pediatras.add(new Pediatra("0002", "Angelina Costa", 28));
        Pediatras.add(new Pediatra("0003", "Alicia Quito", 32));

        System.out.println(NiñosAtendidos.get(0));
        
        MostrarNinos(NiñosAtendidos);
        GenerarDiagnostico(Pediatras.get(0), NiñosAtendidos.get(0));
        GenerarDiagnostico(Pediatras.get(1), NiñosAtendidos.get(0));
        GenerarDiagnostico(Pediatras.get(2), NiñosAtendidos.get(1));
        
        NiñosAtendidos.get(0).Diagnosticos();
        NiñosAtendidos.get(1).Diagnosticos();
        /*
        while(true){
        System.out.println("*********************************PISO PEDIATRIA*********************************");
        
            System.out.println("1. Mostrar Pacientes \n2. Registro de Diagnostico \n3. Mostrar Pediatras\n");
            desicion = scan.nextInt();
        
            if(desicion<=6 && desicion>=1){
                break;
            }
            else{
                System.out.println("Numero no permitido, volver a ingresar el número por favor");
            }
        }
        */
        /*
        while(true){
            //SWITCH PARA TODOS LOS CASOS
            switch (desicion){
                case 1:{
                    //MOSTRAR NIÑOS
                    MostrarNinos(NiñosAtendidos);
                    break;
                }
                case 2:{
                    //GENERAR DIAGNOSTICO
                    GenerarDiagnostico(Pac,EstEntrega);
                    break;
                }
                case 3:{
                    //MOSTRAR DIAGNOSTICO
                    RegistrarPaquetePROC(PaquetesReg,EstEntrega);
                    break;
                }
            }
            
            System.out.println("¿Desea realizar otra operación? \n1. SI \n2. NO");
            desicion = scan.nextInt();
            
            if (desicion==1){
                System.out.println("1. Mostrar Paquetes \n2. Registro de paquete RECIBIDO \n3. Registro de paquete EN PROCESO\n"
                + "4. Registro de paquete ENTREGADO \n5. Registro de paquete FALLO EN ENTREGA \n6. Mostrar Paquetes según estado ");
                desicion = scan.nextInt();
            }
            else if (desicion==2){
                System.out.println("Hasta luego OwO");
                break;
            }
        }
        */
    }
    
    public static void MostrarNinos(ArrayList<Niño> NiñosAtendidos){
        System.out.printf( "%40s%30s%30s%10s%6s\n", "Nombre y Apellido", "Nombre Padre", "Nombre Madre", "Fecha Nacimiento", "Edad");
        for (int i=0; i<NiñosAtendidos.size(); i++){
            NiñosAtendidos.get(i).Lista();
        }
    }
    
    public static void GenerarDiagnostico(Pediatra Doc, Niño Pac){
        Date fechaHoy = new Date();
        DateFormat fechaFormato = DateFormat.getDateInstance(DateFormat.LONG);
        Pac.GenerarDiagnostico(Doc.getCod() + fechaFormato.format(fechaHoy), Doc.GenerarDiag(Pac));
    }
}
