package grasp;

import java.util.ArrayList;

public class Encomenda {
    
    private ArrayList<itemEncomenda> itens; 
    
    public Encomenda() {
        itens = new ArrayList<>();
    }
    
    public void AdicionarSalgado(String nome, float preco, int qty, String recheio) {
        itemEncomenda e = new itemEncomenda();
        e.setSalgado(nome, preco, qty, recheio);
        itens.add(e);
    }
    public void AdicionarDoce(String nome, float preco, int qty, String cobertura) {
        itemEncomenda e = new itemEncomenda();
        e.setDoce(nome, preco, qty, cobertura);
        itens.add(e);
    }
    
    public float TotalEncomenda() {
        float total = 0;
        
        for (itemEncomenda i : itens) {
            total += i.Subtotal();
        }
        
        return total;
    }
    
    public void AlterarPreco(String nome, float novo_preco) {
        for (itemEncomenda i : itens) {
            if (i.getNome().equals(nome))
                i.AlterarPreco(nome, novo_preco);
        }
    }
    
    public void RemoverItem(String nome) {
        for (int i = 0; i < this.itens.size(); i++) {
            if (this.itens.get(i).getNome().equals(nome))
                this.itens.remove(i);
        }
    }
    
    public String[] getItensPrecos() {
        String[] ip = new String[itens.size()];
        
        for (int i = 0; i < this.itens.size(); i++) {
            ip[i] = this.itens.get(i).getItemPreco();
        }
        
        return ip;
    }
    
}
