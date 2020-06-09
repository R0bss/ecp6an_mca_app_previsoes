package br.usjt.rest_json_cidades.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.usjt.rest_json_cidades.model.Cidade;
import br.usjt.rest_json_cidades.repository.CidadeRepository;


@RestController
public class CidadeResource {
	@Autowired
	CidadeRepository CidadeRepo;
	
	@GetMapping("/cidades")
	public List <Cidade> todasAsCidades(){
		return CidadeRepo.findAll();
	}
	@GetMapping("/cidades/latlog/{longitude}/{latitude}")
	public Cidade listaCidadeLatitude(@PathVariable(value="longitude")  double longitude, @PathVariable(value="latitude")double latitude){
		return CidadeRepo.findByLongitudeAndLatitude(longitude, latitude);
		
	}

	@GetMapping("/cidades/letra/{cidade}")
	public List<Cidade> findByLetterName(@PathVariable(value="cidade") String cidade){
		return CidadeRepo.findByCidadeStartingWith(cidade);

	}
		

	@PostMapping ("/salvarCidade")
	    //@ResponseStatus (HttpStatus.CREATED) agora desnecessária
	    public ResponseEntity<Cidade> salvar ( @RequestBody Cidade cidade, HttpServletResponse
	            response) {
	        Cidade l = CidadeRepo.save(cidade);
	        URI uri = ServletUriComponentsBuilder.

	                fromCurrentServletMapping().path("/{id}").
	                buildAndExpand(l.getId()).
	                toUri();
	        //desnecessário também
	        //response.setHeader("Location", uri.toASCIIString());
	        return ResponseEntity.created(uri).body(l);
	    }
}
