package fixture;

import client.GitRepoClient;
import provider.GitAPIProvider;

public class GithubTestFixture {

    public GitAPIProvider gitAPIProvider;
    public GitRepoClient gitRepoClient;

    public GithubTestFixture(){
        gitAPIProvider = new GitAPIProvider();
        gitRepoClient = gitAPIProvider.getGitRepoClient();
    }


}
