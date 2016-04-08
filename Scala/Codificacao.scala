import scala.io.StdIn._
val mensagem = readLine("Digite a mensagem > ")
val cifra = readLine("Digite o valor da cifra > ").toInt

println(mensagem map {c =>(c + cifra).toChar})
