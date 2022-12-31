(ns tutorial.12Cars)

(defn GetBudgetCars
  [budget code]
  (def cars [(atom {:name "BMW" :value 60000})
             (atom {:name "FERRARI" :value 100000})
             (atom {:name "FIAT" :value 20000})])
  (def coupons
    {"A1B2" 0.2
     "AC34" 0.4
     "VV12" 0.5})
  
  (def foundCoupon (get coupons code))
  (if (not= foundCoupon nil)
    (do
      (println "The Coupon is valid")
      (doseq [c cars]
        (swap! c update-in [:value] #(* % (- 1 foundCoupon)))))
    (println "The Coupon is invalid"))

  (def budgetCars (filter #(<= (:value @%) budget) cars))
  (doseq [c budgetCars]
    (println (:name @c) ":" (:value @c))))

(GetBudgetCars 50000 "A1B2")
(GetBudgetCars 50000 "A1B3")
(GetBudgetCars 50000 "VV12")

