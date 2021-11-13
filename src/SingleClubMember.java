public class SingleClubMember extends Member {

    private int club;

    SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub) {
        super(pMemberType, pMemberID, pName, pFees);
        club = pClub;
    }

    public void setClub(int club) {
        this.club = club;
    }

    public int getClub() {
        return club;
    }

    @Override
    public String toString() {
        return "SingleClubMember{" +
                "club=" + club +
                '}';
    }
}
