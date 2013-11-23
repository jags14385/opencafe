package provider;


import client.GitRepoClient;

public class GitAPIProvider {

    public GitRepoClient getGitRepoClient() {
        return gitRepoClient;
    }

    public void setGitRepoClient(GitRepoClient gitRepoClient) {
        this.gitRepoClient = gitRepoClient;
    }

    public GitRepoClient gitRepoClient;

    public GitAPIProvider() {
        gitRepoClient = new GitRepoClient();
    }

}

