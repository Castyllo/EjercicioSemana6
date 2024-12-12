package com.EjercicioSemana6.repository;

import com.EjercicioSemana6.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author casti
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
