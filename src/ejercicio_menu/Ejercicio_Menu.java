package ejercicio_menu;

import javax.swing.JOptionPane;

public class Ejercicio_Menu {

    public static void main(String[] args) {
       int opcion = 0;
        do{
                try{
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("Señor Usuario, ¿que desea hacer hoy?"
                        + "\n 1. Operaciones Matematicas"
                        + "\n 2. "
                        + "\n 3. Mostrar Ciudades"
                        + "\n 4. Salir"));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                }

            switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "Mostrar paises");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Mostrar departamentos");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Mostrar ciudades");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Seleccionó Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                    break;
            }
        }while(opcion != 4);
    }
    
}
