package br.com.cast.avaliacao.converter.mocks;

import java.util.ArrayList;
import java.util.List;

import br.com.cast.avaliacao.model.Categoria;
import br.com.cast.avaliacao.model.vo.CategoriaVO;

public class MockCategoria {


    public Categoria mockEntity() {
    	return mockEntity(0);
    }
    
    public CategoriaVO mockVO() {
    	return mockVO(0);
    }
    
    public List<Categoria> mockEntityList() {
        List<Categoria> categorias = new ArrayList<Categoria>();
        for (int i = 0; i < 14; i++) {
            categorias.add(mockEntity(i));
        }
        return categorias;
    }

    public List<CategoriaVO> mockVOList() {
        List<CategoriaVO> categorias = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            categorias.add(mockVO(i));
        }
        return categorias;
    }
    
    private Categoria mockEntity(Integer number) {
    	Categoria categoria = new Categoria();
    	categoria.setDescricao("Categoria Test" + number);
        return categoria;
    }

    private CategoriaVO mockVO(Integer number) {
    	CategoriaVO categoria = new CategoriaVO();
    	categoria.setDescricao("Categoria Test" + number);
        return categoria;
    }

}
