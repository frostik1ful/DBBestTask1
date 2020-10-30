package com.example.dbbesttask0.testtask.service.classes;

import com.example.dbbesttask0.testtask.entity.Pipe;
import com.example.dbbesttask0.testtask.repository.PipeRepository;
import com.example.dbbesttask0.testtask.service.interfaces.PipeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PipeImplService implements PipeDao {
    PipeRepository pipeRepository;

    public PipeImplService(PipeRepository pipeRepository) {
        this.pipeRepository = pipeRepository;
    }

    @Override
    public void save(Pipe pipe) {
        pipeRepository.save(pipe);
    }
}
