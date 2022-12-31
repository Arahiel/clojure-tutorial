(ns tutorial.4PetStore)
(defn GetPetAges
  [pet humanYears]
  (* (get {"Dog" 7 "Cat" 5 "Fish" 10} pet) humanYears))

(println (GetPetAges "Cat" 3))