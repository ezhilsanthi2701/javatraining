package objectoriented;
class StudentReportCard
{
	int rollno;
	String name;
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	int tot;
	float avg;
	String grade;
	 StudentReportCard(int rollno,String name, int m1,int m2,int m3,int m4,int m5)
	 
	 {
		 this.rollno=rollno;
		 this.name=name;
		 this.m1=m1;
		 this.m2=m2;
		 this.m3=m3;
		 this.m4=m4;
		 this.m5=m5;
		 
		 
	 }
	 void calculateResult( )
	 {
		this.tot= m1+m2+m3+m4+m5;
		this.avg=tot/5;
		if(avg>=90)
		{
			grade="a";
		}
		else if (avg<90&&avg>=80)
		{
			grade="b";
		}
		else if(avg<80 && avg>=70)
		{
			grade="c";
		}
		else if(avg<70 && avg>=60)
		{
			grade="d";
		}
		else
		{
			grade="fail";
		}
	 }
	 
	void getDetail()
	{
		 System.out.println(this. rollno+" "+this. name+"  "+this. tot+"   "+
					this.avg+"   "+this.grade);
	}
	
}
public class StudentReportCardSystem {

	public static void main(String[] args) {
			
		 StudentReportCard er=new  StudentReportCard (19,"ezhil",23,56,78,97,65);
		  
		 er.calculateResult();
		  er.grade="a++";
		 er.getDetail();
		 
		 StudentReportCard ed=new  StudentReportCard (39,"pon",99,99,100,97,94);
		 ed.calculateResult();
		 ed.getDetail();
		 
		

	}

}
