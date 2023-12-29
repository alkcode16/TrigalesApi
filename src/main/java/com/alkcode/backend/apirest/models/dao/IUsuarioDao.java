package com.alkcode.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.alkcode.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
	
	@Query("Select u from Usuario u Where u.username=?1")
	public Usuario findByUsernameQuery(String username);
}
