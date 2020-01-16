
public class Grade {
	public String vote;
	
	public Grade () {
		
	}
	public Grade (String vote) {
		this.vote = vote.toLowerCase();
	}
	public double getNumericGrade() {
		double convertedVote =0;
		if(this.vote.contains("f")) {
			return 0;
		}
		if(this.vote.contains("a")) {
			return 4.0;
		}
		if(this.vote.contains("b")) {
			return 3.0;
		}
		if(this.vote.contains("c")) {
			return 2.0;
		}
		if(this.vote.contains("d")) {
			return 1.0;
		}
		if(this.vote.contains("+") && !this.vote.contains("a")) {
			convertedVote=this.vote+0.3;
		}
		if(this.vote.contains("-") !this.vote.contains("f")) {
			convertedVote=this.vote-0.3;
		}
		return convertedVote;
	}
	public void setVote(String vote) {
		this.vote = vote;
	}
	
}
