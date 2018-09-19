import qt01_singleton.Logger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static com.uece.br.ConsoleColors.*;

public class Main {

    public static void main(String[] args) throws ParseException {
        // write your code here

        // 1. Singleton
        System.out.println(RED + "EXEMPLO SINGLETON" + RESET + " =");
        RunSingleton();

        // 2. Strategy
        System.out.println(GREEN + "EXEMPLO STRATEGY" + RESET + " =");
        RunStrategy();

        // 3. FactoryMethod
        System.out.println(YELLOW + "EXEMPLO FACTORY METHOD" + RESET + " =");
        RunFactoryMethod("foto.bmp");
        RunFactoryMethod("foto.jpg");

        // 4. Decorator
        System.out.println(com.uece.br.ConsoleColors.BLUE + "EXEMPLO DECORATOR" + com.uece.br.ConsoleColors.RESET + " =");
        RunDecorator();

        // 5. Chain
        System.out.println(com.uece.br.ConsoleColors.CYAN + "EXEMPLO CHAIN" + com.uece.br.ConsoleColors.RESET + " =");
        RunChain();

        // 6. Command
        RunCommand();

        // 7. Observer
        System.out.println(com.uece.br.ConsoleColors.YELLOW_BRIGHT + "EXEMPLO OBSERVER" + com.uece.br.ConsoleColors.RESET + " =");
        RunObserver();

        // 8. Template Method
        System.out.println(ConsoleColors.RED_BOLD + "EXEMPLO TEMPLATE METHOD" + ConsoleColors.RESET + " =");
        RunTemplateMethod();


        //11. Abstract Factory
        System.out.println(com.uece.br.ConsoleColors.PURPLE + "EXEMPLO ABSTRACT FACTORY" + com.uece.br.ConsoleColors.RESET + " =");
        RunAbstractFactory();

    }

    private static void RunSingleton() {
        Logger logger1 = Logger.getInstance();
        logger1.setAtivo(true);
        logger1.log("Primeira mensagem");

        Logger logger2 = Logger.getInstance();
        logger2.log("Segunda mensagem");

    }

    public static void RunStrategy() {
        StrategyContext ctx = new StrategyContext();

        ctx.setLoggerStrategy(new LoggerEventViewer());

        ctx.CreateLog("Usando EVENTVIEWER");
    }

    public static void RunFactoryMethod(String image) {
        DecodedImage decodedImage;
        IVisualizador visualizador = null;
        String formato = image.substring(image.indexOf('.') + 1, image.length());
        if (formato.equals("jpg")) {
            visualizador = (IVisualizador) new VisualizadorJpg(image);
        }
        if (formato.equals("bmp")) {
            visualizador = (IVisualizador) new VisualizadorBmp(image);
        }
        if (visualizador == null) throw new AssertionError();
        decodedImage = visualizador.getDecodeImage();
        System.out.println(decodedImage);
    }

    public static void RunDecorator() {
        IFrozenItem frozen = (IFrozenItem) new FrozenBase("yogurte de frutas", 15);
        frozen = new Topo("castanha", 8, frozen);
        frozen = new Topo("frutas cristalizadas", 6, frozen);
        frozen = new Cobertura("chocolate", 5, frozen);
        System.out.println(frozen.getNome());
        System.out.println(frozen.getPreco());

    }

    public static void RunChain() {
        com.uece.br.chain.CedulaChain cedulas = new com.uece.br.chain.CedulaUm();
        cedulas.setNext(new com.uece.br.chain.CedulaCinco());
        cedulas.setNext(new com.uece.br.chain.CedulaDez());

        try {
            cedulas.pagamento(com.uece.br.chain.IdCedulas.um);
            cedulas.pagamento(com.uece.br.chain.IdCedulas.dez);
            cedulas.pagamento(com.uece.br.chain.IdCedulas.cinco);
            cedulas.pagamento(com.uece.br.chain.IdCedulas.um);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void RunCommand() {
        System.out.println("...");
    }

    public static void RunObserver() {
        Alarme ast = new Alarme();

        new PoliciaObserver(ast);
        new SeguroObserver(ast);

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("\nSimule o evento");
            ast.setState(scan.nextInt());
        }

    }

    public static void RunTemplateMethod() {
        padroes.trabalho.templatemethod.TransformaStringTemplate mai = new padroes.trabalho.templatemethod.TransformaMaiuscula();
        mai.imprimeString();

        padroes.trabalho.templatemethod.TransformaStringTemplate min = new padroes.trabalho.templatemethod.TransformaMinuscula();
        min.imprimeString();


        padroes.trabalho.templatemethod.TransformaStringTemplate inverte = new TransformaInverte();
        inverte.imprimeString();

        padroes.trabalho.templatemethod.TransformaStringTemplate duplica = new padroes.trabalho.templatemethod.TransformaDuplicacao();
        duplica.imprimeString();
    }

    public static void RunAbstractFactory() throws ParseException {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com uma data: ");
        String dtRecebida = ler.next();

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = df.parse(dtRecebida);
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(dt);
        int diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

        PizzaioloFactory pizzaiolo = null;

        if (diaDaSemana == 1) {
            pizzaiolo = new PizzaioloDom();
        } else if (diaDaSemana == 2 || diaDaSemana == 4 || diaDaSemana == 6) {
            pizzaiolo = new PizzaioloSegQuaSex();
        } else {
            pizzaiolo = new PizzaioloTerQuiSab();
        }

        System.out.println(pizzaiolo.criarPizza().montaPizza());

    }

}
