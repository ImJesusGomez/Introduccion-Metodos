package metodos;

public class Metodos {

    //Metodo main es el primero que se ejecuta.
    public static void main(String[] args) {

        //Mandamos a llamar el metodo saludar
        saludar();

        //Mandamos a llamar el metodo despedirse
        despedirse("Juame");

        String n = "Andrea";
        despedirse(n);

        //Mandamos llamar el metodo sumar
        double resultadoSuma = sumar(10, 20); //30
        System.out.println(sumar(10, 20));
        System.out.println(resultadoSuma);

        //Mandamos llamar el metodo restar
        restar(); //2
        System.out.println(restar());

        double resultadoResta = restar();
        System.out.println(resultadoResta);

        double resultadoSuma2 = sumar(1, sumar(2, sumar(1, sumar(1, 5))));
        System.out.println("resultadoSuma2 = " + resultadoSuma2);

        //Mandamos a llamar el metodo viaje
        viaje("Jorge", "Inglaterra");

        //Mandamos a llamar el metodo contarLongitud
        contarLongitud("Juan");

        //Mandamos a llamar el metodo multiplicar
        multiplicacion(1, 2, 3);
        System.out.println("Resultado de la multiplicacion " + multiplicacion(1, 2, 3));

        //Mandamos a llamar el metodo de divir
        dividir(1, 2);
        System.out.println("Resultado de la multiplicacion " + dividir(1, 2));

    }

    //Una ventaja de crear metodos es reutilizar codigo
    //Para mandar a llamar un metodo dentro del metodo main, es necesario agregar el satic
    public static void saludar() {
        System.out.println("Hola Mundo");
    }

    public static void despedirse(String nombre) {
        System.out.println("Adios " + nombre);
    }

    public static double sumar(double a, double b) {
        double resultado = a + b;
        return resultado;
    }

    public static double restar() {
        double resta = 6 - 4;
        return resta;
    }

    public static void viaje(String nombre, String destino) {
        System.out.println("" + nombre + " esta viajando a " + destino);
    }

    public static void contarLongitud(String palabra) {
        int caracter = palabra.length();
        System.out.println("La palabra " + palabra + " tiene de caracteres: " + caracter);
    }

    public static double multiplicacion(double a, double b, double c) {
        double resultadoMultiplicacion = a * b * c;
        return resultadoMultiplicacion;
    }

    public static double dividir(double a, double b) {
        double resultadoDivision = a / b;
        return resultadoDivision;
    }
}
