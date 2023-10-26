package criacionais.factory.apple.after.factory;

import criacionais.factory.apple.after.model.IPhone;
import criacionais.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
