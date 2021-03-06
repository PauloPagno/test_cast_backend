package br.com.cast.avaliacao.converter;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cast.avaliacao.converter.mocks.MockCategoria;
import br.com.cast.avaliacao.model.Categoria;
import br.com.cast.avaliacao.model.vo.CategoriaVO;

public class DozerConverterTest {
	
    MockCategoria inputObject;

    @Before
    public void setUp() {
        inputObject = new MockCategoria();
    }

    @Test
    public void parseEntityToVOTest() {
        CategoriaVO output = DozerConverter.parseObject(inputObject.mockEntity(), CategoriaVO.class);
    
        Assert.assertEquals("Categoria Test0", output.getDescricao());
      }

    @Test
    public void parseEntityListToVOListTest() {
        List<CategoriaVO> outputList = DozerConverter.parseListObjects(inputObject.mockEntityList(), CategoriaVO.class);
        CategoriaVO outputZero = outputList.get(0);
        
     
        Assert.assertEquals("Categoria Test0", outputZero.getDescricao());
        
        CategoriaVO outputSeven = outputList.get(7);
        
    
        Assert.assertEquals("Categoria Test7", outputSeven.getDescricao());
        
        CategoriaVO outputTwelve = outputList.get(12);
        
        
        Assert.assertEquals("Categoria Test12", outputTwelve.getDescricao());

    }

    @Test
    public void parseVOToEntityTest() {
        Categoria output = DozerConverter.parseObject(inputObject.mockVO(), Categoria.class);
   
        Assert.assertEquals("Categoria Test0", output.getDescricao());

    }

    @Test
    public void parserVOListToEntityListTest() {
        List<Categoria> outputList = DozerConverter.parseListObjects(inputObject.mockVOList(), Categoria.class);
        Categoria outputZero = outputList.get(0);
        
       
        Assert.assertEquals("Categoria Test0", outputZero.getDescricao());
        
        Categoria outputSeven = outputList.get(7);
        
      
        Assert.assertEquals("Categoria Test7", outputSeven.getDescricao());

        
        Categoria outputTwelve = outputList.get(12);
        
   
        Assert.assertEquals("Categoria Test12", outputTwelve.getDescricao());

    }
}
