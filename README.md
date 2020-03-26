### Ciclo de vida de um teste:
	@BeforeAll => execultado apenas uma vez antes de instanciar a classe, por isso o metodo que receber essa anotação precisa ser estatico;

	@BeforeEach => o método que conter essa anotação vai ser inciado toda vez que outro metodo com a anotação @Test for encontrado, 
	como o propio nome diz, ele roda antes de cada teste;

	@Test => usado para marcar os métodos que serão executados como testes;

	@AfterEach => o método que conter essa anotação vai ser inciado toda vez que um metodo com a anotação @Test for encontrado, 
	como o propio nome diz, ele roda depois de cada teste;

	@AfterAll => execultado apenas uma vez depois que a classe for "excluida", por isso o metodo que receber essa anotação precisa ser estatico;

	@disabled => o teste que receber esta notação sera desativado/ignorado;

##### 	exemplo: https://github.com/springframeworkguru/intro-junit5/blob/test-lifecycle-demo/src/test/java/guru/springframework/GreetingTest.java

### Outras anotações:
	@DisplayName(String nameDisplay) => define o nome que aparecera no "console" durante o teste;
##### 	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/display-name/src/test/java/guru/springframework/sfgpetclinic/controllers/IndexControllerTest.java

### Testes para verificar o comportamento desejado de nossos métodos:
#### Assertions:
	Assertions.assertEquals(Type expected, Type actual, String message) => compara se os dois valores passados são iguais;
##### 	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/assertions/src/test/java/guru/springframework/sfgpetclinic/controllers/IndexControllerTest.java
	
	Assertions.assertAll(String message, () -> Assertions.assertEquals(Type expected, Type actual, String message), Assertions.assertEquals(Type expected, Type actual, String message));} =>
	=> verifica um grupo de invocações, se alguma afirmação falhar, não para as demais validações;
##### 	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/groupedassertions/src/test/java/guru/springframework/sfgpetclinic/model/PersonTest.java
	
	