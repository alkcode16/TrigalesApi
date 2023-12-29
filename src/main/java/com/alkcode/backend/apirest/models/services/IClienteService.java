package com.alkcode.backend.apirest.models.services;

import java.util.List;
import com.alkcode.backend.apirest.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
}
