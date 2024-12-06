package pe.edu.i202224552.service;

import java.util.List;

import pe.edu.i202224552.dto.FilmDTO;
import pe.edu.i202224552.dto.FilmDetailDTO;
import pe.edu.i202224552.dto.FilmTosaveDTO;
import pe.edu.i202224552.model.Film;
import pe.edu.i202224552.model.Language;

public interface CrudFilmService {
	List<FilmDTO> findAll();
	FilmDetailDTO getFilmDetail(Integer id);
	Film update(FilmTosaveDTO entity);
	boolean delete(Integer id);
	Film create(FilmTosaveDTO entity);
	FilmTosaveDTO getFilmToSave(Integer id);
	List<Language> getAllLanguages();
}
