package grasp;

public class cJanelaPrincipal extends javax.swing.JFrame {

    public Encomenda encomenda;
    
    public cJanelaPrincipal(Encomenda e) {
        initComponents();
        
        encomenda = e;
        AtualizarConteudo();
        
        bAdicionarItem.addActionListener(new cAdicionarItem(encomenda, this));
        bAlterarPreco.addActionListener(new cAlterarPreco(encomenda, this));
        bRemoverItem.addActionListener(new cRemoverItem(encomenda, this));        
    }
    
    public void AtualizarConteudo() {
        ListaDeItens.setListData(encomenda.getItensPrecos());
        PrecoTotal.setText(String.valueOf(encomenda.TotalEncomenda()));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeItens = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        bAdicionarItem = new javax.swing.JButton();
        bAlterarPreco = new javax.swing.JButton();
        bRemoverItem = new javax.swing.JButton();
        PrecoTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaDeItens.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaDeItens);

        jLabel1.setText("Preço Total: ");

        bAdicionarItem.setText("Adicionar Salgado");

        bAlterarPreco.setText("Alterar Preço");

        bRemoverItem.setText("Remover Item");

        PrecoTotal.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(PrecoTotal))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bAdicionarItem)
                                .addGap(18, 18, 18)
                                .addComponent(bAlterarPreco)
                                .addGap(18, 18, 18)
                                .addComponent(bRemoverItem)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PrecoTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdicionarItem)
                    .addComponent(bAlterarPreco)
                    .addComponent(bRemoverItem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaDeItens;
    private javax.swing.JLabel PrecoTotal;
    private javax.swing.JButton bAdicionarItem;
    private javax.swing.JButton bAlterarPreco;
    private javax.swing.JButton bRemoverItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
