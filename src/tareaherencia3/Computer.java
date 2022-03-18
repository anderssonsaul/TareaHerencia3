/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia3;

/**
 *
 * @author ander
 */
public class Computer {

    private String brand;
    private String battery;
    private String processor;
    private String ram;
    private double size;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public String getBattery() {
        return battery;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public double getSize() {
        return size;
    }

    public Computer() {
    }

    public Computer(String brand, String battery, String processor, String ram, double size) {
        this.brand = brand;
        this.battery = battery;
        this.processor = processor;
        this.ram = ram;
        this.size = size;
    }

    public void printData() {
        String cadena;
        cadena = "*******************************************\n";
        cadena = cadena + "\nDatos de Computador\n\n";
        cadena = cadena + "Marca: " + getBrand() + "\n";
        cadena = cadena + "Bateria: " + getBattery() + "\n";
        cadena = cadena + "Procesador: " + getProcessor() + "\n";
        cadena = cadena + "Ram: " + getRam() + "\n";
        cadena = cadena + "Tamanio: " + getSize() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
    }

    public void printBrandProcessor() {
        String cadena;
        cadena = "*******************************************\n";
        cadena = cadena + "\nDatos de la marca y el Processador\n\n";
        cadena = cadena + "Marca: " + getBrand() + "\n";
        cadena = cadena + "Procesador: " + getProcessor() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
    }

}
