package Zadanie_4;

public class Calk {
    int ktoraCwiartka(Point point) {
        boolean dodatnieX = (point.getX() > 0);
        boolean dodatnieY = (point.getY() > 0);
        byte cwiartka = 0;

        if (point.getX() == 0 || point.getY() == 0) {
            cwiartka = 0;
        } else if (dodatnieX && dodatnieY) {
            cwiartka = 1;
        } else if (!dodatnieX && dodatnieY) {
            cwiartka = 2;
        } else if (!dodatnieX && !dodatnieY) {
            cwiartka = 3;
        } else if (dodatnieX && !dodatnieY) {
            cwiartka = 4;
        }
        return cwiartka;
    }
}
