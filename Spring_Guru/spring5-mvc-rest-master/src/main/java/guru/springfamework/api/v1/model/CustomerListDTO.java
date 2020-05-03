package guru.springfamework.api.v1.model;


import guru.springfamework.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;

@Data
@AllArgsConstructor
public class CustomerListDTO {

    List<CustomerDTO> customers;
}
