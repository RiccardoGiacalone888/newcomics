package ComicsList.newcomics.Repository;


import ComicsList.newcomics.Models.Comics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicsRepository extends JpaRepository<Comics, Long>{

}