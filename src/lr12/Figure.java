package lr12;

public abstract class Figure {
    public abstract void ReturnName();
}

class Circle extends Figure {
	
    public void ReturnName() { System.out.println("����"); }
}

class Square extends Figure
{
    public void ReturnName() { System.out.println("�������"); }
}
