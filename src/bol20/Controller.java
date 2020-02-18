package bol20;

import javafx.event.ActionEvent;
import listalibros.ActualizarArrayList;
import listalibros.Libro;

import javax.swing.*;
import java.util.ArrayList;

public class Controller {

    ArrayList<Libro> listaLibros = new ArrayList<>();
    ActualizarArrayList obx = new ActualizarArrayList();

    public void opcion1(ActionEvent event) {
        listaLibros.add(obx.crearLibro());
        listaLibros = obx.ordearArrayList(listaLibros);
    }
    public void opcion2(ActionEvent event) {
        obx.borrarLibro(listaLibros);
    }
    public void opcion3(ActionEvent event) {
        obx.amosarLlibros(listaLibros);
    }
    public void opcion4(ActionEvent event) {
        obx.filtrarLibros(listaLibros);
    }
    public void opcion5(ActionEvent event) {
        obx.consultarLibro(listaLibros);
    }
    public void opcion6(ActionEvent event) {
        System.exit(0);
    }
    public void opcion7(ActionEvent event) {
        JOptionPane.showMessageDialog(
                null,
                "Programa creado por dcancelas <3",
                "Boletin 20 - Lista de libros",
                JOptionPane.PLAIN_MESSAGE);
    }
}
