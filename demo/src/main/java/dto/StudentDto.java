package dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.StudentModel;
import tools.jackson.databind.json.JsonMapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StudentDto {
    @JsonIgnore
    private Integer id;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    
    public StudentModel toModel() {
        return StudentModel.builder()
            .id(this.id)
            .name(this.name)
            .lastName(this.lastName)
            .phone(this.phone)
            .email(this.email)
            .build();
    }
    @Override
    public String toString() {
        return JsonMapper.shared().writeValueAsString(this);
    }
}
