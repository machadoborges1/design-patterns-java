package criacionais.factory.app.dbadapter.after.factory;

import criacionais.factory.app.dbadapter.after.db.DB;
import criacionais.factory.app.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
