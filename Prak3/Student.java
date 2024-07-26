public interface Student {
    public long getStudentID();

    public double getOverallGPA();

    public double getGrade();

    public String getMajor();

    public boolean applyMajor(String major);

    public void applyScholarship(String program);

    public void promoteGrade(double grade);

    public void payTuition(boolean paid, String name);
    
}
