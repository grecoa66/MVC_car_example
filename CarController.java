public class carController{
	private Car model;
	private CarView view;

	public carController(Car model, CarView view){
		this.model = model;
		this.view = view;
	}

	public void setCarName(String modelName)
	{
		model.setModel(modelName);
	}

	public String getCarName()
	{
		return model.getModelName();
	}

	public void setVin(int vin)
	{
		model.setVin(vin);
	}

	public int getVin()
	{
		return model.getVin();
	}

	public void setSpeed( int speed)
	{
		model.setSpeed(speed);
	}

	public int getSpeed()
	{
		return model.getSpeed();
	}

	public void updateView()
	{
		view.carDetailedView(model.getModelName(), model.getVin(), model.getSpeed());
	}
}