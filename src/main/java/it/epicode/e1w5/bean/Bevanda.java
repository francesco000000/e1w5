package it.epicode.e1w5.bean;

import lombok.Data;

@Data
public  class Bevanda extends ElementoMenu {
    @Override
    public String toString() {
        return "Bevanda{} " + super.toString();
    }
}
