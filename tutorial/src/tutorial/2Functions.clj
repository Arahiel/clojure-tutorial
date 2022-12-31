(ns tutorial.2Functions)

(def increment (fn [x] (+ x 1)))

(defn increment_set
  [y]
  (map increment y))

(defn increment_set_anon
  "Anonymous call"
  [y]
  (map #(+ % 1) y))

(defn -main
  "First function"
  []
  (println "Test print")
  (println "Test print 2")
  (println (increment_set [2 3 5 6]))
  (println (increment_set_anon [2 3 5 6])))
(-main)

