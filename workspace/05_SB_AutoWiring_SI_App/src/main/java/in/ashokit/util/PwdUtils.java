package in.ashokit.util;

import org.springframework.stereotype.Component;

@Component
public class PwdUtils {

	public PwdUtils() {
		System.out.println("PwdUtils :: Constructor");
	}

	public void encryptPwd() {
		System.out.println("Encrypting Pwd For Registered User....");
	}
}
