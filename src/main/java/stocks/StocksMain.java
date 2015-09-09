package stocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class StocksMain {

	public static void main(String[] args) {
        SpringApplication.run(StocksMain.class, args);
    }
	
    @RequestMapping("/")
    public String index() {
        return "Hi Quynh!";
    }
}
