package com.ants.flatmap;

import com.ants.flatmap.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private long id;
    private String name;
    private List<Address> addressList;
}
