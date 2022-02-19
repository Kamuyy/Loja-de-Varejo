fun main() {
    val americanas = Loja()

    americanas.nome = "Americanas"
    americanas.endereco = "Rua São José"
    americanas.telefoneComercial = "51 985401706"
    americanas.emailComercial = "Americanas@gmail.com"

    println("----> DADOS DA LOJA <----")

    println("Nome:${americanas.nome}")
    println("Endereço:${americanas.endereco}")
    println("Telefone Comercial:${americanas.telefoneComercial}")
    println("Email Comercial:${americanas.emailComercial} ")


    val pedro = Vendedores()

    pedro.nome = "Pedro"
    pedro.idade = 35
    pedro.cpf = "015.800.320-32"
    pedro.localDeTrabalho = "Rua são josé"
    pedro.metaDeVendas = 100

    println("----> DADOS DO VENDEDOR <----")

    println("Nome:${pedro.nome}")
    println("Idade:${pedro.idade}")
    println("CPF: ${pedro.cpf}")
    println("Local de Trabalho:${pedro.localDeTrabalho}")
    println("Meta de Vendas: ${pedro.metaDeVendas}")

    val matheus = Clientes()

    matheus.Nome = "Matheus"
    matheus.idade = 30
    matheus.cpf = "320.250.600-45"
    matheus.telefone= "51 984656320"
    matheus.compras="Pão, Arroz, Refrigerante "

    println("----> DADOS DO CLIENTE <----")

    println("Nome: ${matheus.Nome}")
    println("Idade: ${matheus.idade}")
    println("CPF: ${matheus.cpf}")
    println("Telefone: ${matheus.telefone}")
    println("Compras: ${matheus.compras}")

    val seara = Fornecedores()

    seara.nomeDaFonecedoria = "Seara"
    seara.telefoneComercial = "51 982032154"
    seara.produtos = "Batata, Pao, Carne"
    seara.veiculosDeTransporte = 50
    seara.empressasFornecidas = "Americanas"

    println("----> DADOS DO FORNECEDOR <----")

    println("Nome: ${seara.nomeDaFonecedoria}")
    println("Telefone Comercial: ${seara.telefoneComercial}")
    println("Produtos: ${seara.produtos}")
    println("Veiculos de Transportes: ${seara.veiculosDeTransporte}")
    println("Empressas Fornecidas: ${seara.empressasFornecidas}")

    val pao = Produtos()

    pao.nomeDoProduto = "Pão"
    pao.tipoDeProduto = "alimento"
    pao.quantidadeDeProdutos = 30

    println("----> DADOS DO PRODUTO <----")
    println("Nome do produto: ${pao.nomeDoProduto}")
    println("Tipo de Produto: ${pao.tipoDeProduto}")
    println("Quantidade de Produtos: ${pao.quantidadeDeProdutos}")

    val vendas = Vendas()

    vendas.quantidadeVendida = 38
    vendas.produtoVendido = "Pão"
    vendas.valorDaVenda = "R$10,50"
    vendas.nomeDoComprador = "Kleberson da Silva"
    vendas.nomeDoVendedor = "Pedro"

    println("----> Dasdos de Vendas <----")
    println("Quantidade Vendida: ${vendas.quantidadeVendida}")
    println("Produto Vendido: ${vendas.produtoVendido}")
    println("Valor da Venda: ${vendas.valorDaVenda}")
    println("Nome do Vendedor: ${vendas.nomeDoVendedor}")
    println("Nome do Comprador: ${vendas.nomeDoComprador}")

    val estoque = Estoque()

    estoque.tipoDeEstoque = "Estoque de Pão"
    estoque.quantidadeDoEstoque = 38

    println("----> Dados do Estoque <----")
    println("Tipo de Estoque: ${estoque.tipoDeEstoque}")
    println("Quantidade do Estoque: ${estoque.quantidadeDoEstoque}")

    val transportadora = Transportadora()

    transportadora.nomeDaTransportadora = "Lima Mar"
    transportadora.tipoDeTransporte = "Transporte de Pão"
    transportadora.quantidadeDeTransporte = 38

    println("----> Dados da Transportadora <----")
    println("Nome da Transportadora: ${transportadora.nomeDaTransportadora}")
    println("Tipo de Transporta: ${transportadora.tipoDeTransporte}")
    println("Quantidade de Transporte: ${transportadora.quantidadeDeTransporte}")

    val filial = Filial()
    filial.nomeDaFilial = "Marks"
    filial.gerente = "Roberto Marks"
    filial.vendedor = "Gustavo"
    filial.endereco = "Gustavo Lima"
    filial.produto = "Pão"
    filial.cliente = "Matheus"

    println("----> Dados da Filial <----")
    println("Nome da Filial: ${filial.nomeDaFilial}")
    println("Gerente: ${filial.gerente}")
    println("Vendedor: ${filial.vendedor}")
    println("Endereco: ${filial.endereco}")
    println("Produtos: ${filial.produto}")
    println("Cliente: ${filial.cliente}")

}