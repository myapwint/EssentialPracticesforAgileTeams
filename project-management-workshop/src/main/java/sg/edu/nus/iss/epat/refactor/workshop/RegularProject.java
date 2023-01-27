package sg.edu.nus.iss.epat.refactor.workshop;

public class RegularProject extends Project {

    public void addMember(String member) {
        members.add(member);
    }

    public String removeMember(String member) {
        members.remove(member);
        return member;
    }
}
