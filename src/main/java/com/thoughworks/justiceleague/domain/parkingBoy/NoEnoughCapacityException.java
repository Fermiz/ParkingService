package com.thoughworks.justiceleague.domain.parkingBoy;

public class NoEnoughCapacityException extends RuntimeException {

    @Override
    public String getMessage() {
        return "No enough capacity of this parking lot";
    }
}
