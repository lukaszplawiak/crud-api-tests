package pl.lukaszp.restApiCarRental.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "AllCars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark;
    private String model;
    private Integer year;
    @Enumerated(EnumType.STRING)
    private Color color;

    public Car(String mark, String model, Integer year, Color color) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    //public Car(){
    //}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColour(Color color) {
        this.color = color;
    }
}
