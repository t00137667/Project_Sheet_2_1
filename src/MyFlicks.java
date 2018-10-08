import javax.swing.*;
import java.awt.*;

public class MyFlicks {
    static int filmCount;

    public static void main(String[] args) {

        filmCount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of films you are adding"));
        Film catalog[] = new Film[filmCount];
        System.out.println(catalog.length);

        for (int i = 0; i<filmCount;i++){
            Film f = new Film();

            f.setTitle(JOptionPane.showInputDialog("Please enter the title of the film"));
            f.setDirector(JOptionPane.showInputDialog("Please enter the name of the director"));
            f.setDuration(Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration of the film in minutes")));
            System.out.println("Check 2 "+i);
            catalog[i] = f;
            System.out.println("Check 3");

        }
        displayFilms(catalog);
    }
    private static void displayFilms(Film[] catalog){
        JTextArea jTextArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        jTextArea.setFont(font);
        jTextArea.setText("Number of films: "+ Film.getFilmCount() + "\n\n");

        for (int i = 0;i<Film.getFilmCount();i++){

            Film film = catalog[i];
            jTextArea.append(film.toString()+ "\n\n");
        }

        JOptionPane.showMessageDialog(null,jTextArea);
    }
}
