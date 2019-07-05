package net.fabricmc.example.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.network.packet.SetTradeOffersPacket;

@Mixin(SetTradeOffersPacket.class)
public abstract class SetTradeOffersPacketMixin{

    @Inject(method="<init>*", at=@At("RETURN"))
    private void onInit(CallbackInfo info){
        System.out.println("SetTradeOffersPacket initialized");
    }

}