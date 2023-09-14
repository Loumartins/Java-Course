package Cap18.Collections.ArrayList.domain.hotelaria.domain;

import Cap18.Collections.ArrayList.domain.hotelaria.domain.exceptions.HotelJaExistenteException;
import Cap18.Collections.ArrayList.domain.hotelaria.domain.exceptions.HotelNaoEncontradoException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CadastroHotel {

    private final List<Hotel> hoteis = new ArrayList<>();

    public void adicionarHotel(String nome, String cidade, double precoDiaria){
        Hotel hotel = new Hotel(nome, cidade,precoDiaria);
        if (hoteis.contains(hotel)){
            throw new HotelJaExistenteException("Hotel já existente na lista");
        }
        hoteis.add(hotel);
    }

    public void ordenarPorNome(){
        Collections.sort(hoteis);

    }

    public void ordenarPorPreco(){
        hoteis.sort(new PrecoHotelComparator());
    }

    public Hotel[] arrayHoteis(){
        return hoteis.toArray(new Hotel[0]);
    }

    public List<Hotel> obterTodos(){
        return hoteis;
    }

    public void removerPorCidade(String cidade){
        hoteis.removeIf(hotel -> hotel.getCidade().equals(cidade));
//        for (Hotel hotel : hoteis) {
//            if (hotel.getCidade().equals(cidade) ){
//                hoteis.remove(hotel);
//            }
//        }
    }

    public void remover(Hotel hotel){
       boolean removido = hoteis.remove(hotel);

       if (!removido){
           throw new HotelNaoEncontradoException("Hotel não pode ser removido porque nao foi encontrado");
       }
    }


}
