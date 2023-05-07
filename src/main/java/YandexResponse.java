import java.util.List;

/*
Response example - convert to obj
{
"translations": [
    {
    "text": "Привет",
    "detectedLanguageCode": "en"
    }
    {
    "text": "Мир",
    "detectedLanguageCode": "en"
    }
]
}
 */
public class YandexResponse {

    private List<Translation> translations;

    public List<Translation> getTranslations() {
        return translations;
    }

    public void setTranslations(List<Translation> translations) {
        this.translations = translations;
    }
}
