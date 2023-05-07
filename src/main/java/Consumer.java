import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();



        //GET example
//        String url = "https://reqres.in/api/users/2"; //адрес к которому идет запрос
//        String response = restTemplate.getForObject(url, String.class); //обращение к стороннему сервису GET
//        System.out.println(response);


        //POST example
//        Map<String, String> jsonToSend = new HashMap<>();
//        jsonToSend.put("name", "Test name");
//        jsonToSend.put("job", "Test job");
//
//        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonToSend);
//
//        String url = "https://reqres.in/api/users"; //адрес к которому идет запрос
//        String response = restTemplate.postForObject(url,request, String.class); //обращение к стороннему сервису GET
//
//        System.out.println(response);


    }
}
