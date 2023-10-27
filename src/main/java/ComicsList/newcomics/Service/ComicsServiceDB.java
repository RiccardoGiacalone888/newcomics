package ComicsList.newcomics.Service;

import ComicsList.newcomics.Models.Comics;
import ComicsList.newcomics.Repository.ComicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComicsServiceDB implements ComicsService{
    @Autowired
    public ComicsRepository comicsRepository;
    public List<Comics> getAllComics(){
        return comicsRepository.findAll();
    }

    public Comics getComics(Long id){
        Optional<Comics> comics = this.comicsRepository.findById(id);
        if (comics.isPresent()){
            return comics.get();
        }else {
            return null;
        }
    }

    public void addComics(Comics comics){
        comicsRepository.save(comics);
    }

    public void updateComics(Long id, Comics comics){
        comicsRepository.save(comics);
    }

    public void deleteComics(Long id){
        comicsRepository.deleteById(id);
    }

}
