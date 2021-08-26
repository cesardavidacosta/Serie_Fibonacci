using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FIBONACCI_SERIE
{
    class Program
    {
        static void Main(string[] args)
        {
            Consultas calculos = new Consultas();
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("el numero segun la serie es: " + calculos.SerieFibonacci(i));

                Console.WriteLine("el numero obtenido de la serie es primo: " + calculos.numprimo(i));

            }
            Console.ReadKey(true);

        }
    }
}
