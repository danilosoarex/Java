package br.com.alura.screenmatch.principal;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;
import com.openai.models.responses.ResponseOutputItem;

public class ConsultaChatGPT {

    private static final OpenAIClient client =
            OpenAIOkHttpClient.fromEnv();

    public static String obterTraducao(String texto) {

        ResponseCreateParams params = ResponseCreateParams.builder()
                .model(ChatModel.GPT_5_2)
                .input("""
                        Traduza para o português do Brasil o seguinte texto.
                        Retorne apenas a tradução, sem explicações.
                        Texto:
                        %s
                        """.formatted(texto))
                .build();

        Response response = client.responses().create(params);

        return response.output().stream()
                .filter(ResponseOutputItem::isMessage)
                .map(ResponseOutputItem::asMessage)
                .flatMap(message -> message.content().stream())
                .filter(content -> content.isOutputText())
                .map(content -> content.asOutputText().text())
                .findFirst()
                .orElse("");
    }
}

