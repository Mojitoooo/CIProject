package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import junit.framework.Assert;

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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;

@Service
@RunWith(MockitoJUnitRunner.class)
public class VoyageServiceImplTest {
    @InjectMocks
    VoyageServiceImpl voyageServiceImpl;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this); 
    }
    @Mock
    VoyageRepository voyageRepository;

    Voyage v = new Voyage((long)1,"gareDepart","gareArrivee","dateDepart", "dateArrivee" , "heureDepart", "heureArrivee");
    Voyage v1 = new Voyage((long)2,"gareDepart","gareArrivee","dateDepart", "dateArrivee" , "heureDepart", "heureArrivee");
    Voyage v2 = new Voyage((long)3,"gareDepart","gareArrivee","dateDepart", "dateArrivee" , "heureDepart", "heureArrivee");
    List<Voyage> voyage = new ArrayList<Voyage>(){

        private static final long serialVersionUID = 1L;
        {add(v1); add(v2);}
    };

    @Test
    public void testGetVoyage() {
        Mockito.when(voyageRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(v));
        assertNotNull(voyageServiceImpl.recupererVoyageParId((long)3));
}

/*@Test
public void testaddVoyage() {
    Mockito.when(voyageRepository.save(Mockito.any(Voyage.class))).thenReturn(v);
    assertNotNull(VoyageServiceImpl.ajouterVoyage(v));
}*/

@Test
public void testUpdateVoyage() {


    Mockito.when(voyageRepository.save(Mockito.any(Voyage.class))).thenReturn(v);
    /*assertNotNull(voyageServiceImpl.modifierVoyage(v));
    assertEquals("Updated Libelle", v.getNom());*/
}

/*@Test
    public void testDeleteOperateur() {
        voyageServiceImpl.supp((long)3);
        verify(operateurRepository).deleteById((long)3);
    }*/

}

