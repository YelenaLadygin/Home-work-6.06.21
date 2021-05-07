package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class CustomerController {

    private static ArrayList<Customer> m_customers = new ArrayList<>();

    // static ctor
    static {
        m_customers.add( new Customer( 33,"Yelena","Rehovot") );
        m_customers.add( new Customer(44, "Yosef", "Tel aviv") );
        m_customers.add( new Customer( 66, "Marina", "Herzlia") );
    }

    @GetMapping("/customer")
    public List<Customer> getCustomer()
    {
        return m_customers;
    }

    @GetMapping("/customer/{id}")
    public Customer doGetCouponById(@PathVariable("id") int id)
    {
        for(Customer c : m_customers)
        {
            if (c.getId() == id)
            {
                return c;
            }
        }
        return null;
    }

    @PostMapping("/customer")
    public String addCustomer(@RequestBody Customer c)
    {
        m_customers.add(c);
        return "Customer has been added";
    }

}
