import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.Calendar;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void setup() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.JANUARY, 1);
        Date birthDate = calendar.getTime();
        
        person = new Person("Teste", "Silva", birthDate, true, true, true);
    }

    @Test
    public void show_full_name() {
        assertEquals("Teste Silva", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary(), 0.01);
    }

    @Test
    public void person_is_MEI() {
        person.setSalary(5000);
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        
        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        person.setSalary(15000);
        assertFalse(person.isMEI());
    }
}