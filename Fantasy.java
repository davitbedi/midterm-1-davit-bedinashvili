package task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName;

    public Fantasy(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String getBus1() {
        // Implement logic for getBus1
        return "Bus1 implementation";
    }

    @Override
    public String getKinematics2() {
        return "Kinematics2 implementation";
    }

    @Override
    public String methodCampaign3(String argElectrochemistry5) {
        return "MethodCampaign3 implementation with arg: " + argElectrochemistry5;
    }

    @Override
    public List<String> methodInterface4(String argPasta6) {
        return List.of("MethodInterface4 implementation with arg: " + argPasta6);
    }

    @Override
    public String toString() {
        return "Fantasy by " + studentName;
    }

    public static void main(String[] args) {
        Fantasy fantasy = new Fantasy("Your Name");
        System.out.println(fantasy.getBus1());
        System.out.println(fantasy.getKinematics2());
        System.out.println(fantasy.methodCampaign3("Argument"));
        System.out.println(fantasy.methodInterface4("Argument"));
        System.out.println(fantasy.toString());
    }
}
