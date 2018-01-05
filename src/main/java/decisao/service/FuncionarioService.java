package decisao.service;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import decisao.entity.Funcionario;
import decisao.repository.FuncionarioRepository;

@Service
public class FuncionarioService{
	
	@Autowired
	private FuncionarioRepository repo;
	
	public Funcionario buscar (Integer id) {
		Funcionario obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Nome: " + Funcionario.class.getName(), null);
		}
			return obj;
		
	}
}
