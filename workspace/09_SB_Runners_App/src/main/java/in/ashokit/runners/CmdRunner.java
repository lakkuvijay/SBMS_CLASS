package in.ashokit.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("I am from CommandlineRunner");
	}
}
