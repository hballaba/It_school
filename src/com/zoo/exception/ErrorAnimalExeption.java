package com.zoo.exception;

public class ErrorAnimalExeption extends Exception{

        public ErrorAnimalExeption() {
        }

        public ErrorAnimalExeption(String message) {
            super(message);
        }

        public ErrorAnimalExeption(String message, Throwable cause) {
            super(message, cause);
        }

        public ErrorAnimalExeption(Throwable cause) {
            super(cause);
        }

        public ErrorAnimalExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
}
