package decisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import decisao.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
