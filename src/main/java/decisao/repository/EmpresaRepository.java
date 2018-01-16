package decisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import decisao.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}
