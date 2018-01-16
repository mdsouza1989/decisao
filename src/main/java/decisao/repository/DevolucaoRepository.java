package decisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import decisao.entity.Devolucao;

public interface DevolucaoRepository extends JpaRepository<Devolucao, Integer> {

}
