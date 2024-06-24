package HW.chapter01.chapter04;

public class Q06 {
    public static void main(String[] args) {
        final double R = 40;

        double angle1 = (Math.random() * (2 * Math.PI));
        double angle2 = (Math.random() * (2 * Math.PI));
        double angle3 = (Math.random() * (2 * Math.PI));

        double x1 = R * Math.cos(angle1);
        double y1 = R * Math.sin(angle1);
        double x2 = R * Math.cos(angle2);
        double y2 = R * Math.sin(angle2);
        double x3 = R * Math.cos(angle3);
        double y3 = R * Math.sin(angle3);

        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
    }
}
