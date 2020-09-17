package music.dao;

import org.springframework.data.repository.CrudRepository;

import music.domain.Song;




public interface SongDAO extends CrudRepository<Song, Integer>{

}
