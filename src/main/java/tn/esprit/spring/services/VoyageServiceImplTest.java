package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import tn.esprit.spring.entities.Train;
import tn.esprit.spring.entities.Voyage;
import tn.esprit.spring.repository.TrainRepository;
import tn.esprit.spring.repository.VoyageRepository;

import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

@Service
@RunWith(MockitoJUnitRunner.class)
public class VoyageServiceImplTest {
    @InjectMocks
    VoyageServiceImplTest operateurService;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this); 
    }
    @Mock
    VoyageRepository voyageRepository;


