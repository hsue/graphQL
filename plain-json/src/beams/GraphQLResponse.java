package beams;

/**
 * Created by hsue on 9/10/19.
 */
public class GraphQLResponse {

  private SearchOpportunities data;

  public SearchOpportunities getData() {
    return data;
  }

  public void setData(SearchOpportunities data) {
    this.data = data;
  }


  public static class SearchOpportunities{

    private OpportunitySearchResults searchOpportunities;

    public OpportunitySearchResults getOpportunitySearchResults() {
      return searchOpportunities;
    }

    public void setOpportunitySearchResults(OpportunitySearchResults opportunitySearchResults) {
      searchOpportunities = opportunitySearchResults;
    }
  }
}
