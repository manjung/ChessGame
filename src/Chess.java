

public class Chess 
{
	private int color;
	private String name;
	private int xAxis;
	private int yAxis;
	
	public Chess(int color,String name,int xAxis,int yAxis)
	{
		setChess(color,name,xAxis,yAxis);
	}
	
	public void setChess(int color,String name,int xAxis,int yAxis)
	{
		this.color=color;
		this.name=name;
		this.xAxis=xAxis;
		this.yAxis=yAxis;
	}
	

}
