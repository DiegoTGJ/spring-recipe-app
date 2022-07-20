package tutorial.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import tutorial.domain.UnitOfMeasure;

import java.util.HashSet;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;
    @Before
    public void setUp(){
    }

    @Test
    public void findByDescription() {

        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Cup");

        HashSet<UnitOfMeasure> uomSet = new HashSet<>();
        unitOfMeasureRepository.findAll().iterator().forEachRemaining(uomSet::add);
        assertEquals(8,uomSet.size());
        assertEquals("Cup", uomOptional.get().getDescription());
    }
}