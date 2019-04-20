package flexjson.mock;

import java.util.ArrayList;
import java.util.List;

public class TimeFilter {

    private String name;
    private String uniqueName;
    private List<Pair<String,String>> includes;

    public TimeFilter() {
    }

    public TimeFilter(String name, String uniqueName) {
        this.name = name;
        this.uniqueName = uniqueName;
    }

    public String getName() {
        return name;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public String getType() {
        return "time";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public List<Pair<String,String>> getIncludes() {
        return includes;
    }

    public void setIncludes(List<Pair<String,String>> includes) {
        this.includes = includes;
    }

    public TimeFilter include(String fromDate, String toDate) {
        if( this.includes == null ) this.includes = new ArrayList<Pair<String, String>>();
        this.includes.add( new Pair<String, String>(fromDate,toDate) );
        return this;
    }
}
