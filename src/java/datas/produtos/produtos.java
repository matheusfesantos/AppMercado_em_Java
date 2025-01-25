package src.java.datas.produtos;

public class produtos {

    private String produto;
    private String imagem;

    public produtos(String produto, String imagem) {
        this.produto = produto;
        this.imagem = imagem;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
