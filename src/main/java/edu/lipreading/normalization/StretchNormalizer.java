package edu.lipreading.normalization;

import edu.lipreading.Sample;

import java.util.List;

public class StretchNormalizer extends CenterNormalizer {
	
	public static final double STRECH_COEFFICIENT = 1000;
	
	@Override
	public Sample normalize(Sample sample) {
		for (List<Integer> vector : sample.getMatrix()) {
			int[] center = getCenter(vector);
			double factor = STRECH_COEFFICIENT / center[X_INDEX];
			for (int i = 0; i < vector.size(); i++) {
					vector.set(i, (int)(vector.get(i) * factor));
			}
			
		}
		return /*super.normelize(*/sample/*)*/;
	}

}
