package com.jotapedev1.CadastroAPI.Mission;

import com.jotapedev1.CadastroAPI.Ninja.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_mission")
public class MissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name, difficulty;

    //One mission (current class) to Many(list of) ninjas
    @OneToMany(mappedBy  = "missions")
    private List<NinjaModel> ninjas;
}
