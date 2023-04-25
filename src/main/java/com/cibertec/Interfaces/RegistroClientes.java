package com.cibertec.Interfaces;


import java.util.List;

import com.cibertec.models.ModeloClientes;

public interface RegistroClientes {
	
	public int registrar (ModeloClientes c);
	public int eliminar (ModeloClientes c);
	public List<ModeloClientes> listado();
	
	

}
