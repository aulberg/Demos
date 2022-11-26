class CarInsurancePolicy {
private int policyNumber;
private int numPayments;
private String residentCity; 

public CarInsurancePolicy(int policy, int payments, String city) {
  policyNumber = policy;
  numPayments = payments;
  residentCity = city; 
  }

  public CarInsurancePolicy(int policy, int payments) {
  policyNumber = policy;
  numPayments = payments; 
  residentCity = "Mayfield"; 
  }

  public CarInsurancePolicy(int policy) {
  policyNumber = policy;
  numPayments = 2;
  residentCity = "Mayfield"; 
    
  }

  public void display() {

    System.out.println("Policy # "+ policyNumber + "." + numPayments + " payments annualy. Driver resides in " +
    residentCity);
  }

}