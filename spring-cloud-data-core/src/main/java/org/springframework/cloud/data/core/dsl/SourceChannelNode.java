/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.data.core.dsl;

/**
 * @author Andy Clement
 */
public class SourceChannelNode extends AstNode {

	private final ChannelNode channelNode;

	public SourceChannelNode(ChannelNode channelNode, int endPos) {
		super(channelNode.startPos, endPos);
		this.channelNode = channelNode;
	}

	/** @inheritDoc */
	@Override
	public String stringify(boolean includePositionalInfo) {
		return channelNode.stringify(includePositionalInfo) + ">";
	}

	@Override
	public String toString() {
		return channelNode.toString() + " > ";
	}

	public ChannelNode getChannelNode() {
		return channelNode;
	}

	public SourceChannelNode copyOf() {
		return new SourceChannelNode(channelNode.copyOf(), super.endPos);
	}

	public String getChannelName() {
		return channelNode.getChannelName();
	}

	public Object getChannelType() {
		return channelNode.getChannelType();
	}

}
