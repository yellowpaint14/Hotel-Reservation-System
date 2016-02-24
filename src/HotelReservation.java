package learning.MyProjects.HotelReservationSystem;
import java.util.Scanner;
class HotelReservation {
    public static void main(String[] args)throws java.io.IOException, java.lang.InterruptedException{
        Scanner input = new Scanner(System.in);
        char choice, ignore;
        int peopleCount = 0, nightsCount = 0, price = 0;
        String reservedHotelName = "\n";
        Hotel GoldSleep = new Hotel("Gold Sleep", 4.5, 6, 120);
        Hotel Novotel = new Hotel("Novotel", 5.2, 24, 180);
        Hotel AmericanEagle = new Hotel("American Eagle", 3.2, 15, 70);
        for(;;){
            System.out.println("Witaj. Wybierz, co chcesz zrobić.");
            System.out.println("1. Przeglądaj oferty hoteli");
            System.out.println("2. Sprawdź stan rezerwacji");
            System.out.println("3. Anuluj rezerwację");
            System.out.println("4. Wyjdź z programu");
            choice = (char)System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            switch(choice){
                case '1':
                    System.out.println("1. "+GoldSleep.hotelName);
                    System.out.println("    średnia ocena: "+GoldSleep.rating);
                    System.out.println("    ilość wolnych pokoi: "+GoldSleep.freeRooms);
                    System.out.println("    cena za noc (Os. Dorosła): "+GoldSleep.pricePerNight+" PLN");
                    System.out.println("2. "+Novotel.hotelName);
                    System.out.println("    średnia ocena: "+Novotel.rating);
                    System.out.println("    ilość wolnych pokoi: "+Novotel.freeRooms);
                    System.out.println("    cena za noc (Os.Dorosła): "+Novotel.pricePerNight+" PLN");
                    System.out.println("3. "+AmericanEagle.hotelName);
                    System.out.println("    średnia ocena: "+AmericanEagle.rating);
                    System.out.println("    ilość wolnych pokoi: "+AmericanEagle.freeRooms);
                    System.out.println("    cena za noc (Os. Dorosła): "+AmericanEagle.pricePerNight+" PLN");
                    System.out.println("Wybierz numer hotelu, lub wpisz q aby wrócić.");
                    choice = (char) System.in.read();
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                    switch(choice){
                        case '1':
                            System.out.println("Dla ilu osób zarezerwować pokój?");
                            peopleCount = input.nextInt();
                            System.out.println("Na ile nocy zarazerwować pokój?");
                            nightsCount = input.nextInt();
                            System.out.println("Cena wynienie "+GoldSleep.getFinalPrice(peopleCount, nightsCount));
                            System.out.println("Czy na pewno chcesz zarezerwować? t/n");
                            choice = (char) System.in.read();
                            do {
                                ignore = (char) System.in.read();
                            } while (ignore != '\n');
                            switch(choice){
                                case 't':
                                    System.out.println("Zarezerowałeś "+nightsCount+" nocy w hotelu "+GoldSleep.hotelName+", cena wyniesie "+GoldSleep.getFinalPrice(peopleCount, nightsCount)+" PLN.");
                                    price = GoldSleep.getFinalPrice(peopleCount,nightsCount);
                                    reservedHotelName = GoldSleep.hotelName;
                                    System.out.println("Za chwilę zostaniesz przeniesiony do menu... ");
                                    Thread.sleep(6000);
                                    break;
                                case 'n':
                                    break;
                            }
                            break;
                        case '2':
                            System.out.println("Dla ilu osób zarezerwować pokój?");
                            peopleCount = input.nextInt();
                            System.out.println("Na ile nocy zarazerwować pokój?");
                            nightsCount = input.nextInt();
                            System.out.println("Cena wyniesie "+Novotel.getFinalPrice(peopleCount, nightsCount)+" PLN.");
                            System.out.println("Czy na pewno chcesz zarezerwować? t/n");
                            choice = (char) System.in.read();
                            do {
                                ignore = (char) System.in.read();
                            } while (ignore != '\n');
                            switch(choice){
                                case 't':
                                    System.out.println("Zarezerwowałeś "+nightsCount+" nocy w hotelu "+Novotel.hotelName+", cena wyniesie "+Novotel.getFinalPrice(peopleCount, nightsCount));
                                    price = Novotel.getFinalPrice(peopleCount,nightsCount);
                                    reservedHotelName = Novotel.hotelName;
                                    System.out.println("Za chwilę zostaniesz przeniesiony do menu...");
                                    Thread.sleep(6000);
                                    break;
                                case 'n':
                                    break;

                            }
                            break;
                        case '3':
                            System.out.println("Dla ilu osób zarezerwować pokój?");
                            peopleCount = input.nextInt();
                            System.out.println("Na ile nocy zarazerwować pokój?");
                            nightsCount = input.nextInt();
                            System.out.println("Cena wyniesie "+AmericanEagle.getFinalPrice(peopleCount, nightsCount)+" PLN");
                            System.out.println("Czy na pewno chcesz zarezerwować? t/n");
                            choice = (char) System.in.read();
                            do {
                                ignore = (char) System.in.read();
                            } while (ignore != '\n');
                            switch (choice){
                                case 't':
                                    System.out.println("Zarezerwowałeś "+nightsCount+" nocy w hotelu "+AmericanEagle.hotelName+", cena wyniesie "+AmericanEagle.getFinalPrice(peopleCount, nightsCount));
                                    price = AmericanEagle.getFinalPrice(peopleCount, nightsCount);
                                    reservedHotelName = AmericanEagle.hotelName;
                                    System.out.println("Za chwilę zostaniesz przeniesiony do menu...");
                                    Thread.sleep(6000);
                                    break ;
                                case 'n':
                                    break;
                            }
                        case 'q':
                            break;
                    }
                    break;
                case '2':
                    System.out.println("Oto stan twojej rezerwacji: ");
                    if(reservedHotelName.equals("\n")){
                        System.out.println("Brak rezerwacji!");
                    }
                    else{
                        System.out.println("Nazwa hotelu: "+reservedHotelName);
                        System.out.println("Ilość osób: "+peopleCount);
                        System.out.println("Ilość nocy: "+nightsCount);
                        System.out.println("Cena: "+price+" PLN");
                    }
                    System.out.println("Aby wrócić, wpisz 1");
                    choice = (char) System.in.read();
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                    switch (choice){
                        case '1':
                            break;
                    }
                    break;
                case '3':
                    if(reservedHotelName.equals("\n")){
                        System.out.println("Brak rezerwacji!");
                        System.out.println("Wybierz 1, aby wrócić");
                        choice = (char) System.in.read();
                        do {
                            ignore = (char) System.in.read();
                        } while (ignore != '\n');
                        switch (choice){
                            case '1':
                                break;
                        }
                        break;

                    }
                    else {
                        System.out.println("Czy na pewno chcesz anulować swoją rezerwację?");
                        System.out.println("t/n");
                        choice = (char) System.in.read();
                        do {
                            ignore = (char) System.in.read();
                        } while (ignore != '\n');
                        switch (choice) {
                            case 't':
                                reservedHotelName = "\n";
                                peopleCount = 0;
                                nightsCount = 0;
                                price = 0;
                                System.out.println("Rezerwacja anulowana.");
                                System.out.println("Za chwilę zostaniesz przeniesiony do menu...");
                                Thread.sleep(3000);
                                break;
                            case 'n':
                                break;
                        }
                        break;
                    }
                case '4':
                    System.out.println("Czy na pewno chcesz wyjść z programu? t/n");
                    choice = (char) System.in.read();
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                    switch(choice){
                        case 't':
                            System.exit(1);
                        case 'n':
                            break;
                    }

                    break;
            }
        }
    }
}
