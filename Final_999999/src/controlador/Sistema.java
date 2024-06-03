package controlador;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import excepciones.AnimalNoExisteException;
import excepciones.ClienteNotFoundException;
import excepciones.PasturaNotFoundException;
import negocio.Animal;
import negocio.Cliente;
import negocio.Pastura;
import view.AnimalView;
import view.ClienteView;
import view.PasturaView;

public class Sistema {

	/**
	 * Convierta esta clase en un singleton para accederla desde la interfaz
	 * */
	
	private static Sistema instance;
	
	private List<Cliente> clientes;
	private List<Pastura> pasturas;
	private List<Animal> animales;
	
	private Sistema(){
		clientes = new ArrayList<>();
		pasturas = new ArrayList<>();
		animales = new ArrayList<>();
		/**
		 * La siguiente rutina solo tiene como funci�n cargar datos para operar
		 * */
		cargarDatos();
	}
	
	public static Sistema getInstance()
	{
		if(instance == null)
		{
			instance = new Sistema();
		}
		return instance;
	}
	
	public void agregarCampo(String cuit, int codigo, int area, int codigoPastura, int codigoAnimal) throws ClienteNotFoundException, PasturaNotFoundException, AnimalNoExisteException{
		Cliente cliente = buscarCliente(cuit);
		Pastura pastura = buscarPastura(codigoPastura);
		Animal animal = buscarAnimal(codigoAnimal);
		cliente.addCampo(codigo, area, pastura, animal);
	}
	
	public int obtenerCabezasPorCliente(String cuit, int codigoAnimal) throws ClienteNotFoundException, AnimalNoExisteException{
		Cliente cliente = buscarCliente(cuit);
		Animal animal = buscarAnimal(codigoAnimal);
		return cliente.cantidadCabezasAnimal(animal);
	}
	
	public double obtenerValorHaciendaPorCliente(String cuit) throws ClienteNotFoundException{
		Cliente cliente = buscarCliente(cuit);
		return cliente.precioHaciendaEnPie();
	}
	
	public List<ClienteView> obtenerClientes(){
		//Coloque su codigo aca
		List<ClienteView> clienteView = new ArrayList<>();
		for(Cliente c : clientes)
		{
			clienteView.add(c.toView());
		}
		return clienteView;
	}
	
	public List<PasturaView> obtenerPasturas()
	{
		List<PasturaView> pasturasView = new ArrayList<>();
		for(Pastura p : pasturas)
		{
			pasturasView.add(p.toView());
		}
		
		return pasturasView;
	}
	
	public List<AnimalView> obtenerAnimales()
	{
		//Coloque su codigo aca
		List<AnimalView> animalesView = new ArrayList<>();
		for(Animal a : animales)
		{
			animalesView.add(a.toView());
		}
		return animalesView;
	}
	
	private Cliente buscarCliente(String cuit) throws ClienteNotFoundException{
		for(Cliente cliente : clientes)
			if(cliente.tieneCuit(cuit))
				return cliente;
		throw new ClienteNotFoundException("El cliente " + cuit + " no existe");
	}
	
	private Pastura buscarPastura(int codigoPastura) throws PasturaNotFoundException{
		for(Pastura pastura : pasturas)
			if(pastura.tieneCodigo(codigoPastura))
				return pastura;
		throw new PasturaNotFoundException("La Pastura " + codigoPastura + " no existe");
	}
	
	private Animal buscarAnimal(int codigoAnimal) throws AnimalNoExisteException{
		for(Animal animal : animales)
			if(animal.tieneCodigo(codigoAnimal))
				return animal;
		throw new AnimalNoExisteException("El Animal " + codigoAnimal + " no existe");
	}
	
	private void cargarDatos(){
		Animal animal;
		animal = new Animal(1,"Hereford", 15500 ); animales.add(animal);
		animal = new Animal(2,"Aberdeen Angus", 15500); animales.add(animal);
		animal = new Animal(3,"Criolla", 10000); animales.add(animal);
		animal = new Animal(4,"Holando Argentino", 15000); animales.add(animal);
		animal = new Animal(5,"Jersey", 15000); animales.add(animal);
		animal = new Animal(6,"Charolais", 12000); animales.add(animal);
		animal = new Animal(7,"Limousin", 13000); animales.add(animal);
		animal = new Animal(8,"Fleckvieh", 13000); animales.add(animal);
		animal = new Animal(9,"Brahman", 14000); animales.add(animal);
		animal = new Animal(10,"Santa Gertrudis", 11000); animales.add(animal);
		animal = new Animal(11,"Brangus", 18000); animales.add(animal);
		animal = new Animal(12,"Bradford", 13000); animales.add(animal);
		animal = new Animal(13,"Belted Galloway", 14000); animales.add(animal);
		Pastura pastura;
		pastura = new Pastura(1, "Alfalfa", 435.00f); pasturas.add(pastura);
		pastura = new Pastura(2, "Afrecho", 440.00f); pasturas.add(pastura);
		pastura = new Pastura(3, "Cebada", 398.00f); pasturas.add(pastura);
		pastura = new Pastura(4, "Centeno", 366.00f); pasturas.add(pastura);
		Cliente cliente;
		cliente = new Cliente("Cuit:12-3456789-1", "Nombre_I"); clientes.add(cliente);
		cliente = new Cliente("Cuit:22-3456789-2", "Nombre_II"); clientes.add(cliente);
		cliente = new Cliente("Cuit:32-3456789-3", "Nombre_III"); clientes.add(cliente);
		cliente = new Cliente("Cuit:42-3456789-4", "Nombre_IV"); clientes.add(cliente);
		cliente = new Cliente("Cuit:52-3456789-5", "Nombre_V"); clientes.add(cliente);
		cliente = new Cliente("Cuit:62-3456789-6", "Nombre_VI"); clientes.add(cliente);
		cliente = new Cliente("Cuit:72-3456789-7", "Nombre_VII"); clientes.add(cliente);
	}
	
	
	
	}
