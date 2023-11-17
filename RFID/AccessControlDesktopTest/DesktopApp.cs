
// ---------------------------------------------------------------- RFID ----------------------------------------------------------------  
using ReaderB; //??? Static Class Reader SubRutine
using RawInput_dll;

using System;
using UHFReader18CSharp; //??? No llama al archivo Basic.dll en Referencias


class Program
{
    static void Main()
    {
        // Inicializar el lector RFID
        UHFReader18CSharp.UHFReader reader = new UHFReader18CSharp.UHFReader();

        // Manejar eventos del lector RFID
        reader.CardReceiveEvent += Reader_CardReceiveEvent;

        //Ejecución o cambio de COM #


        // Inicializar RawInput para manejar eventos de teclado
        RawInput rawInput = new RawInput();
        rawInput.KeyPressed += RawInput_KeyPressed;

        // Esperar hasta que el usuario presione una tecla para salir
        Console.WriteLine("Presiona una tecla para salir...");
        Console.ReadKey();

        // Liberar recursos antes de salir
        reader.CloseReader();
        rawInput.Dispose();
    }

    private static void RawInput_KeyPressed(object sender, RawInputEventArg e)
    {
        // Manejar eventos de teclado si es necesario
        Console.WriteLine($"Tecla presionada: {e.KeyPressEvent.DeviceName} - Código: {e.KeyPressEvent.VKeyName}");
    }

    private static void Reader_CardReceiveEvent(object sender, CardReceiveEventArgs e)
    {
        // Manejar eventos de lectura de tarjeta RFID
        Console.WriteLine($"Tarjeta RFID leída: {BitConverter.ToString(e.CardData)}");
    }
}

// ---------------------------------------------------------------- RFID ----------------------------------------------------------------  

//Cyclic Rudendancy Check (CRC)

//Funciones ¿RRU1861? a utiliziar 




