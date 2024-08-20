package DesignPatterns.Builder;

public class Student {
    String name;
    int age;
    String batch;
    String universityName;
    int gradYear;
    String phoneNumber;

    double psp;

    private Student(Builder builder) {
        if (builder.getGradYear() <= 2020) {
            throw new RuntimeException("Grad Year should be after 2020");
        }
        if (builder.getPsp() < 80) {
            throw new RuntimeException("PSP should be greater than 80");
        }
        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
        this.gradYear = builder.gradYear;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        String name;
        int age;
        String batch;
        String universityName;
        int gradYear;
        String phoneNumber;
        double psp;

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            //Use this method to actually build the student object.
            return new Student(this);
        }
    }
}
