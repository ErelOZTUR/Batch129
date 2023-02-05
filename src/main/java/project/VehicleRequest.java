package project;

import java.time.LocalDate;
import java.time.LocalTime;

public class VehicleRequest {

    private String rentCity;

    private LocalDate rentDay;

    private LocalDate deliveryDay;

    private LocalTime deliveryHour;

    public VehicleRequest(String rentCity, LocalDate rentDay, LocalDate deliveryDay, LocalTime deliveryHour) {
        this.rentCity = rentCity;
        this.rentDay = rentDay;
        this.deliveryDay = deliveryDay;
        this.deliveryHour = deliveryHour;
    }


    public String getRentCity() {
        return rentCity;
    }

    public void setRentCity(String rentCity) {
        this.rentCity = rentCity;
    }

    public LocalDate getRentDay() {
        return rentDay;
    }

    public void setRentDay(LocalDate rentDay) {
        this.rentDay = rentDay;
    }

    public LocalDate getDeliveryDay() {
        return deliveryDay;
    }

    public void setDeliveryDay(LocalDate deliveryDay) {
        this.deliveryDay = deliveryDay;
    }

    public LocalTime getDeliveryHour() {
        return deliveryHour;
    }

    public void setDeliveryHour(LocalTime deliveryHour) {
        this.deliveryHour = deliveryHour;
    }
}
