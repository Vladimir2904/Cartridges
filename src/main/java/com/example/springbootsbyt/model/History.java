package com.example.springbootsbyt.model;

import lombok.Data;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.*;

//@Data
@Entity
@Table(name = "history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHistory;

    @Column(name = "date_of_status")
    private Date dateOfStatus;

    @Column(name = "status")
    private String status;

    @Column(name = "cartridges_id")
    private Integer cartridgesId;

    public Integer getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(Integer idHistory) {
        this.idHistory = idHistory;
    }

    public Date getDateOfStatus() {
        return dateOfStatus;
    }

    public void setDateOfStatus(Date dateOfStatus) {
        this.dateOfStatus = dateOfStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCartridgesId() {
        return cartridgesId;
    }

    public void setCartridgesId(Integer cartridgesId) {
        this.cartridgesId = cartridgesId;
    }

    public History(Integer idHistory, Date dateOfStatus, String status, Integer cartridgesId) {
        this.idHistory = idHistory;
        this.dateOfStatus = dateOfStatus;
        this.status = status;
        this.cartridgesId = cartridgesId;
    }

    public History() {
    }

    @Override
    public String toString() {
        return "History{" +
                "idHistory=" + idHistory +
                ", dateOfStatus=" + dateOfStatus +
                ", status='" + status + '\'' +
                ", cartridgesId=" + cartridgesId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;
        return Objects.equals(idHistory, history.idHistory) &&
                Objects.equals(dateOfStatus, history.dateOfStatus) &&
                Objects.equals(status, history.status) &&
                Objects.equals(cartridgesId, history.cartridgesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHistory, dateOfStatus, status, cartridgesId);
    }
}
