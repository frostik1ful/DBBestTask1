package com.example.dbbesttask0.testtask.service.classes;

import com.example.dbbesttask0.testtask.entity.Point;
import com.example.dbbesttask0.testtask.repository.PointRepository;
import com.example.dbbesttask0.testtask.service.interfaces.PointDao;
import org.springframework.stereotype.Service;

@Service
public class PointImplService implements PointDao {
    PointRepository pointRepository;

    public PointImplService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    @Override
    public void save(Point point) {
        pointRepository.save(point);
    }
}
