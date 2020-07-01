//parcial
package examenParcial;


public class Persona {
    //atributos 
    private String codigo;
    private String nombre;
    private double tarifa;
    private int hora;
    
       public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    private double sueldo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    //**************************************************
    //set
    public void registrar(String cod,String nombre, double tarifa, int hora){
        this.codigo = cod;
        this.nombre = nombre;
        this.tarifa = tarifa;
        this.hora = hora;
    }
    
    public double hallarSueldo(){
        
        sueldo = this.tarifa * this.hora;
        return sueldo;
    }
    public void mostrarSueldo(){
        System.out.println("Sueldo "+hallarSueldo());
    }
    public void mostrarDatos(){
        System.out.println("\nCodigo = "+codigo);
        System.out.println("Nombre = "+nombre);
        System.out.println("Tarifa = "+tarifa);
        System.out.println("Hora = "+hora);
        System.out.println("Sueldo al dia es= "+hallarSueldo());
        System.out.println("Sueldo mencial (26 dias trabajados) = " + hallarSueldo()*26);
    }
    
    
    
    
    
}
