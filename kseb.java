class KsebConsumer {
    int coustomerNo, usedUnits;
    double charge;
    String consumerName;
    KsebConsumer(int cno, int units, String name) {
        coustomerNo = cno;
        usedUnits = units;
        charge = 0;
        consumerName = name;
    }
    double calculateCharge() {
        if (usedUnits > 300) {
            charge += .60 * 100;
            charge += .80 * 200;
            charge += ((usedUnits - 300) * .90);
        } else if (usedUnits <= 100) {
            charge = usedUnits * .60;
        } else {
            charge += 100 * .60;
            charge += (usedUnits - 100) * .80;
        }
        if (charge > 300) {
            charge += charge * 0.15;
        } else if (charge < 50) {
            charge = 50;
        }
        return charge;
    }
}
class Main {
    public static void main(String[] arg) {
        KsebConsumer kseb = new KsebConsumer(25045, 600, "user");
        System.out.println("name : " + kseb.consumerName + "\ncoustomer number :" +
            kseb.coustomerNo + "\nNumber of units : " + kseb.usedUnits);
        System.out.println("total cost : " + kseb.calculateCharge() + "Rs");
    }
}
