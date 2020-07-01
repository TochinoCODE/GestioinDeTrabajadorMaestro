//parcial
package examenParcial;

import javax.swing.JOptionPane;


public class ArregloPersona {
    int frente ;
    int Final ;
    int max;
    int pos = 0;
    Persona [] trabajador; //Arreglo pila de tipo Alumno
    //guardar espacio en la ram 
    public ArregloPersona (int max){
        this.Final = 0; //donde incia array
        this.frente = 0; //tope
        this.max = max; //tamaño arrreglo
        this.trabajador = new Persona[this.max+1];
        //para espacios de la ram
        for (int i = 0; i < this.max+1; i++) {
            trabajador[i] = new Persona();
        }
    }
    
    public int getFrente(){
        return frente;
    }
    
    public boolean isColaLlena(){
        if(frente == max){
            return true;
        }else return false;
    }
    
    public boolean isColaVacia(){
        if(frente == Final){
            return true;
        }else return false;
    }
    
    public void llenarDatos(){
        double tarifa;
        int hora;

        String codigo = JOptionPane.showInputDialog("Ingrese el codigo Ejemplo de Input");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        do {
            tarifa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tarifa por hora trabajada"));
            if (tarifa <= 0) {
                JOptionPane.showMessageDialog(null, "**Error al ingresar tarifa***");
            }
        } while (tarifa <= 0);

        do {
            hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas al dia "));
            if (hora <= 0) {
                JOptionPane.showMessageDialog(null, "**Error al ingresar hora no puede ser negativa o cero***");
            }
        } while (hora <= 0);

          trabajador[pos].registrar(codigo, nombre, tarifa, hora); //guardamos en el arreglo de objetos
          
           frente++; //cada vez que se inicializa el metodo a tope le sumara 1
           pos++;//cada vez que se inicializa el metodo a pos le sumara 1
    }
    
    public void mostrar(){
        if (this.isColaVacia()) 
            JOptionPane.showMessageDialog(null,"No hay elemento que mostrar");
        else{
            for (int i = 0; i<frente; i++){
            trabajador[i].mostrarDatos();
            }
        }
    }
     
    public void eliminar (String eliminar){
    if (this.isColaVacia()){
      JOptionPane.showMessageDialog(null,"Ya esta vavia");
    }else{ 

      for (int i =0; i<frente ; i++){
        if (eliminar.equals(trabajador[i].getCodigo())){
          JOptionPane.showMessageDialog(null,"Se elimino el trabajdor "+trabajador[i].getNombre());
          trabajador[i] = trabajador[i+1];
          break;
        }else JOptionPane.showMessageDialog(null,"No se encontró elemento");
      }
    }
  }
    
    public void  buscar(String buscar){
        if (isColaVacia()) {
           JOptionPane.showMessageDialog(null,"Tiene que ingresar primero los datos de los trabajadores");
        }
        else{
        for (int i = 0; i < frente ; i++){
//                if  (buscar == null ? trabajador[i].getCodigo() == null : buscar.equals(trabajador[i].getCodigo())){
                  if (buscar.equals(trabajador[i].getCodigo())){
                    trabajador[i].mostrarDatos();
                    break;
                }else JOptionPane.showMessageDialog(null,"**No existe el elemento**");
                  
            }
        }
    }
}
