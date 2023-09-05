package Cap18.Collections.hotelaria.domain;

import Cap18.Collections.hotelaria.domain.exceptions.HotelJaExistenteException;

import java.util.ArrayList;
import java.util.List;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionarHotel(String nome, String cidade, double precoDiaria){
        Hotel hotel = new Hotel(nome, cidade,precoDiaria);
        if (hoteis.contains(hotel)){
            throw new HotelJaExistenteException("Hotel já existente na lista");
        }
        hoteis.add(hotel);
    }

    public ArrayList<Hotel> obterTodos(){
        return hoteis;
    }

}
