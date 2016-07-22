package com.sperly.endtrans.proxy;


import com.sperly.endtrans.init.EndTransItems;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        EndTransItems.registerRenders();
    }
}
