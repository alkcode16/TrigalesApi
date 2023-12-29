package com.alkcode.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alkcode.backend.apirest.models.entity.Cliente;
import com.alkcode.backend.apirest.models.dao.IClienteDao;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	
	private IClienteDao clienteDao;
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>)clienteDao.findAll();
	}

}
