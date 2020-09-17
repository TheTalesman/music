package music.dao;

import org.springframework.data.repository.CrudRepository;

import music.domain.Album;






public interface AlbumDAO extends CrudRepository<Album, Integer>{

}
