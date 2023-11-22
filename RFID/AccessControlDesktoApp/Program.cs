using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Runtime.InteropServices;
// ---------------------------------------------------------------- RFID ----------------------------------------------------------------  
//??? Static Class Reader SubRutine
using RawInput_dll;
using ReaderB; //??? No llama al archivo Basic.dll en Referencias

namespace ControlDesktoAppConsol
{
    internal class Program
    {
        const int DefaultPort = 8; // Puerto predeterminado
        const byte DefaultBaud = 5; // Baud predeterminado
        static int PortHandle;

        static void Main()
        {
            // Configurar la dirección del lector RFID y otros parámetros según sea necesario
            byte ComAddr = 0xFF; // Dirección del lector RFID

            // Abrir el puerto
            int result = ReaderB.StaticClassReaderB.OpenComPort(DefaultPort, ref ComAddr, DefaultBaud, ref PortHandle);

            if (result != 0)
            {
                Console.WriteLine("Error al abrir el puerto. Código: " + result);
                return;
            }

            try
            {
                //  obtener información del lector
                GetReaderInformation(ComAddr);

                // También puedes realizar otras operaciones como la lectura y escritura de tarjetas RFID

                // ...

            }
            finally
            {
                // Cerrar el puerto al finalizar
                ReaderB.StaticClassReaderB.CloseComPort();
            }
        }

        static void GetReaderInformation(byte ConAddr)
        {
            byte[] VersionInfo = new byte[4];
            byte ReaderType = 0;
            byte[] TrType = new byte[3];
            byte dmaxfre = 0, dminfre = 0, powerdBm = 0, ScanTime = 0;

            int result = ReaderB.StaticClassReaderB.GetReaderInformation(ref ConAddr, VersionInfo, ref ReaderType, TrType, ref dmaxfre, ref dminfre, ref powerdBm, ref ScanTime, PortHandle);

            if (result == 0)
            {
                Console.WriteLine($"Información del lector RFID:");
                Console.WriteLine($"Versión: {Encoding.ASCII.GetString(VersionInfo)}");
                Console.WriteLine($"Tipo de lector: {ReaderType}");
                Console.WriteLine($"Tipo de frecuencia: {Encoding.ASCII.GetString(TrType)}");
                Console.WriteLine($"Frecuencia máxima: {dmaxfre}");
                Console.WriteLine($"Frecuencia mínima: {dminfre}");
                Console.WriteLine($"Potencia dBm: {powerdBm}");
                Console.WriteLine($"Tiempo de escaneo: {ScanTime}");
            }
            else
            {
                Console.WriteLine($"Error al obtener la información del lector. Código: {result}");
            }
        }
    }
}
