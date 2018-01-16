package decisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import decisao.entity.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Integer> {

}
