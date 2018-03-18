# Atividade
Crie um formulário chamado “Cadastro de Carro” com os seguintes campos: modelo, ano e placa.Deverá possuir botões : limpar, adicionar, alterar , excluir e buscar. Utilize as classes JFrame, JLabel, JTextField e JButton para isso. Use o GridLayout.

## Desenvolvimento
A interface principal está definida na classe `Cadastro`. Os componentes visuais são configurados no método construtor da classe. Todos os metodos de inicialização começam com o prefixo `initialize`.

Existem dois grupos de componentes visuais: os elementos de entrada de dados (JTextField) e os elementos de ação (JButton). A inicialização de cada grupo é feita em duas etapas:

1. Primeiro os elementos necessários são configurados. No caso dos elementos de entrada é criado um array de strings com o nome de cada campo. No caso dos botões é criado um dicionário com o nome do botão e qual a classe vai tratar o evento (ActionListener);
2. É feito um loop nas configurações e os componentes visuais são instanciados. No caso dos elementos de entrada é criado um JTextField e um JLabel para cada campo. Para os botões é instanciado um JButton e configurado o evento de click.

## Editores e Ferramentas

Foi utilizado o editor Visual Studio Code, o versionamento de código foi feito através do Git e a compilação foi através da linha de comando.

## Boas práticas
Nessa atividade foram adotadas as boas práticas:
1. Cada método tem uma responsabilidade única;
2. A construção centralizada dos componentes garante a reutilização de código e garante um ponto único de manutenção;
3. Foi feita a reutilização de classes para tarefas comuns, por exemplo: `SimpleAction` exibe um alerta, onde a mensagem é recebida no construtor, e essa classe foi utilizada em mais de um botão;
4. Aproveitando os recursos de OO foi aplicada a extensão de uma classe agregando novas funcionalidades. A classe `DeleteAction` extende de `ClearAction`, e nela foi incluida uma confirmação do usuário antes de performar a ação da classe base;
5. Foi adotado um único padrão de nomenclatura para variáveis e métodos em todo o código;
6. Para os componentes visuais que possuem um JLabel o método `setLabelFor` foi utilizado seguindo [as recomendações](https://docs.oracle.com/javase/tutorial/uiswing/components/label.html) para melhorar a acessibilidade do programa.  

# Compilando e executando
A atividade foi desenvolvida utilizando o Java SE Development Kit 8. O SDK precisa estar instalado e o caminho do SDK precisa estar configurado no PATH das variáveis de ambiente.

## Command line
A partir do diretório `src/main/java`, compile o projeto:
```
$ javac *.java
```

Execute:
```
$ java Main
```