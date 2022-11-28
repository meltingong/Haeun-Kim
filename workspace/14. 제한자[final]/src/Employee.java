public abstract class Employee {
	
	public static final double INCENTIVE_RATE = 0.1;	//인센티브율
	
    private int no;		 // 사원번호
    private String name; // 사원이름
    private int pay;	 // 사원급여
    
    public Employee() {
		
	}
    
    public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	/*
      급여계산
      	- 실제구현작업 불가능
      	- 자식클래스에서 반드시 재정의(구현)해야하는 메소드
      	- 재정의 강제(규칙, specification)
     */
    public abstract void calculatePay();
    
    /*
    	인센티브계산 (급여가 100만원 이상이면 10%인센티브 지급)
    		- 재정의금지
    		- 모든사원들의 인센티브 계산방법 동일
     */
    public final double calculateIncentive() {
    	double incentive = 0.0;
    	if(this.pay >= 1000000) {
    		incentive = this.pay * Employee.INCENTIVE_RATE;
    	}
    	return incentive;
    }
    
    
    
    public void print(){
    	System.out.print(this.no + "\t" + this.name + "\t" + this.pay + "\t");
    }

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

    
}
