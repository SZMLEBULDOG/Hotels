package pl.maks.hotelsapplication.remote.rest.dto.request;

import java.util.List;

public class AddHotelDto {
    private String name;
    private List<AddRoomDto> rooms;

    public AddHotelDto() {
    }

    public AddHotelDto(String name, List<AddRoomDto> rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddRoomDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<AddRoomDto> rooms) {
        this.rooms = rooms;
    }
}
