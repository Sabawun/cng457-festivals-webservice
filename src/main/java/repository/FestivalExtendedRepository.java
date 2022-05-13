package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface FestivalExtendedRepository<Festival, String extends festivalRepository>
        extends JpaRepository<Festival, String> {

    public List<Festival> findByCity(String attributeName, String text);
}
