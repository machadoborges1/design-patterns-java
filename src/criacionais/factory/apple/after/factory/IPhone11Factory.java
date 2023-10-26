package criacionais.factory.apple.after.factory;

import criacionais.factory.apple.after.model.IPhone;
import criacionais.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
