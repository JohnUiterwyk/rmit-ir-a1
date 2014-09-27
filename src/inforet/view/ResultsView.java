package inforet.view;

import inforet.model.QueryResult;

import java.util.List;

/**
 * Created by johnuiterwyk on 27/09/2014.
 */
public class ResultsView
{
    public void printResults(List<QueryResult> results, String label)
    {
        for(int i=0;i< results.size(); i++)
        {
            QueryResult result = results.get(i);
            System.out.printf("%s %s %d %3.3f\n",label,result.getDoc().getIdentifier(),i+1,result.getSimilarityScore());
        }
    }
}
