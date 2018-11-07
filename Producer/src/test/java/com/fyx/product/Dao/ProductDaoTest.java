package com.fyx.product.Dao;

import com.fyx.product.pojo.Cities;
import com.fyx.product.pojo.Product;
import com.mysql.fabric.xmlrpc.base.Array;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDaoTest {
    @Autowired
    private  CitiesDao CitiesDao;

}