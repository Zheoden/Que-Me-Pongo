package TP1;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.List;
import java.util.ArrayList;

import modelo.clases.*;
import modelo.enums.*;
import modelo.enums.comportamiento.TipoAccesorio;
import modelo.enums.comportamiento.TipoCalzado;
import modelo.enums.comportamiento.TipoInferior;
import modelo.enums.comportamiento.TipoSuperior;

import org.junit.Assert;
import org.junit.Test;

public class GuardarropasTest {
	
	@Test
	public void getPrenda() {
		Prenda prenda = new Prenda(TipoSuperior.REMERACORTA, Material.ALGODON, Color.AZUL);
		Prenda prenda1 = new Prenda(TipoInferior.PANTALON, Material.ALGODON, Color.AZUL);
		Prenda prenda2 = new Prenda(TipoCalzado.ZAPATILLAS, Material.ALGODON, Color.AZUL);
		ArrayList <Prenda> prendas = new ArrayList <Prenda>();
		prendas.add(prenda);
		prendas.add(prenda1);
		prendas.add(prenda2);
		Guardarropas guardaRopa = new Guardarropas(prendas);
		
		Assert.assertEquals(guardaRopa.getRandomPrendaByCategoria(Categoria.PARTE_SUPERIOR), prenda);
		Assert.assertEquals(guardaRopa.getRandomPrendaByCategoria(Categoria.PARTE_INFERIOR), prenda1);
		Assert.assertEquals(guardaRopa.getRandomPrendaByCategoria(Categoria.CALZADO), prenda2);
	}
	
	@Test
	public void existPrendaByCategoriaFalse() {
		ArrayList <Prenda> prendas = new ArrayList <Prenda>();
		Guardarropas guardaRopa = new Guardarropas(prendas);
		Assert.assertEquals(guardaRopa.existPrendaByCategoria(Categoria.PARTE_SUPERIOR), false);
	}
	
	@Test
	public void existPrendaByCategoriaTrue() {
		Prenda prenda = new Prenda(TipoSuperior.REMERACORTA, Material.ALGODON, Color.AZUL);
		Prenda prenda1 = new Prenda(TipoInferior.PANTALON, Material.ALGODON, Color.AZUL);
		Prenda prenda2 = new Prenda(TipoCalzado.ZAPATILLAS, Material.ALGODON, Color.AZUL);
		ArrayList <Prenda> prendas = new ArrayList <Prenda>();
		prendas.add(prenda);
		prendas.add(prenda1);
		prendas.add(prenda2);
		Guardarropas guardaRopa = new Guardarropas(prendas);
		
		Assert.assertEquals(guardaRopa.existPrendaByCategoria(Categoria.PARTE_SUPERIOR), true);
		Assert.assertEquals(guardaRopa.existPrendaByCategoria(Categoria.PARTE_INFERIOR), true);
		Assert.assertEquals(guardaRopa.existPrendaByCategoria(Categoria.CALZADO), true);
	}
	
	@Test
	public void agregarPrendaConImagenAlGuardarropa() {
		
		ArrayList <Prenda> prendas = new ArrayList <Prenda>();
		Imagen objetoImagen = new Imagen();
		Prenda prenda = new Prenda(TipoCalzado.ZAPATILLAS, Material.CUERO, Color.ROJO, Color.BLANCO);
		prenda.setDireccionImagen("ImgPrendas/zapas.jpg");
		prendas.add(prenda);
		Guardarropas unGuardarropa = new Guardarropas(prendas);	
		objetoImagen.normalizarImagen(unGuardarropa.getPrendas().get(0).getDireccionImagen());
		Assert.assertEquals(objetoImagen.getImagenRenderizada().getHeight(), 800);
	}
	
	@Test
	public void testGuava() {
		ArrayList <Prenda> prendas = new ArrayList <Prenda>();
		Prenda prenda = new Prenda(TipoSuperior.BUZO, Material.ALGODON, Color.ROJO, Color.BLANCO);
		Prenda prenda1 = new Prenda(TipoSuperior.CAMISA, Material.ALGODON, Color.ROJO, Color.BLANCO);
		Prenda prenda2 = new Prenda(TipoSuperior.CAMPERA, Material.ALGODON, Color.ROJO, Color.BLANCO);
		Prenda prenda3 = new Prenda(TipoSuperior.REMERACORTA, Material.ALGODON, Color.ROJO, Color.BLANCO);
		Prenda prenda4 = new Prenda(TipoSuperior.REMERALARGA, Material.ALGODON, Color.ROJO, Color.BLANCO);
		
		Prenda prenda5 = new Prenda(TipoInferior.BERMUDAS, Material.ALGODON, Color.ROJO, Color.BLANCO);
		Prenda prenda6 = new Prenda(TipoInferior.CALZAS, Material.LYCRA, Color.ROJO, Color.BLANCO);
		Prenda prenda7 = new Prenda(TipoInferior.PANTALON, Material.ALGODON, Color.ROJO, Color.BLANCO);
		Prenda prenda8 = new Prenda(TipoInferior.POLLERA, Material.ALGODON, Color.ROJO, Color.BLANCO);
		Prenda prenda9 = new Prenda(TipoInferior.SHORTS, Material.ALGODON, Color.ROJO, Color.BLANCO);
		
		Prenda prenda10 = new Prenda(TipoCalzado.OJOTAS, Material.CUERO, Color.ROJO, Color.BLANCO);
		Prenda prenda13 = new Prenda(TipoCalzado.ZAPATILLAS, Material.CUERO, Color.ROJO, Color.BLANCO);
		Prenda prenda14 = new Prenda(TipoCalzado.ZAPATILLAS, Material.CUERO, Color.ROJO, Color.BLANCO);
		Prenda prenda11 = new Prenda(TipoCalzado.ZAPATOS, Material.CUERO, Color.ROJO, Color.BLANCO);
		Prenda prenda12 = new Prenda(TipoCalzado.ZAPATOSDETACON, Material.CUERO, Color.ROJO, Color.BLANCO);

		Prenda prenda15 = new Prenda(TipoAccesorio.ANTEOJOS, Material.CUERO, Color.ROJO, Color.BLANCO);
		Prenda prenda16 = new Prenda(TipoAccesorio.AROS, Material.CUERO, Color.ROJO, Color.BLANCO);
		Prenda prenda17 = new Prenda(TipoAccesorio.BUFANDA, Material.CUERO, Color.ROJO, Color.BLANCO);
		Prenda prenda18 = new Prenda(TipoAccesorio.COLLAR, Material.CUERO, Color.ROJO, Color.BLANCO);
		Prenda prenda19 = new Prenda(TipoAccesorio.GORRA, Material.CUERO, Color.ROJO, Color.BLANCO);
		
		prendas.add(prenda);
		prendas.add(prenda1);
		prendas.add(prenda2);
		prendas.add(prenda3);
		prendas.add(prenda4);
		prendas.add(prenda5);
		prendas.add(prenda6);
		prendas.add(prenda7);
		prendas.add(prenda8);
		prendas.add(prenda9);
		prendas.add(prenda10);
		prendas.add(prenda11);
		prendas.add(prenda12);
		prendas.add(prenda13);
		prendas.add(prenda14);
		prendas.add(prenda15);
		prendas.add(prenda16);
		prendas.add(prenda17);
		prendas.add(prenda18);
		prendas.add(prenda19);
		
		Guardarropas unGuardarropa = new Guardarropas(prendas);
		List<Atuendo> atuendos = unGuardarropa.generarSugerencias(7);
		Assert.assertEquals(atuendos.size(), 8);
	}

}
