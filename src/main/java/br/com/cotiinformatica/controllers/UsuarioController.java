package br.com.cotiinformatica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.AutenticarUsuarioRequest;
import br.com.cotiinformatica.dtos.AutenticarUsuarioResponse;
import br.com.cotiinformatica.dtos.CriarUsuarioRequest;
import br.com.cotiinformatica.dtos.CriarUsuarioResponse;
import br.com.cotiinformatica.services.UsuarioService;

@RestController
@RequestMapping(value = "/api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("criar")
	public CriarUsuarioResponse criar(@RequestBody CriarUsuarioRequest request) throws Exception {
		
		return usuarioService.criar(request);
	}
	
	@PostMapping("autenticar")
	public AutenticarUsuarioResponse autenticar(@RequestBody AutenticarUsuarioRequest request) throws Exception {
		
		return usuarioService.autenticar(request);
	}

}
