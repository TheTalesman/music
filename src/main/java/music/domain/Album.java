package music.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "en_album")
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@ManyToMany(targetEntity = Song.class, cascade = CascadeType.ALL)
	@JoinTable(name = "re_album_songs", joinColumns = @JoinColumn(name = "album_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "song_id", referencedColumnName = "id"))
	private List<Song> songs;

	

	public Album() {
	}

	public Album(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Song> getSongs() {
		return songs;
	}

	public void setCids(List<Song> songs) {
		this.songs = songs;
	}

}
