package br.com.srcabral.matchessimulator.data;

import java.util.List;

import br.com.srcabral.matchessimulator.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesAPI {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
