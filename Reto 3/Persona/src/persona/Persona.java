/*Realizar el siguiente ejercicio haciendo uso de la programación orientada a 
objetos.

Haz una clase llamada Persona que siga las siguientes condiciones:
Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. 
No queremos que se accedan directamente a ellos. Piensa que modificador de acceso
es el más adecuado, también su 
tipo. 
Si quieres añadir algún atributo puedes hacerlo.
Por defecto, todos los atributos menos el DNI serán valores por defecto según su 
tipo (0 números, 
cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante
para ello.
Se implantaran varios constructores:
Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.
____________________________________________________________________




Los métodos que se implementaran son:
calcularIMC(): calculara si la persona esta en su peso ideal 
(peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, 
la función devuelve un -1 porque esta por debajo del peso ideal, si devuelve un 
número entre 20 y 25 (incluidos), significa que esta en su peso ideal la función 
devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
la función devuelve un 1. Te recomiendo que uses constantes para devolver estos 
valores.

esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no
es correcto, sera H. No sera visible al exterior.

toString(): devuelve toda la información del objeto.

generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su 
número su letra correspondiente. Este método sera invocado cuando se construya 
el objeto. Puedes dividir el método para que te sea más fácil. No será visible
al exterior.

Métodos set de cada parámetro, excepto de DNI.

Ahora, crea una clase ejecutable que haga lo siguiente:
Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores
variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores
menos el peso y la altura y el último por defecto, para este último utiliza los
métodos set para darle a los atributos un valor.
Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o
por debajo de su peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por último, mostrar la información de cada objeto.
Puedes usar métodos en la clase ejecutable, para que os sea mas fácil.

 */
package persona;
import javax.swing.JOptionPane;

public class Persona {
    
    //atributos
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    //constantes
    private final static char SEXO_DEF='H';
    private static final int BAJO_PESO=-1;
    private static final int PESO_IDEAL=0;
    private static final int SOBREPESO=1;
    
    //constructores
    //constructores por defecto
    public Persona(){
        this("", 0, SEXO_DEF, 0, 0);
    }
    
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }
    
    //constructor con parametros
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.altura=altura;
        generaDNI();
        this.sexo=sexo;
        comprobarSexo();
    }
    
//calcularIMC(): calculara si la persona esta en su peso ideal 
//(peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, 
//la función devuelve un -1 porque esta por debajo del peso ideal, si devuelve un 
//número entre 20 y 25 (incluidos), significa que esta en su peso ideal la función 
//devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
//la función devuelve un 1. Te recomiendo que uses constantes para devolver estos 
//valores.
    
    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return BAJO_PESO;
        } else {
            return SOBREPESO;
        }
    }
    
    //esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if (edad>=18){
            mayor = true;    
        }
        return mayor;
    }
    
//generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su 
//número su letra correspondiente. Este método sera invocado cuando se construya 
//el objeto. Puedes dividir el método para que te sea más fácil. No será visible
//al exterior.
    
    //metodos privados    
    private void generaDNI(){
        final int divisor=23;
        int numeroDNI=((int)Math.floor(Math.random()*(10000000 -10000000)+10000000));
        int resultado=numeroDNI-(numeroDNI/divisor*divisor);
        char letraDNI=LetrasDNI(resultado);
        DNI=Integer.toString(numeroDNI)+letraDNI;
    }   
    
    private char LetrasDNI(int resultado){
        char letras []={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
         'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z'};
        return letras[resultado];
    }
    
    private void comprobarSexo(){
        if (sexo!='H' && sexo!='M'){
            this.sexo=SEXO_DEF;
        }
    }  
    
    
    
    
    //metodos set por parametros
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setPeso(double peso){
        this.peso=peso;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
    public String toString(){
        String sexo;
        if (this.sexo == 'H'){
            sexo = "Hombre";
        }else{
            sexo = "Mujer";
        }
        return "Datos del usuario:\n" + "Nombre: " + nombre + "\n" + "Sexo: " 
                + sexo + "\n" + "Edad: " + edad + "\n" + "DNI: " + DNI + "\n" + "peso: "
                 + peso + "kg\n" + "Altura: " + altura + "m\n";
             
    }
    
    public static void main(String[] args) {
        //Pide por teclado el nombre, la edad, sexo, peso y altura.
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
 
        String texto = JOptionPane.showInputDialog("Introduce la edad");
        int edad = Integer.parseInt(texto);
 
        texto = JOptionPane.showInputDialog("Introduce el sexo");
        char sexo = texto.charAt(0);
 
        texto = JOptionPane.showInputDialog("Introduce el peso");
        double peso = Double.parseDouble(texto);
 
        texto = JOptionPane.showInputDialog("Introduce la altura");
        double altura = Double.parseDouble(texto);
        
        
        //y el último por defecto, para este último utiliza los métodos 
        //set para darle a los atributos un valor.
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
 
        ////Crea 3 objetos de la clase anterior, el primer objeto obtendrá 
        //las anteriores variables pedidas por teclado,  
        persona1.setNombre("Jorge Andres");
        persona1.setEdad(18);
        persona1.setSexo('M');
        persona1.setPeso(77);
        persona1.setAltura(1.90);
 
        //el segundo objeto obtendrá todos los anteriores menos el peso y la altura
        persona2.setPeso(34.9);
        persona2.setAltura(1.77);
 
       
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());
 
        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());
 
        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }
 
    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch(IMC) {
            case Persona.PESO_IDEAL -> System.out.println("La persona esta en su peso ideal");
            case Persona.BAJO_PESO -> System.out.println("La persona esta por debajo de su peso ideal");
            case Persona.SOBREPESO -> System.out.println("La persona esta por encima de su peso ideal");
        }
    }
 
    public static void MuestraMayorDeEdad(Persona p) {
 
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
        
        
    
    
}
