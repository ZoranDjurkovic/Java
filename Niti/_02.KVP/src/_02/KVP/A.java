package _02.KVP;

//Nit se moze napraviti za svaki objekat koji implementira interfejs Runnable
// Da bi klasa implementira interfejs Runnable potrebno je da samo ima metodu koja se Zove run(),
// deklarisana u sledece obliku > public void ru();
// U metodi ru zadajete kod koji treba da se izvrsava u novoj niti
//Kada se izvrsava metoda run nit se unistava

public class A  implements Runnable {
	
	public void run() {
		for(int i =  1; i <= 10; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}

}
