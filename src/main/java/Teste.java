
import br.com.sumpaulo.pedidovenda.model.Cliente;
import br.com.sumpaulo.pedidovenda.model.Endereco;
import br.com.sumpaulo.pedidovenda.model.TipoPessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class Teste {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoVendaPU");
        EntityManager manager = factory.createEntityManager();
        
        
//        EntityTransaction transaction = manager.getTransaction();
//        transaction.begin();
//        
//        Cliente cliente = new Cliente();
//        Endereco endereco = new Endereco();
//        
//        endereco.setCidade("Contagem");
//        endereco.setComplemento("Casa");
//        endereco.setUf("UF");
//        endereco.setNumero("1200");
//        endereco.setLogradouro("Av. do Joao");
//        endereco.setCep("20550-333");
//        
//        cliente.setNome("Joao de Deus");
//        cliente.setEmail("jao123@gmail.com");
//        cliente.setTipo(TipoPessoa.FISICA);
//        cliente.setDocumentoReceitaFederal("123.123.321-12");
//        
//        endereco.setCliente(cliente);
//        cliente.getEnderecos().add(endereco);
//        
//        
//        manager.persist(cliente);
//        
//        transaction.commit();
//        
//        manager.close();
//        factory.close(); 
//        
    }
}
