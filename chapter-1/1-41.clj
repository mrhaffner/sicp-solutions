;; Exercise 1.41
;; page 103

;; using concise language feature
(defn double
    [f]
    (comp f f))

;; using lambda
(defn double
    [f]
    #(f (f %)))

;; returns 21 = 5 + 16
;; inc runs 2^4 = 16 times
(((double (double double)) inc) 5)