package com.games.hash;

public abstract class Line implements LineRule{

	Line rule;
	protected boolean finish;

	@Override
	public void next(Line rule) {
		if(this.rule != null) {
			this.rule.next(rule);
			return;
		}
		this.rule = rule;
	}

	public boolean isGameEnded(Simbol[][] square) {
		Line l = this;
		while(l != null && (l = l.apply(square)) != null && !(finish = l.finish)) {
			l = l.rule;
		}
		return finish;
	}

	public boolean isFinished() {
		return finish;
	}

}
