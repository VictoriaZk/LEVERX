package entity;

public enum Job {
    POLICE("police"),
    MEDICINE("medicine"),
    SHOW("show"),
    NONE("none");

    private final String job;

    Job(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }
}
