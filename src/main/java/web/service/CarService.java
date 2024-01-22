package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;

import java.util.List;

import static java.util.Objects.isNull;

@Service
public class CarService {
    // выделен отдельно для реализации доп логики над dao перед выводом
    @Autowired
    private static CarDao carDao;

    public static List<String> printCars(Integer count){
        if (isNull(count)) {
            return carDao.printCars();
        } else {
            return count < 5 ? carDao.printCars().stream().limit(count).toList() : carDao.printCars();
        }
    }

}
