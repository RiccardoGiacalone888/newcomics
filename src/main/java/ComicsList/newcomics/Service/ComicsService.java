package ComicsList.newcomics.Service;

import ComicsList.newcomics.Models.Comics;

import java.util.List;

public interface ComicsService {
    public List<Comics> getAllComics();
    public Comics getComics(Long id);
    public void addComics(Comics comic);
    public void updateComics(Long id, Comics comics);
    public void deleteComics (Long id);
}
