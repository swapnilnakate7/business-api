package in.swapnil.mybusiness.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BusinessControllerTest {

    @Autowired
    private BusinessController businessController;

    @BeforeEach
    void setUp() {

    }

    @Test
    public void testGetBusinessName(){
       assertEquals("My Grocery Store",businessController.getBusinessName());
    }


}