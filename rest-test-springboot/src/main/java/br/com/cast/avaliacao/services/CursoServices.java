package br.com.cast.avaliacao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.avaliacao.converter.DozerConverter;
import br.com.cast.avaliacao.exception.ResourceNotFoundException;
import br.com.cast.avaliacao.model.Curso;
import br.com.cast.avaliacao.model.vo.CursoVO;
import br.com.cast.avaliacao.reposirory.CursoReposirory;

@Service
public class CursoServices {

	@Autowired
	CursoReposirory repository;

	public CursoVO create(CursoVO curso) {
		
		
		var entity = DozerConverter.parseObject(curso, Curso.class);
		var vo = DozerConverter.parseObject(repository.save(entity), CursoVO.class);

		return vo;
	}

	public List<CursoVO> findAll() {
		return DozerConverter.parseListObjects(repository.findAll(), CursoVO.class);
	}

	public CursoVO findById(Long id) {

		var entity =  repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Curso não encontrado!"));
		return DozerConverter.parseObject(repository.save(entity), CursoVO.class);
		
	}

	public CursoVO update(CursoVO curso) {

		var  entity = repository.findById(curso.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Curso não encontrado!"));
		entity.setDescricao(curso.getDescricao());
		entity.setDatainicio(curso.getDatainicio());
		entity.setDatafim(curso.getDatafim());
		entity.setQuantidadeAlunos(curso.getQuantidadeAlunos());
		entity.setCategoria(curso.getCategoria());
		
		var vo = DozerConverter.parseObject(repository.save(entity), CursoVO.class);
		return vo;
		
	}

	public void delete(Long id) {
		Curso entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Curso não encontrado!"));

		repository.delete(entity);
	}

}
