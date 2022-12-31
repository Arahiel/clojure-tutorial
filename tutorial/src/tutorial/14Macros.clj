(ns tutorial.14Macros)

(macroexpand-1 '(when true (println "hello")))
;; => (if true (do (println "hello")))
