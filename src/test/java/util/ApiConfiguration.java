package util;

public class ApiConfiguration {

    public static final String CREATE_PROJECT=GetProperties.getInstance().getHost()+"/api/projects.json";
    public static final String UPDATE_PROJECT=GetProperties.getInstance().getHost()+"/api/projects/%s.json";
    public static final String READ_PROJECT=GetProperties.getInstance().getHost()+"/api/projects/%s.json";
    public static final String DELETE_PROJECT=GetProperties.getInstance().getHost()+"/api/projects/%s.json";

}
