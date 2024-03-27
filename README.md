# Busca

1. Dado o código:

int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74,
32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52,
25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19,
33, 21, 57, 19, 55, 93, 31, 54, 31, 50,
66, 44, 54, 55, 29, 75, 43, 88, 61, 65,
49, 87, 10, 25, 33, 70, 84, 125, 345, 400,
77, 32, 41, 66, 33, 70, 84, 125, 600,
38, 43, 51, 34, 76, 25, 48, 14, 50, 71,
1, 98, 86, 38, 91, 65, 96, 60, 43, 75,
86, 59, 17, 86, 12, 10, 16, 10, 33, 15,
77, 22, 56, 4, 9, 63, 49, 80, 39, 53,
97, 36, 34, 16, 1, 98, 78, 92, 100, 35 };

- Crie um algoritmo de busca sequencial para encontrar o índice do número 77.
Qual o seu índice?
- Encontre agora o índice do número 600. Qual o seu índice?
- Encontre agora o índice do número 56. Qual o seu índice?
- Encontre agora o índice do número 65. Qual o seu índice?
- Agora encontre todos os índices onde o número 65 se encontra. Imprima esses índices na tela.

2. Dado o código:
Pessoa vinicius = new Pessoa("Vinícius", 41);
Pessoa daniela = new Pessoa("Daniela", 44);
Pessoa ana = new Pessoa("Ana", 18);
Pessoa carla = new Pessoa("Carla", 20);
Pessoa daniel = new Pessoa("Daniel Paiva", 31);
Pessoa felipe = new Pessoa("Felipe", 24);
Pessoa patricia = new Pessoa("Patricia", 23);
Pessoa rafael = new Pessoa("Rafael", 20);
Pessoa pedro = new Pessoa("Pedro", 22);
Pessoa marcela = new Pessoa("Marcela", 24);
Pessoa amanda = new Pessoa("Amanda", 100);
Pessoa[] listaPessoas = { vinicius, daniela,
ana, carla,
daniel, felipe,
pedro, patricia,
rafael, marcela, amanda };

Onde temos um objeto Pessoa com as propriedades nome e idade.

- Encontre nessa lista qual pessoa tem a idade de 100 anos. Escreva o nome dela no console.

- Encontre as pessoas que tem idade superior a 30 anos. Escreva os devidos nomes no console.

3. Dado o código:

int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
75, 76, 77, 78, 79, 80, 81,
82, 83, 84, 85, 86, 87, 88, 89,
90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
 - Implemente um algoritmo de busca binária para retornar o índice do número 99.
 - Qual o seu índice? E para o número 81? Qual o seu índice?

4. Você está na biblioteca procurando um livro específico. Os livros estão organizados em ordem alfabética por título. Implemente uma busca binária para encontrar rapidamente a posição do livro que você deseja. Mostre também título, autor e ano de publicação.

5. Você está desenvolvendo um aplicativo para monitorar a variação de preços de um produto específico ao longo do tempo. Os produtos estão armazenados em um array ordenado por data. Encontre a primeira e a última ocorrência de um preço específico para determinar o período em que ele permaneceu inalterado. Utilize uma busca binária.

6. Você está pensando em um número entre 1 e 100. O computador tentará adivinhar o número usando o mínimo de tentativas possível. Após cada tentativa, você deve informar ao computador se o número que ele adivinhou é muito alto, muito baixo ou correto. O computador deve utilizar estratégia de busca binária para adivinhar o número de forma eficiente.


