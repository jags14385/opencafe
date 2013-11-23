package client;

import domain.Repository;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.List;

public class GitRepoClient {

    public List<Repository> getRepositoryForUser(String username) throws IOException {

        String url = "https://api.github.com/users/"+username+"/repos";
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);

        String responseInStrFormat = IOUtils.toString(response.getEntity().getContent(), "UTF-8");

        ObjectMapper objMapper = new ObjectMapper();
        List<Repository> repoList = objMapper.readValue(responseInStrFormat, new TypeReference<List<Repository>>() {
        });

        return repoList;

    }

}
