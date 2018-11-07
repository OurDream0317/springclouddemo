package com.fyx.product.Dao;

import com.fyx.product.pojo.Cities;
import com.fyx.product.pojo.Product;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class CitiesDaoTest {
    @Autowired
    private  CitiesDao productDao;
    @Test
    public void findAll() {
        List<Cities> all = productDao.findAll();
        Assert.assertTrue(all.size()>0);
    }

}