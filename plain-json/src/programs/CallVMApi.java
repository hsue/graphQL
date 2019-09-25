package programs;

import beams.GraphQLResponse;
import beams.OpportunityBean;
import beams.OpportunitySearchResults;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jdk.nashorn.internal.codegen.CompilerConstants;
import org.apache.commons.io.IOUtils;

import javax.net.ssl.HttpsURLConnection;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hsue on 9/24/19.
 */
public class CallVMApi {
  private static final String urlString = "https://apibeta.stage.volunteermatch.org/graphql/";

  public static void main(String[] args) throws IOException {
    CallVMApi call = new CallVMApi();
    call.searchOppByCity();
  }

  public void searchOppByCity() throws IOException {

    String urlStr =  urlString;
    String payload =
        "{\n" +
            "  \"query\": \n" +
            "  \"{  searchOpportunities( input:{ location: \\\"fremont\\\", numberOfResults: 1} ) " +
            "   { opportunities { id, location{ city }}     }}\"\n" +
            "}";

    String output = getHTTPPostResponse(urlStr, payload);
    OpportunitySearchResults results = getSearchResultsFromOutput(output);

    if (results.getOpportunities()!= null && results.getOpportunities().size()>0) {
      OpportunityBean opp = results.getOpportunities().get(0);
      if (opp.getLocation()!= null) {
        System.out.println(" This opportunity's location is"+opp.getLocation().toMap());
      }
    } else {
      System.err.println("Failed: no search results returned");
    }

    System.out.println("call SearchOppByCity done");
  }

  String getHTTPPostResponse(String urlStr, String payload) throws IOException {

    URL url = new URL(urlStr);
    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

    conn.setRequestMethod("POST");
    conn.setRequestProperty("Content-Type", "application/json");
    conn.setRequestProperty("X-SSL-Client-SHA1", "94A34A3B34357BEC20C8B20471111E53F13B8C70");
    conn.setRequestProperty("x-api-key", "7e3b93903016981dfbddcb0f121d0178");
    conn.setDoOutput(true);

    DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
    wr.writeBytes(payload);
    wr.flush();
    wr.close();

    int responseCode = conn.getResponseCode();
    System.out.println("\nSending 'POST' request to URL : " + url);
    System.out.println("payload : " + payload);
    System.out.println("Response Code : " + responseCode);

    String output = IOUtils.toString(conn.getInputStream());

    if (responseCode != 200) {
      throw new RuntimeException(output);
    }
    conn.disconnect();

    return output;
  }
  private OpportunitySearchResults getSearchResultsFromOutput(String jsonStr) {
    Gson gson = new Gson();
    GraphQLResponse response =  gson.fromJson(jsonStr, new TypeToken<GraphQLResponse>() {}.getType());
    if (response != null && response.getData()!= null) {
      return response.getData().getOpportunitySearchResults();
    }
    return null;
  }

  private boolean isCategoryValid(List<String> searchCats, List<String> returnCats){
    for(String cat: returnCats){
      if (searchCats.contains(cat)) {
        return true;
      }
    }
    return false;
  }


  ArrayList<OpportunityBean> getOpps(String jsonStr) {
    Gson gson = new Gson();
    return gson.fromJson(jsonStr, new TypeToken<ArrayList<OpportunityBean>>() {}.getType());
  }

}
