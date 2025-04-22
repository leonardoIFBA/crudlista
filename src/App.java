public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa p = new Pessoa(1,"Leo",30);
        Pessoa p1 = new Pessoa(2,"Ana",30);
        Pessoa p2 = new Pessoa(3,"Lua",30);
        Pessoa p3 = new Pessoa();
        p3.setId(4);
        p3.setNome("Maria");
        p3.setIdade(20);

        System.out.println(p);
        //System.out.println(p1);

        PessoaRepository rep = new PessoaRepository();
        rep.listarTodos();

        rep.salvar(p);
        rep.salvar(p1);
        rep.salvar(p2);
        rep.salvar(p3);

        //rep.listarTodos();
        rep.listarTodos("tabela");

        rep.excluir(p);

        rep.listarTodos("tabela");

       Pessoa a = rep.buscarPorId(3);
       System.out.println(a);
       a.setNome("Leonardo");
       
       rep.editar(a);

       rep.listarTodos("tabela");
    }
}
