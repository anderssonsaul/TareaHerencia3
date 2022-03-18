/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia3;

/**
 *
 * @author ander
 */
public class SmartPhone extends Computer {

    private String gama;
    private String camera;

    public void setGama(String gama) {
        this.gama = gama;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getGama() {
        return gama;
    }

    public String getCamera() {
        return camera;
    }

    public SmartPhone() {
    }

    public SmartPhone(String gama, String camera) {
        this.gama = gama;
        this.camera = camera;
    }

    public SmartPhone(String gama, String camera, String brand, String battery, String processor, String ram, double size) {
        super(brand, battery, processor, ram, size);
        this.gama = gama;
        this.camera = camera;
    }

    public void printData() {
        String cadena;
        cadena = "*******************************************\n";
        cadena = cadena + "\nDatos del Celular\n\n";
        cadena = cadena + "Marca: " + getBrand() + "\n";
        cadena = cadena + "Bateria: " + getBattery() + "\n";
        cadena = cadena + "Procesador: " + getProcessor() + "\n";
        cadena = cadena + "Ram: " + getRam() + "\n";
        cadena = cadena + "Tamanio: " + getSize() + "\n";
        cadena = cadena + "Gama: " + getGama() + "\n";
        cadena = cadena + "Camara: " + getCamera() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
    }

    public void printGamaCamera() {
        String cadena;
        cadena = "*******************************************\n";
        cadena = cadena + "\nDatos de Gama y Camara\n\n";
        cadena = cadena + "Gama: " + getGama() + "\n";
        cadena = cadena + "Camara: " + getCamera() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
    }

}
