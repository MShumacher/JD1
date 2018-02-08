package com.itacademy.jd1.part2.carmarketdb;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.command.CommandDao;
import com.itacademy.jd1.part2.carmarketdb.command.CommandExit;
import com.itacademy.jd1.part2.carmarketdb.command.CommandFindCar;
import com.itacademy.jd1.part2.carmarketdb.dao.IBaseDao;
import com.itacademy.jd1.part2.carmarketdb.dao.IBrandDao;
import com.itacademy.jd1.part2.carmarketdb.dao.ICarDao;
import com.itacademy.jd1.part2.carmarketdb.dao.IFuelTypeDao;
import com.itacademy.jd1.part2.carmarketdb.dao.IModelDao;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.BrandDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.CarDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.FuelTypeDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.dao.impl.ModelDaoImpl;
import com.itacademy.jd1.part2.carmarketdb.model.Brand;
import com.itacademy.jd1.part2.carmarketdb.model.Car;
import com.itacademy.jd1.part2.carmarketdb.model.FuelType;
import com.itacademy.jd1.part2.carmarketdb.model.Model;

public class Main {

	public static void main(String[] args) throws SQLException, IllegalArgumentException, IllegalAccessException {
		List<Command> firstLevelCommands = new ArrayList<Command>();
		IBrandDao brandDao = new BrandDaoImpl();
		Brand brand = new Brand();
		add(firstLevelCommands, brandDao, brand);
		IModelDao modelDao = new ModelDaoImpl();
		Model model = new Model();
		add(firstLevelCommands, modelDao, model);
		IFuelTypeDao fuelTypeDao = new FuelTypeDaoImpl();
		FuelType fuelType = new FuelType();
		add(firstLevelCommands, fuelTypeDao, fuelType);
		ICarDao carDao = new CarDaoImpl();
		Car car = new Car();
		add(firstLevelCommands, carDao, car);
		firstLevelCommands.add(new CommandFindCar("findcar", "For finding car in base print"));
		firstLevelCommands.add(new CommandExit("exit", "For exit print"));
		Menu menu = new Menu(firstLevelCommands);
		menu.execute();
		System.out.println("Thank you for choosing our carmarket.");
	}

	private static void add(List<Command> fLC, IBaseDao dao, Object object) {
		fLC.add(new CommandDao(dao.getTableName(),
				String.format("For work with table %s print", dao.getTableName().toUpperCase()), dao, object));
	}
}