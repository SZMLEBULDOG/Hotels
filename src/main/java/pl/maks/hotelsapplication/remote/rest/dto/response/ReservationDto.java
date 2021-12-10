package pl.maks.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class ReservationDto {

    private List<HotelDto> hotels;

    public ReservationDto() {
    }

    public ReservationDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
