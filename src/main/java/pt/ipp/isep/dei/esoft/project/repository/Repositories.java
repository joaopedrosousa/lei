package pt.ipp.isep.dei.esoft.project.repository;

public class Repositories {

    private static final Repositories instance = new Repositories();
    TaskCategoryRepository requestCategoryRepository = new TaskCategoryRepository();

    OrganizationRepository propertyTypeRepository = new OrganizationRepository();
    AuthenticationRepository authenticationRepository = new AuthenticationRepository();

    private Repositories() {
    }

    public static Repositories getInstance() {
        return instance;
    }

    public OrganizationRepository getOrganizationRepository() {
        return propertyTypeRepository;
    }

    public TaskCategoryRepository getTaskCategoryRepository() {
        return requestCategoryRepository;
    }

    public AuthenticationRepository getAuthenticationRepository() {
        return authenticationRepository;
    }


}
