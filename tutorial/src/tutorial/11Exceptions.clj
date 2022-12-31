(ns tutorial.11Exceptions)

(defn ExHandling
  [x]
  (try
    (inc x)
    (catch ClassCastException e
      (println "Caught exception " (.getMessage e)))
    (catch Exception e
      (println "Caught generic exception"))
    (finally (println "cleanup and move on"))
    ))
(ExHandling "Hello")
(ExHandling 5)