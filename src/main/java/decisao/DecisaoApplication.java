package decisao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import decisao.entity.Emprestimo;
import decisao.entity.Funcionario;
import decisao.entity.Setor;
import decisao.repository.DevolucaoRepository;
import decisao.repository.DocumentoRepository;
import decisao.repository.EmpresaRepository;
import decisao.repository.EmprestimoRepository;
import decisao.repository.EnderecoRepository;
import decisao.repository.FuncionarioRepository;
import decisao.repository.LivroRepository;
import decisao.repository.SetorRepository;

@SpringBootApplication
public class DecisaoApplication implements CommandLineRunner {
	
	
	@Autowired
	private FuncionarioRepository funcionariorepository;
	
	@Autowired
	private EmprestimoRepository emprestimorepository;
	
	@Autowired
	private DevolucaoRepository devolucaorepository;
	
	@Autowired
	private DocumentoRepository documentorepository;
	
	@Autowired
	private EmpresaRepository empresarepository;
	
	@Autowired
	private EnderecoRepository enderecorepository;
	
	@Autowired
	private LivroRepository livrorepository;
	
	@Autowired
	private SetorRepository setorrepository;
	

	public static void main(String[] args) {
		SpringApplication.run(DecisaoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Setor setor1 = new Setor(null, "administracao");
		Setor setor2 = new Setor(null, "contabilidade");
		
		setorrepository.save(Arrays.asList(setor1));
		
		Funcionario fun1 = new Funcionario(null, "marcelo", "marcelodisse@yahoo", setor1);
		Funcionario fun2 = new Funcionario(null, "marina", "marina@gmail", setor2);
		
		funcionariorepository.save(Arrays.asList(fun1, fun2));
		
		
		Emprestimo emp1 = new Emprestimo(null,"contabil", "ocupado", "12/12/12", "marcelo",fun1);
		Emprestimo emp2 = new Emprestimo(null,"dp", "ocupado", "13/12/12", "marcelo",fun1);
		
		emprestimorepository.save(Arrays.asList(emp1, emp2));
		
		
		
		fun1.getEmprestimos().addAll(Arrays.asList(emp1,emp2));
		
	}
}
