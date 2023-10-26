package criacionais.factory.app.dbadapter.after.factory;

import criacionais.factory.app.dbadapter.after.db.DB;
import criacionais.factory.app.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
