package decisao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import decisao.entity.Emprestimo;
import decisao.entity.Funcionario;
import decisao.repository.EmprestimoRepository;
import decisao.repository.FuncionarioRepository;

@SpringBootApplication
public class DecisaoApplication implements CommandLineRunner {
	
	
	@Autowired
	private FuncionarioRepository funcionariorepository;
	
	@Autowired
	private EmprestimoRepository emprestimorepository;

	public static void main(String[] args) {
		SpringApplication.run(DecisaoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Funcionario fun1 = new Funcionario(null, "marcelo", "marcelodisse@yahoo");
		Funcionario fun2 = new Funcionario(null, "marina", "marina@gmail");
		
		funcionariorepository.save(Arrays.asList(fun1, fun2));
		
		Emprestimo emp1 = new Emprestimo(null,"contabil", "ocupado", "12/12/12", "marcelo");
		
		emprestimorepository.save(Arrays.asList(emp1));
		
		fun1.getEmprestimos().addAll(Arrays.asList(emp1));
		
	}
}
