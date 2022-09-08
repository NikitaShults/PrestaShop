package com.prestashop;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
@Builder
public class Account {

    private String firstName;
    private String lastName;
    private String password;
    private String day;
    private String month;
    private String year;
}
