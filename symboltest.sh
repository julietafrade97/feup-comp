#!/bin/bash

cd Project

jjtree proj.jjt
javacc proj.jj
javac *.java

java Proj yal-eval/SemanticTests/ftl.yal color