package com.fyx.product.ProductController;

import com.fyx.product.Dao.CitiesDao;
import com.fyx.product.pojo.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class Productcontroller {

    @Autowired
    private CitiesDao citiesDao;


    @RequestMapping("/showGoods/{ids}")
    @ResponseBody
    public Cities  findall(@PathVariable("ids") Integer integer){

        final Optional<Cities> byId = citiesDao.findById(integer);
        return  byId.get();
    }

}
