package model;

import dto.StudentDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.databind.json.JsonMapper;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
    
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "estudiante")

public class StudentModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", columnDefinition = "varchar(80)")
    private String name;
    @Column(name = "apellido", columnDefinition = "varchar(50)")
    private String lastName;
    @Column(name = "telefono", columnDefinition = "varchar(20)")
    private String phone;
    @Column(name = "email", columnDefinition = "varchar(80)")
    private String email;
    
    public StudentDto toDto() {
        return StudentDto.builder()
            .id(id)
            .name(name)
            .lastName(lastName)
            .phone(phone)
            .email(email)
            .build();
    }
   
    @Override
    public String toString() {
        return JsonMapper.shared().writeValueAsString(this);
    }
}
