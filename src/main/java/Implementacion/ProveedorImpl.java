package Implementacion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import Entidad.Proveedor;
import Interface.IProveedor;

public class ProveedorImpl implements IProveedor {
	
	 private List<Proveedor> proveedores = new ArrayList<>();
	    private AtomicLong counter = new AtomicLong();

	@Override
	public Proveedor crearProveedor(Proveedor proveedor) {
		  proveedor.setId(counter.incrementAndGet());
	        proveedores.add(proveedor);
	        return proveedor;
	}



	@Override
	public List<Proveedor> listarProveedores() {
		return proveedores;
	}

	@Override
	public Proveedor obtenerProveedorPorId(Long id) {
		return proveedores.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
	}

	@Override
	public Proveedor actualizarProveedor(Long id, Proveedor proveedorActualizado) {
		 Proveedor proveedor = obtenerProveedorPorId(id);
	        proveedor.setNombre(proveedorActualizado.getNombre());
	        proveedor.setDireccion(proveedorActualizado.getDireccion());
	        proveedor.setTelefono(proveedorActualizado.getTelefono());
	        return proveedor;
	}

	@Override
	public void eliminarProveedor(Long id) {
		proveedores.removeIf(p -> p.getId().equals(id));
		
	}

	
	  
}
