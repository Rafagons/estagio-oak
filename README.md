# 💻 Criando código requisitado: Cadastro e listagem de produtos. 🖥️

 - Código criado em Java para concorrer á vaga de estágio na OAK Tecnologia.

## Explicação do Código
 
 - Classe Produto:
 
  Define um produto com os campos `nome`, `descricao`, `valor` e `disponivelParaVenda`.

 - Classe `CadastroProdutos`:

    Método `cadastrarProduto`: Solicita ao usuário os dados do produto, cria um novo objeto `Produto` e o adiciona à lista de produtos. Após o cadastro, chama automaticamente o método `listarProdutos` para exibir a listagem atualizada.

 - Método `listarProdutos`: Lista todos os produtos ordenados pelo valor. Oferece a opção de cadastrar um novo produto após exibir a listagem.

 - Método `main`: Inicia a aplicação chamando o método `listarProdutos` do objeto `CadastroProdutos`.

## Funcionamento: 
    
 Quando executamos o código, poderemos cadastrar novos produtos conforme solicitado. A listagem será exibida automaticamente após cada cadastro, e teremos a opção de continuar cadastrando novos produtos ou sair do programa.

 Podemos adaptar e expandir esse código conforme as necessidades específicas de interface gráfica ou persistência de dados.

 ## 🛠️ Construído com


* [Java JDK 21](https://www.oracle.com/middleeast/java/technologies/downloads/) - Jdk Java Usado.
* [Visual Studio Code](https://code.visualstudio.com/) - IDE Utilizada para criação e edição do código.

---
⌨Criado por [Rafagons](https://github.com/Rafagons)
