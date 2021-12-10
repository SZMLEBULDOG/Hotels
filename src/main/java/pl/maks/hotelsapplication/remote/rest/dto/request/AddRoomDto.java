package pl.maks.hotelsapplication.remote.rest.dto.request;

import java.math.BigDecimal;

public class AddRoomDto {
    private Integer beds;
    private BigDecimal price;

    public AddRoomDto() {
    }

    public AddRoomDto(Integer beds, BigDecimal price) {
        this.beds = beds;
        this.price = price;
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
