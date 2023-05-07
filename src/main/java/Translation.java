
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
public class Translation {
    private String text;
    private String detectedLanguageCode;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDetectedLanguageCode() {
        return detectedLanguageCode;
    }

    public void setDetectedLanguageCode(String detectedLanguageCode) {
        this.detectedLanguageCode = detectedLanguageCode;
    }
}
