package pl.maks.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class HotelDto {
    private Integer id;
    private String name;
    private List<RoomDto> rooms;

    public HotelDto() {
    }

    public HotelDto(Integer id, String name, List<RoomDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoomDto> getSizes() {
        return rooms;
    }

    public void setSizes(List<RoomDto> sizes) {
        this.rooms = sizes;
    }
}
