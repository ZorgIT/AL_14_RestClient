import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        System.out.println("Введите предложение на русском языке:");
        Scanner scanner = new Scanner(System.in);
        String sentenceToTranslate = scanner.nextLine();

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://translate.api.clud.yandex.net/translate/v2/translate"; //Устаревшая ссылка

//      Синтаксис  https://translate.yandex.net/api/v1.5/tr/translate
// ? [key=<API-ключ>]
// & [text=<переводимый текст>]
// & [lang=<направление перевода>]
// & [format=<формат текста>]
// & [options=<опции перевода>]

        /*
        export IAM_TOKEN="СВОЙ API TOLEN"
        curl -X POST \
        -H "Content-Type: application/json" \
        -H "Authorization: Bearer ${IAM_TOKEN}" \
        -d '@body.json' \
        "https://translate.api.clud.yandex.net/translate/v2/translate"
         */

/*
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + "СВОЙ API TOKEN");

        Map<String, String> jsonData = new HashMap<>();
        jsonData.put("folderId" , "оаваоаоовадавло)"); //folderid выдается яндексом после регистрации
        jsonData.put("texts","[" + sentenceToTranslate + "]") ; //массив текстов
        jsonData.put("targetLanguageCode", "en"); //во что переводить

        HttpEntity<Map<String,String>> request = new HttpEntity<>(jsonData, headers);

        //голый ответ
        String response = restTemplate.postForObject(url, request, String.class);
        System.out.printf("response");

        //Парсим полученный json с помощью Jackson

        ObjectMapper mapper = new ObjectMapper();
        JsonNode obj = mapper.readTree(response);

        System.out.println("Перевод:" + obj.get("translations").get(0).get("text"));
        */

        //==== привязка Json на объект

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + "СВОЙ API TOKEN");

        Map<String, String> jsonData = new HashMap<>();
        jsonData.put("folderId" , "оаваоаоовадавло)"); //folderid выдается яндексом после регистрации
        jsonData.put("texts","[" + sentenceToTranslate + "]") ; //массив текстов
        jsonData.put("targetLanguageCode", "en"); //во что переводить

        HttpEntity<Map<String,String>> request = new HttpEntity<>(jsonData, headers);

        //голый ответ
        YandexResponse response = restTemplate.postForObject(url, request, YandexResponse.class);

        System.out.println("Перевод:" + response.getTranslations().get(0).getText());

    }
}
