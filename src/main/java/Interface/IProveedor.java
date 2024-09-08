package Interface;

import java.util.List;

import Entidad.Proveedor;

public interface IProveedor {
	  Proveedor crearProveedor(Proveedor proveedor);
	    List<Proveedor> listarProveedores();
	    Proveedor obtenerProveedorPorId(Long id);
	    Proveedor actualizarProveedor(Long id, Proveedor proveedor);
	    void eliminarProveedor(Long id);
}
