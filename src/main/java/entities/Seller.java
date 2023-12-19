package entities;

import lombok.*;

import java.sql.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Seller {
private Integer id;
private String name;
private String email;
private Date birthDate;
private Double baseSalary;

private Department department;

}
