package Cap18.Collections.hotelaria.domain;

import java.util.ArrayList;
import java.util.List;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionarHotel(String nome, String cidade, double precoDiaria){
        hoteis.add(new Hotel(nome, cidade,precoDiaria));
    }

    public ArrayList<Hotel> obterTodos(){
        return hoteis;
    }

}
