package beams;

import java.util.List;

/**
 * Created by hsue on 7/31/19.
 */
public class OpportunitySearchResults {

  Integer currentPage;

  Integer resultsSize;

  Integer numberOfResults;

  String sortCriteria;

  List<OpportunityBean> opportunities;

  public List<OpportunityBean> getOpportunities() {
    return opportunities;
  }

  public void setOpportunities(List<OpportunityBean> opportunities) {
    this.opportunities = opportunities;
  }

  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public Integer getResultsSize() {
    return resultsSize;
  }

  public void setResultsSize(Integer resultsSize) {
    this.resultsSize = resultsSize;
  }

  public String getSortCriteria() {
    return sortCriteria;
  }

  public void setSortCriteria(String sortCriteria) {
    this.sortCriteria = sortCriteria;
  }

  public Integer getNumberOfResults() {
    return numberOfResults;
  }

  public void setNumberOfResults(Integer numberOfResults) {
    this.numberOfResults = numberOfResults;
  }


}

