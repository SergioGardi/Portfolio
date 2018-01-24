package pizzerialachila;
import java.util.Date;

public class cajero extends empleados{
	private int idCaja;
	ventas ventasCajero = new ventas();
	
	public int getIdCaja()
	{
		return idCaja;
	}
	
	public void serIdCaja(int _idCaja)
	{
		idCaja=_idCaja;
	}
	
	public void setVentasCajero(
				int _folio, Date _fecha, double _monto)
	{
		ventasCajero.setFolio(_folio);
		ventasCajero.setFecha(_fecha);
		ventasCajero.setMonto(_monto);
	}
	public ventas getVentasCajero()
	{
		return ventasCajero;
	}
	
	
	
	
	
}
