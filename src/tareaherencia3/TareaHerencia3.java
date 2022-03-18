/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaherencia3;

public class TareaHerencia3 {

    /**
*se agrega comentario
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        SmartPhone sp = new SmartPhone();

        laptop.setBrand("DELL");
        laptop.setBattery("Litio");
        laptop.setProcessor("Intel i5");
        laptop.setRam("16 Gb");
        laptop.setSize(16);
        laptop.setColor("Rojo");
        laptop.setGraphicCard("MSI GeForce GT 730 - 4GB");
        laptop.setOs("windows 11");
        laptop.printData();
        laptop.printColorGraficCardOs();
        laptop.printBrandProcessor();

        System.out.println("\n##############################################################\n");

        sp.setBrand("SAMSUNG");
        sp.setBattery("Li-Ion 3400 mAh");
        sp.setProcessor("Exynos 9820");
        sp.setRam("8 Gb");
        sp.setSize(6.1);
        sp.setGama("Alta");
        sp.setCamera("16 megapíxeles");
        sp.printData();
        sp.printGamaCamera();
        sp.printBrandProcessor();

    }

}
