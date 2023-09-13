package Cap18.Collections.ArrayList.domain.hotelaria.test;

import Cap18.Collections.ArrayList.domain.hotelaria.domain.CadastroHotel;
import Cap18.Collections.ArrayList.domain.hotelaria.domain.Hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class HotelariaTest01 {
    public static void main(String[] args) {
        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionarHotel("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastroHotel.adicionarHotel("Royal Lodge", "Macae/RJ", 800);
        cadastroHotel.adicionarHotel("Copacabana Palace", "RIo de Janeiro/RJ", 1700);
        cadastroHotel.adicionarHotel("Inn Lodge", "Fortim/CE", 1300);
        cadastroHotel.adicionarHotel("Hotel Fazenda Dona Carolina", "São Paulo/CE", 900);
        cadastroHotel.adicionarHotel("Mercure Lodge", "Belo Horizonte/CE", 500);

       //Hotel hotel = cadastroHotel.obterTodos().get(3);
        // System.out.println(hotel.getNome());

        //System.out.println("-----------");

          List<Hotel> hoteis = cadastroHotel.obterTodos();

        //cadastroHotel.adicionarHotel("Jaguaribe Lodge", "Fortim/CE", 1300);

//        for (Hotel obterTodo : cadastroHotel.obterTodos()) {
//            System.out.println(obterTodo);
//            }

       // imprimirHoteis(hoteis);

//        cadastroHotel.removerPorCidade("Macae/RJ");

//        System.out.println("---------");
//
//        imprimirHoteis(hoteis);
//
//        System.out.println("---------");
//
//        imprimirHoteisDeTrazPraFrente(hoteis);


//        Hotel[] hotels = cadastroHotel.arrayHoteis();
//        System.out.println(Arrays.toString(hotels));

          cadastroHotel.ordenarPorPreco();

          imprimirHoteis(hoteis);

        }

        private static void imprimirHoteis(List<Hotel> hotels){
            for (Hotel hotel : hotels) {
                System.out.println(hotel);
            }
        }


        private static void imprimirHoteisDeTrazPraFrente(List<Hotel> hoteis){
            ListIterator<Hotel> hotelListIterator = hoteis.listIterator(hoteis.size());
            while (hotelListIterator.hasPrevious()){
                System.out.println(hotelListIterator.previous());
            }
        }
    }