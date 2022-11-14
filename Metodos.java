import javax.swing.*;

public class Metodos {
    //variables
    int base, altura;
    boolean condicion;
    int numero;

    public int pedirEnteros(String mensaje) {
        this.numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return this.numero;
    }

    public boolean getCondicion(){
        this.condicion = base >=0 & altura >= 0;
        return this.condicion;
    }

    public int getArea(){
        int area = this.base * this.altura;
        return area;
    }

    //bucle: numeros incorrectos los vuelve a pedir
    public int pedirNumerosCorrectos() {
        this.base = pedirEnteros("Introducir base");
        this.altura = pedirEnteros("Introducir altura");
        while (!getCondicion()) {
            System.out.println("Numeros introducidos incorrectos");
            this.altura = pedirEnteros("Volver a introducir la altura");
            this.base = pedirEnteros("Volver a introducir la base");
        }
        System.out.println("Numeros enteros correctos");
        int area = getArea();
        return area;

    }
}

