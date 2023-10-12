import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    private String name;
    private double wallet;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Ryan", 550.75);
    }

    @Test
    public void hasName(){
        assertThat(customer.getCustomerName()).isEqualTo("Ryan");
    }

    @Test
    public void hasMoney(){
        assertThat(customer.getWallet()).isEqualTo(550.75);
    }



}
