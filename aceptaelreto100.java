????   4 ]
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextInt ()I
     next ()Ljava/lang/String;
      java/lang/String toCharArray ()[C
 ! " # $ % java/util/Arrays sort ([C)V
  '  %
 ) * + , - java/lang/Integer parseInt (Ljava/lang/String;)I
 ) / 0 1 toString (I)Ljava/lang/String;	 
 3 4 5 out Ljava/io/PrintStream;
 7 8 9 : ; java/io/PrintStream println (I)V = aceptaelreto/aceptaelreto100 Code LineNumberTable LocalVariableTable this Laceptaelreto/aceptaelreto100; main ([Ljava/lang/String;)V x I j sol Ljava/lang/String; ni ri nums [C reverso args [Ljava/lang/String; sc Ljava/util/Scanner; veces solucion 	iteracion operaciones StackMapTable P M MethodParameters 
SourceFile aceptaelreto100.java ! <           >   /     *? ?    ?        @        A B   	 C D  >  ?     ?? Y? 	? L+? =66	6
	? ?6
+? ? N-??:? ^-?  6-?? -?dd6-4U????? Y-? &? (6? Y? &? (6d6? .:? N?
???? 2
? 6?	??{?    ?   b    
             "  *  0  8  <  F ! O " X  ^ & k ' y ) ? + ? - ? / ? 2 ? 3 ? 5 @   ?  O 	 E F  ?  G F  ?  H I  k ( J F  y  K F  * w L M  0 q N M    ? O P    ? Q R   ? S F   ? T F   ? U F 	  ? V F 
 W   P ?   X        ?   X  Y Y     ? ? 4?   X         Z    O    [    \