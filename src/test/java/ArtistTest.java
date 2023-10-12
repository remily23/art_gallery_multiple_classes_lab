import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;

public class ArtistTest {

    Artist artist;
    @BeforeEach
    public void setUp(){
        artist = new Artist("Andy Warhol");
    }

    @Test
    public void hasName(){
        assertThat(artist.getArtistName()).isEqualTo("Andy Warhol");
    }
}
