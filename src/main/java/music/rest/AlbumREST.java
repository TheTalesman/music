package music.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import music.dao.AlbumDAO;
import music.domain.Album;



@RestController
public class AlbumREST {
	
	@Autowired
	AlbumDAO albumDAO;
	
	@RequestMapping(value = "/albumAdd", method = RequestMethod.GET)
	public void addAlbum(@RequestBody Album album)
			throws IOException {
		albumDAO.save(album);
	}
	
	@RequestMapping(value = "/albumList", method = RequestMethod.GET)
	public @ResponseBody List<Album> listAlbum(@RequestBody Album album)
			throws IOException {
		List<Album> lista = (List<Album>) albumDAO.findAll();
		return lista;
	}
	
}
