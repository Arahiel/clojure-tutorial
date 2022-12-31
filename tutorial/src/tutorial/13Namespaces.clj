(ns tutorial.13Namespaces
  (:require [clojure.string :refer [capitalize]]))
;;   (:require [clojure.string :refer :all]))


(defn -main
  []
  (println (capitalize "hello")))
(-main)