package store.intent.zerodevelop.custom;

import store.intent.zerodevelop.executor.Module;
import store.intent.zerodevelop.util.Version;

public abstract class example extends Module {
    @Override
    public Version getBuildVersion() {
        return new Version(1,0,0);
    }
    @Override
    public Category getCategory() {
        return Category.DEVELOP;
    }
    @Override
    public String getDescription() {
        return "Example module from 'Add Your Own Hacks to ZeroDay (ZeroDevelop SDK)'";
    }

    public void onUpdate() {
        player.addChatMessage("[Message] Hi there!");
    }
}
