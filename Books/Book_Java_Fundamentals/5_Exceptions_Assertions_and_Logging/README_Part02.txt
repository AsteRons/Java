ASERACJA:


Aseracja - technika programowania zachowawczego

assert warunek;

assert warunek : wyrażenie

jeśli warunek nie jest spełniony zgłasza błą AssertionError

+ standardowo jest wyłączony 
+ aby odpaliła należy użyć
		java	-enableasserations Part_1
		java -ea:Part_01 		//		włączon w pojednynczej klasie
		
	
	
Kiedy stosujemy?

- w przypadku awarii, ktorych nieda sie naprawic
- testy oprogramowania


DZIENNIKI:

Aby nieużywać ciągle println mozna go zastąpić API Logging

Zapis w globalnym rejestrze:

	Logger.global.info("Informacja");

Tworzenie własnego rejestratora:

	private static final Logger myLogger = Logger.getLogger("com.mycompany.myapp")


Wyłączenie:


		Logger.global.setLevel(Level.OFF) 
		
		
Poziomy komunikatów:

SEVERE
WARNING
INFO
CONFIG
FINE
FINER
FINEST

Metoda logp() 

Metody zapisujące w dzienniku opis wyjątków:

void throwing(String className, String methodName, Throwable t)
void log(Level l, String message, Throwable t)

Logger.getLogger(...).log(...)


