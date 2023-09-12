package Cap18.Collections.hotelaria.domain;

import Cap18.Collections.hotelaria.domain.exceptions.HotelJaExistenteException;
import Cap18.Collections.hotelaria.domain.exceptions.HotelNaoEncontradoException;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void removerPorCidade(String cidade){
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()){
            Hotel hotel = hotelIterator.next();
            if (hotel.getCidade().equals(cidade)){
                hotelIterator.remove();
            }
        }
    }

    public void remover(Hotel hotel){
       boolean removido = hoteis.remove(hotel);

       if (!removido){
           throw new HotelNaoEncontradoException("Hotel não pode ser removido porque nao foi encontrado");
       }
    }


}
