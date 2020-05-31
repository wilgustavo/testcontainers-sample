package gmw.integral.domain;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class ContactoRepositoryTest extends AbstractContainerBaseTest {

    @Autowired
    private ContactoRepository contactoRepository;

    @Test
    @Sql("/sql/contactos.sql")
    public void deberiaConsultarContacto() {
        String id = "979177d9-1ff5-4c02-8dc6-0d2c60df8ffd";
        Contacto contacto = contactoRepository.findById(id).get();
        assertThat(contacto.getEmail()).isEqualTo("homer@email.com");
        assertThat(contacto.getNombre()).isEqualTo("Cosme Fulanito");
    }

}