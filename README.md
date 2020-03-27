# Junit 5 resumo:

------------


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
	@DisplayName(String nameDisplay) => define o nome que aparecerá no "console" durante o teste;
##### 	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/display-name/src/test/java/guru/springframework/sfgpetclinic/controllers/IndexControllerTest.java
	
	@EnabledOnOs(OS.?methodOption?) => compara o Sistema operaacional da maquina que está realizando os testes e compara com o S.O defenido no primeiro parametro, se iguais o teste é execultado;
	@EnabledOnJre(JRE.?methodOprion?) => compara a versão do JDK da maquina que está realizando os testes e compara com o JDK defenido no primeiro parametro, se iguais o teste é execultado;
##### 	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/conditional-exec/src/test/java/guru/springframework/sfgpetclinic/controllers/IndexControllerTest.java

	@Nested => mais recursos para expressar o relacionamento entre vários grupos de testes;
#####	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/nested-tests2/src/test/java/guru/springframework/sfgpetclinic/services/map/OwnerMapServiceTest.java

	@RepeatedTest(value = int num) => repete o teste onde a anotação se encontra em n vezes definido no primeiro parametro;
#####	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/repeated-tests/src/test/java/guru/springframework/sfgpetclinic/model/PersonTest.java

	@ParameterizedTest => são como outros testes, mas podemos utilizar outra anotação em conjunto a @ValueSource que permite passar parametros pro método direto da anotação, nescessita da dependencia: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-params/5.3.2;
	@ValueSource(ints = {1, 3, 5, ...}) => testa o metodo com todos os valores que está dentro do "ints";
#####	exemplo:https://github.com/springframeworkguru/testing-java-junit5/blob/param-value-source/src/test/java/guru/springframework/sfgpetclinic/model/OwnerTest.java

### Testes para verificar o comportamento desejado dos nossos métodos:
### Assertions:
	Assertions.assertEquals(Type expected, Type actual, String message) => compara se os dois valores passados são iguais;
##### 	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/assertions/src/test/java/guru/springframework/sfgpetclinic/controllers/IndexControllerTest.java
	
	Assertions.assertAll(String message, () -> Assertions.assertEquals(Type expected, Type actual, String message), Assertions.assertEquals(Type expected, Type actual, String message));}
	=> verifica um grupo de invocações, se alguma afirmação falhar, não para as demais validações;
##### 	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/groupedassertions/src/test/java/guru/springframework/sfgpetclinic/model/PersonTest.java
	
	Assertions.assertThrows(Exception.class, () -> { codigo que vai gerar uma exceção; }) => compara a exceção passada no primeiro parametro com a exceção do segundo;
##### 	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/expected-exception/src/test/java/guru/springframework/sfgpetclinic/controllers/IndexControllerTest.java
	
### Assumptions:
	Assumptions.assumeTrue(boolean bol) => compara se a condição passada no primeiro parametro é verdadeiro;
	Assumptions.assumeFalse(boolean bol) => compara se a condição passada no primeiro parametro é falso;
##### 	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/assumptions/src/test/java/guru/springframework/sfgpetclinic/controllers/IndexControllerTest.java

### MatcherAssert:
	MatcherAssert.assertThat(String name, Matchers.is(String name")) => compara se o valor passado no primeiro e no segundo parametro, são iguais;
#####	exemplo: https://github.com/springframeworkguru/testing-java-junit5/blob/hamcrest/src/test/java/guru/springframework/sfgpetclinic/model/OwnerTest.java

### Links para consulta:
#### 	Assertions:
##### 		https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
#### 	Assumptions:
##### 		https://junit.org/junit5/docs/5.0.0/api/org/junit/jupiter/api/Assumptions.html		
#### 	MatcherAssert:
##### 		https://junit.org/junit4/javadoc/latest/org/hamcrest/MatcherAssert.html,
##### 		https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-writing-assertions-with-hamcrest
#### 	Matchers:
##### 		http://hamcrest.org/JavaHamcrest/javadoc/1.3/org/hamcrest/Matchers.html		
#### 	Parameterized Test:
#####		https://www.baeldung.com/parameterized-tests-junit-5
#### 	Geral:
##### 		https://www.infoq.com/br/articles/JUnit-5-Early-Test-Drive
##### 		https://www.udemy.com/course/testing-spring-boot-beginner-to-guru
#####		https://junit.org/junit5/docs/current/user-guide
#####		https://martinfowler.com/articles/mocksArentStubs.html
#####		https://www.thoughtworks.com/pt/insights/blog/mockists-are-dead-long-live-classicists
#####		https://howtodoinjava.com/mockito/mockito-mock-injectmocks
