����   4 ^
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextInt ()I  [[C
     next ()Ljava/lang/String;
      ! java/lang/String charAt (I)C # ARRIBA
  % & ' equals (Ljava/lang/Object;)Z	 
 ) * + out Ljava/io/PrintStream; - NINGUNO
 / 0 1 2 3 java/io/PrintStream println (Ljava/lang/String;)V 5 DERECHA 7 	IZQUIERDA 9 ABAJO
 / ; 2 < (I)V > --- @ aceptaelreto/aceptaelreto479 Code LineNumberTable LocalVariableTable this Laceptaelreto/aceptaelreto479; main ([Ljava/lang/String;)V j I patron Ljava/lang/String; i pf pc contador posicion mapa casos args [Ljava/lang/String; sc Ljava/util/Scanner; filas columnas StackMapTable T MethodParameters 
SourceFile aceptaelreto479.java ! ?           A   /     *� �    B        C        D E   	 F G  A  a  
  �� Y� 	� L+� =+� >�u�q� :6� -+� :6� 2� U�������+� 6�+� 6+� 66+� :		"� $� *d2d4X� ������ (,� .� 	4� $� 1d2d4X�  ��2�d��� (,� .� 	6� $� *d2d4X� ������ (,� .� 	8� $� /d2d4X� ���d��� (,� .� � &� !�d� 2�d� � (� :�����+� =+� >� (=� .����    B   � 6     	  
     %  .  4  =  L  R  X  ^  c  i  o  r  x  �  �  �  �  �  �  � # � $ � % � & � ' � ( � ) � - � . � / � 0 1 2 3 7 8- 90 :3 ;= <E =H Ah Bp Ds Ev F{ G� H� I� L C   �  7  H I  4  J K  ( 0 L I  i
 M I  o N I  r O I  x � P K 	 %c Q   ^* R I   � S T   � U V  | W I  w X I  Y   Y �  �  �  � � � � # 
 Z     &	-	&	+'�   Z    �  [    S    \    ]