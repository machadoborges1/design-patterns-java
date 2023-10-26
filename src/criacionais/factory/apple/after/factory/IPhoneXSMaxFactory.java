package criacionais.factory.apple.after.factory;

import criacionais.factory.apple.after.model.IPhone;
import criacionais.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
