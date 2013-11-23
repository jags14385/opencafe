package test;

import domain.Repository;
import fixture.GithubTestFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GithubAPITest extends GithubTestFixture {

    @Before
    public void setup() {

    }

    @Test
    public void shouldHaveTheExpectedRepositories() throws IOException {

        List<Repository> repos = gitRepoClient.getRepositoryForUser("jags14385");
        assertThat(repos.size(), is(7));
        String[] expectedRepoNames = new String[]{"AngularJSTesting","curriculum","JATR","My_Scripts","opencafe","TestGrid","webpy"};
        for (Repository repo : repos) {
             assertThat(Arrays.asList(expectedRepoNames).contains(repo.getName()),is(true));
        }
    }

    @After
    public void tearDown() {

    }

}

