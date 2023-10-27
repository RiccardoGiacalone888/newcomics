package ComicsList.newcomics.Controller;

import ComicsList.newcomics.Models.Comics;
import ComicsList.newcomics.Service.ComicsServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;

@RestController
public class ComicsController {
    @Autowired
    private ComicsServiceDB comicsServiceDB;

    @GetMapping("/comics")
    public List<Comics> getAllComics(){
        return comicsServiceDB.getAllComics();
    }

    @GetMapping("/comics/id")
    public Comics getComics(@PathVariable Long id){
        return comicsServiceDB.getComics(id);
    }

    @PostMapping("/comics")
    public void addComics(@RequestBody Comics comics){
        comicsServiceDB.addComics(comics);
    }

    @RequestMapping(value = "/comics/{id}", method = RequestMethod.PUT)
    public void updateComics (@PathVariable Long id, @RequestBody Comics comics){
        comicsServiceDB.updateComics(id,comics);
    }

    @RequestMapping(value = "/comics/{id}", method = RequestMethod.DELETE)
    public void deleteComics (@PathVariable Long id){
        comicsServiceDB.deleteComics(id);
    }



}
