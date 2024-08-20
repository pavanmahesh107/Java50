package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
//        //Builder builder = new Builder();
//        Builder builder = Student.getBuilder();
//        builder.setName("Pavan");
//        builder.setAge(25);
//        builder.setBatch("April 23 Tuesday");
//        builder.setGradYear(2021);
//        builder.setPsp(81);
//
//       // Student student = new Student(builder);

        Student student = Student.getBuilder()
                                      .setName("Pavan")
                                            .setAge(26)
                                                .setBatch("April 23 Tuesday")
                                                       .setGradYear(2021)
                                                              .setPsp(81)
                                                                   .build();

        System.out.println(student);

    }
}
