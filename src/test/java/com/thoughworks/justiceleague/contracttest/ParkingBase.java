package com.thoughworks.justiceleague.contracttest;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Ignore
public class ParkingBase {

    @Autowired
    WebApplicationContext context;

    @Before
    public void setUp() throws Exception {
        RestAssuredMockMvc.webAppContextSetup(context);
    }
}
