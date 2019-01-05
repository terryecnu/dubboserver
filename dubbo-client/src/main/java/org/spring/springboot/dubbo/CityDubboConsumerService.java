package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 城市 Dubbo 服务消费者
 *
 *
 */
@Component
public class CityDubboConsumerService {

    @Reference(version = "1.0.0")
    //@Autowired
	CityDubboService cityDubboService;

    public void printCity() {
        String cityName="上海";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
