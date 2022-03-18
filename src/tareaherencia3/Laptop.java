/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia3;

public class Laptop extends Computer {

    private String color;
    private String graphicCard;
    private String os;

    public void setColor(String color) {
        this.color = color;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getOs() {
        return os;
    }

    public Laptop() {
    }

    public Laptop(String color, String graphicCard, String os) {
        this.color = color;
        this.graphicCard = graphicCard;
        this.os = os;
    }

    public Laptop(String color, String graphicCard, String os, String brand, String battery, String processor, String ram, double size) {
        super(brand, battery, processor, ram, size);
        this.color = color;
        this.graphicCard = graphicCard;
        this.os = os;
    }

    public void printData() {
        String cadena;
        cadena = "*******************************************\n";
        cadena = cadena + "\nDatos Completos Laptop\n\n";
        cadena = cadena + "Marca: " + getBrand() + "\n";
        cadena = cadena + "Bateria: " + getBattery() + "\n";
        cadena = cadena + "Procesador: " + getProcessor() + "\n";
        cadena = cadena + "Ram: " + getRam() + "\n";
        cadena = cadena + "Tamanio: " + getSize() + "\n";
        cadena = cadena + "Color: " + getColor() + "\n";
        cadena = cadena + "Tarjeta Grafica: " + getGraphicCard() + "\n";
        cadena = cadena + "Sistema Operativo: " + getOs() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
    }

    public void printColorGraficCardOs() {
        String cadena;
        cadena = "*******************************************\n";
        cadena = cadena + "\nColor TarjetaGrafica y Sistema Operativo de la laptop\n\n";
        cadena = cadena + "Color: " + getColor() + "\n";
        cadena = cadena + "Tarjeta Grafica: " + getGraphicCard() + "\n";
        cadena = cadena + "Sistema Operativo: " + getOs() + "\n";
        cadena = cadena + "*******************************************\n";
        System.out.println(cadena);
    }

}
