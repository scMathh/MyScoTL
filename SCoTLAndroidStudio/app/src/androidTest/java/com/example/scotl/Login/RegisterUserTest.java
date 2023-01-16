package com.example.scotl.Login;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

import Frameworks.Database.SQLite.SQLiteDAO;
import Policy.Adapters.MyLog;
import Policy.BusinessRules.DatabaseAccess;
import Policy.BusinessRules.UserType;

public class RegisterUserTest
{
    @Test
    public void ExecuteRegisterUserTest()
    {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        SQLiteDAO database = new SQLiteDAO(appContext);

        Boolean result = database.TryRegisterUser("Pedro2", "123", "11111111111",UserType.WAREHOUSE_MANAGER);
        MyLog.LogMessage(result.toString());
    }
}
