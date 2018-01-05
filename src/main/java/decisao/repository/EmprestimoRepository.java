package decisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import decisao.entity.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {

}
