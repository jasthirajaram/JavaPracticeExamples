package com.spring.dependency;

public class Fortuner {
	private String company;
    private double cost;
    
    public Fortuner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fortuner(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}

	public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        cost = this.cost;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

	@Override
	public String toString() {
		return "Fortuner [company=" + company + ", cost=" + cost + "]";
	}

    
    
}