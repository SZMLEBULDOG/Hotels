package pl.maks.hotelsapplication.remote.rest.dto.response;

import java.math.BigDecimal;

public class RoomDto {
    private Integer Id;
    private Integer beds;
    private BigDecimal price;

    public RoomDto() {
    }

    public RoomDto(Integer id, Integer beds, BigDecimal price) {
        Id = id;
        this.beds = beds;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
