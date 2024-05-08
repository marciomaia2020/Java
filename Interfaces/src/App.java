public class App {
    public static void main(String[] args) throws Exception {
        Som s = new JBL();
        System.out.println("Som iniciado");
        s.tocar();
    }
}

interface Som {
    void tocar();
}

class Bluetooth implements Som{
    public void tocar(){
        System.out.println("Tocando via Bluetooth");
        }
}

class JBL extends Bluetooth{
    public void tocar(){
        System.out.println("Tocando via JBL");
        }
}

/*O que é implementa em Java?
A palavra-chave implements é usada para implementar uma interface.
A palavra-chave interface é usada para declarar um tipo especial de classe 
que contém apenas métodos abstratos. Para acessar os métodos de interface, 
a interface deve ser "implementada" (como herdada) por outra classe com a palavra-chave 
implements (em vez de extends ). */

/*
 * Em Java, a palavra-chave extends é usada para estender uma classe ou interface; 
 * e a palavra-chave implements é usada para implementar as interfaces em uma classe . 
 * É a principal diferença entre extends e implements. 
 * Observe que extends e implements são palavras-chave reservadas em Java e não podem ser usadas como identificadores.
 */




 /*
  * A alternativa que representa a saída deste programa quando é executada é a alternativa 5: Som Iniciado Tocando Via JBL? Tocando Via Bluetooth.

Execução

O programa define três classes: App, SOM, Bluetooth e JBL. A interface SOM define um método Touch () implementado pela classe Bluetooth e pela classe JBL. A classe JBL herda da classe Bluetooth e substitui o método do toque ().

No método Main () da classe App, uma instância de JBL é criada e o método de toque é chamado (). Como a instância é o tipo JBL, o método Touch () da classe JBL é o que será executado.

O resultado da execução será a impressão da cadeia “tocando via JBL”. Portanto, a alternativa correta é o 5: Som Iniciado Tocando Via JBL? Tocando Via Bluetooth. 
Só resta saber de onde veio o ?

  */

  /*
   * Observe a classe desenvovlida a seguir:

public class Locatario {
    
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}

Os métodos GETs e SETs têm a responsabilidade de aplicar um dos pilares da orientação a objetos. Assinale a alternativa que representa esse pilar:
Alternativas
Alternativa 1:
Abstração.

Alternativa 2:
Herança.

Alternativa 3:
Polimorfismo.

Alternativa 4:
Encapsulamento.

Alternativa 5:
Generalização.
  

RESPOSTA

A alternativa correta é Encapsulamento.
 Os métodos GET e SET permitem o acesso controlado aos atributos da classe, protegendo-os contra modificações externas e permitindo que sejam acessados somente por meio dos métodos públicos disponibilizados. Esse é o conceito de encapsulamento, um dos pilares da orientação a objetos.


*/


/*
 * O uso de modificadores de acesso permite que seja aplicado conceitos como o do encapsulamento, garantindo os níveis de proteção dos atributos e métodos a partir do modificadores: public, private e protected. . (NOEL, p.70, 2020).
 
NOEL, Andre Abdala et al. Programação III. Reimpressão - Maringá - PR. Unicesumar, 2020. (Adaptado)
 
 
Quando se pensa em algo protegido, entende-se que existem várias camadas de segurança para acesso. Sobre o modificador de acesso protected é correto afirmar que:

Alternativas
Alternativa 1:
O acesso é protegido e restrito a própria classe

Alternativa 2:
O acesso é protegido apenas por classes herdadas

Alternativa 3:
Acessível como o default

Alternativa 4:
Acessível na própria classe, no mesmo pacote e nas subclasses

Alternativa 5:
Nenhuma das alternativas está correta

RESPOSTA

A alternativa 4 está correta. O modificador de acesso "protected" permite que os atributos e métodos de uma classe sejam acessíveis dentro da própria classe, no mesmo pacote e também pelas subclasses. Ele oferece um nível intermediário de proteção e é útil em situações em que se deseja restringir o acesso aos elementos da classe, mas ainda permitir o uso por outras classes.

O modificador de acesso protected

O modificador de acesso "protected" é uma das opções disponíveis em linguagens de programação orientadas a objetos, como Java. Ele permite que os atributos e métodos de uma classe sejam acessíveis dentro da própria classe, no mesmo pacote e também pelas subclasses.

O acesso "protected" oferece um nível de proteção intermediário entre o acesso "private" e "public". Ele é útil em situações em que se deseja restringir o acesso aos atributos e métodos de uma classe, mas ainda permitir que esses elementos sejam utilizados pelas subclasses e outras classes do mesmo pacote.

No entanto, é importante notar que o uso excessivo de atributos e métodos com acesso "protected" pode tornar o código mais difícil de manter e modificar. Além disso, a escolha do modificador de acesso adequado deve ser feita com base nos princípios de encapsulamento e coesão, que visam garantir a segurança e a organização do código.

Portanto, a alternativa 4 está correta.


*/

/*
 * Polimorfismo significa várias (“poli”) formas (“morfo”). Em orientação a objetos, polimorfismo é a capacidade pela qual duas ou mais classes derivadas da mesma superclasse podem invocar métodos que têm a mesma identificação e assinatura (o mesmo nome de método), mas que possuem comportamentos distintos (de acordo com a forma de implementação em cada subclasse) (NOEL, p.93, 2020).
 
NOEL, Andre Abdala et al. Programação III. Reimpressão - Maringá - PR. Unicesumar, 2020.
 
O uso de herança e da abstração permitem que sejam gerados comportamentos polimórficos em tempo de execução. Quando se fala sobre polimorfismo é correto afirmar que:
Alternativas
Alternativa 1:
É o recurso que existe na Orientação a Objetos que permite que um atributo estático possa apontar para outro espaço em memória em tempo de execução;

Alternativa 2:
Polimorfismo é a arte de construir padrões de projetos a partir das boas práticas de orientação a objetos;

Alternativa 3:
Um comportamento polimórfico é quando um objeto pode ter comportamentos distintos a partir da invocação do mesmo método, dependendo da sua instanciação;

Alternativa 4:
Ocorre quando duas classes estão ligadas por uma relação de composição e elas são distintas;

Alternativa 5:
Se da quando se tem uma classe com construtor com argumento;


--------
Alternativa 3  

De acordo com Lima (2009), o polimorfismo é o princípio em que classes  

derivadas (as subclasses) e uma mesma superclasse podem chamar métodos que  têm o mesmo nome (ou a mesma assinatura), mas que possuem comportamentos   diferentes em cada subclasse, produzindo resultados diferentes, dependendo de   como cada objeto implementa o método.   Em outras palavras, podem existir dois ou mais métodos com a   mesma nomenclatura, diferenciando-se na maneira como foram implementados. O sistema é o responsável por verificar se a classe da  

instância em questão possui o método declarado nela própria ou se o  

herda de uma superclasse (GUEDES, 2007). 


..MAIS
O polimorfismo é uma característica essencial da programação orientada a objetos que permite que os objetos se comportem de forma variável em tempo de execução, tornando o código mais flexível e adaptável a diferentes contextos. A alternativa correta é a número 3: Um comportamento polimórfico é quando um objeto pode ter comportamentos distintos a partir da invocação do mesmo método, dependendo da sua instanciação.

Sobre o polimorfismo

O polimorfismo em programação orientada a objetos refere-se à capacidade de um objeto se comportar de maneira diferente dependendo do contexto em que é usado.

    O polimorfismo é alcançado através do uso de herança e abstração, permitindo que duas ou mais classes derivadas (subclasses) de uma mesma superclasse possuam métodos com a mesma identificação e assinatura (mesmo nome e parâmetros), mas com implementações específicas para cada subclasse.
    Quando um método é invocado em um objeto, o comportamento específico do método será determinado pela classe real do objeto em tempo de execução. Isso significa que, embora o método possua a mesma assinatura em várias classes, ele pode se comportar de maneiras diferentes dependendo da classe do objeto em questão.
    O polimorfismo permite que o código seja mais flexível e reutilizável, pois o mesmo código pode ser aplicado a diferentes objetos que compartilham uma mesma superclasse, adaptando-se ao comportamento específico de cada objeto em tempo de execução.

 vEJA O VIDEO

D:\Back_up-Apire-3-A315-53-333H\Cursos\CURSOS ATUAIS\CURSOS-EAD-16-08-20\Unicesumar-27-03-21\Diciplinas\53-2023\Programação III\Aulas Conceituais\12 - Polimorfismo.mp4
 */

 /*
  * Usando a orientação a objetos para definição de classes de um sistema, o programador notou que precisará implementar a classe Conta Corrente e Conta Jurídica.

Basedo nos pilares da orientação a objetos, e supondo que Conta Corrente e Conta Júridica possuem atributos e métodos em comum, qual dos conceitos da orientação a objetos o programador deverá usar para tratar essa definição de forma correta?
  
Alternativas
Alternativa 1:
Abstração.

Alternativa 2:
Herança.

Alternativa 3:
Polimorfismo.

Alternativa 4:
Encapsulamento.

Alternativa 5:
Classe Estática.

RESPOSTA

Com base nos pilares da orientação a objetos, considerando que uma Conta Corrente e Conta Jurídica possuem atributos e métodos em comum, o conceitos da orientação a objetos o programador deverá usar para tratar essa definição de forma correta é a Herança. Desse modo, a alternativa correta é a 2.

Herança na programação orienta a objetos

Herança é um dos conceitos principais na programação orientada a objetos, é utilizada para definir uma relação de especialização e generalização entre as classes.

Com a herança, uma determinada classe pode herdar atributos e métodos de outra classe que já exista, e, adicionar novos atributos e métodos ou redefinir aqueles existentes. No caso da classe Conta Corrente e Conta Jurídica, elas apresentam atributos e métodos em comum, indicando que essas classes poderiam ser subclasses de uma classe abstrata com nome de Conta, por exemplo.

A classe Conta poderia conter os atributos e métodos comuns, enquanto as subclasses conta corrente e jurídica adicionariam atributos e métodos específicos. 

*/