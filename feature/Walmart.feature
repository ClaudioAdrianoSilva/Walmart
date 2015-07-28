# language: pt

Funcionalidade: busca site Walmart

  Cenário: Acesso à página do Walmart

 	Dado que eu acesse a url do Walmart
 	Então devo ser direcionado para a página do Walmart

  Cenário: Busca pela palavra tv

 	Dado que eu acesse a url do Walmart 
 	Quando eu pesquisar a palavra tv
 	Então deverá ser exibido resultados da palavra tv

  Cenário: adicionar produto ao carrinho

 	Dado que eu acesse a url do Walmart
	Quando eu pesquisar a palavra tv
	E clicar em um dos resultados da pesquisa
	E eu clicar no botão adicionar ao carrinho
	E a tela de garantia estendida for apresentada
	E eu clicar no botão continuar
	E eu clicar no botão carrinho
	Então o produto deverá estar adicionado ao carrinho com sucesso
