package autenticacao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoginController {
	
	@PostMapping("/v1/login")    
	public ResponseEntity<Token> login(@RequestBody Usuario usuario) {
		
		if(usuario.getLogin().equals("admin")&&usuario.getSenha().equals("senha")) {
			Token token = new Token();			
			token.setBearer("mZ1edKKACtPAb7zGlwSzvs72PvhAbGmB8K1ZrGxpcNM");
	   	
			return ResponseEntity.status(HttpStatus.OK).body(token);
		}

		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		    	
    }

}
