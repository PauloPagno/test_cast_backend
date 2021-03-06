package br.com.cast.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.avaliacao.model.vo.CategoriaVO;
import br.com.cast.avaliacao.services.CategoriaServices;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaServices services;

	@GetMapping("/{codigo}")
	public CategoriaVO findBy(@PathVariable("codigo") Long codigo) {

		return services.findById(codigo);

	}

	@GetMapping
	public List<CategoriaVO> findAll() {

		return services.findAll();

	}

	@PostMapping
	public CategoriaVO create(@RequestBody CategoriaVO categoria) {

		return services.create(categoria);

	}

	@PutMapping
	public CategoriaVO update(@RequestBody CategoriaVO categoria) {

		return services.update(categoria);

	}

	@DeleteMapping("/{codigo}")
	public void delete(@PathVariable("codigo") Long codigo) {

		services.delete(codigo);

	}
}
