package criacionais.factory.apple.after.factory;

import criacionais.factory.apple.after.model.IPhone;
import criacionais.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
