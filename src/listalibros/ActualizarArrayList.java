package listalibros;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActualizarArrayList {

    public Libro crearLibro() {
        Libro libro = new Libro(
                JOptionPane.showInputDialog(
                        null,
                        "Introduce o título",
                        "Boletin 20 - Lista de libros",
                        JOptionPane.QUESTION_MESSAGE),
                JOptionPane.showInputDialog(
                        null,
                        "Introduce o autor",
                        "Boletin 20 - Lista de libros",
                        JOptionPane.QUESTION_MESSAGE),
                JOptionPane.showInputDialog(
                        null,
                        "Introduce o ISBN",
                        "Boletin 20 - Lista de libros",
                        JOptionPane.QUESTION_MESSAGE),
                Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        "Introduce o prezo",
                        "Boletin 20 - Lista de libros",
                        JOptionPane.QUESTION_MESSAGE)),
                Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Introduce o número de unidades",
                        "Boletin 20 - Lista de libros",
                        JOptionPane.QUESTION_MESSAGE)));
        return libro;
    }

    public ArrayList<Libro> ordearArrayList(ArrayList<Libro> lista) {
        lista.sort(new Comparator<Libro>() {
            @Override
            public int compare(Libro o1, Libro o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }
        });
        return lista;
    }

    public void borrarLibro(ArrayList<Libro> lista) {
        String ISBN = JOptionPane.showInputDialog(
                null,
                "Introduce o ISBN",
                "Boletin 20 - Lista de libros",
                JOptionPane.QUESTION_MESSAGE);
        int resp = JOptionPane.showConfirmDialog(
                null,
                "¿Está seguro?",
                "Boletin 20 - Lista de libros",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        int error = 0;
        if (resp == 0) {
            for (int i = 0; i < lista.size(); i++) {
                if (ISBN.equals(lista.get(i).getISBN()))
                    lista.remove(lista.get(i));
                    error = 1;
            }
        }
        if (error == 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "O ISBN introducido non existe",
                    "Boletin 20 - Lista de libros",
                    JOptionPane.ERROR_MESSAGE);
        }
        if (error == 1) {
            JOptionPane.showMessageDialog(
                    null,
                    "O libro eliminouse correctamente",
                    "Boletin 20 - Lista de libros",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void amosarLlibros(ArrayList<Libro> lista) {
        JOptionPane.showMessageDialog(
                null,
                new JList(lista.toArray()),
                "Boletin 20 - Lista de libros",
                JOptionPane.PLAIN_MESSAGE);
    }

    public void filtrarLibros(ArrayList<Libro> lista) {
        int resp = JOptionPane.showConfirmDialog(
                null,
                "¿Está seguro?",
                "Boletin 20 - Lista de libros",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        int error = 0;
        if (resp == 0) {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getUnidades() == 0)
                    lista.remove(lista.get(i));
                    error = 1;
            }
        }
        if (error == 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "Non hai libros sen stock",
                    "Boletin 20 - Lista de libros",
                    JOptionPane.ERROR_MESSAGE);
        }
        if (error == 1) {
            JOptionPane.showMessageDialog(
                    null,
                    "Os libros elimináronse correctamente",
                    "Boletin 20 - Lista de libros",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void consultarLibro(ArrayList<Libro> lista) {
        String ISBN = JOptionPane.showInputDialog(
                null,
                "Introduce o ISBN",
                "Boletin 20 - Lista de libros",
                JOptionPane.QUESTION_MESSAGE);
        int error = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (ISBN.equals(lista.get(i).getISBN()))
                JOptionPane.showMessageDialog(
                        null,
                        lista.get(i),
                        "Boletin 20 - Lista de libros",
                        JOptionPane.PLAIN_MESSAGE);
                        error = 1;
        }
        if (error == 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "O ISBN introducido non existe",
                    "Boletin 20 - Lista de libros",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
