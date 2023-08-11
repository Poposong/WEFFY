package openvidu.meeting.service.java.conference.streaming;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SendVideo {
    private String localRecordingPath = "C://recording/";

    //"?type=lecture"
    public void sendRequest(String classId, String fileName) throws IOException {

        String accessToken = "토큰이름";

        HttpClient httpClient = HttpClients.createDefault();

        HttpPost postRequest = new HttpPost("http://i9d107.p.ssafy.io:8081/api/v1/files/" + classId );

        postRequest.addHeader("Authorization", "Bearer " + accessToken);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();

        Path file = Paths.get(localRecordingPath + classId + "/" + fileName + ".mp4");

       // System.out.println("문장 : "+ file.toString());
        builder.addBinaryBody("file", Files.newInputStream(file), ContentType.APPLICATION_OCTET_STREAM, file.getFileName().toString());

       // System.out.println("file Path : "+ file.toString());

        HttpEntity multipartEntity = builder.build();
        postRequest.setEntity(multipartEntity);

        try (CloseableHttpResponse response = (CloseableHttpResponse) httpClient.execute(postRequest)) {
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Response: " + responseBody);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
