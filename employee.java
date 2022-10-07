enum Status {
    Junior,
    Senior,
    SuperSenior,
}
enum Rank {
    AssistantProf,
    AssociateProf,
    Prof,
}
enum Title {
    Assistant,
    Officer,
    Manager,
}
class Person {
    String name;
    String address;
    long phoneNo;
    String email;
    public Person(String name, String address, long phoneNo, String email) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
    }
    @Override
    public String toString() {
        return String.format("name : %s\nClass name : %s\n", this.name, this.getClass());
    }
}
class Student extends Person {
    final Status status;
    Student(Status status, String name, String address,
        long phoneNo, String email) {
        super(name, address, phoneNo, email);
        this.status = status;
    }
    class Employee extends Person {
        String office;
        int salary;
        String date;
        Employee(String office, int salary, String date, String name,
            String address, long phoneNo, String email) {
            super(name, address, phoneNo, email);
            this.office = office;
            this.salary = salary;
            this.date = date;
        }
    }
    class Faculty extends Employee {
        int officeHrs;
        Rank rank;
        Faculty(int officeHrs, Rank rank, String office, int salary, String date,
            String name, String address, long phoneNo, String email) {
            super(office, salary, date, name, address, phoneNo, email);
            this.officeHrs = officeHrs;
            this.rank = rank;
        }
    }
    class Staff extends Employee {
        Title title;
        Staff(Title title, String office, int salary, String date, String name,
            String address, long phoneNo, String email) {
            super(office, salary, date, name, address, phoneNo, email);
            this.title = title;
        }
    }
    class Test {
        public static void main(String args[]) {
            Person p = new Person("user1",
                "painavu", 9977997799 L, "user@geci.com");
            System.out.println(p.toString());
            Student std = new Student(Status.Senior, "user2",
                "painavu", 7788992211 L, "u2@geci.com");
            System.out.println(std.toString());
            Employee emp = new Employee("Administration", 50000, "25-07-2012",
                "user3", "painavu", 8648231257 L, "user3@geci.com");
            System.out.println(emp.toString());
            Faculty fac = new Faculty(8, Rank.AssociateProf, "Lab", 50000,
                "31-01-2022", "user4", "cheruthoni", 7890284632 L, "user4@geci.com");
            System.out.println(fac.toString());
            Staff s = new Staff(Title.Assistant, "Accounts", 5000, "25-05-2012",
                "user5", "thodupuzha", 7853231247 L, "user5@geci.com");
            System.out.println(s.toString());
        }
    }
}
