package net.auoeke.sp.source.lexeme;

import net.auoeke.sp.source.NodeTransformer;
import net.auoeke.sp.source.NodeVisitor;

public final class CharacterLexeme extends Lexeme {
	public final Token token;

	public CharacterLexeme(Position position, Token token) {
		super(position);

		this.token = token;
	}

	@Override public Token token() {
		return this.token;
	}

	@Override public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	@Override public <T> T accept(NodeTransformer<T> transformer) {
		return transformer.transform(this);
	}

	@Override public CharacterLexeme clone() {
		return new CharacterLexeme(this.position, this.token);
	}

	@Override public String toString() {
		return String.valueOf(this.token.character());
	}
}
