package com.itacademy.jd1.part2.carmarketdb.command.admin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.jd1.part2.carmarketdb.Command;
import com.itacademy.jd1.part2.carmarketdb.Menu;
import com.itacademy.jd1.part2.carmarketdb.command.CommandExit;
import com.itacademy.jd1.part2.carmarketdb.command.user.CommandFindCar;
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

public class CEnterAdmin extends Command {

	public CEnterAdmin(String value, String output) {
		super(value, output);
	}

	public void execute() throws IllegalArgumentException, IllegalAccessException, SQLException {
		List<Command> secondLevelCommands = new ArrayList<Command>();
		IBrandDao brandDao = new BrandDaoImpl();
		Brand brand = new Brand();
		add(secondLevelCommands, brandDao, brand);
		IModelDao modelDao = new ModelDaoImpl();
		Model model = new Model();
		add(secondLevelCommands, modelDao, model);
		IFuelTypeDao fuelTypeDao = new FuelTypeDaoImpl();
		FuelType fuelType = new FuelType();
		add(secondLevelCommands, fuelTypeDao, fuelType);
		ICarDao carDao = new CarDaoImpl();
		Car car = new Car();
		add(secondLevelCommands, carDao, car);
		secondLevelCommands.add(new CommandExit("exit", "To exit to previous menu print"));
		Menu menu = new Menu(secondLevelCommands);
		menu.execute();
	}

	private void add(List<Command> fLC, IBaseDao dao, Object object) {
		fLC.add(new CommandDao(dao.getTableName(),
				String.format("For working with table %s print", dao.getTableName().toUpperCase()), dao, object));
	}
}