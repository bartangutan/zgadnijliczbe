import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //typy proste, zmienne (nie obniekty) - małe litery

        //typy całkowite
        byte liczba1 = 120;
        short liczba2 = 300;
        int liczba3 = 12321321;
        long liczba4 = 123213232;
        System.out.println("liczba całkowita: "+liczba2);

        //typy zmiennoprzecinkowe
        float liczba5 = 12.546f;
        double liczba6 = 213123.321321;

        //typ logiczny
        boolean czyToTo = true;

        //typ znakowy
        char znak = 'a';


//        napisz program w którym zgadniesz liczbe wylosowaną z zakresu od 1-100
        //losowanie liczby
        int wylosowanaLiczba = (int)(Math.random()*100+1); //rzutowanie typów
        System.out.println("wylosowano: "+wylosowanaLiczba);

        //wpisywanie z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int wpisanaLiczba = scanner.nextInt();
        System.out.println("Wpisano: "+wpisanaLiczba);

        //instruksja warunkowa
        if (wpisanaLiczba==wylosowanaLiczba){
            System.out.println("Trafione!");
        }else{
            System.out.println("nie trafione!");
        }

        int roznica;
        if (wylosowanaLiczba>wpisanaLiczba){
            roznica = wylosowanaLiczba-wpisanaLiczba;
        }else{
            roznica = wpisanaLiczba-wylosowanaLiczba;
        }
        //wyrażenie warunkowe -> zwraca wartość
        roznica = wpisanaLiczba>wylosowanaLiczba?wpisanaLiczba-wylosowanaLiczba:wylosowanaLiczba-wpisanaLiczba;
        System.out.println("różnica: "+roznica);

        //dzielenie całkowite
        roznica = roznica/10; //dzielimy inty więc nie wyjdzie float

        //instrukcja wyboru
        switch (roznica){
            case 0:
                System.out.println("Prawie lub trafione.");
                break;
            case 1:
                System.out.println("BLisko");
                break;
            case 2:
                System.out.println("Nie najgorzej");
                break;
            default:
                System.out.println("Spróbuj innym razem.");
        }

        //wyrażenie switch
        System.out.println(
                switch (roznica){
                    case 0->"prawie.";
                    case 1->"blisko.";
                    case 2->"srednio.";
                    default -> "slabo.";
                }
        );

    }
}