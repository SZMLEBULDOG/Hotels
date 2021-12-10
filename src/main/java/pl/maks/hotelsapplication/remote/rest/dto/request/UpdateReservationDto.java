package pl.maks.hotelsapplication.remote.rest.dto.request;

import pl.maks.hotelsapplication.domain.model.ReservationStatusType;

import java.util.List;

public class UpdateReservationDto {

    private ReservationStatusType status;
    private List<HotelReservationDto> hotels;
    private PersonReservationDto personReservationDto;

    public UpdateReservationDto() {
    }

    public UpdateReservationDto(ReservationStatusType status, List<HotelReservationDto> hotels, PersonReservationDto personReservationDto) {
        this.status = status;
        this.hotels = hotels;
        this.personReservationDto = personReservationDto;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<HotelReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonReservationDto getPersonReservationDto() {
        return personReservationDto;
    }

    public void setPersonReservationDto(PersonReservationDto personReservationDto) {
        this.personReservationDto = personReservationDto;
    }
}
