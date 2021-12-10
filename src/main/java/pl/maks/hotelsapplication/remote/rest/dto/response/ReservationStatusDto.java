package pl.maks.hotelsapplication.remote.rest.dto.response;

import pl.maks.hotelsapplication.domain.model.ReservationStatusType;

import java.util.Date;

public class ReservationStatusDto {

    private ReservationStatusType status;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAT;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    public ReservationStatusDto() {
    }

    public ReservationStatusDto(ReservationStatusType status, Date createdAT, Date expectedAt, Date updatedAt) {
        this.status = status;
        this.createdAT = createdAT;
        this.expectedAt = expectedAt;
        this.updatedAt = updatedAt;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public Date getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(Date createdAT) {
        this.createdAT = createdAT;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
