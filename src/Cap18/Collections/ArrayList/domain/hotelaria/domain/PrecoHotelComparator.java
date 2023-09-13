package Cap18.Collections.ArrayList.domain.hotelaria.domain;

import java.util.Comparator;

public class PrecoHotelComparator implements Comparator<Hotel> {

    @Override
    public int compare(Hotel o1, Hotel o2) {
        return Double.compare(o1.getPrecoDiaria(), o2.getPrecoDiaria());
    }
}
