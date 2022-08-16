package com.example.trouvago.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private long phone;

    @NotNull
    private String adress;

    @NotNull
    private int rate;

    @ManyToOne
    private City city;

    @OneToMany (mappedBy = "hotel")
    private List<Room> rooms;

    public Hotel(Long id, String name, Long phone, String adress, int rate, City city) {
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.adress=adress;
        this.rate=rate;
        this.city = city;
    }
}
