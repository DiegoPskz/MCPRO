package Controlador;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import Entidad.Proveedor;
import Interface.IProveedor;

@RestController
@RequestMapping("/proveedores")

public class ProveeedoresC {

	private final ProveeedoresC proveedorService;

    public ProveeedoresC(ProveeedoresC proveedorService) {
        this.proveedorService = proveedorService;
    }

    @PostMapping
    public Proveedor crearProveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.crearProveedor(proveedor);
    }

    @GetMapping
    public List<Proveedor> listarProveedores() {
        return proveedorService.listarProveedores();
    }

    @GetMapping("/{id}")
    public Proveedor obtenerProveedor(@PathVariable Long id) {
        return proveedorService.obtenerProveedor(id);
    }

    @PutMapping("/{id}")
    public Proveedor actualizarProveedor(@PathVariable Long id, @RequestBody Proveedor proveedor) {
        return proveedorService.actualizarProveedor(id, proveedor);
    }

    @DeleteMapping("/{id}")
    public void eliminarProveedor(@PathVariable Long id) {
        proveedorService.eliminarProveedor(id);
    }
}
