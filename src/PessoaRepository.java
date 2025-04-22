import java.util.ArrayList;
import java.util.List;

public class PessoaRepository {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void listarTodos(){
        System.out.println(pessoas);
    }

    public void listarTodos(String tipo){
        System.out.println("=============================================");
        System.out.println("id " + " nome " + " idade ");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getId() + "   " + pessoa.getNome() + "    " + pessoa.getIdade());    
        }

        System.out.println("=============================================");        
    }

    public void salvar(Pessoa pessoa){
        if(buscarPorId(pessoa.getId()) == null){
            pessoas.add(pessoa);
        }else{
            pessoas.set(pessoa.getId()-1, pessoa);
        }
        
    }

    public void editar(Pessoa pessoa){
        pessoas.set(pessoa.getId()-1, pessoa);
    }

    public void excluir(Pessoa pessoa){
        pessoas.remove(pessoa);

        int i = 1;
        for (Pessoa p : pessoas) {
            p.setId(i);  
            i++;          
        }
    }

    public Pessoa buscarPorId(int id){
        if(pessoas.isEmpty())
            return null;
        else if(pessoas.size() < id)
            return null;
        else
            return pessoas.get(id-1);
    }
    
}
