package test;

import domain.Repository;
import fixture.GithubTestFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GithubAPITest extends GithubTestFixture {

    @Before
    public void setup() {

    }

    @Test
    public void shouldHaveTheExpectedNumberOfRepositories() throws IOException {

        List<Repository> repos = gitRepoClient.getRepositoryForUser("jags14385");
        assertThat(repos.size(), is(7));

    }

    @Test
    public void shouldHaveTheExpectedRepositories() throws IOException {

        List<Repository> repos = gitRepoClient.getRepositoryForUser("jags14385");
        for (Repository repo : repos) {

        }
    }

    @After
    public void tearDown() {

    }

}

