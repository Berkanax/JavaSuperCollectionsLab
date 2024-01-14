package JavaZaawansowana._02_Super;
/*
Zadanie 1
Konstrukcja super()
Pozwala odwoływać się do pól i metod nadklasy, które zostały przesłonięte lub ukryte.
Wywołanie następuje przez konstruktor z kropką.
Więc stwórzmy (Computer i Notebook), w którym obniżymy temperaturę procesora CPU o 3 dla Computera i o 9 dla Notebooka.
 */
public class MainClass {

    public static void main(String[] args) {
        Computer computer = new Computer("11", 20);
        computer.reduceTemperature();
        System.out.println(computer);

        Notebook notebook = new Notebook("12", 50);
        notebook.reduceTemperature();
        System.out.println(notebook);
    }

}
